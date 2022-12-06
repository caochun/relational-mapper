package ch.hepia.sql

import ch.hepia.Ast
import ch.hepia.Ast._
import ch.hepia.Ast.Operator._
import ch.hepia.Ast.BooleanOperator._
import ch.hepia.Ast.Relation._
import ch.hepia.Ast.JoinType._
import ch.hepia.sql.Outer
import ch.hepia.Ast.AttributeInfo.AttributeId
import ch.hepia.Ast.AttributeInfo.OuterAttributeInfo

object AstShowSql {

  implicit val operatorCanShowSql = ShowSql[Operator]{
    case Neq => " <> "
    case Eq => " = "
    case Big => " > "
    case Less => " < "
    case BigEq => " >= "
    case LessEq => " <= "
    case In => "IN"
  }

  implicit val joinTypeCanShowSql = ShowSql[JoinType]{
    case InnerJoin => "INNER JOIN "
    case LeftJoin => "LEFT JOIN "
    case RightJoin => "RIGHT JOIN"
    case Union => "UNION "
  }

  def toSql(attributeInfo: AttributeInfo): String = attributeInfo match {
    case AttributeId(name) => name
    case OuterAttributeInfo(name) => Outer.outerAttributeName.getOrElse(name,"")
  }

  def toSql(logicOp: BooleanOperator): String = logicOp match {
    case And(left, right) => toSql(left) + " AND " + toSql(right)
    case Or(left, right) => toSql(left) + " OR " + toSql(right)
    case Cond(left, op, right)  => toSql(left) + ShowSql[Operator].showSql(op) + right.value
    case JoinCond(left, op, right)  => toSql(left) + ShowSql[Operator].showSql(op) + toSql(right)
    case OuterCond(name) => Outer.outerCond.getOrElse(name,"")
  }
  implicit val booleanCanShowSql = ShowSql[BooleanOperator]( toSql )


  def toSql(relation: Relation): String = relation match {
    case RenameRelation(rel,anotherName)  if anotherName.name=="" => "(\n"+toSql(rel)+")"
    case RenameRelation(rel,anotherName)  if anotherName.name!="" => "(\n"+toSql(rel)+") "+anotherName.name
    case SingleRelation(id) => id.name
    case RelationExpr(sr, joined @ _* ) => toSql(sr) + joined.map { 
      case (bo,jt, rel) if jt!=JoinType.Union => "\n" +ShowSql[JoinType].showSql(jt) + toSql(rel) + "\nON " + ShowSql[BooleanOperator].showSql(bo) 
      case (bo,jt, rel) if jt==JoinType.Union => "\n" +ShowSql[JoinType].showSql(jt) + toSql(rel)
    }.mkString
    case Sigma(cond, rel) =>  toSql(rel) + "\nWHERE " + ShowSql[BooleanOperator].showSql(cond)
    case PiRelationExpr(attrs, rel) => "(\nSELECT " + attrs.map(a => toSql(a)).mkString(",\n") + "\nFROM " + toSql(rel)+")\n"
    case OuterRelation(name) => Outer.outerFieldName.getOrElse(name,"")
  }
  implicit val relationCanShowSql = ShowSql[Relation]( r => toSql(r) )

  implicit val AstcanShowSql = ShowSql[Ast]{
    case PiRelationExpr(attrs, rel) => "SELECT " + attrs.map(a => toSql(a)).mkString(",\n") + "\nFROM " + ShowSql[Relation].showSql(rel)
    case Sigma(cond, rel) => "SELECT *\nFROM " + ShowSql[Relation].showSql(rel) + "\nWHERE " + ShowSql[BooleanOperator].showSql(cond)
    case RelationExpr(sr, joined @ _* ) => "SELECT *\nFROM " + toSql(sr) + joined.map { 
      case (bo,jt, rel) if jt!=JoinType.Union => "\n" +ShowSql[JoinType].showSql(jt) + toSql(rel) + "\nON " + ShowSql[BooleanOperator].showSql(bo) 
      case (bo,jt, rel) if jt==JoinType.Union => "\n" +ShowSql[JoinType].showSql(jt) + toSql(rel)
    }.mkString
    case _:SingleRelation => throw new Exception("Shouldn't be possible")
  }



}
