package ch.hepia

import javax.management.MBeanAttributeInfo

sealed trait Ast
object Ast {

  case class RelationalId(name: String)
  sealed trait AttributeInfo
  object AttributeInfo{
    case class AttributeId(name: String) extends AttributeInfo
    case class OuterAttributeInfo(name: String) extends AttributeInfo
  }
  case class Value(value: String)
  //case class AnyPara(content : String)

  sealed trait Operator
  object Operator {
    case object Neq extends Operator
    case object Eq extends Operator
    case object Big extends Operator
    case object Less extends Operator
    case object BigEq extends Operator
    case object LessEq extends Operator
    case object In extends Operator
  }

  sealed trait BooleanOperator
  object BooleanOperator {
    case class And(left: BooleanOperator, right: BooleanOperator) extends BooleanOperator
    case class Or(left: BooleanOperator, right: BooleanOperator) extends BooleanOperator
    case class Cond(left: AttributeInfo, op: Operator, right: Value) extends BooleanOperator
    case class JoinCond(left: AttributeInfo, op: Operator, right: AttributeInfo) extends BooleanOperator
    case class OuterCond(name: String) extends BooleanOperator
  }

  sealed trait JoinType
  object JoinType {
    case object InnerJoin extends JoinType
    case object LeftJoin extends JoinType
    case object RightJoin extends JoinType
    case object Union extends JoinType
  }

  
  // sealed trait JoinCond
  // object JoinCond {
  //   case class And(left: JoinCond, right:JoinCond) extends JoinCond
  //   case class Or(left: JoinCond, right:JoinCond) extends JoinCond
  //   case class Cond(left: AttributeId,op:Operator, right:AttributeId) extends JoinCond
  // }

  sealed trait Relation extends Ast
  object Relation {
    case class SingleRelation(name: RelationalId) extends Relation
    case class RenameRelation(relation: Relation,anotherName: RelationalId) extends Relation
    case class Sigma(cond: BooleanOperator, relation: Relation) extends Relation
    case class RelationExpr(relation: Relation, joined: (BooleanOperator,JoinType, Relation)*) extends Relation
    case class PiRelationExpr(attributes: Seq[AttributeInfo], relation: Relation) extends Relation
    case class OuterRelation(name: String) extends Relation
  }

  //case class PiExpr(piRelationExpr: Relation.PiRelationExpr) extends Ast

}
