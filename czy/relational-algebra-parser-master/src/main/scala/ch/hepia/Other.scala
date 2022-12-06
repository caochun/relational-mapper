package ch.hepia.sql
object Outer{
 implicit val outerFieldName=Map(
    "field1"->"""(
SELECT 
B.OPACT_ORGN AS OO_NO, --开户机构
A.CUST_ACTNUM  AS PABK_NO, --存折号
A.CUST_ACTNUM AS ACT_NO, --账号（客户账号）
A.CUST_NUM AS CUST_NO, --客户号
CASE WHEN G.sav_typ_leng_2='08' THEN '8'/*sav_typ_leng_2:储种*/
      ELSE A.MEDA_TYP END AS PABK_TYPE, /*存折类型,MEDA_TYP:介质类型*/
B.OPACT_DATE AS CS_DT, --开户日期
CASE WHEN B.ACTE_USER IS NULL OR LENGTH(B.ACTE_USER)<1 
     THEN B.OPACT_USER ELSE B.ACTE_USER END AS OTEL_NO, /*启用柜员号,(ACTE_USER:激活用户为空时,取OPACT_USER:开户用户*/
A.CUST_ACCT_STAS AS PABK_STS, /*取CUST_ACCT_STAS:客户账户状态作为存折状态*/
A.RPOT_LOSS_STAS AS RPOT_LOSS_STAS,--挂失状态
C.SYST_ACTNUM AS SYS_NO --系统账号
FROM DCB_DCB_DPMSTA A   --客户账户主表
INNER JOIN DCB_DCB_DPMSTP B --客户账户附表
        ON A.CUST_ACTNUM=B.CUST_ACTNUM 
	   AND B.HYREN_S_DATE<='#{ETL_DT}' 
	   AND B.HYREN_E_DATE>'#{ETL_DT}'  
INNER JOIN (
        SELECT SYST_ACTNUM,CUST_ACTNUM,CUST_NUM,TERM_AND_CRNT_FLG
	    ,row_number()OVER(PARTITION BY SYST_ACTNUM,CUST_ACTNUM,CUST_NUM,TERM_AND_CRNT_FLG ORDER BY LOCL_TRAN_DATE DESC) PX 
	      FROM DCB_DCB_DPACRA --账户关系文件
	     WHERE TERM_AND_CRNT_FLG IN ('1','2')-- 1-定期,2-活期
	       AND HYREN_S_DATE<='#{ETL_DT}' 
		   AND HYREN_E_DATE>'#{ETL_DT}' 
           ) C
        ON A.CUST_ACTNUM=C.CUST_ACTNUM 
	   AND A.CUST_NUM=C.CUST_NUM  
	   AND C.PX=1
LEFT JOIN DCB_DCB_TDTACA G --定期系统账户主表  
    /* by ch 20220818 修改大额存单关联关系*/
	   ON A.CUST_ACTNUM=G.RDEP_RELA_ACTNUM 
	  AND G.HYREN_S_DATE<='#{ETL_DT}' 
	  AND G.HYREN_E_DATE>'#{ETL_DT}' 
	  AND G.sav_typ_leng_2='08'
WHERE A.HYREN_S_DATE<='#{ETL_DT}' AND A.HYREN_E_DATE>'#{ETL_DT}' 
 ) CG1""",
 "field2"->"""(
      SELECT CUST_IDN,CUST_NAM,CERT_TYP,CERT_NO 
        FROM ECF_ECF_T01_P_CUST_INFO --对私客户基本信息
	   WHERE CUST_STS='A' AND HYREN_S_DATE<='#{ETL_DT}' AND HYREN_E_DATE>'#{ETL_DT}' AND SUBSTR(UPD_TMSTP,1,8)='99991231'
	  UNION ALL
	  SELECT a.CUST_IDN,a.CUST_NAM, b.cert_typ CERT_TYP,b.cert_no CERT_NO
        FROM ECF_ECF_T01_C_CUST_INFO a --对公客户基本信息
	    left join(
	            select party_id,cert_typ,cert_no,upd_tmstp,MAIN_CERT_IDN_FLAG 
			    from(
			          select party_id,cert_typ,cert_no,upd_tmstp,MAIN_CERT_IDN_FLAG
			              ,row_number() over(partition by cert_no order by upd_tmstp desc) rn 
			          from ECF_ECF_t01_c_party_resolve cr --对公参与人客户识别
			          where hyren_s_date<='#{ETL_DT}' and hyren_e_date>'#{ETL_DT}' 
					  and MAIN_CERT_IDN_FLAG='1' and upd_tmstp='99991231000000000' 
			    ) ctr where ctr.rn=1
			) b on  a.party_id=b.party_id
	  WHERE a.CUST_STS='A' --A-正常，D-销户
	    AND a.HYREN_S_DATE<='#{ETL_DT}' 
		AND a.HYREN_E_DATE>'#{ETL_DT}' 
		AND SUBSTR(a.UPD_TMSTP,1,8)='99991231'
) CG2""",
"field3"->"""(
     SELECT COD_VLU
	        ,CASE WHEN COD_VLU IN ('101','102','132') THEN LEFT(COD_DESC,INSTR(COD_DESC,'-')-1) 
			      WHEN COD_VLU IN ('105','107') THEN '军官证'
				  WHEN COD_VLU IN ('121','140') THEN '文职干部证 '
				  WHEN COD_VLU IN ('106','113') THEN '士兵证'
				  WHEN COD_VLU IN ('103','112') THEN '护照'
				  WHEN COD_VLU IN ('226') THEN '统一社会信用代码'
			 ELSE CONCAT('其他-',LEFT(COD_DESC,INSTR(COD_DESC,'-')-1))
			END AS CERT_TYP --COD_VLU:代码值 
	 FROM ECF_ECF_CODE_STRING --公共代码表
	 WHERE HYREN_S_DATE<='#{ETL_DT}' 
	   AND HYREN_E_DATE>'#{ETL_DT}'
	   AND cod_typ IN ('C001','C002') --对私、对公
) H """,
)
implicit val outerAttributeName=Map(
"attr1"->"""case when H.CERT_TYP IS NULL OR LENGTH(H.CERT_TYP)<1 
 THEN '无证件' ELSE H.CERT_TYP END   AS ZJLBΩ>,CG2.CERT_NO as ZJHM,CG1.PABK_NO as CZH,CG1.SYS_NO as HQCKZH,attriNameInOtherLanguage<αCASE WHEN CG1.PABK_TYPE='2' THEN '普通存折'
	 WHEN CG1.PABK_TYPE='3' THEN '存单'
	 WHEN CG1.PABK_TYPE='8' THEN '大额定期存单' 
	 ELSE '其他-无介质' END AS CZLX,	--存折类型
CASE WHEN D.A0177 IS NULL THEN '否' ELSE '是' END AS YGKBZ""",
"attr2"->"""CASE  
     WHEN CG1.RPOT_LOSS_STAS IN ('2','3') THEN '挂失'
	 WHEN CG1.PABK_STS='2' THEN '冻结'
	 WHEN CG1.PABK_STS='1' THEN '正常'
     WHEN CG1.PABK_STS='3' THEN '注销'
	 WHEN CG1.PABK_STS='4' THEN '未激活'
     WHEN CG1.PABK_STS='5' THEN '其他-作废'
	 WHEN CG1.PABK_STS='6' THEN '睡眠'
     ELSE '其他' END AS CZZT"""
)
implicit val outerCond=Map(
"cond1"->"""CG1.PABK_TYPE IN ('2','3','8')"""
)
}