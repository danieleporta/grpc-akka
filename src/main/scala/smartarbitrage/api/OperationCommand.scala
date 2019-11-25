package smartarbitrage.api

import smartarbitrage.api.OperationParams._
import smartarbitrage.api.interface.internal.PlaceLimitOrderRequest

// probabilmente OperationCommand e OperationParams sono ridondanti

object OperationCommand {

  case class GetBalance(params: GetBalanceParams)

  case class GetPositions(params: GetPositionsParams)

  case class CheckBalance(params: CheckBalanceParams)

  case class PlaceLimitOrder(params: PlaceLimitOrderParams)

  case class ObserveOrder(params: CheckBalanceParams)

  case class CancelOrder(params: CancelOrderParams)

//  case class RecoverOrder(params: RecoverOrderParams)

  case class GetRecoverableObserver(params: GetRecoverableObserverParams)

}