// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package io.grpc.binarylog.v1

/** Address information
  *
  * @param ipPort
  *   only for TYPE_IPV4 and TYPE_IPV6
  */
@SerialVersionUID(0L)
final case class Address(
    `type`: io.grpc.binarylog.v1.Address.Type = io.grpc.binarylog.v1.Address.Type.TYPE_UNKNOWN,
    address: _root_.scala.Predef.String = "",
    ipPort: _root_.scala.Int = 0
    ) extends scalapb.GeneratedMessage with scalapb.Message[Address] with scalapb.lenses.Updatable[Address] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = `type`
        if (__value != io.grpc.binarylog.v1.Address.Type.TYPE_UNKNOWN) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(1, __value.value)
        }
      };
      
      {
        val __value = address
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = ipPort
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeUInt32Size(3, __value)
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
        val __v = `type`
        if (__v != io.grpc.binarylog.v1.Address.Type.TYPE_UNKNOWN) {
          _output__.writeEnum(1, __v.value)
        }
      };
      {
        val __v = address
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = ipPort
        if (__v != 0) {
          _output__.writeUInt32(3, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): io.grpc.binarylog.v1.Address = {
      var __type = this.`type`
      var __address = this.address
      var __ipPort = this.ipPort
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __type = io.grpc.binarylog.v1.Address.Type.fromValue(_input__.readEnum())
          case 18 =>
            __address = _input__.readString()
          case 24 =>
            __ipPort = _input__.readUInt32()
          case tag => _input__.skipField(tag)
        }
      }
      io.grpc.binarylog.v1.Address(
          `type` = __type,
          address = __address,
          ipPort = __ipPort
      )
    }
    def withType(__v: io.grpc.binarylog.v1.Address.Type): Address = copy(`type` = __v)
    def withAddress(__v: _root_.scala.Predef.String): Address = copy(address = __v)
    def withIpPort(__v: _root_.scala.Int): Address = copy(ipPort = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = `type`.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
        case 2 => {
          val __t = address
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = ipPort
          if (__t != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PEnum(`type`.scalaValueDescriptor)
        case 2 => _root_.scalapb.descriptors.PString(address)
        case 3 => _root_.scalapb.descriptors.PInt(ipPort)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = io.grpc.binarylog.v1.Address
}

object Address extends scalapb.GeneratedMessageCompanion[io.grpc.binarylog.v1.Address] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[io.grpc.binarylog.v1.Address] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): io.grpc.binarylog.v1.Address = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    io.grpc.binarylog.v1.Address(
      io.grpc.binarylog.v1.Address.Type.fromValue(__fieldsMap.getOrElse(__fields.get(0), io.grpc.binarylog.v1.Address.Type.TYPE_UNKNOWN.javaValueDescriptor).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(2), 0).asInstanceOf[_root_.scala.Int]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[io.grpc.binarylog.v1.Address] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      io.grpc.binarylog.v1.Address(
        io.grpc.binarylog.v1.Address.Type.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(io.grpc.binarylog.v1.Address.Type.TYPE_UNKNOWN.scalaValueDescriptor).number),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Int]).getOrElse(0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = BinarylogProto.javaDescriptor.getMessageTypes.get(7)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = BinarylogProto.scalaDescriptor.messages(7)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 1 => io.grpc.binarylog.v1.Address.Type
    }
  }
  lazy val defaultInstance = io.grpc.binarylog.v1.Address(
    `type` = io.grpc.binarylog.v1.Address.Type.TYPE_UNKNOWN,
    address = "",
    ipPort = 0
  )
  sealed trait Type extends _root_.scalapb.GeneratedEnum {
    type EnumType = Type
    def isTypeUnknown: _root_.scala.Boolean = false
    def isTypeIpv4: _root_.scala.Boolean = false
    def isTypeIpv6: _root_.scala.Boolean = false
    def isTypeUnix: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[Type] = io.grpc.binarylog.v1.Address.Type
  }
  
  object Type extends _root_.scalapb.GeneratedEnumCompanion[Type] {
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[Type] = this
    @SerialVersionUID(0L)
    case object TYPE_UNKNOWN extends Type {
      val value = 0
      val index = 0
      val name = "TYPE_UNKNOWN"
      override def isTypeUnknown: _root_.scala.Boolean = true
    }
    
    /** address is in 1.2.3.4 form
      */
    @SerialVersionUID(0L)
    case object TYPE_IPV4 extends Type {
      val value = 1
      val index = 1
      val name = "TYPE_IPV4"
      override def isTypeIpv4: _root_.scala.Boolean = true
    }
    
    /** address is in IPv6 canonical form (RFC5952 section 4)
      * The scope is NOT included in the address string.
      */
    @SerialVersionUID(0L)
    case object TYPE_IPV6 extends Type {
      val value = 2
      val index = 2
      val name = "TYPE_IPV6"
      override def isTypeIpv6: _root_.scala.Boolean = true
    }
    
    /** address is UDS string
      */
    @SerialVersionUID(0L)
    case object TYPE_UNIX extends Type {
      val value = 3
      val index = 3
      val name = "TYPE_UNIX"
      override def isTypeUnix: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(value: _root_.scala.Int) extends Type with _root_.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.immutable.Seq(TYPE_UNKNOWN, TYPE_IPV4, TYPE_IPV6, TYPE_UNIX)
    def fromValue(value: _root_.scala.Int): Type = value match {
      case 0 => TYPE_UNKNOWN
      case 1 => TYPE_IPV4
      case 2 => TYPE_IPV6
      case 3 => TYPE_UNIX
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = io.grpc.binarylog.v1.Address.javaDescriptor.getEnumTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = io.grpc.binarylog.v1.Address.scalaDescriptor.enums(0)
  }
  implicit class AddressLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.binarylog.v1.Address]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, io.grpc.binarylog.v1.Address](_l) {
    def `type`: _root_.scalapb.lenses.Lens[UpperPB, io.grpc.binarylog.v1.Address.Type] = field(_.`type`)((c_, f_) => c_.copy(`type` = f_))
    def address: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.address)((c_, f_) => c_.copy(address = f_))
    def ipPort: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.ipPort)((c_, f_) => c_.copy(ipPort = f_))
  }
  final val TYPE_FIELD_NUMBER = 1
  final val ADDRESS_FIELD_NUMBER = 2
  final val IP_PORT_FIELD_NUMBER = 3
  def of(
    `type`: io.grpc.binarylog.v1.Address.Type,
    address: _root_.scala.Predef.String,
    ipPort: _root_.scala.Int
  ): _root_.io.grpc.binarylog.v1.Address = _root_.io.grpc.binarylog.v1.Address(
    `type`,
    address,
    ipPort
  )
}
