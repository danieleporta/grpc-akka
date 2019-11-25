package smartarbitrage.api.model

object OrderType extends Enumeration {
  type OrderType = Value
  val BID, ASK = Value
  // TODO: check methods to be imported avoiding Xchange library
}
