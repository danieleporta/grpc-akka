// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api

/** Output generated from semantically comparing two versions of a service
  * configuration.
  *
  * Includes detailed information about a field that have changed with
  * applicable advice about potential consequences for the change, such as
  * backwards-incompatibility.
  *
  * @param element
  *   Object hierarchy path to the change, with levels separated by a '.'
  *   character. For repeated fields, an applicable unique identifier field is
  *   used for the index (usually selector, name, or id). For maps, the term
  *   'key' is used. If the field has no unique identifier, the numeric index
  *   is used.
  *   Examples:
  *   - visibility.rules[selector=="google.LibraryService.CreateBook"].restriction
  *   - quota.metric_rules[selector=="google"].metric_costs[key=="reads"].value
  *   - logging.producer_destinations[0]
  * @param oldValue
  *   Value of the changed object in the old Service configuration,
  *   in JSON format. This field will not be populated if ChangeType == ADDED.
  * @param newValue
  *   Value of the changed object in the new Service configuration,
  *   in JSON format. This field will not be populated if ChangeType == REMOVED.
  * @param changeType
  *   The type for this change, either ADDED, REMOVED, or MODIFIED.
  * @param advices
  *   Collection of advice provided for this change, useful for determining the
  *   possible impact of this change.
  */
@SerialVersionUID(0L)
final case class ConfigChange(
    element: _root_.scala.Predef.String = "",
    oldValue: _root_.scala.Predef.String = "",
    newValue: _root_.scala.Predef.String = "",
    changeType: com.google.api.ChangeType = com.google.api.ChangeType.CHANGE_TYPE_UNSPECIFIED,
    advices: _root_.scala.Seq[com.google.api.Advice] = _root_.scala.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[ConfigChange] with scalapb.lenses.Updatable[ConfigChange] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = element
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = oldValue
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      
      {
        val __value = newValue
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
        }
      };
      
      {
        val __value = changeType
        if (__value != com.google.api.ChangeType.CHANGE_TYPE_UNSPECIFIED) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(4, __value.value)
        }
      };
      advices.foreach { __item =>
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
      {
        val __v = element
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = oldValue
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
      {
        val __v = newValue
        if (__v != "") {
          _output__.writeString(3, __v)
        }
      };
      {
        val __v = changeType
        if (__v != com.google.api.ChangeType.CHANGE_TYPE_UNSPECIFIED) {
          _output__.writeEnum(4, __v.value)
        }
      };
      advices.foreach { __v =>
        val __m = __v
        _output__.writeTag(5, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.ConfigChange = {
      var __element = this.element
      var __oldValue = this.oldValue
      var __newValue = this.newValue
      var __changeType = this.changeType
      val __advices = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.api.Advice] ++= this.advices)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __element = _input__.readString()
          case 18 =>
            __oldValue = _input__.readString()
          case 26 =>
            __newValue = _input__.readString()
          case 32 =>
            __changeType = com.google.api.ChangeType.fromValue(_input__.readEnum())
          case 42 =>
            __advices += _root_.scalapb.LiteParser.readMessage(_input__, com.google.api.Advice.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      com.google.api.ConfigChange(
          element = __element,
          oldValue = __oldValue,
          newValue = __newValue,
          changeType = __changeType,
          advices = __advices.result()
      )
    }
    def withElement(__v: _root_.scala.Predef.String): ConfigChange = copy(element = __v)
    def withOldValue(__v: _root_.scala.Predef.String): ConfigChange = copy(oldValue = __v)
    def withNewValue(__v: _root_.scala.Predef.String): ConfigChange = copy(newValue = __v)
    def withChangeType(__v: com.google.api.ChangeType): ConfigChange = copy(changeType = __v)
    def clearAdvices = copy(advices = _root_.scala.Seq.empty)
    def addAdvices(__vs: com.google.api.Advice*): ConfigChange = addAllAdvices(__vs)
    def addAllAdvices(__vs: Iterable[com.google.api.Advice]): ConfigChange = copy(advices = advices ++ __vs)
    def withAdvices(__v: _root_.scala.Seq[com.google.api.Advice]): ConfigChange = copy(advices = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = element
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = oldValue
          if (__t != "") __t else null
        }
        case 3 => {
          val __t = newValue
          if (__t != "") __t else null
        }
        case 4 => {
          val __t = changeType.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
        case 5 => advices
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(element)
        case 2 => _root_.scalapb.descriptors.PString(oldValue)
        case 3 => _root_.scalapb.descriptors.PString(newValue)
        case 4 => _root_.scalapb.descriptors.PEnum(changeType.scalaValueDescriptor)
        case 5 => _root_.scalapb.descriptors.PRepeated(advices.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.api.ConfigChange
}

object ConfigChange extends scalapb.GeneratedMessageCompanion[com.google.api.ConfigChange] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.ConfigChange] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.ConfigChange = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.api.ConfigChange(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(2), "").asInstanceOf[_root_.scala.Predef.String],
      com.google.api.ChangeType.fromValue(__fieldsMap.getOrElse(__fields.get(3), com.google.api.ChangeType.CHANGE_TYPE_UNSPECIFIED.javaValueDescriptor).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      __fieldsMap.getOrElse(__fields.get(4), Nil).asInstanceOf[_root_.scala.Seq[com.google.api.Advice]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.ConfigChange] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.api.ConfigChange(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        com.google.api.ChangeType.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(com.google.api.ChangeType.CHANGE_TYPE_UNSPECIFIED.scalaValueDescriptor).number),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Seq[com.google.api.Advice]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ConfigChangeProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ConfigChangeProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 5 => __out = com.google.api.Advice
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 4 => com.google.api.ChangeType
    }
  }
  lazy val defaultInstance = com.google.api.ConfigChange(
    element = "",
    oldValue = "",
    newValue = "",
    changeType = com.google.api.ChangeType.CHANGE_TYPE_UNSPECIFIED,
    advices = _root_.scala.Seq.empty
  )
  implicit class ConfigChangeLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.ConfigChange]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.ConfigChange](_l) {
    def element: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.element)((c_, f_) => c_.copy(element = f_))
    def oldValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.oldValue)((c_, f_) => c_.copy(oldValue = f_))
    def newValue: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.newValue)((c_, f_) => c_.copy(newValue = f_))
    def changeType: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.ChangeType] = field(_.changeType)((c_, f_) => c_.copy(changeType = f_))
    def advices: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.api.Advice]] = field(_.advices)((c_, f_) => c_.copy(advices = f_))
  }
  final val ELEMENT_FIELD_NUMBER = 1
  final val OLD_VALUE_FIELD_NUMBER = 2
  final val NEW_VALUE_FIELD_NUMBER = 3
  final val CHANGE_TYPE_FIELD_NUMBER = 4
  final val ADVICES_FIELD_NUMBER = 5
  def of(
    element: _root_.scala.Predef.String,
    oldValue: _root_.scala.Predef.String,
    newValue: _root_.scala.Predef.String,
    changeType: com.google.api.ChangeType,
    advices: _root_.scala.Seq[com.google.api.Advice]
  ): _root_.com.google.api.ConfigChange = _root_.com.google.api.ConfigChange(
    element,
    oldValue,
    newValue,
    changeType,
    advices
  )
}
