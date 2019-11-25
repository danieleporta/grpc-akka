package smartarbitrage.api

import smartarbitrage.api.OperationReturn._

import scala.concurrent.Future

trait ExchangeGatewayApi {

  def getBalance(command: OperationCommand.GetBalance): Future[GetBalanceReturn]
  def getPositions(command: OperationCommand.GetPositions): Future[GetPositionReturn]
  def checkBalance(command: OperationCommand.CheckBalance): Future[CheckBalanceReturn]
  def placeLimitOrder(command: OperationCommand.PlaceLimitOrder): Future[PlaceLimitOrderReturn]
  def observeOrder(command: OperationCommand.ObserveOrder): Future[ObserveOrderReturn]
  def cancelOrder(command: OperationCommand.CancelOrder): Future[CancelOrderReturn]
//  def recoverOrder(command: OperationCommand.RecoverOrder): Future[RecoverOrderReturn]
  def getRecoverableObserver(command: OperationCommand.GetRecoverableObserver): Future[GetRecoverableObserverReturn]

}


