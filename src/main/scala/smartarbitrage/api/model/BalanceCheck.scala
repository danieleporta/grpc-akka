package smartarbitrage.api.model

/**
 * Result of the check of the balance.
 *
 * @author Fabio G. Strozzi
 */
trait BalanceCheck {
  /**
   * Balance that has been used to validate an operation.
   *
   * @return Amount of a { @link #getCurrency() certain currency}
   */
  def getAvailable: java.math.BigDecimal

  /**
   * Currency code (e.g. btc, usd, eth, eur, ecc.) used to validate an operation
   *
   * @return Currency code
   */
  def getCurrency: String

  /**
   * Whether check is successful or not.
   *
   * @return True if operation will likely be allowed, false otherwise.
   */
  def isSuccessful: Boolean

  /**
   * Currency code (e.g. btc, usd, eth, eur, ecc.) used to indicate collateral in margin order
   *
   * @return Currency code
   */
  def getCollateralCurrency: Option[String]
}
