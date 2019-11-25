package smartarbitrage.api.builder

import smartarbitrage.api.interface.internal.{OrderStatusType ⇒ OrderStatusTypeInternal, OrderStatusTypeBox ⇒ OrderStatusTypeBoxInternal}
import smartarbitrage.api.model.OrderStatus
import smartarbitrage.api.model.OrderStatus.OrderStatus

object OrderStatusTypeBuilder {
  def build(o: OrderStatusTypeBoxInternal): OrderStatus = OrderStatus.apply(o.status.index)
  def build(o: OrderStatus): OrderStatusTypeBoxInternal = OrderStatusTypeBoxInternal(OrderStatusTypeInternal.fromValue(o.id))

}
