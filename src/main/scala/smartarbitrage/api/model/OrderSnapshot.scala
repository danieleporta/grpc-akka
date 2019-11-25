package smartarbitrage.api.model

import smartarbitrage.api.model.OrderStatus.OrderStatus
import smartarbitrage.api.model.OrderType.OrderType

/**
 * The snapshot view of an order.
 *
 * @author Fabio G. Strozzi
 */
trait OrderSnapshot {
  /**
   * Unique identifier of the order for a certain exchange.
   *
   * @return Unique identifier of the order for a certain exchange
   */
  def getId: String

  /**
   * Order status.
   *
   * @return Order status
   */
  // OrderStatus contiene delle chiamate a xchange
  def getStatus: OrderStatus

  /**
   * Side of the order.
   *
   * @return Side of the order
   */
  // OrderType contiene delle chiamate a xchange
  def getSide: OrderType

  /**
   * Average price (in trade currency, e.g. usd, eur, ecc.) weighted on fills that compose the cumulative amount.
   *
   * @return Average price up to now
   */
  def getAveragePrice: java.math.BigDecimal

  /**
   * How much the order got filled.
   *
   * @return How much the order got filled
   */
  def getCumulativeAmount: java.math.BigDecimal
}

