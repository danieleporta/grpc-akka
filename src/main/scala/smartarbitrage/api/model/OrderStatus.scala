package smartarbitrage.api.model

object OrderStatus extends Enumeration {
  type OrderStatus = Value
  val PENDING_NEW, NEW, PARTIALLY_FILLED, FILLED,
  PENDING_CANCEL, PARTIALLY_CANCELED, CANCELED,
  PENDING_REPLACE, REPLACED, STOPPED, REJECTED, EXPIRED, UNKNOWN = Value

}


