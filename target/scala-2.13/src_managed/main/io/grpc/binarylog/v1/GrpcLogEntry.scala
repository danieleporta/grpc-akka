// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.grpc.binarylog.v1

/** Log entry we store in binary logs
  *
  * @param timestamp
  *   The timestamp of the binary log message
  * @param callId
  *   Uniquely identifies a call. The value must not be 0 in order to disambiguate
  *   from an unset value.
  *   Each call may have several log entries, they will all have the same call_id.
  *   Nothing is guaranteed about their value other than they are unique across
  *   different RPCs in the same gRPC process.
  * @param sequenceIdWithinCall
  *   The entry sequence id for this call. The first GrpcLogEntry has a
  *   value of 1, to disambiguate from an unset value. The purpose of
  *   this field is to detect missing entries in environments where
  *   durability or ordering is not guaranteed.
  * @param logger
  *   One of the above Logger enum
  * @param payloadTruncated
  *   true if payload does not represent the full message or metadata.
  * @param peer
  *   Peer address information, will only be recorded on the first
  *   incoming event. On client side, peer is logged on
  *   EVENT_TYPE_SERVER_HEADER normally or EVENT_TYPE_SERVER_TRAILER in
  *   the case of trailers-only. On server side, peer is always
  *   logged on EVENT_TYPE_CLIENT_HEADER.
  */
@SerialVersionUID(0L)
final case class GrpcLogEntry(
    timestamp: _root_.scala.Option[com.google.protobuf.timestamp.Timestamp] = _root_.scala.None,
    callId: _root_.scala.Long = 0L,
    sequenceIdWithinCall: _root_.scala.Long = 0L,
    `type`: io.grpc.binarylog.v1.GrpcLogEntry.EventType = io.grpc.binarylog.v1.GrpcLogEntry.EventType.EVENT_TYPE_UNKNOWN,
    logger: io.grpc.binarylog.v1.GrpcLogEntry.Logger = io.grpc.binarylog.v1.GrpcLogEntry.Logger.LOGGER_UNKNOWN,
    payloadTruncated: _root_.scala.Boolean = false,
    peer: _root_.scala.Option[io.grpc.binarylog.v1.Address] = _root_.scala.None,
    payload: io.grpc.binarylog.v1.GrpcLogEntry.Payload = io.grpc.binarylog.v1.GrpcLogEntry.Payload.Empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[GrpcLogEntry] with scalapb.lenses.Updatable[GrpcLogEntry] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (timestamp.isDefined) {
        val __value = timestamp.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      
      {
        val __value = callId
        if (__value != 0L) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt64Size(2, __value)
        }
      };
      
      {
        val __value = sequenceIdWithinCall
        if (__value != 0L) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt64Size(3, __value)
        }
      };
      
      {
        val __value = `type`
        if (__value != io.grpc.binarylog.v1.GrpcLogEntry.EventType.EVENT_TYPE_UNKNOWN) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(4, __value.value)
        }
      };
      
      {
        val __value = logger
        if (__value != io.grpc.binarylog.v1.GrpcLogEntry.Logger.LOGGER_UNKNOWN) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(5, __value.value)
        }
      };
      if (payload.clientHeader.isDefined) {
        val __value = payload.clientHeader.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (payload.serverHeader.isDefined) {
        val __value = payload.serverHeader.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (payload.message.isDefined) {
        val __value = payload.message.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      if (payload.trailer.isDefined) {
        val __value = payload.trailer.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      
      {
        val __value = payloadTruncated
        if (__value != false) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(10, __value)
        }
      };
      if (peer.isDefined) {
        val __value = peer.get
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
      timestamp.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = callId
        if (__v != 0L) {
          _output__.writeUInt64(2, __v)
        }
      };
      {
        val __v = sequenceIdWithinCall
        if (__v != 0L) {
          _output__.writeUInt64(3, __v)
        }
      };
      {
        val __v = `type`
        if (__v != io.grpc.binarylog.v1.GrpcLogEntry.EventType.EVENT_TYPE_UNKNOWN) {
          _output__.writeEnum(4, __v.value)
        }
      };
      {
        val __v = logger
        if (__v != io.grpc.binarylog.v1.GrpcLogEntry.Logger.LOGGER_UNKNOWN) {
          _output__.writeEnum(5, __v.value)
        }
      };
      payload.clientHeader.foreach { __v =>
        val __m = __v
        _output__.writeTag(6, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      payload.serverHeader.foreach { __v =>
        val __m = __v
        _output__.writeTag(7, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      payload.message.foreach { __v =>
        val __m = __v
        _output__.writeTag(8, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      payload.trailer.foreach { __v =>
        val __m = __v
        _output__.writeTag(9, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = payloadTruncated
        if (__v != false) {
          _output__.writeBool(10, __v)
        }
      };
      peer.foreach { __v =>
        val __m = __v
        _output__.writeTag(11, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): io.grpc.binarylog.v1.GrpcLogEntry = {
      var __timestamp = this.timestamp
      var __callId = this.callId
      var __sequenceIdWithinCall = this.sequenceIdWithinCall
      var __type = this.`type`
      var __logger = this.logger
      var __payloadTruncated = this.payloadTruncated
      var __peer = this.peer
      var __payload = this.payload
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __timestamp = Option(_root_.scalapb.LiteParser.readMessage(_input__, __timestamp.getOrElse(com.google.protobuf.timestamp.Timestamp.defaultInstance)))
          case 16 =>
            __callId = _input__.readUInt64()
          case 24 =>
            __sequenceIdWithinCall = _input__.readUInt64()
          case 32 =>
            __type = io.grpc.binarylog.v1.GrpcLogEntry.EventType.fromValue(_input__.readEnum())
          case 40 =>
            __logger = io.grpc.binarylog.v1.GrpcLogEntry.Logger.fromValue(_input__.readEnum())
          case 50 =>
            __payload = io.grpc.binarylog.v1.GrpcLogEntry.Payload.ClientHeader(_root_.scalapb.LiteParser.readMessage(_input__, payload.clientHeader.getOrElse(io.grpc.binarylog.v1.ClientHeader.defaultInstance)))
          case 58 =>
            __payload = io.grpc.binarylog.v1.GrpcLogEntry.Payload.ServerHeader(_root_.scalapb.LiteParser.readMessage(_input__, payload.serverHeader.getOrElse(io.grpc.binarylog.v1.ServerHeader.defaultInstance)))
          case 66 =>
            __payload = io.grpc.binarylog.v1.GrpcLogEntry.Payload.Message(_root_.scalapb.LiteParser.readMessage(_input__, payload.message.getOrElse(io.grpc.binarylog.v1.Message.defaultInstance)))
          case 74 =>
            __payload = io.grpc.binarylog.v1.GrpcLogEntry.Payload.Trailer(_root_.scalapb.LiteParser.readMessage(_input__, payload.trailer.getOrElse(io.grpc.binarylog.v1.Trailer.defaultInstance)))
          case 80 =>
            __payloadTruncated = _input__.readBool()
          case 90 =>
            __peer = Option(_root_.scalapb.LiteParser.readMessage(_input__, __peer.getOrElse(io.grpc.binarylog.v1.Address.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      io.grpc.binarylog.v1.GrpcLogEntry(
          timestamp = __timestamp,
          callId = __callId,
          sequenceIdWithinCall = __sequenceIdWithinCall,
          `type` = __type,
          logger = __logger,
          payloadTruncated = __payloadTruncated,
          peer = __peer,
          payload = __payload
      )
    }
    def getTimestamp: com.google.protobuf.timestamp.Timestamp = timestamp.getOrElse(com.google.protobuf.timestamp.Timestamp.defaultInstance)
    def clearTimestamp: GrpcLogEntry = copy(timestamp = _root_.scala.None)
    def withTimestamp(__v: com.google.protobuf.timestamp.Timestamp): GrpcLogEntry = copy(timestamp = Option(__v))
    def withCallId(__v: _root_.scala.Long): GrpcLogEntry = copy(callId = __v)
    def withSequenceIdWithinCall(__v: _root_.scala.Long): GrpcLogEntry = copy(sequenceIdWithinCall = __v)
    def withType(__v: io.grpc.binarylog.v1.GrpcLogEntry.EventType): GrpcLogEntry = copy(`type` = __v)
    def withLogger(__v: io.grpc.binarylog.v1.GrpcLogEntry.Logger): GrpcLogEntry = copy(logger = __v)
    def getClientHeader: io.grpc.binarylog.v1.ClientHeader = payload.clientHeader.getOrElse(io.grpc.binarylog.v1.ClientHeader.defaultInstance)
    def withClientHeader(__v: io.grpc.binarylog.v1.ClientHeader): GrpcLogEntry = copy(payload = io.grpc.binarylog.v1.GrpcLogEntry.Payload.ClientHeader(__v))
    def getServerHeader: io.grpc.binarylog.v1.ServerHeader = payload.serverHeader.getOrElse(io.grpc.binarylog.v1.ServerHeader.defaultInstance)
    def withServerHeader(__v: io.grpc.binarylog.v1.ServerHeader): GrpcLogEntry = copy(payload = io.grpc.binarylog.v1.GrpcLogEntry.Payload.ServerHeader(__v))
    def getMessage: io.grpc.binarylog.v1.Message = payload.message.getOrElse(io.grpc.binarylog.v1.Message.defaultInstance)
    def withMessage(__v: io.grpc.binarylog.v1.Message): GrpcLogEntry = copy(payload = io.grpc.binarylog.v1.GrpcLogEntry.Payload.Message(__v))
    def getTrailer: io.grpc.binarylog.v1.Trailer = payload.trailer.getOrElse(io.grpc.binarylog.v1.Trailer.defaultInstance)
    def withTrailer(__v: io.grpc.binarylog.v1.Trailer): GrpcLogEntry = copy(payload = io.grpc.binarylog.v1.GrpcLogEntry.Payload.Trailer(__v))
    def withPayloadTruncated(__v: _root_.scala.Boolean): GrpcLogEntry = copy(payloadTruncated = __v)
    def getPeer: io.grpc.binarylog.v1.Address = peer.getOrElse(io.grpc.binarylog.v1.Address.defaultInstance)
    def clearPeer: GrpcLogEntry = copy(peer = _root_.scala.None)
    def withPeer(__v: io.grpc.binarylog.v1.Address): GrpcLogEntry = copy(peer = Option(__v))
    def clearPayload: GrpcLogEntry = copy(payload = io.grpc.binarylog.v1.GrpcLogEntry.Payload.Empty)
    def withPayload(__v: io.grpc.binarylog.v1.GrpcLogEntry.Payload): GrpcLogEntry = copy(payload = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => timestamp.orNull
        case 2 => {
          val __t = callId
          if (__t != 0L) __t else null
        }
        case 3 => {
          val __t = sequenceIdWithinCall
          if (__t != 0L) __t else null
        }
        case 4 => {
          val __t = `type`.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
        case 5 => {
          val __t = logger.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
        case 6 => payload.clientHeader.orNull
        case 7 => payload.serverHeader.orNull
        case 8 => payload.message.orNull
        case 9 => payload.trailer.orNull
        case 10 => {
          val __t = payloadTruncated
          if (__t != false) __t else null
        }
        case 11 => peer.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => timestamp.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => _root_.scalapb.descriptors.PLong(callId)
        case 3 => _root_.scalapb.descriptors.PLong(sequenceIdWithinCall)
        case 4 => _root_.scalapb.descriptors.PEnum(`type`.scalaValueDescriptor)
        case 5 => _root_.scalapb.descriptors.PEnum(logger.scalaValueDescriptor)
        case 6 => payload.clientHeader.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 7 => payload.serverHeader.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 8 => payload.message.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 9 => payload.trailer.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 10 => _root_.scalapb.descriptors.PBoolean(payloadTruncated)
        case 11 => peer.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = io.grpc.binarylog.v1.GrpcLogEntry
}

object GrpcLogEntry extends scalapb.GeneratedMessageCompanion[io.grpc.binarylog.v1.GrpcLogEntry] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.grpc.binarylog.v1.GrpcLogEntry] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): io.grpc.binarylog.v1.GrpcLogEntry = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    io.grpc.binarylog.v1.GrpcLogEntry(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[com.google.protobuf.timestamp.Timestamp]],
      __fieldsMap.getOrElse(__fields.get(1), 0L).asInstanceOf[_root_.scala.Long],
      __fieldsMap.getOrElse(__fields.get(2), 0L).asInstanceOf[_root_.scala.Long],
      io.grpc.binarylog.v1.GrpcLogEntry.EventType.fromValue(__fieldsMap.getOrElse(__fields.get(3), io.grpc.binarylog.v1.GrpcLogEntry.EventType.EVENT_TYPE_UNKNOWN.javaValueDescriptor).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      io.grpc.binarylog.v1.GrpcLogEntry.Logger.fromValue(__fieldsMap.getOrElse(__fields.get(4), io.grpc.binarylog.v1.GrpcLogEntry.Logger.LOGGER_UNKNOWN.javaValueDescriptor).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      __fieldsMap.getOrElse(__fields.get(9), false).asInstanceOf[_root_.scala.Boolean],
      __fieldsMap.get(__fields.get(10)).asInstanceOf[_root_.scala.Option[io.grpc.binarylog.v1.Address]],
      payload = __fieldsMap.get(__fields.get(5)).asInstanceOf[_root_.scala.Option[io.grpc.binarylog.v1.ClientHeader]].map(io.grpc.binarylog.v1.GrpcLogEntry.Payload.ClientHeader)
    .orElse[io.grpc.binarylog.v1.GrpcLogEntry.Payload](__fieldsMap.get(__fields.get(6)).asInstanceOf[_root_.scala.Option[io.grpc.binarylog.v1.ServerHeader]].map(io.grpc.binarylog.v1.GrpcLogEntry.Payload.ServerHeader))
    .orElse[io.grpc.binarylog.v1.GrpcLogEntry.Payload](__fieldsMap.get(__fields.get(7)).asInstanceOf[_root_.scala.Option[io.grpc.binarylog.v1.Message]].map(io.grpc.binarylog.v1.GrpcLogEntry.Payload.Message))
    .orElse[io.grpc.binarylog.v1.GrpcLogEntry.Payload](__fieldsMap.get(__fields.get(8)).asInstanceOf[_root_.scala.Option[io.grpc.binarylog.v1.Trailer]].map(io.grpc.binarylog.v1.GrpcLogEntry.Payload.Trailer))
    .getOrElse(io.grpc.binarylog.v1.GrpcLogEntry.Payload.Empty)
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.grpc.binarylog.v1.GrpcLogEntry] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      io.grpc.binarylog.v1.GrpcLogEntry(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.timestamp.Timestamp]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Long]).getOrElse(0L),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Long]).getOrElse(0L),
        io.grpc.binarylog.v1.GrpcLogEntry.EventType.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(io.grpc.binarylog.v1.GrpcLogEntry.EventType.EVENT_TYPE_UNKNOWN.scalaValueDescriptor).number),
        io.grpc.binarylog.v1.GrpcLogEntry.Logger.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(io.grpc.binarylog.v1.GrpcLogEntry.Logger.LOGGER_UNKNOWN.scalaValueDescriptor).number),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(10).get).map(_.as[_root_.scala.Boolean]).getOrElse(false),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(11).get).flatMap(_.as[_root_.scala.Option[io.grpc.binarylog.v1.Address]]),
        payload = __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).flatMap(_.as[_root_.scala.Option[io.grpc.binarylog.v1.ClientHeader]]).map(io.grpc.binarylog.v1.GrpcLogEntry.Payload.ClientHeader)
    .orElse[io.grpc.binarylog.v1.GrpcLogEntry.Payload](__fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).flatMap(_.as[_root_.scala.Option[io.grpc.binarylog.v1.ServerHeader]]).map(io.grpc.binarylog.v1.GrpcLogEntry.Payload.ServerHeader))
    .orElse[io.grpc.binarylog.v1.GrpcLogEntry.Payload](__fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).flatMap(_.as[_root_.scala.Option[io.grpc.binarylog.v1.Message]]).map(io.grpc.binarylog.v1.GrpcLogEntry.Payload.Message))
    .orElse[io.grpc.binarylog.v1.GrpcLogEntry.Payload](__fieldsMap.get(scalaDescriptor.findFieldByNumber(9).get).flatMap(_.as[_root_.scala.Option[io.grpc.binarylog.v1.Trailer]]).map(io.grpc.binarylog.v1.GrpcLogEntry.Payload.Trailer))
    .getOrElse(io.grpc.binarylog.v1.GrpcLogEntry.Payload.Empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = BinarylogProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = BinarylogProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.google.protobuf.timestamp.Timestamp
      case 6 => __out = io.grpc.binarylog.v1.ClientHeader
      case 7 => __out = io.grpc.binarylog.v1.ServerHeader
      case 8 => __out = io.grpc.binarylog.v1.Message
      case 9 => __out = io.grpc.binarylog.v1.Trailer
      case 11 => __out = io.grpc.binarylog.v1.Address
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 4 => io.grpc.binarylog.v1.GrpcLogEntry.EventType
      case 5 => io.grpc.binarylog.v1.GrpcLogEntry.Logger
    }
  }
  lazy val defaultInstance = io.grpc.binarylog.v1.GrpcLogEntry(
    timestamp = _root_.scala.None,
    callId = 0L,
    sequenceIdWithinCall = 0L,
    `type` = io.grpc.binarylog.v1.GrpcLogEntry.EventType.EVENT_TYPE_UNKNOWN,
    logger = io.grpc.binarylog.v1.GrpcLogEntry.Logger.LOGGER_UNKNOWN,
    payloadTruncated = false,
    peer = _root_.scala.None,
    payload = io.grpc.binarylog.v1.GrpcLogEntry.Payload.Empty
  )
  /** Enumerates the type of event
    * Note the terminology is different from the RPC semantics
    * definition, but the same meaning is expressed here.
    */
  sealed trait EventType extends _root_.scalapb.GeneratedEnum {
    type EnumType = EventType
    def isEventTypeUnknown: _root_.scala.Boolean = false
    def isEventTypeClientHeader: _root_.scala.Boolean = false
    def isEventTypeServerHeader: _root_.scala.Boolean = false
    def isEventTypeClientMessage: _root_.scala.Boolean = false
    def isEventTypeServerMessage: _root_.scala.Boolean = false
    def isEventTypeClientHalfClose: _root_.scala.Boolean = false
    def isEventTypeServerTrailer: _root_.scala.Boolean = false
    def isEventTypeCancel: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[EventType] = io.grpc.binarylog.v1.GrpcLogEntry.EventType
  }
  
  object EventType extends _root_.scalapb.GeneratedEnumCompanion[EventType] {
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[EventType] = this
    @SerialVersionUID(0L)
    case object EVENT_TYPE_UNKNOWN extends EventType {
      val value = 0
      val index = 0
      val name = "EVENT_TYPE_UNKNOWN"
      override def isEventTypeUnknown: _root_.scala.Boolean = true
    }
    
    /** Header sent from client to server
      */
    @SerialVersionUID(0L)
    case object EVENT_TYPE_CLIENT_HEADER extends EventType {
      val value = 1
      val index = 1
      val name = "EVENT_TYPE_CLIENT_HEADER"
      override def isEventTypeClientHeader: _root_.scala.Boolean = true
    }
    
    /** Header sent from server to client
      */
    @SerialVersionUID(0L)
    case object EVENT_TYPE_SERVER_HEADER extends EventType {
      val value = 2
      val index = 2
      val name = "EVENT_TYPE_SERVER_HEADER"
      override def isEventTypeServerHeader: _root_.scala.Boolean = true
    }
    
    /** Message sent from client to server
      */
    @SerialVersionUID(0L)
    case object EVENT_TYPE_CLIENT_MESSAGE extends EventType {
      val value = 3
      val index = 3
      val name = "EVENT_TYPE_CLIENT_MESSAGE"
      override def isEventTypeClientMessage: _root_.scala.Boolean = true
    }
    
    /** Message sent from server to client
      */
    @SerialVersionUID(0L)
    case object EVENT_TYPE_SERVER_MESSAGE extends EventType {
      val value = 4
      val index = 4
      val name = "EVENT_TYPE_SERVER_MESSAGE"
      override def isEventTypeServerMessage: _root_.scala.Boolean = true
    }
    
    /** A signal that client is done sending
      */
    @SerialVersionUID(0L)
    case object EVENT_TYPE_CLIENT_HALF_CLOSE extends EventType {
      val value = 5
      val index = 5
      val name = "EVENT_TYPE_CLIENT_HALF_CLOSE"
      override def isEventTypeClientHalfClose: _root_.scala.Boolean = true
    }
    
    /** Trailer indicates the end of the RPC.
      * On client side, this event means a trailer was either received
      * from the network or the gRPC library locally generated a status
      * to inform the application about a failure.
      * On server side, this event means the server application requested
      * to send a trailer. Note: EVENT_TYPE_CANCEL may still arrive after
      * this due to races on server side.
      */
    @SerialVersionUID(0L)
    case object EVENT_TYPE_SERVER_TRAILER extends EventType {
      val value = 6
      val index = 6
      val name = "EVENT_TYPE_SERVER_TRAILER"
      override def isEventTypeServerTrailer: _root_.scala.Boolean = true
    }
    
    /** A signal that the RPC is cancelled. On client side, this
      * indicates the client application requests a cancellation.
      * On server side, this indicates that cancellation was detected.
      * Note: This marks the end of the RPC. Events may arrive after
      * this due to races. For example, on client side a trailer
      * may arrive even though the application requested to cancel the RPC.
      */
    @SerialVersionUID(0L)
    case object EVENT_TYPE_CANCEL extends EventType {
      val value = 7
      val index = 7
      val name = "EVENT_TYPE_CANCEL"
      override def isEventTypeCancel: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(value: _root_.scala.Int) extends EventType with _root_.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.immutable.Seq(EVENT_TYPE_UNKNOWN, EVENT_TYPE_CLIENT_HEADER, EVENT_TYPE_SERVER_HEADER, EVENT_TYPE_CLIENT_MESSAGE, EVENT_TYPE_SERVER_MESSAGE, EVENT_TYPE_CLIENT_HALF_CLOSE, EVENT_TYPE_SERVER_TRAILER, EVENT_TYPE_CANCEL)
    def fromValue(value: _root_.scala.Int): EventType = value match {
      case 0 => EVENT_TYPE_UNKNOWN
      case 1 => EVENT_TYPE_CLIENT_HEADER
      case 2 => EVENT_TYPE_SERVER_HEADER
      case 3 => EVENT_TYPE_CLIENT_MESSAGE
      case 4 => EVENT_TYPE_SERVER_MESSAGE
      case 5 => EVENT_TYPE_CLIENT_HALF_CLOSE
      case 6 => EVENT_TYPE_SERVER_TRAILER
      case 7 => EVENT_TYPE_CANCEL
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = io.grpc.binarylog.v1.GrpcLogEntry.javaDescriptor.getEnumTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = io.grpc.binarylog.v1.GrpcLogEntry.scalaDescriptor.enums(0)
  }
  /** Enumerates the entity that generates the log entry
    */
  sealed trait Logger extends _root_.scalapb.GeneratedEnum {
    type EnumType = Logger
    def isLoggerUnknown: _root_.scala.Boolean = false
    def isLoggerClient: _root_.scala.Boolean = false
    def isLoggerServer: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[Logger] = io.grpc.binarylog.v1.GrpcLogEntry.Logger
  }
  
  object Logger extends _root_.scalapb.GeneratedEnumCompanion[Logger] {
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[Logger] = this
    @SerialVersionUID(0L)
    case object LOGGER_UNKNOWN extends Logger {
      val value = 0
      val index = 0
      val name = "LOGGER_UNKNOWN"
      override def isLoggerUnknown: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object LOGGER_CLIENT extends Logger {
      val value = 1
      val index = 1
      val name = "LOGGER_CLIENT"
      override def isLoggerClient: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    case object LOGGER_SERVER extends Logger {
      val value = 2
      val index = 2
      val name = "LOGGER_SERVER"
      override def isLoggerServer: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(value: _root_.scala.Int) extends Logger with _root_.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.immutable.Seq(LOGGER_UNKNOWN, LOGGER_CLIENT, LOGGER_SERVER)
    def fromValue(value: _root_.scala.Int): Logger = value match {
      case 0 => LOGGER_UNKNOWN
      case 1 => LOGGER_CLIENT
      case 2 => LOGGER_SERVER
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = io.grpc.binarylog.v1.GrpcLogEntry.javaDescriptor.getEnumTypes.get(1)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = io.grpc.binarylog.v1.GrpcLogEntry.scalaDescriptor.enums(1)
  }
  sealed trait Payload extends _root_.scalapb.GeneratedOneof {
    def isEmpty: _root_.scala.Boolean = false
    def isDefined: _root_.scala.Boolean = true
    def isClientHeader: _root_.scala.Boolean = false
    def isServerHeader: _root_.scala.Boolean = false
    def isMessage: _root_.scala.Boolean = false
    def isTrailer: _root_.scala.Boolean = false
    def clientHeader: _root_.scala.Option[io.grpc.binarylog.v1.ClientHeader] = _root_.scala.None
    def serverHeader: _root_.scala.Option[io.grpc.binarylog.v1.ServerHeader] = _root_.scala.None
    def message: _root_.scala.Option[io.grpc.binarylog.v1.Message] = _root_.scala.None
    def trailer: _root_.scala.Option[io.grpc.binarylog.v1.Trailer] = _root_.scala.None
  }
  object Payload extends {
    @SerialVersionUID(0L)
    case object Empty extends io.grpc.binarylog.v1.GrpcLogEntry.Payload {
      type ValueType = _root_.scala.Nothing
      override def isEmpty: _root_.scala.Boolean = true
      override def isDefined: _root_.scala.Boolean = false
      override def number: _root_.scala.Int = 0
      override def value: _root_.scala.Nothing = throw new java.util.NoSuchElementException("Empty.value")
    }
  
    @SerialVersionUID(0L)
    final case class ClientHeader(value: io.grpc.binarylog.v1.ClientHeader) extends io.grpc.binarylog.v1.GrpcLogEntry.Payload {
      type ValueType = io.grpc.binarylog.v1.ClientHeader
      override def isClientHeader: _root_.scala.Boolean = true
      override def clientHeader: _root_.scala.Option[io.grpc.binarylog.v1.ClientHeader] = Some(value)
      override def number: _root_.scala.Int = 6
    }
    @SerialVersionUID(0L)
    final case class ServerHeader(value: io.grpc.binarylog.v1.ServerHeader) extends io.grpc.binarylog.v1.GrpcLogEntry.Payload {
      type ValueType = io.grpc.binarylog.v1.ServerHeader
      override def isServerHeader: _root_.scala.Boolean = true
      override def serverHeader: _root_.scala.Option[io.grpc.binarylog.v1.ServerHeader] = Some(value)
      override def number: _root_.scala.Int = 7
    }
    @SerialVersionUID(0L)
    final case class Message(value: io.grpc.binarylog.v1.Message) extends io.grpc.binarylog.v1.GrpcLogEntry.Payload {
      type ValueType = io.grpc.binarylog.v1.Message
      override def isMessage: _root_.scala.Boolean = true
      override def message: _root_.scala.Option[io.grpc.binarylog.v1.Message] = Some(value)
      override def number: _root_.scala.Int = 8
    }
    @SerialVersionUID(0L)
    final case class Trailer(value: io.grpc.binarylog.v1.Trailer) extends io.grpc.binarylog.v1.GrpcLogEntry.Payload {
      type ValueType = io.grpc.binarylog.v1.Trailer
      override def isTrailer: _root_.scala.Boolean = true
      override def trailer: _root_.scala.Option[io.grpc.binarylog.v1.Trailer] = Some(value)
      override def number: _root_.scala.Int = 9
    }
  }
  implicit class GrpcLogEntryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.binarylog.v1.GrpcLogEntry]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.grpc.binarylog.v1.GrpcLogEntry](_l) {
    def timestamp: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.timestamp.Timestamp] = field(_.getTimestamp)((c_, f_) => c_.copy(timestamp = Option(f_)))
    def optionalTimestamp: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.timestamp.Timestamp]] = field(_.timestamp)((c_, f_) => c_.copy(timestamp = f_))
    def callId: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Long] = field(_.callId)((c_, f_) => c_.copy(callId = f_))
    def sequenceIdWithinCall: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Long] = field(_.sequenceIdWithinCall)((c_, f_) => c_.copy(sequenceIdWithinCall = f_))
    def `type`: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.binarylog.v1.GrpcLogEntry.EventType] = field(_.`type`)((c_, f_) => c_.copy(`type` = f_))
    def logger: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.binarylog.v1.GrpcLogEntry.Logger] = field(_.logger)((c_, f_) => c_.copy(logger = f_))
    def clientHeader: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.binarylog.v1.ClientHeader] = field(_.getClientHeader)((c_, f_) => c_.copy(payload = io.grpc.binarylog.v1.GrpcLogEntry.Payload.ClientHeader(f_)))
    def serverHeader: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.binarylog.v1.ServerHeader] = field(_.getServerHeader)((c_, f_) => c_.copy(payload = io.grpc.binarylog.v1.GrpcLogEntry.Payload.ServerHeader(f_)))
    def message: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.binarylog.v1.Message] = field(_.getMessage)((c_, f_) => c_.copy(payload = io.grpc.binarylog.v1.GrpcLogEntry.Payload.Message(f_)))
    def trailer: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.binarylog.v1.Trailer] = field(_.getTrailer)((c_, f_) => c_.copy(payload = io.grpc.binarylog.v1.GrpcLogEntry.Payload.Trailer(f_)))
    def payloadTruncated: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.payloadTruncated)((c_, f_) => c_.copy(payloadTruncated = f_))
    def peer: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.binarylog.v1.Address] = field(_.getPeer)((c_, f_) => c_.copy(peer = Option(f_)))
    def optionalPeer: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[io.grpc.binarylog.v1.Address]] = field(_.peer)((c_, f_) => c_.copy(peer = f_))
    def payload: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.binarylog.v1.GrpcLogEntry.Payload] = field(_.payload)((c_, f_) => c_.copy(payload = f_))
  }
  final val TIMESTAMP_FIELD_NUMBER = 1
  final val CALL_ID_FIELD_NUMBER = 2
  final val SEQUENCE_ID_WITHIN_CALL_FIELD_NUMBER = 3
  final val TYPE_FIELD_NUMBER = 4
  final val LOGGER_FIELD_NUMBER = 5
  final val CLIENT_HEADER_FIELD_NUMBER = 6
  final val SERVER_HEADER_FIELD_NUMBER = 7
  final val MESSAGE_FIELD_NUMBER = 8
  final val TRAILER_FIELD_NUMBER = 9
  final val PAYLOAD_TRUNCATED_FIELD_NUMBER = 10
  final val PEER_FIELD_NUMBER = 11
  def of(
    timestamp: _root_.scala.Option[com.google.protobuf.timestamp.Timestamp],
    callId: _root_.scala.Long,
    sequenceIdWithinCall: _root_.scala.Long,
    `type`: io.grpc.binarylog.v1.GrpcLogEntry.EventType,
    logger: io.grpc.binarylog.v1.GrpcLogEntry.Logger,
    payloadTruncated: _root_.scala.Boolean,
    peer: _root_.scala.Option[io.grpc.binarylog.v1.Address],
    payload: io.grpc.binarylog.v1.GrpcLogEntry.Payload
  ): _root_.io.grpc.binarylog.v1.GrpcLogEntry = _root_.io.grpc.binarylog.v1.GrpcLogEntry(
    timestamp,
    callId,
    sequenceIdWithinCall,
    `type`,
    logger,
    payloadTruncated,
    peer,
    payload
  )
}
