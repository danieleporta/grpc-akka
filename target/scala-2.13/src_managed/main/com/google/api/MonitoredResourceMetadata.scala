// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api

/** Auxiliary metadata for a [MonitoredResource][google.api.MonitoredResource] object.
  * [MonitoredResource][google.api.MonitoredResource] objects contain the minimum set of information to
  * uniquely identify a monitored resource instance. There is some other useful
  * auxiliary metadata. Google Stackdriver Monitoring &amp; Logging uses an ingestion
  * pipeline to extract metadata for cloud resources of all types , and stores
  * the metadata in this message.
  *
  * @param systemLabels
  *   Output only. Values for predefined system metadata labels.
  *   System labels are a kind of metadata extracted by Google Stackdriver.
  *   Stackdriver determines what system labels are useful and how to obtain
  *   their values. Some examples: "machine_image", "vpc", "subnet_id",
  *   "security_group", "name", etc.
  *   System label values can be only strings, Boolean values, or a list of
  *   strings. For example:
  *  
  *       { "name": "my-test-instance",
  *         "security_group": ["a", "b", "c"],
  *         "spot_instance": false }
  * @param userLabels
  *   Output only. A map of user-defined metadata labels.
  */
@SerialVersionUID(0L)
final case class MonitoredResourceMetadata(
    systemLabels: _root_.scala.Option[com.google.protobuf.struct.Struct] = _root_.scala.None,
    userLabels: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String] = _root_.scala.collection.immutable.Map.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[MonitoredResourceMetadata] with scalapb.lenses.Updatable[MonitoredResourceMetadata] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (systemLabels.isDefined) {
        val __value = systemLabels.get
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      };
      userLabels.foreach { __item =>
        val __value = com.google.api.MonitoredResourceMetadata._typemapper_userLabels.toBase(__item)
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
      systemLabels.foreach { __v =>
        val __m = __v
        _output__.writeTag(1, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      userLabels.foreach { __v =>
        val __m = com.google.api.MonitoredResourceMetadata._typemapper_userLabels.toBase(__v)
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.MonitoredResourceMetadata = {
      var __systemLabels = this.systemLabels
      val __userLabels = (_root_.scala.collection.immutable.Map.newBuilder[_root_.scala.Predef.String, _root_.scala.Predef.String] ++= this.userLabels)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __systemLabels = Option(_root_.scalapb.LiteParser.readMessage(_input__, __systemLabels.getOrElse(com.google.protobuf.struct.Struct.defaultInstance)))
          case 18 =>
            __userLabels += com.google.api.MonitoredResourceMetadata._typemapper_userLabels.toCustom(_root_.scalapb.LiteParser.readMessage(_input__, com.google.api.MonitoredResourceMetadata.UserLabelsEntry.defaultInstance))
          case tag => _input__.skipField(tag)
        }
      }
      com.google.api.MonitoredResourceMetadata(
          systemLabels = __systemLabels,
          userLabels = __userLabels.result()
      )
    }
    def getSystemLabels: com.google.protobuf.struct.Struct = systemLabels.getOrElse(com.google.protobuf.struct.Struct.defaultInstance)
    def clearSystemLabels: MonitoredResourceMetadata = copy(systemLabels = _root_.scala.None)
    def withSystemLabels(__v: com.google.protobuf.struct.Struct): MonitoredResourceMetadata = copy(systemLabels = Option(__v))
    def clearUserLabels = copy(userLabels = _root_.scala.collection.immutable.Map.empty)
    def addUserLabels(__vs: (_root_.scala.Predef.String, _root_.scala.Predef.String)*): MonitoredResourceMetadata = addAllUserLabels(__vs)
    def addAllUserLabels(__vs: Iterable[(_root_.scala.Predef.String, _root_.scala.Predef.String)]): MonitoredResourceMetadata = copy(userLabels = userLabels ++ __vs)
    def withUserLabels(__v: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String]): MonitoredResourceMetadata = copy(userLabels = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => systemLabels.orNull
        case 2 => userLabels.iterator.map(com.google.api.MonitoredResourceMetadata._typemapper_userLabels.toBase).toSeq
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => systemLabels.map(_.toPMessage).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => _root_.scalapb.descriptors.PRepeated(userLabels.iterator.map(com.google.api.MonitoredResourceMetadata._typemapper_userLabels.toBase(_).toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.api.MonitoredResourceMetadata
}

object MonitoredResourceMetadata extends scalapb.GeneratedMessageCompanion[com.google.api.MonitoredResourceMetadata] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.MonitoredResourceMetadata] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.MonitoredResourceMetadata = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.api.MonitoredResourceMetadata(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[com.google.protobuf.struct.Struct]],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.Seq[com.google.api.MonitoredResourceMetadata.UserLabelsEntry]].iterator.map(com.google.api.MonitoredResourceMetadata._typemapper_userLabels.toCustom).toMap
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.MonitoredResourceMetadata] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.api.MonitoredResourceMetadata(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[com.google.protobuf.struct.Struct]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[com.google.api.MonitoredResourceMetadata.UserLabelsEntry]]).getOrElse(_root_.scala.Seq.empty).iterator.map(com.google.api.MonitoredResourceMetadata._typemapper_userLabels.toCustom).toMap
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = MonitoredResourceProto.javaDescriptor.getMessageTypes.get(2)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = MonitoredResourceProto.scalaDescriptor.messages(2)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 1 => __out = com.google.protobuf.struct.Struct
      case 2 => __out = com.google.api.MonitoredResourceMetadata.UserLabelsEntry
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      _root_.com.google.api.MonitoredResourceMetadata.UserLabelsEntry
    )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.api.MonitoredResourceMetadata(
    systemLabels = _root_.scala.None,
    userLabels = _root_.scala.collection.immutable.Map.empty
  )
  @SerialVersionUID(0L)
  final case class UserLabelsEntry(
      key: _root_.scala.Predef.String = "",
      value: _root_.scala.Predef.String = ""
      ) extends scalapb.GeneratedMessage with scalapb.Message[UserLabelsEntry] with scalapb.lenses.Updatable[UserLabelsEntry] {
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
          val __value = value
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
          val __v = key
          if (__v != "") {
            _output__.writeString(1, __v)
          }
        };
        {
          val __v = value
          if (__v != "") {
            _output__.writeString(2, __v)
          }
        };
      }
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.MonitoredResourceMetadata.UserLabelsEntry = {
        var __key = this.key
        var __value = this.value
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 10 =>
              __key = _input__.readString()
            case 18 =>
              __value = _input__.readString()
            case tag => _input__.skipField(tag)
          }
        }
        com.google.api.MonitoredResourceMetadata.UserLabelsEntry(
            key = __key,
            value = __value
        )
      }
      def withKey(__v: _root_.scala.Predef.String): UserLabelsEntry = copy(key = __v)
      def withValue(__v: _root_.scala.Predef.String): UserLabelsEntry = copy(value = __v)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = key
            if (__t != "") __t else null
          }
          case 2 => {
            val __t = value
            if (__t != "") __t else null
          }
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(key)
          case 2 => _root_.scalapb.descriptors.PString(value)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = com.google.api.MonitoredResourceMetadata.UserLabelsEntry
  }
  
  object UserLabelsEntry extends scalapb.GeneratedMessageCompanion[com.google.api.MonitoredResourceMetadata.UserLabelsEntry] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.MonitoredResourceMetadata.UserLabelsEntry] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.MonitoredResourceMetadata.UserLabelsEntry = {
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      com.google.api.MonitoredResourceMetadata.UserLabelsEntry(
        __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
        __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.MonitoredResourceMetadata.UserLabelsEntry] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        com.google.api.MonitoredResourceMetadata.UserLabelsEntry(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.google.api.MonitoredResourceMetadata.javaDescriptor.getNestedTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.google.api.MonitoredResourceMetadata.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = com.google.api.MonitoredResourceMetadata.UserLabelsEntry(
      key = "",
      value = ""
    )
    implicit class UserLabelsEntryLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.MonitoredResourceMetadata.UserLabelsEntry]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.MonitoredResourceMetadata.UserLabelsEntry](_l) {
      def key: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.key)((c_, f_) => c_.copy(key = f_))
      def value: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.value)((c_, f_) => c_.copy(value = f_))
    }
    final val KEY_FIELD_NUMBER = 1
    final val VALUE_FIELD_NUMBER = 2
    implicit val keyValueMapper: _root_.scalapb.TypeMapper[com.google.api.MonitoredResourceMetadata.UserLabelsEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)] =
      _root_.scalapb.TypeMapper[com.google.api.MonitoredResourceMetadata.UserLabelsEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)](__m => (__m.key, __m.value))(__p => com.google.api.MonitoredResourceMetadata.UserLabelsEntry(__p._1, __p._2))
    def of(
      key: _root_.scala.Predef.String,
      value: _root_.scala.Predef.String
    ): _root_.com.google.api.MonitoredResourceMetadata.UserLabelsEntry = _root_.com.google.api.MonitoredResourceMetadata.UserLabelsEntry(
      key,
      value
    )
  }
  
  implicit class MonitoredResourceMetadataLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.MonitoredResourceMetadata]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.MonitoredResourceMetadata](_l) {
    def systemLabels: _root_.scalapb.lenses.Lens[UpperPB, com.google.protobuf.struct.Struct] = field(_.getSystemLabels)((c_, f_) => c_.copy(systemLabels = Option(f_)))
    def optionalSystemLabels: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[com.google.protobuf.struct.Struct]] = field(_.systemLabels)((c_, f_) => c_.copy(systemLabels = f_))
    def userLabels: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String]] = field(_.userLabels)((c_, f_) => c_.copy(userLabels = f_))
  }
  final val SYSTEM_LABELS_FIELD_NUMBER = 1
  final val USER_LABELS_FIELD_NUMBER = 2
  @transient
  private val _typemapper_userLabels: _root_.scalapb.TypeMapper[com.google.api.MonitoredResourceMetadata.UserLabelsEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)] = implicitly[_root_.scalapb.TypeMapper[com.google.api.MonitoredResourceMetadata.UserLabelsEntry, (_root_.scala.Predef.String, _root_.scala.Predef.String)]]
  def of(
    systemLabels: _root_.scala.Option[com.google.protobuf.struct.Struct],
    userLabels: _root_.scala.collection.immutable.Map[_root_.scala.Predef.String, _root_.scala.Predef.String]
  ): _root_.com.google.api.MonitoredResourceMetadata = _root_.com.google.api.MonitoredResourceMetadata(
    systemLabels,
    userLabels
  )
}
