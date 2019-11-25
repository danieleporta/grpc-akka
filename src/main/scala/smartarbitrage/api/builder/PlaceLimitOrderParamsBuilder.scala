package smartarbitrage.api.builder

import smartarbitrage.api.OperationParams.PlaceLimitOrderParams
import smartarbitrage.api.interface.internal.{PlaceLimitOrderRequest ⇒ PlaceLimitOrderRequestInternal}

object PlaceLimitOrderParamsBuilder {
  def build(p: PlaceLimitOrderParams): PlaceLimitOrderRequestInternal =
    PlaceLimitOrderRequestInternal(p.exchangeUri, LimitOrderBuilder.build(p.lo),
      if (p.swap.isDefined) Some(ForexBuilder.build(p.swap.get)) else None)

}
