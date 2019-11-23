// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api

/** Billing related configuration of the service.
  *
  * The following example shows how to configure monitored resources and metrics
  * for billing:
  *
  *     monitored_resources:
  *     - type: library.googleapis.com/branch
  *       labels:
  *       - key: /city
  *         description: The city where the library branch is located in.
  *       - key: /name
  *         description: The name of the branch.
  *     metrics:
  *     - name: library.googleapis.com/book/borrowed_count
  *       metric_kind: DELTA
  *       value_type: INT64
  *     billing:
  *       consumer_destinations:
  *       - monitored_resource: library.googleapis.com/branch
  *         metrics:
  *         - library.googleapis.com/book/borrowed_count
  *
  * @param consumerDestinations
  *   Billing configurations for sending metrics to the consumer project.
  *   There can be multiple consumer destinations per service, each one must have
  *   a different monitored resource type. A metric can be used in at most
  *   one consumer destination.
  */
@SerialVersionUID(0L)
final case class Billing(
    consumerDestinations: _root_.scala.Seq[com.google.api.Billing.BillingDestination] = _root_.scala.Seq.empty
    ) extends scalapb.GeneratedMessage with scalapb.Message[Billing] with scalapb.lenses.Updatable[Billing] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      consumerDestinations.foreach { __item =>
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
      consumerDestinations.foreach { __v =>
        val __m = __v
        _output__.writeTag(8, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.Billing = {
      val __consumerDestinations = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.api.Billing.BillingDestination] ++= this.consumerDestinations)
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 66 =>
            __consumerDestinations += _root_.scalapb.LiteParser.readMessage(_input__, com.google.api.Billing.BillingDestination.defaultInstance)
          case tag => _input__.skipField(tag)
        }
      }
      com.google.api.Billing(
          consumerDestinations = __consumerDestinations.result()
      )
    }
    def clearConsumerDestinations = copy(consumerDestinations = _root_.scala.Seq.empty)
    def addConsumerDestinations(__vs: com.google.api.Billing.BillingDestination*): Billing = addAllConsumerDestinations(__vs)
    def addAllConsumerDestinations(__vs: Iterable[com.google.api.Billing.BillingDestination]): Billing = copy(consumerDestinations = consumerDestinations ++ __vs)
    def withConsumerDestinations(__v: _root_.scala.Seq[com.google.api.Billing.BillingDestination]): Billing = copy(consumerDestinations = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 8 => consumerDestinations
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 8 => _root_.scalapb.descriptors.PRepeated(consumerDestinations.iterator.map(_.toPMessage).toVector)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.api.Billing
}

object Billing extends scalapb.GeneratedMessageCompanion[com.google.api.Billing] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.Billing] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.Billing = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.api.Billing(
      __fieldsMap.getOrElse(__fields.get(0), Nil).asInstanceOf[_root_.scala.Seq[com.google.api.Billing.BillingDestination]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.Billing] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.api.Billing(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).map(_.as[_root_.scala.Seq[com.google.api.Billing.BillingDestination]]).getOrElse(_root_.scala.Seq.empty)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = BillingProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = BillingProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 8 => __out = com.google.api.Billing.BillingDestination
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      _root_.com.google.api.Billing.BillingDestination
    )
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.api.Billing(
    consumerDestinations = _root_.scala.Seq.empty
  )
  /** Configuration of a specific billing destination (Currently only support
    * bill against consumer project).
    *
    * @param monitoredResource
    *   The monitored resource type. The type must be defined in
    *   [Service.monitored_resources][google.api.Service.monitored_resources] section.
    * @param metrics
    *   Names of the metrics to report to this billing destination.
    *   Each name must be defined in [Service.metrics][google.api.Service.metrics] section.
    */
  @SerialVersionUID(0L)
  final case class BillingDestination(
      monitoredResource: _root_.scala.Predef.String = "",
      metrics: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty
      ) extends scalapb.GeneratedMessage with scalapb.Message[BillingDestination] with scalapb.lenses.Updatable[BillingDestination] {
      @transient
      private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
      private[this] def __computeSerializedValue(): _root_.scala.Int = {
        var __size = 0
        
        {
          val __value = monitoredResource
          if (__value != "") {
            __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
          }
        };
        metrics.foreach { __item =>
          val __value = __item
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
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
          val __v = monitoredResource
          if (__v != "") {
            _output__.writeString(1, __v)
          }
        };
        metrics.foreach { __v =>
          val __m = __v
          _output__.writeString(2, __m)
        };
      }
      def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.Billing.BillingDestination = {
        var __monitoredResource = this.monitoredResource
        val __metrics = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= this.metrics)
        var _done__ = false
        while (!_done__) {
          val _tag__ = _input__.readTag()
          _tag__ match {
            case 0 => _done__ = true
            case 10 =>
              __monitoredResource = _input__.readString()
            case 18 =>
              __metrics += _input__.readString()
            case tag => _input__.skipField(tag)
          }
        }
        com.google.api.Billing.BillingDestination(
            monitoredResource = __monitoredResource,
            metrics = __metrics.result()
        )
      }
      def withMonitoredResource(__v: _root_.scala.Predef.String): BillingDestination = copy(monitoredResource = __v)
      def clearMetrics = copy(metrics = _root_.scala.Seq.empty)
      def addMetrics(__vs: _root_.scala.Predef.String*): BillingDestination = addAllMetrics(__vs)
      def addAllMetrics(__vs: Iterable[_root_.scala.Predef.String]): BillingDestination = copy(metrics = metrics ++ __vs)
      def withMetrics(__v: _root_.scala.Seq[_root_.scala.Predef.String]): BillingDestination = copy(metrics = __v)
      def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
        (__fieldNumber: @_root_.scala.unchecked) match {
          case 1 => {
            val __t = monitoredResource
            if (__t != "") __t else null
          }
          case 2 => metrics
        }
      }
      def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
        _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
        (__field.number: @_root_.scala.unchecked) match {
          case 1 => _root_.scalapb.descriptors.PString(monitoredResource)
          case 2 => _root_.scalapb.descriptors.PRepeated(metrics.iterator.map(_root_.scalapb.descriptors.PString).toVector)
        }
      }
      def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
      def companion = com.google.api.Billing.BillingDestination
  }
  
  object BillingDestination extends scalapb.GeneratedMessageCompanion[com.google.api.Billing.BillingDestination] {
    implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.Billing.BillingDestination] = this
    def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.Billing.BillingDestination = {
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
      val __fields = javaDescriptor.getFields
      com.google.api.Billing.BillingDestination(
        __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
        __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.Seq[_root_.scala.Predef.String]]
      )
    }
    implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.Billing.BillingDestination] = _root_.scalapb.descriptors.Reads{
      case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
        _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
        com.google.api.Billing.BillingDestination(
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
          __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty)
        )
      case _ => throw new RuntimeException("Expected PMessage")
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = com.google.api.Billing.javaDescriptor.getNestedTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = com.google.api.Billing.scalaDescriptor.nestedMessages(0)
    def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
    lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
    def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
    lazy val defaultInstance = com.google.api.Billing.BillingDestination(
      monitoredResource = "",
      metrics = _root_.scala.Seq.empty
    )
    implicit class BillingDestinationLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.Billing.BillingDestination]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.Billing.BillingDestination](_l) {
      def monitoredResource: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.monitoredResource)((c_, f_) => c_.copy(monitoredResource = f_))
      def metrics: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.metrics)((c_, f_) => c_.copy(metrics = f_))
    }
    final val MONITORED_RESOURCE_FIELD_NUMBER = 1
    final val METRICS_FIELD_NUMBER = 2
    def of(
      monitoredResource: _root_.scala.Predef.String,
      metrics: _root_.scala.Seq[_root_.scala.Predef.String]
    ): _root_.com.google.api.Billing.BillingDestination = _root_.com.google.api.Billing.BillingDestination(
      monitoredResource,
      metrics
    )
  }
  
  implicit class BillingLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.Billing]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.Billing](_l) {
    def consumerDestinations: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.api.Billing.BillingDestination]] = field(_.consumerDestinations)((c_, f_) => c_.copy(consumerDestinations = f_))
  }
  final val CONSUMER_DESTINATIONS_FIELD_NUMBER = 8
  def of(
    consumerDestinations: _root_.scala.Seq[com.google.api.Billing.BillingDestination]
  ): _root_.com.google.api.Billing = _root_.com.google.api.Billing(
    consumerDestinations
  )
}