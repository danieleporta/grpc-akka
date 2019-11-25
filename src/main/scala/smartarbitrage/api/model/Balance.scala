package smartarbitrage.api.model

trait Balance {
  def getWallet: String

  def getCurrency: String

  def getAmount: java.math.BigDecimal
}
