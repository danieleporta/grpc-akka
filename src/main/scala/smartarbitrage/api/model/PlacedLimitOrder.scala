package smartarbitrage.api.model

/**
 * A placed order has an identifier.
 *
 * @author Fabio G. Strozzi
 */
trait PlacedLimitOrder extends LimitOrder {
  def getId: String
}
