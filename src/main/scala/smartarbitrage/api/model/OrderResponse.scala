package smartarbitrage.api.model

import smartarbitrage.api.model.CancelReason.CancelReason
import smartarbitrage.api.model.OrderStatus.OrderStatus

trait OrderResponse {
  def getId: String

  def getStatus: Option[OrderStatus]

  def getCancelReason: Option[CancelReason]
}