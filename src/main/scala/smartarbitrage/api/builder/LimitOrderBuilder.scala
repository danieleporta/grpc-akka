package smartarbitrage.api.builder

import smartarbitrage.api.interface.internal.{LimitOrder ⇒ LimitOrderInternal}
import smartarbitrage.api.model.LimitOrder

object LimitOrderBuilder {

  def build(lo: LimitOrder): LimitOrderInternal  = LimitOrderInternal(lo.getQCode, OrderTypeBuilder.build(lo.getSide),
    lo.getQuantity.toString, lo.getPrice.toString, lo.isPostOnly, lo.getLeverage, lo.getCollateralCurrency,
    lo.getCorrelationId)


}
