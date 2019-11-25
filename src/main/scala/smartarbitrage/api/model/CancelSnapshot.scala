package smartarbitrage.api.model

/**
 * Cancelation outcome that might include an order snapshot.
 *
 * @author Fabio G. Strozzi
 */
trait CancelSnapshot {
  def isSuccessful: Boolean

  def getSnapshot: Option[OrderSnapshot]
}