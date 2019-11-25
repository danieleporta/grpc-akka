package smartarbitrage.api.adapter

import smartarbitrage.api.OperationReturn
import smartarbitrage.api.OperationReturn.PlaceLimitOrderReturn
import smartarbitrage.api.builder.OrderStatusTypeBuilder
import smartarbitrage.api.builder.CancelReasonTypeBuilder
import smartarbitrage.api.interface.internal.{PlaceLimitOrderReply ⇒ PlaceLimitOrderReplyInternal}
import smartarbitrage.api.model.CancelReason.CancelReason
import smartarbitrage.api.model.OrderResponse
import smartarbitrage.api.model.OrderStatus.OrderStatus

object OperationReturnAdapter extends OperationReturn {
  def apply(pl: PlaceLimitOrderReplyInternal): PlaceLimitOrderReturn = {
    val r = new OrderResponse() {
      override def getId: String = pl.id

      override def getStatus: Option[OrderStatus] = if (pl.status.isDefined) Some(OrderStatusTypeBuilder.build(pl.status.get)) else None

      override def getCancelReason: Option[CancelReason] = if (pl.cancelReason.isDefined) Some(CancelReasonTypeBuilder.build(pl.cancelReason.get)) else None
    }
    PlaceLimitOrderReturn(r)
  }
}
