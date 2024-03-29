// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api

/** Defines a metric type and its schema. Once a metric descriptor is created,
  * deleting or altering it stops data collection and makes the metric type's
  * existing data unusable.
  *
  * @param name
  *   The resource name of the metric descriptor.
  * @param type
  *   The metric type, including its DNS name prefix. The type is not
  *   URL-encoded.  All user-defined custom metric types have the DNS name
  *   `custom.googleapis.com`.  Metric types should use a natural hierarchical
  *   grouping. For example:
  *  
  *       "custom.googleapis.com/invoice/paid/amount"
  *       "appengine.googleapis.com/http/server/response_latencies"
  * @param labels
  *   The set of labels that can be used to describe a specific
  *   instance of this metric type. For example, the
  *   `appengine.googleapis.com/http/server/response_latencies` metric
  *   type has a label for the HTTP response code, `response_code`, so
  *   you can look at latencies for successful responses or just
  *   for responses that failed.
  * @param metricKind
  *   Whether the metric records instantaneous values, changes to a value, etc.
  *   Some combinations of `metric_kind` and `value_type` might not be supported.
  * @param valueType
  *   Whether the measurement is an integer, a floating-point number, etc.
  *   Some combinations of `metric_kind` and `value_type` might not be supported.
  * @param unit
  *   The unit in which the metric value is reported. It is only applicable
  *   if the `value_type` is `INT64`, `DOUBLE`, or `DISTRIBUTION`. The
  *   supported units are a subset of [The Unified Code for Units of
  *   Measure](http://unitsofmeasure.org/ucum.html) standard:
  *  
  *   **Basic units (UNIT)**
  *  
  *   * `bit`   bit
  *   * `By`    byte
  *   * `s`     second
  *   * `min`   minute
  *   * `h`     hour
  *   * `d`     day
  *  
  *   **Prefixes (PREFIX)**
  *  
  *   * `k`     kilo    (10**3)
  *   * `M`     mega    (10**6)
  *   * `G`     giga    (10**9)
  *   * `T`     tera    (10**12)
  *   * `P`     peta    (10**15)
  *   * `E`     exa     (10**18)
  *   * `Z`     zetta   (10**21)
  *   * `Y`     yotta   (10**24)
  *   * `m`     milli   (10**-3)
  *   * `u`     micro   (10**-6)
  *   * `n`     nano    (10**-9)
  *   * `p`     pico    (10**-12)
  *   * `f`     femto   (10**-15)
  *   * `a`     atto    (10**-18)
  *   * `z`     zepto   (10**-21)
  *   * `y`     yocto   (10**-24)
  *   * `Ki`    kibi    (2**10)
  *   * `Mi`    mebi    (2**20)
  *   * `Gi`    gibi    (2**30)
  *   * `Ti`    tebi    (2**40)
  *  
  *   **Grammar**
  *  
  *   The grammar also includes these connectors:
  *  
  *   * `/`    division (as an infix operator, e.g. `1/s`).
  *   * `.`    multiplication (as an infix operator, e.g. `GBy.d`)
  *  
  *   The grammar for a unit is as follows:
  *  
  *       Expression = Component { "." Component } { "/" Component } ;
  *  
  *       Component = ( [ PREFIX ] UNIT | "%" ) [ Annotation ]
  *                 | Annotation
  *                 | "1"
  *                 ;
  *  
  *       Annotation = "{" NAME "}" ;
  *  
  *   Notes:
  *  
  *   * `Annotation` is just a comment if it follows a `UNIT` and is
  *      equivalent to `1` if it is used alone. For examples,
  *      `{requests}/s == 1/s`, `By{transmitted}/s == By/s`.
  *   * `NAME` is a sequence of non-blank printable ASCII characters not
  *      containing '{' or '}'.
  *   * `1` represents dimensionless value 1, such as in `1/s`.
  *   * `%` represents dimensionless value 1/100, and annotates values giving
  *      a percentage.
  * @param description
  *   A detailed description of the metric, which can be used in documentation.
  * @param displayName
  *   A concise name for the metric, which can be displayed in user interfaces.
  *   Use sentence case without an ending period, for example "Request count".
  *   This field is optional but it is recommended to be set for any metrics
  *   associated with user-visible concepts, such as Quota.
  */
@SerialVersionUID(0L)
final case class MetricDescriptor(
    name: _root_.scala.Predef.String = "",
    `type`: _root_.scala.Predef.String = "",
    labels: _root_.scala.Seq[com.google.api.LabelDescriptor] = _root_.scala.Seq.empty,
    metricKind: com.google.api.MetricDescriptor.MetricKind = com.google.api.MetricDescriptor.MetricKind.METRIC_KIND_UNSPECIFIED,
    valueType: com.google.api.MetricDescriptor.ValueTypeEnum = com.google.api.MetricDescriptor.ValueTypeEnum.VALUE_TYPE_UNSPECIFIED,
    unit: _root_.scala.Predef.String = "",
    description: _root_.scala.Predef.String = "",
    displayName: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[MetricDescriptor] with scalapb.lenses.Updatable[MetricDescriptor] {
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
      
      {
        val __value = `type`
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(8, __value)
        }
      };
      labels.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      
      {
        val __value = metricKind
        if (__value != com.google.api.MetricDescriptor.MetricKind.METRIC_KIND_UNSPECIFIED) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(3, __value.value)
        }
      };
      
      {
        val __value = valueType
        if (__value != com.google.api.MetricDescriptor.ValueTypeEnum.VALUE_TYPE_UNSPECIFIED) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(4, __value.value)
        }
      };
      
      {
        val __value = unit
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(5, __value)
        }
      };
      
      {
        val __value = description
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(6, __value)
        }
      };
      
      {
        val __value = displayName
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(7, __value)
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
        val __v = metricKind
        if (__v != com.google.api.MetricDescriptor.MetricKind.METRIC_KIND_UNSPECIFIED) {
          _output__.writeEnum(3, __v.value)
        }
      };
      {
        val __v = valueType
        if (__v != com.google.api.MetricDescriptor.ValueTypeEnum.VALUE_TYPE_UNSPECIFIED) {
          _output__.writeEnum(4, __v.value)
        }
      };
      {
        val __v = unit
        if (__v != "") {
          _output__.writeString(5, __v)
        }
      };
      {
        val __v = description
        if (__v != "") {
          _output__.writeString(6, __v)
        }
      };
      {
        val __v = displayName
        if (__v != "") {
          _output__.writeString(7, __v)
        }
      };
      {
        val __v = `type`
        if (__v != "") {
          _output__.writeString(8, __v)
        }
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.MetricDescriptor = {
      var __name = this.name
      var __type = this.`type`
      val __labels = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.api.LabelDescriptor] ++= this.labels)
      var __metricKind = this.metricKind
      var __valueType = this.valueType
      var __unit = this.unit
      var __description = this.description
      var __displayName = this.displayName
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = _input__.readString()
          case 66 =>
            __type = _input__.readString()
          case 18 =>
            __labels += _root_.scalapb.LiteParser.readMessage(_input__, com.google.api.LabelDescriptor.defaultInstance)
          case 24 =>
            __metricKind = com.google.api.MetricDescriptor.MetricKind.fromValue(_input__.readEnum())
          case 32 =>
            __valueType = com.google.api.MetricDescriptor.ValueTypeEnum.fromValue(_input__.readEnum())
          case 42 =>
            __unit = _input__.readString()
          case 50 =>
            __description = _input__.readString()
          case 58 =>
            __displayName = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.api.MetricDescriptor(
          name = __name,
          `type` = __type,
          labels = __labels.result(),
          metricKind = __metricKind,
          valueType = __valueType,
          unit = __unit,
          description = __description,
          displayName = __displayName
      )
    }
    def withName(__v: _root_.scala.Predef.String): MetricDescriptor = copy(name = __v)
    def withType(__v: _root_.scala.Predef.String): MetricDescriptor = copy(`type` = __v)
    def clearLabels = copy(labels = _root_.scala.Seq.empty)
    def addLabels(__vs: com.google.api.LabelDescriptor*): MetricDescriptor = addAllLabels(__vs)
    def addAllLabels(__vs: Iterable[com.google.api.LabelDescriptor]): MetricDescriptor = copy(labels = labels ++ __vs)
    def withLabels(__v: _root_.scala.Seq[com.google.api.LabelDescriptor]): MetricDescriptor = copy(labels = __v)
    def withMetricKind(__v: com.google.api.MetricDescriptor.MetricKind): MetricDescriptor = copy(metricKind = __v)
    def withValueType(__v: com.google.api.MetricDescriptor.ValueTypeEnum): MetricDescriptor = copy(valueType = __v)
    def withUnit(__v: _root_.scala.Predef.String): MetricDescriptor = copy(unit = __v)
    def withDescription(__v: _root_.scala.Predef.String): MetricDescriptor = copy(description = __v)
    def withDisplayName(__v: _root_.scala.Predef.String): MetricDescriptor = copy(displayName = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = name
          if (__t != "") __t else null
        }
        case 8 => {
          val __t = `type`
          if (__t != "") __t else null
        }
        case 2 => labels
        case 3 => {
          val __t = metricKind.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
        case 4 => {
          val __t = valueType.javaValueDescriptor
          if (__t.getNumber() != 0) __t else null
        }
        case 5 => {
          val __t = unit
          if (__t != "") __t else null
        }
        case 6 => {
          val __t = description
          if (__t != "") __t else null
        }
        case 7 => {
          val __t = displayName
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(name)
        case 8 => _root_.scalapb.descriptors.PString(`type`)
        case 2 => _root_.scalapb.descriptors.PRepeated(labels.iterator.map(_.toPMessage).toVector)
        case 3 => _root_.scalapb.descriptors.PEnum(metricKind.scalaValueDescriptor)
        case 4 => _root_.scalapb.descriptors.PEnum(valueType.scalaValueDescriptor)
        case 5 => _root_.scalapb.descriptors.PString(unit)
        case 6 => _root_.scalapb.descriptors.PString(description)
        case 7 => _root_.scalapb.descriptors.PString(displayName)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.api.MetricDescriptor
}

object MetricDescriptor extends scalapb.GeneratedMessageCompanion[com.google.api.MetricDescriptor] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.MetricDescriptor] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.MetricDescriptor = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.api.MetricDescriptor(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.Seq[com.google.api.LabelDescriptor]],
      com.google.api.MetricDescriptor.MetricKind.fromValue(__fieldsMap.getOrElse(__fields.get(3), com.google.api.MetricDescriptor.MetricKind.METRIC_KIND_UNSPECIFIED.javaValueDescriptor).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      com.google.api.MetricDescriptor.ValueTypeEnum.fromValue(__fieldsMap.getOrElse(__fields.get(4), com.google.api.MetricDescriptor.ValueTypeEnum.VALUE_TYPE_UNSPECIFIED.javaValueDescriptor).asInstanceOf[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor].getNumber),
      __fieldsMap.getOrElse(__fields.get(5), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(6), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(7), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.MetricDescriptor] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.api.MetricDescriptor(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[com.google.api.LabelDescriptor]]).getOrElse(_root_.scala.Seq.empty),
        com.google.api.MetricDescriptor.MetricKind.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(com.google.api.MetricDescriptor.MetricKind.METRIC_KIND_UNSPECIFIED.scalaValueDescriptor).number),
        com.google.api.MetricDescriptor.ValueTypeEnum.fromValue(__fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scalapb.descriptors.EnumValueDescriptor]).getOrElse(com.google.api.MetricDescriptor.ValueTypeEnum.VALUE_TYPE_UNSPECIFIED.scalaValueDescriptor).number),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = MetricProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = MetricProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 2 => __out = com.google.api.LabelDescriptor
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 3 => com.google.api.MetricDescriptor.MetricKind
      case 4 => com.google.api.MetricDescriptor.ValueTypeEnum
    }
  }
  lazy val defaultInstance = com.google.api.MetricDescriptor(
    name = "",
    `type` = "",
    labels = _root_.scala.Seq.empty,
    metricKind = com.google.api.MetricDescriptor.MetricKind.METRIC_KIND_UNSPECIFIED,
    valueType = com.google.api.MetricDescriptor.ValueTypeEnum.VALUE_TYPE_UNSPECIFIED,
    unit = "",
    description = "",
    displayName = ""
  )
  /** The kind of measurement. It describes how the data is reported.
    */
  sealed trait MetricKind extends _root_.scalapb.GeneratedEnum {
    type EnumType = MetricKind
    def isMetricKindUnspecified: _root_.scala.Boolean = false
    def isGauge: _root_.scala.Boolean = false
    def isDelta: _root_.scala.Boolean = false
    def isCumulative: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[MetricKind] = com.google.api.MetricDescriptor.MetricKind
  }
  
  object MetricKind extends _root_.scalapb.GeneratedEnumCompanion[MetricKind] {
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[MetricKind] = this
    /** Do not use this default value.
      */
    @SerialVersionUID(0L)
    case object METRIC_KIND_UNSPECIFIED extends MetricKind {
      val value = 0
      val index = 0
      val name = "METRIC_KIND_UNSPECIFIED"
      override def isMetricKindUnspecified: _root_.scala.Boolean = true
    }
    
    /** An instantaneous measurement of a value.
      */
    @SerialVersionUID(0L)
    case object GAUGE extends MetricKind {
      val value = 1
      val index = 1
      val name = "GAUGE"
      override def isGauge: _root_.scala.Boolean = true
    }
    
    /** The change in a value during a time interval.
      */
    @SerialVersionUID(0L)
    case object DELTA extends MetricKind {
      val value = 2
      val index = 2
      val name = "DELTA"
      override def isDelta: _root_.scala.Boolean = true
    }
    
    /** A value accumulated over a time interval.  Cumulative
      * measurements in a time series should have the same start time
      * and increasing end times, until an event resets the cumulative
      * value to zero and sets a new start time for the following
      * points.
      */
    @SerialVersionUID(0L)
    case object CUMULATIVE extends MetricKind {
      val value = 3
      val index = 3
      val name = "CUMULATIVE"
      override def isCumulative: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(value: _root_.scala.Int) extends MetricKind with _root_.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.immutable.Seq(METRIC_KIND_UNSPECIFIED, GAUGE, DELTA, CUMULATIVE)
    def fromValue(value: _root_.scala.Int): MetricKind = value match {
      case 0 => METRIC_KIND_UNSPECIFIED
      case 1 => GAUGE
      case 2 => DELTA
      case 3 => CUMULATIVE
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = com.google.api.MetricDescriptor.javaDescriptor.getEnumTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = com.google.api.MetricDescriptor.scalaDescriptor.enums(0)
  }
  /** The value type of a metric.
    */
  sealed trait ValueTypeEnum extends _root_.scalapb.GeneratedEnum {
    type EnumType = ValueTypeEnum
    def isValueTypeUnspecified: _root_.scala.Boolean = false
    def isBool: _root_.scala.Boolean = false
    def isInt64: _root_.scala.Boolean = false
    def isDouble: _root_.scala.Boolean = false
    def isString: _root_.scala.Boolean = false
    def isDistribution: _root_.scala.Boolean = false
    def isMoney: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[ValueTypeEnum] = com.google.api.MetricDescriptor.ValueTypeEnum
  }
  
  object ValueTypeEnum extends _root_.scalapb.GeneratedEnumCompanion[ValueTypeEnum] {
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[ValueTypeEnum] = this
    /** Do not use this default value.
      */
    @SerialVersionUID(0L)
    case object VALUE_TYPE_UNSPECIFIED extends ValueTypeEnum {
      val value = 0
      val index = 0
      val name = "VALUE_TYPE_UNSPECIFIED"
      override def isValueTypeUnspecified: _root_.scala.Boolean = true
    }
    
    /** The value is a boolean.
      * This value type can be used only if the metric kind is `GAUGE`.
      */
    @SerialVersionUID(0L)
    case object BOOL extends ValueTypeEnum {
      val value = 1
      val index = 1
      val name = "BOOL"
      override def isBool: _root_.scala.Boolean = true
    }
    
    /** The value is a signed 64-bit integer.
      */
    @SerialVersionUID(0L)
    case object INT64 extends ValueTypeEnum {
      val value = 2
      val index = 2
      val name = "INT64"
      override def isInt64: _root_.scala.Boolean = true
    }
    
    /** The value is a double precision floating point number.
      */
    @SerialVersionUID(0L)
    case object DOUBLE extends ValueTypeEnum {
      val value = 3
      val index = 3
      val name = "DOUBLE"
      override def isDouble: _root_.scala.Boolean = true
    }
    
    /** The value is a text string.
      * This value type can be used only if the metric kind is `GAUGE`.
      */
    @SerialVersionUID(0L)
    case object STRING extends ValueTypeEnum {
      val value = 4
      val index = 4
      val name = "STRING"
      override def isString: _root_.scala.Boolean = true
    }
    
    /** The value is a [`Distribution`][google.api.Distribution].
      */
    @SerialVersionUID(0L)
    case object DISTRIBUTION extends ValueTypeEnum {
      val value = 5
      val index = 5
      val name = "DISTRIBUTION"
      override def isDistribution: _root_.scala.Boolean = true
    }
    
    /** The value is money.
      */
    @SerialVersionUID(0L)
    case object MONEY extends ValueTypeEnum {
      val value = 6
      val index = 6
      val name = "MONEY"
      override def isMoney: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(value: _root_.scala.Int) extends ValueTypeEnum with _root_.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.immutable.Seq(VALUE_TYPE_UNSPECIFIED, BOOL, INT64, DOUBLE, STRING, DISTRIBUTION, MONEY)
    def fromValue(value: _root_.scala.Int): ValueTypeEnum = value match {
      case 0 => VALUE_TYPE_UNSPECIFIED
      case 1 => BOOL
      case 2 => INT64
      case 3 => DOUBLE
      case 4 => STRING
      case 5 => DISTRIBUTION
      case 6 => MONEY
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = com.google.api.MetricDescriptor.javaDescriptor.getEnumTypes.get(1)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = com.google.api.MetricDescriptor.scalaDescriptor.enums(1)
  }
  implicit class MetricDescriptorLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.MetricDescriptor]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.MetricDescriptor](_l) {
    def name: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def `type`: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.`type`)((c_, f_) => c_.copy(`type` = f_))
    def labels: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.api.LabelDescriptor]] = field(_.labels)((c_, f_) => c_.copy(labels = f_))
    def metricKind: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.MetricDescriptor.MetricKind] = field(_.metricKind)((c_, f_) => c_.copy(metricKind = f_))
    def valueType: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.MetricDescriptor.ValueTypeEnum] = field(_.valueType)((c_, f_) => c_.copy(valueType = f_))
    def unit: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.unit)((c_, f_) => c_.copy(unit = f_))
    def description: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.description)((c_, f_) => c_.copy(description = f_))
    def displayName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.displayName)((c_, f_) => c_.copy(displayName = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val TYPE_FIELD_NUMBER = 8
  final val LABELS_FIELD_NUMBER = 2
  final val METRIC_KIND_FIELD_NUMBER = 3
  final val VALUE_TYPE_FIELD_NUMBER = 4
  final val UNIT_FIELD_NUMBER = 5
  final val DESCRIPTION_FIELD_NUMBER = 6
  final val DISPLAY_NAME_FIELD_NUMBER = 7
  def of(
    name: _root_.scala.Predef.String,
    `type`: _root_.scala.Predef.String,
    labels: _root_.scala.Seq[com.google.api.LabelDescriptor],
    metricKind: com.google.api.MetricDescriptor.MetricKind,
    valueType: com.google.api.MetricDescriptor.ValueTypeEnum,
    unit: _root_.scala.Predef.String,
    description: _root_.scala.Predef.String,
    displayName: _root_.scala.Predef.String
  ): _root_.com.google.api.MetricDescriptor = _root_.com.google.api.MetricDescriptor(
    name,
    `type`,
    labels,
    metricKind,
    valueType,
    unit,
    description,
    displayName
  )
}
