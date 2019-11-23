// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.grpc.channelz.v1

/** Server represents a single server.  There may be multiple servers in a single
  * program.
  *
  * @param ref
  *   The identifier for a Server.  This should be set.
  * @param data
  *   The associated data of the Server.
  * @param listenSocket
  *   The sockets that the server is listening on.  There are no ordering
  *   guarantees.  This may be absent.
  */
@SerialVersionUID(0L)
final case class Server(
    ref: _root_.scala.Option[io.grpc.channelz.v1.ServerRef] = _root_.scala.None,
    data: _root_.scala.Option[io.grpc.channelz.v1.ServerData] = _root_.scala.None,
    listenSocket: _root_.scala.Seq[io.grpc.channelz.v1.SocketRef] = _root_.scala.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[Server] with scalapb.lenses.Updatable[Server] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (ref.isDefined) {
        val __value = ref.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (data.isDefined) {
        val __value = data.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      listenSocket.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
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
      ref.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      data.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      listenSocket.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): io.grpc.channelz.v1.Server = {
      var __ref = this.ref
      var __data = this.data
      val __listenSocket = (_root_.scala.collection.immutable.Vector.newBuilder[io.grpc.channelz.v1.SocketRef] ++= this.listenSocket)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __ref = Option(_root_.scalapb.LiteParser.readMessage(_input__, __ref.getOrElse(io.grpc.channelz.v1.ServerRef.defaultInstance)))
          case 18 =>
            __data = Option(_root_.scalapb.LiteParser.readMessage(_input__, __data.getOrElse(io.grpc.channelz.v1.ServerData.defaultInstance)))
          case 26 =>
            __listenSocket += _root_.scalapb.LiteParser.readMessage(_input__, io.grpc.channelz.v1.SocketRef.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      io.grpc.channelz.v1.Server(
          ref = __ref,
          data = __data,
          listenSocket = __listenSocket.result()
      )
    }
    def getRef: io.grpc.channelz.v1.ServerRef = ref.getOrElse(io.grpc.channelz.v1.ServerRef.defaultInstance)
    def clearRef: Server = copy(ref = _root_.scala.None)
    def withRef(__v: io.grpc.channelz.v1.ServerRef): Server = copy(ref = Option(__v))
    def getData: io.grpc.channelz.v1.ServerData = data.getOrElse(io.grpc.channelz.v1.ServerData.defaultInstance)
    def clearData: Server = copy(data = _root_.scala.None)
    def withData(__v: io.grpc.channelz.v1.ServerData): Server = copy(data = Option(__v))
    def clearListenSocket = copy(listenSocket = _root_.scala.Seq.empty)
    def addListenSocket(__vs: io.grpc.channelz.v1.SocketRef*): Server = addAllListenSocket(__vs)
    def addAllListenSocket(__vs: Iterable[io.grpc.channelz.v1.SocketRef]): Server = copy(listenSocket = listenSocket ++ __vs)
    def withListenSocket(__v: _root_.scala.Seq[io.grpc.channelz.v1.SocketRef]): Server = copy(listenSocket = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => ref.orNull
        case 2 => data.orNull
        case 3 => listenSocket
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => ref.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => data.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => _root_.scalapb.descriptors.PRepeated(listenSocket.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = io.grpc.channelz.v1.Server
}

object Server extends scalapb.GeneratedMessageCompanion[io.grpc.channelz.v1.Server] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.grpc.channelz.v1.Server] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): io.grpc.channelz.v1.Server = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    io.grpc.channelz.v1.Server(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[io.grpc.channelz.v1.ServerRef]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[io.grpc.channelz.v1.ServerData]],
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.Seq[io.grpc.channelz.v1.SocketRef]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.grpc.channelz.v1.Server] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      io.grpc.channelz.v1.Server(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[io.grpc.channelz.v1.ServerRef]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[io.grpc.channelz.v1.ServerData]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Seq[io.grpc.channelz.v1.SocketRef]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ChannelzProto.javaDescriptor.getMessageTypes.get(10)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ChannelzProto.scalaDescriptor.messages(10)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = io.grpc.channelz.v1.ServerRef
      case 2 => __out = io.grpc.channelz.v1.ServerData
      case 3 => __out = io.grpc.channelz.v1.SocketRef
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = io.grpc.channelz.v1.Server(
    ref = _root_.scala.None,
    data = _root_.scala.None,
    listenSocket = _root_.scala.Seq.empty
  )
  implicit class ServerLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.channelz.v1.Server]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.grpc.channelz.v1.Server](_l) {
    def ref: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.channelz.v1.ServerRef] = field(_.getRef)((c_, f_) => c_.copy(ref = Option(f_)))
    def optionalRef: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[io.grpc.channelz.v1.ServerRef]] = field(_.ref)((c_, f_) => c_.copy(ref = f_))
    def data: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.channelz.v1.ServerData] = field(_.getData)((c_, f_) => c_.copy(data = Option(f_)))
    def optionalData: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[io.grpc.channelz.v1.ServerData]] = field(_.data)((c_, f_) => c_.copy(data = f_))
    def listenSocket: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[io.grpc.channelz.v1.SocketRef]] = field(_.listenSocket)((c_, f_) => c_.copy(listenSocket = f_))
  }
  final val REF_FIELD_NUMBER = 1
  final val DATA_FIELD_NUMBER = 2
  final val LISTEN_SOCKET_FIELD_NUMBER = 3
  def of(
    ref: _root_.scala.Option[io.grpc.channelz.v1.ServerRef],
    data: _root_.scala.Option[io.grpc.channelz.v1.ServerData],
    listenSocket: _root_.scala.Seq[io.grpc.channelz.v1.SocketRef]
  ): _root_.io.grpc.channelz.v1.Server = _root_.io.grpc.channelz.v1.Server(
    ref,
    data,
    listenSocket
  )
}