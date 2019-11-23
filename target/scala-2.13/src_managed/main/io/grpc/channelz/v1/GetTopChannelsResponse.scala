// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.grpc.channelz.v1

/** @param channel
  *   list of channels that the connection detail service knows about.  Sorted in
  *   ascending channel_id order.
  *   Must contain at least 1 result, otherwise 'end' must be true.
  * @param end
  *   If set, indicates that the list of channels is the final list.  Requesting
  *   more channels can only return more if they are created after this RPC
  *   completes.
  */
@SerialVersionUID(0L)
final case class GetTopChannelsResponse(
    channel: _root_.scala.Seq[io.grpc.channelz.v1.Channel] = _root_.scala.Seq.empty,
    end: _root_.scala.Boolean = false
    ) extends scalapb.GeneratedMessage with scalapb.Message[GetTopChannelsResponse] with scalapb.lenses.Updatable[GetTopChannelsResponse] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      channel.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      
      {
        val __value = end
        if (__value != false) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(2, __value)
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
      channel.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = end
        if (__v != false) {
          _output__.writeBool(2, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): io.grpc.channelz.v1.GetTopChannelsResponse = {
      val __channel = (_root_.scala.collection.immutable.Vector.newBuilder[io.grpc.channelz.v1.Channel] ++= this.channel)
      var __end = this.end
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __channel += _root_.scalapb.LiteParser.readMessage(_input__, io.grpc.channelz.v1.Channel.defaultInstance)
          case 16 =>
            __end = _input__.readBool()
          case tag => _input__.skipField(tag)
        }
      }
      io.grpc.channelz.v1.GetTopChannelsResponse(
          channel = __channel.result(),
          end = __end
      )
    }
    def clearChannel = copy(channel = _root_.scala.Seq.empty)
    def addChannel(__vs: io.grpc.channelz.v1.Channel*): GetTopChannelsResponse = addAllChannel(__vs)
    def addAllChannel(__vs: Iterable[io.grpc.channelz.v1.Channel]): GetTopChannelsResponse = copy(channel = channel ++ __vs)
    def withChannel(__v: _root_.scala.Seq[io.grpc.channelz.v1.Channel]): GetTopChannelsResponse = copy(channel = __v)
    def withEnd(__v: _root_.scala.Boolean): GetTopChannelsResponse = copy(end = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => channel
        case 2 => {
          val __t = end
          if (__t != false) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PRepeated(channel.iterator.map(_.toPMessage).toVector)
        case 2 => _root_.scalapb.descriptors.PBoolean(end)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = io.grpc.channelz.v1.GetTopChannelsResponse
}

object GetTopChannelsResponse extends scalapb.GeneratedMessageCompanion[io.grpc.channelz.v1.GetTopChannelsResponse] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.grpc.channelz.v1.GetTopChannelsResponse] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): io.grpc.channelz.v1.GetTopChannelsResponse = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    io.grpc.channelz.v1.GetTopChannelsResponse(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.Seq[io.grpc.channelz.v1.Channel]],
      __fieldsMap.getOrElse(__fields.get(1), false).asInstanceOf[_root_.scala.Boolean]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.grpc.channelz.v1.GetTopChannelsResponse] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      io.grpc.channelz.v1.GetTopChannelsResponse(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Seq[io.grpc.channelz.v1.Channel]]).getOrElse(_root_.scala.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Boolean]).getOrElse(false)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ChannelzProto.javaDescriptor.getMessageTypes.get(21)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ChannelzProto.scalaDescriptor.messages(21)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = io.grpc.channelz.v1.Channel
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = io.grpc.channelz.v1.GetTopChannelsResponse(
    channel = _root_.scala.Seq.empty,
    end = false
  )
  implicit class GetTopChannelsResponseLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.channelz.v1.GetTopChannelsResponse]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.grpc.channelz.v1.GetTopChannelsResponse](_l) {
    def channel: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[io.grpc.channelz.v1.Channel]] = field(_.channel)((c_, f_) => c_.copy(channel = f_))
    def end: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.end)((c_, f_) => c_.copy(end = f_))
  }
  final val CHANNEL_FIELD_NUMBER = 1
  final val END_FIELD_NUMBER = 2
  def of(
    channel: _root_.scala.Seq[io.grpc.channelz.v1.Channel],
    end: _root_.scala.Boolean
  ): _root_.io.grpc.channelz.v1.GetTopChannelsResponse = _root_.io.grpc.channelz.v1.GetTopChannelsResponse(
    channel,
    end
  )
}