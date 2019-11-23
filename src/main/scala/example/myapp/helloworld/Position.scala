package example.myapp.helloworld

import scalapb.TypeMapper


case class BigDecimalMapper(str: String){
  def this(b: BigDecimal) = this(b.toString)
  def toBigDecimal = BigDecimal(str)
}

object BigDecimalMapper {
  implicit val mapper: TypeMapper[String, BigDecimalMapper] = TypeMapper[String, BigDecimalMapper](s => BigDecimalMapper(s))(b ⇒ b.str)
}


trait Position {
  val qcode: String

  val volume: BigDecimal

  val entryPrice: BigDecimalMapper

  val collateral: Option[String]

  val pnl: Option[BigDecimalMapper]
}
