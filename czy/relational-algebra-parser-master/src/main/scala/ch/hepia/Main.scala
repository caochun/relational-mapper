package ch.hepia

import ch.hepia.sql.ShowSql._
import ch.hepia.sql.AstShowSql._

import scala.util.Try

import java.io.{File, PrintWriter}

import scala.io.Source


object Main {
  import fastparse._

  def main(args: Array[String]): Unit = {
	val input=Source.fromFile("./input.txt", "UTF-8").mkString
    val toParse: String = Try ( args(0) ).getOrElse(input)

    val Parsed.Success(value, successIndex) = parse(toParse, Parser.parseAlgebra(_))
	val res="-" * 50+"\n"+value.showSql+"\n"+"-" * 50;
    println(res)
	val writer = new PrintWriter(new File("./output.sql"))
    writer.write(res)
    writer.close()
  }


}
