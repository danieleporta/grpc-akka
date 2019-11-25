package smartarbitrage.api

import org.reactivestreams.Publisher
import smartarbitrage.api.model._

import scala.collection.immutable.List
import scala.concurrent.Future
import scala.util.Try

// Incapsulamento dei valori di ritorno delle operazioni
trait OperationReturn

object OperationReturn {

  // Balance --> here, in exchange.model
  case class GetBalanceReturn(getBalanceReturn: List[Balance]) extends OperationReturn

  // Position --> here, in exchange.model
  case class GetPositionReturn(getPositionReturn: List[Position]) extends OperationReturn

  // BalanceCheck --> here, in exchange.model
  case class CheckBalanceReturn(checkBalanceReturn: BalanceCheck) extends OperationReturn

  // OrderResponse --> in project sa-exchange-client
  // OrderStatus, CancelReason
  case class PlaceLimitOrderReturn(placeLimitOrderReturn: OrderResponse) extends OperationReturn

  // OrderSnapshot --> here, in exchange.model
  case class ObserveOrderReturn(observeOrderReturn: Publisher[Try[OrderSnapshot]]) extends OperationReturn

  // CancelSnapshot --> here, in exchange.model
  // OrderSnapshot --> here in exchange.model
  case class CancelOrderReturn(cancelOrderReturn: Future[CancelSnapshot]) extends OperationReturn

  // OrderResponse --> in project sa-exchange-client
  // OrderStatus, CancelReason --> in project sa-exchange-client
  case class RecoverOrderReturn(recoverOrderReturn: Future[OrderResponse]) extends OperationReturn

  // RecoverableObserver --> here, in exchange.model
  // OrderSnapshot --> here in exchange.model
  // Only Gdax implements RecoverableObserver
  case class GetRecoverableObserverReturn(getRecoverableObserverReturn: RecoverableObserver) extends OperationReturn

}
