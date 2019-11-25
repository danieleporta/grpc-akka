package smartarbitrage.api.adapter

import smartarbitrage.api.model.Forex
import smartarbitrage.api.interface.internal.{Forex ⇒ ForexInternal}

class ForexAdapter(fx: ForexInternal) extends Forex {
  override def getQCode: String = fx.qcode
  override def getPrice: java.math.BigDecimal = BigDecimal(fx.price).bigDecimal
}
