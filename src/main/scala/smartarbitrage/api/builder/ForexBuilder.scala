package smartarbitrage.api.builder
import smartarbitrage.api.interface.internal.{Forex ⇒ ForexInternal}
import smartarbitrage.api.model.Forex

object ForexBuilder {
  def build(fx: Forex): ForexInternal = ForexInternal(fx.getQCode, fx.getPrice.toString)
}
