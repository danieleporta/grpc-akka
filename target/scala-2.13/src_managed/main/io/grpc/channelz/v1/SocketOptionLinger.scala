// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.grpc.channelz.v1

/** For use with SocketOption's additional field.  This is primarily used for
  * SO_LINGER.
  *
  * @param active
  *   active maps to `struct linger.l_onoff`
  * @param duration
  *   duration maps to `struct linger.l_linger`
  */
@SerialVersionUID(0L)
final case class SocketOptionLinger(
    active: _root_.scala.Boolean = false,
    duration: _root_.scala.Option[com.google.protobuf.duration.Duration] = _root_.scala.None
    ) extends scalapb.GeneratedMessage with scalapb.Message[SocketOptionLinger] with scalapb.lenses.Updatable[SocketOptionLinger] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = active
        if (__value != false) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(1, __value)
        }
      };
      if (duration.isDefined) {
        val __value = duration.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
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
        val __v = active
        if (__v != false) {
          _output__.writeBool(1, __v)
        }
      };
      duration.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): io.grpc.channelz.v1.SocketOptionLinger = {
      var __active = this.active
      var __duration = this.duration
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __active = _input__.readBool()
          case 18 =>
            __duration = Option(_root_.scalapb.LiteParser.readMessage(_input__, __duration.getOrElse(com.google.protobuf.duration.Duration.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      io.grpc.channelz.v1.SocketOptionLinger(
          active = __active,
          duration = __duration
      )
    }
    def withActive(__v: _root_.scala.Boolean): SocketOptionLinger = copy(active = __v)
    def getDuration: com.google.protobuf.duration.Duration = duration.getOrElse(com.google.protobuf.duration.Duration.defaultInstance)
    def clearDuration: SocketOptionLinger = copy(duration = _root_.scala.None)
    def withDuration(__v: com.google.protobuf.duration.Duration): SocketOptionLinger = copy(duration = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = active
          if (__t != false) __t else null
        }
        case 2 => duration.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PBoolean(active)
        case 2 => duration.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = io.grpc.channelz.v1.SocketOptionLinger
}

object SocketOptionLinger extends scalapb.GeneratedMessageCompanion[io.grpc.channelz.v1.SocketOptionLinger] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.grpc.channelz.v1.SocketOptionLinger] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): io.grpc.channelz.v1.SocketOptionLinger = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    io.grpc.channelz.v1.SocketOptionLinger(
      __fieldsMap.getOrElse(__fields.get(0), false).asInstanceOf[_root_.scala.Boolean],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[com.google.protobuf.duration.Duration]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.grpc.channelz.v1.SocketOptionLinger] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      io.grpc.channelz.v1.SocketOptionLinger(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Boolean]).getOrElse(false),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.duration.Duration]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ChannelzProto.javaDescriptor.getMessageTypes.get(18)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ChannelzProto.scalaDescriptor.messages(18)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.protobuf.duration.Duration
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = io.grpc.channelz.v1.SocketOptionLinger(
    active = false,
    duration = _root_.scala.None
  )
  implicit class SocketOptionLingerLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.channelz.v1.SocketOptionLinger]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.grpc.channelz.v1.SocketOptionLinger](_l) {
    def active: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.active)((c_, f_) => c_.copy(active = f_))
    def duration: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.duration.Duration] = field(_.getDuration)((c_, f_) => c_.copy(duration = Option(f_)))
    def optionalDuration: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.duration.Duration]] = field(_.duration)((c_, f_) => c_.copy(duration = f_))
  }
  final val ACTIVE_FIELD_NUMBER = 1
  final val DURATION_FIELD_NUMBER = 2
  def of(
    active: _root_.scala.Boolean,
    duration: _root_.scala.Option[com.google.protobuf.duration.Duration]
  ): _root_.io.grpc.channelz.v1.SocketOptionLinger = _root_.io.grpc.channelz.v1.SocketOptionLinger(
    active,
    duration
  )
}
