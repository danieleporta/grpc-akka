// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api

/** A description of a log type. Example in YAML format:
  *
  *     - name: library.googleapis.com/activity_history
  *       description: The history of borrowing and returning library items.
  *       display_name: Activity
  *       labels:
  *       - key: /customer_id
  *         description: Identifier of a library customer
  *
  * @param name
  *   The name of the log. It must be less than 512 characters long and can
  *   include the following characters: upper- and lower-case alphanumeric
  *   characters [A-Za-z0-9], and punctuation characters including
  *   slash, underscore, hyphen, period [/_-.].
  * @param labels
  *   The set of labels that are available to describe a specific log entry.
  *   Runtime requests that contain labels not specified here are
  *   considered invalid.
  * @param description
  *   A human-readable description of this log. This information appears in
  *   the documentation and can contain details.
  * @param displayName
  *   The human-readable name for this log. This information appears on
  *   the user interface and should be concise.
  */
@SerialVersionUID(0L)
final case class LogDescriptor(
    name: _root_.scala.Predef.String = "",
    labels: _root_.scala.Seq[com.google.api.LabelDescriptor] = _root_.scala.Seq.empty,
    description: _root_.scala.Predef.String = "",
    displayName: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[LogDescriptor] with scalapb.lenses.Updatable[LogDescriptor] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = name
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      labels.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      
      {
        val __value = description
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
        }
      };
      
      {
        val __value = displayName
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
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
        val __v = name
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      labels.foreach { __v =>
        val __m = __v
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = description
        if (__v != "") {
          _output__.writeString(3, __v)
        }
      };
      {
        val __v = displayName
        if (__v != "") {
          _output__.writeString(4, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.LogDescriptor = {
      var __name = this.name
      val __labels = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.api.LabelDescriptor] ++= this.labels)
      var __description = this.description
      var __displayName = this.displayName
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = _input__.readString()
          case 18 =>
            __labels += _root_.scalapb.LiteParser.readMessage(_input__, com.google.api.LabelDescriptor.defaultInstance)
          case 26 =>
            __description = _input__.readString()
          case 34 =>
            __displayName = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.api.LogDescriptor(
          name = __name,
          labels = __labels.result(),
          description = __description,
          displayName = __displayName
      )
    }
    def withName(__v: _root_.scala.Predef.String): LogDescriptor = copy(name = __v)
    def clearLabels = copy(labels = _root_.scala.Seq.empty)
    def addLabels(__vs: com.google.api.LabelDescriptor*): LogDescriptor = addAllLabels(__vs)
    def addAllLabels(__vs: Iterable[com.google.api.LabelDescriptor]): LogDescriptor = copy(labels = labels ++ __vs)
    def withLabels(__v: _root_.scala.Seq[com.google.api.LabelDescriptor]): LogDescriptor = copy(labels = __v)
    def withDescription(__v: _root_.scala.Predef.String): LogDescriptor = copy(description = __v)
    def withDisplayName(__v: _root_.scala.Predef.String): LogDescriptor = copy(displayName = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 2 => labels
        case 3 => {
          val __t = description
          if (__t != "") __t else null
        }
        case 4 => {
          val __t = displayName
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(name)
        case 2 => _root_.scalapb.descriptors.PRepeated(labels.iterator.map(_.toPMessage).toVector)
        case 3 => _root_.scalapb.descriptors.PString(description)
        case 4 => _root_.scalapb.descriptors.PString(displayName)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.api.LogDescriptor
}

object LogDescriptor extends scalapb.GeneratedMessageCompanion[com.google.api.LogDescriptor] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.LogDescriptor] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.LogDescriptor = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.api.LogDescriptor(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.Seq[com.google.api.LabelDescriptor]],
      __fieldsMap.getOrElse(__fields.get(2), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(3), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.LogDescriptor] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.api.LogDescriptor(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[com.google.api.LabelDescriptor]]).getOrElse(_root_.scala.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = LogProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = LogProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.api.LabelDescriptor
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.api.LogDescriptor(
    name = "",
    labels = _root_.scala.Seq.empty,
    description = "",
    displayName = ""
  )
  implicit class LogDescriptorLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.LogDescriptor]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.LogDescriptor](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def labels: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.api.LabelDescriptor]] = field(_.labels)((c_, f_) => c_.copy(labels = f_))
    def description: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.description)((c_, f_) => c_.copy(description = f_))
    def displayName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.displayName)((c_, f_) => c_.copy(displayName = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val LABELS_FIELD_NUMBER = 2
  final val DESCRIPTION_FIELD_NUMBER = 3
  final val DISPLAY_NAME_FIELD_NUMBER = 4
  def of(
    name: _root_.scala.Predef.String,
    labels: _root_.scala.Seq[com.google.api.LabelDescriptor],
    description: _root_.scala.Predef.String,
    displayName: _root_.scala.Predef.String
  ): _root_.com.google.api.LogDescriptor = _root_.com.google.api.LogDescriptor(
    name,
    labels,
    description,
    displayName
  )
}
