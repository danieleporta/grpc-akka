package example.myapp.helloworld

import akka.NotUsed
import akka.stream.Materializer
import akka.stream.scaladsl.Source
import example.myapp.helloworld.grpc._

import scala.concurrent.Future

class PositionServiceImpl(implicit mat: Materializer) extends PositionService {

  override def getPositions(request: PositionRequest): Source[PositionReply, NotUsed] = {

    println(s"getPositions with exchange ${request.exchangeUri} and qcodes ${request.qcodes}")

    val p = PositionReply("ETH/USD", BigDecimal(9.75).toString(), BigDecimal(207.45).toString(),
      Some("BTC/USD"), Some(BigDecimal(1798.52).toString()))

    val positions = (0 to 1000000).toList.map(_ ⇒ PositionReply("ETH/USD", BigDecimal(3.58).toString(), BigDecimal(200.36).toString(), Some("BTC/USD")))
    Source(positions)
  }


}