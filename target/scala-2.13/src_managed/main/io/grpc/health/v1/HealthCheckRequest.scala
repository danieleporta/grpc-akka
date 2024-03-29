// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.grpc.health.v1

@SerialVersionUID(0L)
final case class HealthCheckRequest(
    service: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[HealthCheckRequest] with scalapb.lenses.Updatable[HealthCheckRequest] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = service
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
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
        val __v = service
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): io.grpc.health.v1.HealthCheckRequest = {
      var __service = this.service
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __service = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      io.grpc.health.v1.HealthCheckRequest(
          service = __service
      )
    }
    def withService(__v: _root_.scala.Predef.String): HealthCheckRequest = copy(service = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = service
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(service)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = io.grpc.health.v1.HealthCheckRequest
}

object HealthCheckRequest extends scalapb.GeneratedMessageCompanion[io.grpc.health.v1.HealthCheckRequest] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.grpc.health.v1.HealthCheckRequest] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): io.grpc.health.v1.HealthCheckRequest = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    io.grpc.health.v1.HealthCheckRequest(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.grpc.health.v1.HealthCheckRequest] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      io.grpc.health.v1.HealthCheckRequest(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = HealthProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = HealthProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = io.grpc.health.v1.HealthCheckRequest(
    service = ""
  )
  implicit class HealthCheckRequestLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.health.v1.HealthCheckRequest]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.grpc.health.v1.HealthCheckRequest](_l) {
    def service: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.service)((c_, f_) => c_.copy(service = f_))
  }
  final val SERVICE_FIELD_NUMBER = 1
  def of(
    service: _root_.scala.Predef.String
  ): _root_.io.grpc.health.v1.HealthCheckRequest = _root_.io.grpc.health.v1.HealthCheckRequest(
    service
  )
}
