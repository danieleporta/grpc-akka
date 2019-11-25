// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package smartarbitrage.api.interface.internal

/** used to generate Option[OrderStatusType]
  */
@SerialVersionUID(0L)
final case class OrderStatusTypeBox(
    status: smartarbitrage.api.interface.internal.OrderStatusType = smartarbitrage.api.interface.internal.OrderStatusType.OST_PENDING_NEW
    ) extends scalapb.GeneratedMessage with scalapb.Message[OrderStatusTypeBox] with scalapb.lenses.Updatable[OrderStatusTypeBox] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = status
        if (__value != smartarbitrage.api.interface.internal.OrderStatusType.OST_PENDING_NEW) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(1, __value.value)
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
        val __v = status
        if (__v != smartarbitrage.api.interface.internal.OrderStatusType.OST_PENDING_NEW) {
          _output__.writeEnum(1, __v.value)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): smartarbitrage.api.interface.internal.OrderStatusTypeBox = {
      var __status = this.status
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __status = smartarbitrage.api.interface.internal.OrderStatusType.fromValue(_input__.readEnum())
          case tag => _input__.skipField(tag)
        }
      }
      smartarbitrage.api.interface.internal.OrderStatusTypeBox(
          status = __status
      )
    }
    def withStatus(__v: smartarbitrage.api.interface.internal.OrderStatusType): OrderStatusTypeBox = copy(status = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = status.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PEnum(status.scalaValueDescriptor)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = smartarbitrage.api.interface.internal.OrderStatusTypeBox
}

object OrderStatusTypeBox extends scalapb.GeneratedMessageCompanion[smartarbitrage.api.interface.internal.OrderStatusTypeBox] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[smartarbitrage.api.interface.internal.OrderStatusTypeBox] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): smartarbitrage.api.interface.internal.OrderStatusTypeBox = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    smartarbitrage.api.interface.internal.OrderStatusTypeBox(
      smartarbitrage.api.interface.internal.OrderStatusType.fromValue(__fieldsMap.getOrElse(__fields.get(0), smartarbitrage.api.interface.internal.OrderStatusType.OST_PENDING_NEW.javaValueDescriptor).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber)
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[smartarbitrage.api.interface.internal.OrderStatusTypeBox] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      smartarbitrage.api.interface.internal.OrderStatusTypeBox(
        smartarbitrage.api.interface.internal.OrderStatusType.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(smartarbitrage.api.interface.internal.OrderStatusType.OST_PENDING_NEW.scalaValueDescriptor).number)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = CommonsProto.javaDescriptor.getMessageTypes.get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = CommonsProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => smartarbitrage.api.interface.internal.OrderStatusType
    }
  }
  lazy val defaultInstance = smartarbitrage.api.interface.internal.OrderStatusTypeBox(
    status = smartarbitrage.api.interface.internal.OrderStatusType.OST_PENDING_NEW
  )
  implicit class OrderStatusTypeBoxLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, smartarbitrage.api.interface.internal.OrderStatusTypeBox]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, smartarbitrage.api.interface.internal.OrderStatusTypeBox](_l) {
    def status: _root_.scalapb.lenses.Lens[UpperPB, smartarbitrage.api.interface.internal.OrderStatusType] = field(_.status)((c_, f_) => c_.copy(status = f_))
  }
  final val STATUS_FIELD_NUMBER = 1
  def of(
    status: smartarbitrage.api.interface.internal.OrderStatusType
  ): _root_.smartarbitrage.api.interface.internal.OrderStatusTypeBox = _root_.smartarbitrage.api.interface.internal.OrderStatusTypeBox(
    status
  )
}
