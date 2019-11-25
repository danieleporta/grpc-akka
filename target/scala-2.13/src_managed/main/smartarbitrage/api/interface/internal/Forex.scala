// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package smartarbitrage.api.interface.internal

/** @param price
  *  BigDecimal
  */
@SerialVersionUID(0L)
final case class Forex(
    qcode: _root_.scala.Predef.String = "",
    price: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[Forex] with scalapb.lenses.Updatable[Forex] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = qcode
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = price
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      __size
    }
    final override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = qcode
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = price
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): smartarbitrage.api.interface.internal.Forex = {
      var __qcode = this.qcode
      var __price = this.price
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __qcode = _input__.readString()
          case 18 =>
            __price = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      smartarbitrage.api.interface.internal.Forex(
          qcode = __qcode,
          price = __price
      )
    }
    def withQcode(__v: _root_.scala.Predef.String): Forex = copy(qcode = __v)
    def withPrice(__v: _root_.scala.Predef.String): Forex = copy(price = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = qcode
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = price
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(qcode)
        case 2 => _root_.scalapb.descriptors.PString(price)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = smartarbitrage.api.interface.internal.Forex
}

object Forex extends scalapb.GeneratedMessageCompanion[smartarbitrage.api.interface.internal.Forex] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[smartarbitrage.api.interface.internal.Forex] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): smartarbitrage.api.interface.internal.Forex = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    smartarbitrage.api.interface.internal.Forex(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[smartarbitrage.api.interface.internal.Forex] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      smartarbitrage.api.interface.internal.Forex(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = CommonsProto.javaDescriptor.getMessageTypes.get(1)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = CommonsProto.scalaDescriptor.messages(1)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = smartarbitrage.api.interface.internal.Forex(
    qcode = "",
    price = ""
  )
  implicit class ForexLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, smartarbitrage.api.interface.internal.Forex]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, smartarbitrage.api.interface.internal.Forex](_l) {
    def qcode: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.qcode)((c_, f_) => c_.copy(qcode = f_))
    def price: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.price)((c_, f_) => c_.copy(price = f_))
  }
  final val QCODE_FIELD_NUMBER = 1
  final val PRICE_FIELD_NUMBER = 2
  def of(
    qcode: _root_.scala.Predef.String,
    price: _root_.scala.Predef.String
  ): _root_.smartarbitrage.api.interface.internal.Forex = _root_.smartarbitrage.api.interface.internal.Forex(
    qcode,
    price
  )
}