import Ra.RelationalAlgebraInterpreter;
import Ra.RelationalAlgebraLexer;
import Ra.RelationalAlgebraParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganBasicInfoTest {

//SELECTION : 'σ';
//PROJECTION : 'π';
//LEFTJOIN : '⟕' // different form left outer join
//AND : '∧';
//OR : '∨';
//RENAME : 'ρ';
    @Test
    public void test(){
        //σ T2.ORGN_RELA_RELA_TYP = 'RPTT'
        String line = "ρ T3.B01BH PAYMENT_CODE, T1.ORGN_NUM ORGANKEY, T3.B010R BANKLICENCE, T3.B01BG CREDIT_CODE, T1.ORGN_NAM ORGANNAME, " +
                "ψ(T3.B01AK = '200' ∨ T3.B01AK = '100', '管理机构' ; " +
                "T3.B01AK = '210' ∨ T3.B01AK = '110' ∨ T1.ORGN_NUM λ '0089%' , '内设机构' ; " +
                "T1.ORGN_NUM λ 'X%' ∨ T1.ORGN_NUM λ '%999', '虚拟机构' ; '营业机构') ORGAN_TYPE, " +
                "T3.B01BQ ADD_CODE, T1.IF_ALLW_TRAN STAUTS, " +
                "ψ(T1.CBRC_APRV_DT != '0', T1.CBRC_APRV_DT; T1.OPEN_DATE) SETUPDATE, " +
                "T3.B0140 ADDRESS, T1.CNTA_TLPH CONTACT_NO, T3.B010O RESPON_PER, " +
                "T3.B010Q RESPOM_TITLE, T3.B010I RESPON_NUM, T2.SUPR_ORGN_NUM SUPR_ORGN_NUM, '#{ETL_DT}' DATADT" +

                "σ T2.ORGN_RELA_RELA_TYP = 'RPTT' ∧ T1.HYREN_S_DATE <= '#{ETL_DT}' " +
                "∧ T1.HYREN_E_DATE > '#{ETL_DT}' ∧ T2.ORGN_RELA_RELA_TYP = 'RPTT'" +
                "∧ ƒ(3) < '#{ETL_DT}' ∧ ƒ(4) > '#{ETL_DT}' " +

                "T1 ⟕ T1.ORGN_NUM = T2.ORGN_NUM ∧ T2.HYREN_S_DATE <= '#{ETL_DT}' ∧ T2.HYREN_E_DATE > '#{ETL_DT}' " +
                "∧ ƒ(1) <= '#{ETL_DT}' ∧ ƒ(2) > '#{ETL_DT}' T2 " +
                "⟕ T1.ORGN_NUM = T3.B01AA ∧ T3.HYREN_S_DATE <= '#{ETL_DT}' ∧ T3.HYREN_E_DATE > '#{ETL_DT}' T3";
        RelationalAlgebraLexer lexer = new RelationalAlgebraLexer(CharStreams.fromString(line));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RelationalAlgebraParser parser = new RelationalAlgebraParser(tokens);
        ParseTree tree = parser.exp();
        RelationalAlgebraInterpreter interpreter = new RelationalAlgebraInterpreter();
        String query = (String) interpreter.visit(tree);
        System.out.println(query);
        //assertEquals(out, query);
    }
}
