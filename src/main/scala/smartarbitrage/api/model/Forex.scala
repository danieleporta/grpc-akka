package smartarbitrage.api.model

/**
 * Foreign exchange information: price and quotation.
 *
 * @author Giovanni Eruzzi
 */
trait Forex {
  def getQCode: String

  def getPrice: java.math.BigDecimal
}
