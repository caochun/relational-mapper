package ch.hepia

import fastparse.{CharIn, P}
import fastparse._
import NoWhitespace._
import Ast._
import ch.hepia.Ast.BooleanOperator.Cond
import ch.hepia.Ast.Relation.SingleRelation

object Parser {

  def value[_: P]: P[Value] = CharIn("a-zA-Z0-9_").rep(1).!.map( Value )
  def valueStrContent[_: P] = CharIn("a-zA-Z0-9_#{}").rep
  def strValue[_: P] = P(
    for {
      _ <- P("'")
      content <- valueStrContent.!
      _ <- P("'")
    } yield Value("'"+content+"'")
  )
  
  def listValue[_: P] = P(
    for {
      _ <- P("'")
      content <- valueStrContent.!
      _ <- P("'")
    } yield Value("'"+content+"'")
  )

  def fieldName[_: P]:P[Relation] = CharIn("a-zA-Z0-9_").rep(1).!.map{ case(n) => SingleRelation(RelationalId(n)) }

  def renamedField[_: P]:P[(Relation,RelationalId)] = P("renamedField("~(originExpr)~","~(fieldName.!)~")").map{case(rel,anName) => (rel,RelationalId(anName))}


  //def anyPara[_: P] = CharIn(" !-}\n\t\127-\255").rep(1)
  def anyPara[_: P] = CharsWhile(_ != 'Ω').!

  def fieldNameInOtherLanguage[_: P]:P[Relation] = P(
    for {
      _ <- P("fieldNameInOtherLanguage<")
      content <- attributeName.!
      _ <- P(">")
    } yield Ast.Relation.OuterRelation(content)
  )

  def idName[_: P] = CharIn("a-zA-Z0-9_").rep(1)

  def capitalizedIdName[_: P] = CharIn("A-Z") ~ CharIn("a-z").rep

  def attributeName[_: P] = P( idName.!).map(AttributeInfo.AttributeId)

  def attributeNameWithField[_: P] = P(
    for {
      id1 <- fieldName.!
      _ <- P(".")
      id2 <- idName.!
    } yield AttributeInfo.AttributeId(id1+"."+id2)
  )
  def rename[_: P] = P(
    for {
      id1 <- (attriInfoInOtherLanguage|attributeNameWithField|attributeName|value|strValue).!
      _ <- P(" as ")
      id2 <- idName.!
    } yield AttributeInfo.AttributeId(id1+" AS "+id2)
  )

  def attriInfoInOtherLanguage[_: P] = P(
    for {
      _ <- P("attriInfoInOtherLanguage<")
      name <- attributeName.!
      _ <- P(">")
    } yield AttributeInfo.OuterAttributeInfo(name)
  )

  def renameRelation[_: P]: P[Ast.Relation.RenameRelation] = P( (renamedField) ).map{case (name1,name2) => Ast.Relation.RenameRelation(name1,name2)}

  def funcArguments[_: P] =
    P( " ".rep ~ (rename|attriInfoInOtherLanguage|attributeNameWithField|attributeName).rep(sep=" ".rep ~ "," ~ " ".rep./) ).map(seqs => seqs )

  def eqJoinCond[_: P] = P(
    for {
      _ <- P(" innerJoin(")
      le <- logicExpr
      _ <- P(") ")
    } yield (le,JoinType.InnerJoin)
  )

  def eqLeftJoinCond[_: P] = P(
    for {
      _ <- P(" leftJoin(")
      le <- logicExpr
      _ <- P(") ")
    } yield (le,JoinType.LeftJoin)
  )

  def unionCond[_: P] = P(
    for {
      _ <- P(" union ")
    } yield (Ast.BooleanOperator.OuterCond(""),JoinType.Union)
  )

  def originExpr[_: P]: P[Relation.RelationExpr] =
    P(relationExpr ~ ((eqJoinCond|eqLeftJoinCond|unionCond) ~ relationExpr).rep).map {
      case (sr, joined) => Relation.RelationExpr(sr, joined:_*)
    } 

  def neqSign[_: P]: P[Operator] = P("!=").!.map(_ => Operator.Eq )
  def eqSign[_: P]: P[Operator] = P("=").!.map(_ => Operator.Eq )
  def bigSign[_: P]: P[Operator] = P(">").!.map(_ => Operator.Big )
  def lessSign[_: P]: P[Operator] = P("<").!.map(_ => Operator.Less )
  def lessEqSign[_: P]: P[Operator] = P("<=").!.map(_ => Operator.LessEq )
  def bigEqSign[_: P]: P[Operator] = P(">=").!.map(_ => Operator.BigEq )
  def inEqSign[_: P]: P[Operator] = P(">=").!.map(_ => Operator.In )
  def sign[_: P]: P[Operator] = P( " " ~ (neqSign|eqSign|bigEqSign|lessEqSign|bigSign|lessSign|inEqSign) ~ " " )

  def comparisonExpr[_: P]: P[Cond] = P( (attriInfoInOtherLanguage|attributeNameWithField|attributeName) ~ sign ~ (strValue|value) ).map { case (a, s, v) => Cond(a, s, v) }
  def joinComparisonExpr[_: P]: P[BooleanOperator] = P( (attriInfoInOtherLanguage|attributeNameWithField|attributeName) ~ sign ~ (attributeNameWithField|attributeName) ).map { case (a1, s, a2) => Ast.BooleanOperator.JoinCond(a1, s, a2) }
  def otherCondExpr[_: P]: P[BooleanOperator] = P( "otherCond<"~" ".rep~ (attributeName.!) ~">" ).map { case (a) => Ast.BooleanOperator.OuterCond(a) }
  def logicFactor[_: P]: P[BooleanOperator] = otherCondExpr|joinComparisonExpr|comparisonExpr
  def orTerm[_: P]: P[BooleanOperator] = P( logicFactor ~ " or " ~ logicTerm ).map {case (t, lf) => Ast.BooleanOperator.Or(t,lf)}
  def logicTerm[_: P]: P[BooleanOperator] = P( orTerm | logicFactor )
  def andTerm[_: P]: P[BooleanOperator] = P( logicTerm ~ " and " ~ logicExpr ).map {case (t, lf) => Ast.BooleanOperator.And(t,lf)}
  def logicExpr[_: P]: P[BooleanOperator] = P( andTerm | logicTerm )

  def sigmaExpr[_: P]: P[Relation] = P( "sigma(" ~ logicExpr ~ ")(" ~ originExpr ~ ")" ).map { case (logicOp, rel) => Relation.Sigma(logicOp, rel) }

  def piRelationExpr[_: P]: P[Relation] = P("pi(" ~ funcArguments ~ ")(" ~ relationExpr ~ ")").map { case (attrs, rel) => Relation.PiRelationExpr(attrs, rel) }
  def relationExpr[_: P]: P[Relation] = P( fieldNameInOtherLanguage|piRelationExpr|sigmaExpr|renameRelation|fieldName )

  //def piExpr[_: P]: P[PiExpr]  = P(piRelationExpr).map { case (pi) => PiExpr(pi) }

  def parseAlgebra[_: P]: P[Ast] = P(  (relationExpr) ~ End)
}
