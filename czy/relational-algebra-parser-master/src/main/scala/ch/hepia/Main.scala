package ch.hepia

import ch.hepia.sql.ShowSql._
import ch.hepia.sql.AstShowSql._

import scala.util.Try


object Main {
  import fastparse._

  def main(args: Array[String]): Unit = {

    val toParse: String = Try ( args(0) ).getOrElse("pi(FIELD_1.name as NAME, id as ID)(sigma(DATE = V_DATE)(fieldNameInOtherLanguage<###(FIELD_4 JOIN FIELD_5) as FIELD_1###> join(FIELD_1.p1 = FIELD_2.p1 and FIELD_1.p2 <= FIELD_2.p2 or FIELD_1.p3 > FIELD_2.p3) FIELD_2 leftJoin(FIELD_1.p4 = FIELD_3.p4) FIELD_3))")

    val Parsed.Success(value, successIndex) = parse(toParse, Parser.parseAlgebra(_))

    println("-" * 50)

    println(value.showSql)

    println("-" * 50)

  }


}
