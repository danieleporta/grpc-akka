package smartarbitrage.api

import smartarbitrage.api.model.{Forex, LimitOrder}
import smartarbitrage.api.model.PlacedLimitOrder


// probabilmente OperationCommand e OperationParams sono ridondanti

object OperationParams {

  trait OperationParams

  // LimitOrder --> here in model
  // Forex --> here in model
  case class GetBalanceParams(exchangeUri: String, op: LimitOrder, fx: Option[Forex],
                              swap: Option[Forex]) extends OperationParams

  case class GetPositionsParams(exchangeUri: String,
                                qcodes: String*) extends OperationParams

  // LimitOrder --> here in model
  // Forex --> here in model
  case class CheckBalanceParams(exchangeUri: String, lo: LimitOrder, fx: Option[Forex],
                                swap: Option[Forex]) extends OperationParams

  // LimitOrder --> here in model
  // Forex --> here in model
  case class PlaceLimitOrderParams(exchangeUri: String, lo: LimitOrder,
                                   swap: Option[Forex]) extends OperationParams

  // PlacedLimitOrder --> here in model
  // Forex --> here in model
  case class ObserveOrderParams(exchangeUri: String, lo: PlacedLimitOrder,
                                swap: Option[Forex]) extends OperationParams

  // PlacedLimitOrder --> here in model
  // Forex --> here in model
  case class CancelOrderParams(exchangeUri: String, lo: PlacedLimitOrder,
                               swap: Option[Forex]) extends OperationParams

  // LimitOrder --> here in model
  // Forex --> here in model
  // ExchangeException --> in sa-exchange-client
//  case class RecoverOrderParams(exchangeUri: String, op: LimitOrder,
//                                swap: Option[Forex], e: ExchangeException) extends OperationParams

  // PlacedLimitOrder --> here in model
  case class GetRecoverableObserverParams(exchangeUri: String, times: Int,
                                          orgOrder: PlacedLimitOrder) extends OperationParams

}
