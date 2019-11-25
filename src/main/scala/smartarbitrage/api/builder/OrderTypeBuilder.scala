package smartarbitrage.api.builder
import smartarbitrage.api.interface.internal.{LimitOrder ⇒ LimitOrderInternal, OrderType ⇒ OrderTypeInternal}
import smartarbitrage.api.model.OrderType
import smartarbitrage.api.model.OrderType.OrderType

object OrderTypeBuilder {
  def build(t: OrderTypeInternal): OrderType = if (t == OrderTypeInternal.ASK) OrderType.ASK else OrderType.BID
  def build(t: OrderType): OrderTypeInternal = if (t == OrderType.ASK) OrderTypeInternal.ASK else OrderTypeInternal.BID

}
