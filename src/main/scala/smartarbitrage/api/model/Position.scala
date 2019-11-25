package smartarbitrage.api.model

/**
 * @author Fabio G. Strozzi
 */
trait Position {
  def getQcode: String

  def getVolume: java.math.BigDecimal

  def getEntryPrice: java.math.BigDecimal

  def getCollateral: Option[String]

  def getPnl: Option[java.math.BigDecimal]

  def toString: String
}

