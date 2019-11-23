// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api

/** A description of a label.
  *
  * @param key
  *   The label key.
  * @param valueType
  *   The type of data that can be assigned to the label.
  * @param description
  *   A human-readable description for the label.
  */
@SerialVersionUID(0L)
final case class LabelDescriptor(
    key: _root_.scala.Predef.String = "",
    valueType: com.google.api.LabelDescriptor.ValueTypeEnum = com.google.api.LabelDescriptor.ValueTypeEnum.STRING,
    description: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[LabelDescriptor] with scalapb.lenses.Updatable[LabelDescriptor] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = key
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = valueType
        if (__value != com.google.api.LabelDescriptor.ValueTypeEnum.STRING) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(2, __value.value)
        }
      };
      
      {
        val __value = description
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
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
        val __v = key
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = valueType
        if (__v != com.google.api.LabelDescriptor.ValueTypeEnum.STRING) {
          _output__.writeEnum(2, __v.value)
        }
      };
      {
        val __v = description
        if (__v != "") {
          _output__.writeString(3, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.LabelDescriptor = {
      var __key = this.key
      var __valueType = this.valueType
      var __description = this.description
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __key = _input__.readString()
          case 16 =>
            __valueType = com.google.api.LabelDescriptor.ValueTypeEnum.fromValue(_input__.readEnum())
          case 26 =>
            __description = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.api.LabelDescriptor(
          key = __key,
          valueType = __valueType,
          description = __description
      )
    }
    def withKey(__v: _root_.scala.Predef.String): LabelDescriptor = copy(key = __v)
    def withValueType(__v: com.google.api.LabelDescriptor.ValueTypeEnum): LabelDescriptor = copy(valueType = __v)
    def withDescription(__v: _root_.scala.Predef.String): LabelDescriptor = copy(description = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = key
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = valueType.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
        case 3 => {
          val __t = description
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(key)
        case 2 => _root_.scalapb.descriptors.PEnum(valueType.scalaValueDescriptor)
        case 3 => _root_.scalapb.descriptors.PString(description)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.api.LabelDescriptor
}

object LabelDescriptor extends scalapb.GeneratedMessageCompanion[com.google.api.LabelDescriptor] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.LabelDescriptor] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.LabelDescriptor = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.api.LabelDescriptor(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      com.google.api.LabelDescriptor.ValueTypeEnum.fromValue(__fieldsMap.getOrElse(__fields.get(1), com.google.api.LabelDescriptor.ValueTypeEnum.STRING.javaValueDescriptor).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      __fieldsMap.getOrElse(__fields.get(2), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.LabelDescriptor] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.api.LabelDescriptor(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        com.google.api.LabelDescriptor.ValueTypeEnum.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(com.google.api.LabelDescriptor.ValueTypeEnum.STRING.scalaValueDescriptor).number),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = LabelProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = LabelProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 2 => com.google.api.LabelDescriptor.ValueTypeEnum
    }
  }
  lazy val defaultInstance = com.google.api.LabelDescriptor(
    key = "",
    valueType = com.google.api.LabelDescriptor.ValueTypeEnum.STRING,
    description = ""
  )
  /** Value types that can be used as label values.
    */
  sealed trait ValueTypeEnum extends _root_.scalapb.GeneratedEnum {
    type EnumType = ValueTypeEnum
    def isString: _root_.scala.Boolean = false
    def isBool: _root_.scala.Boolean = false
    def isInt64: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[ValueTypeEnum] = com.google.api.LabelDescriptor.ValueTypeEnum
  }
  
  object ValueTypeEnum extends _root_.scalapb.GeneratedEnumCompanion[ValueTypeEnum] {
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[ValueTypeEnum] = this
    /** A variable-length string. This is the default.
      */
    @SerialVersionUID(0L)
    case object STRING extends ValueTypeEnum {
      val value = 0
      val index = 0
      val name = "STRING"
      override def isString: _root_.scala.Boolean = true
    }
    
    /** Boolean; true or false.
      */
    @SerialVersionUID(0L)
    case object BOOL extends ValueTypeEnum {
      val value = 1
      val index = 1
      val name = "BOOL"
      override def isBool: _root_.scala.Boolean = true
    }
    
    /** A 64-bit signed integer.
      */
    @SerialVersionUID(0L)
    case object INT64 extends ValueTypeEnum {
      val value = 2
      val index = 2
      val name = "INT64"
      override def isInt64: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(value: _root_.scala.Int) extends ValueTypeEnum with _root_.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.immutable.Seq(STRING, BOOL, INT64)
    def fromValue(value: _root_.scala.Int): ValueTypeEnum = value match {
      case 0 => STRING
      case 1 => BOOL
      case 2 => INT64
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = com.google.api.LabelDescriptor.javaDescriptor.getEnumTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = com.google.api.LabelDescriptor.scalaDescriptor.enums(0)
  }
  implicit class LabelDescriptorLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.LabelDescriptor]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.LabelDescriptor](_l) {
    def key: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.key)((c_, f_) => c_.copy(key = f_))
    def valueType: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.LabelDescriptor.ValueTypeEnum] = field(_.valueType)((c_, f_) => c_.copy(valueType = f_))
    def description: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.description)((c_, f_) => c_.copy(description = f_))
  }
  final val KEY_FIELD_NUMBER = 1
  final val VALUE_TYPE_FIELD_NUMBER = 2
  final val DESCRIPTION_FIELD_NUMBER = 3
  def of(
    key: _root_.scala.Predef.String,
    valueType: com.google.api.LabelDescriptor.ValueTypeEnum,
    description: _root_.scala.Predef.String
  ): _root_.com.google.api.LabelDescriptor = _root_.com.google.api.LabelDescriptor(
    key,
    valueType,
    description
  )
}