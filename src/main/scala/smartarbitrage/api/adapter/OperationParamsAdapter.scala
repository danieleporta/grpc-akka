package smartarbitrage.api.adapter

import smartarbitrage.api.OperationParams.{OperationParams, PlaceLimitOrderParams}
import smartarbitrage.api.interface.internal.PlaceLimitOrderRequest

object OperationParamsAdapter extends OperationParams {

  def apply(pl: PlaceLimitOrderRequest) = PlaceLimitOrderParams(pl.exchangeUri, new LimitOrderAdapter(pl.order),
    if (pl.swap.isDefined) Some(new ForexAdapter(pl.swap.get)) else None )

}
