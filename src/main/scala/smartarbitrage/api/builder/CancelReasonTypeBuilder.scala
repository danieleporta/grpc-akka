package smartarbitrage.api.builder

import smartarbitrage.api.interface.internal.{CancelReasonType ⇒ CancelReasonTypeInternal, CancelReasonTypeBox ⇒ CancelReasonTypeBoxInternal}
import smartarbitrage.api.model.CancelReason
import smartarbitrage.api.model.CancelReason.CancelReason

object CancelReasonTypeBuilder {
  def build(o: CancelReasonTypeBoxInternal): CancelReason = CancelReason.apply(o.cancelReason.index)
  def build(o: CancelReason): CancelReasonTypeBoxInternal = CancelReasonTypeBoxInternal(CancelReasonTypeInternal.fromValue(o.id))

}
