// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.api

/** `Documentation` provides the information for describing a service.
  *
  * Example:
  * &lt;pre&gt;&lt;code&gt;documentation:
  *   summary: &gt;
  *     The Google Calendar API gives access
  *     to most calendar features.
  *   pages:
  *   - name: Overview
  *     content: &amp;#40;== include google/foo/overview.md ==&amp;#41;
  *   - name: Tutorial
  *     content: &amp;#40;== include google/foo/tutorial.md ==&amp;#41;
  *     subpages;
  *     - name: Java
  *       content: &amp;#40;== include google/foo/tutorial_java.md ==&amp;#41;
  *   rules:
  *   - selector: google.calendar.Calendar.Get
  *     description: &gt;
  *       ...
  *   - selector: google.calendar.Calendar.Put
  *     description: &gt;
  *       ...
  * &lt;/code&gt;&lt;/pre&gt;
  * Documentation is provided in markdown syntax. In addition to
  * standard markdown features, definition lists, tables and fenced
  * code blocks are supported. Section headers can be provided and are
  * interpreted relative to the section nesting of the context where
  * a documentation fragment is embedded.
  *
  * Documentation from the IDL is merged with documentation defined
  * via the config at normalization time, where documentation provided
  * by config rules overrides IDL provided.
  *
  * A number of constructs specific to the API platform are supported
  * in documentation text.
  *
  * In order to reference a proto element, the following
  * notation can be used:
  * &lt;pre&gt;&lt;code&gt;&amp;#91;fully.qualified.proto.name]&amp;#91;]&lt;/code&gt;&lt;/pre&gt;
  * To override the display text used for the link, this can be used:
  * &lt;pre&gt;&lt;code&gt;&amp;#91;display text]&amp;#91;fully.qualified.proto.name]&lt;/code&gt;&lt;/pre&gt;
  * Text can be excluded from doc using the following notation:
  * &lt;pre&gt;&lt;code&gt;&amp;#40;-- internal comment --&amp;#41;&lt;/code&gt;&lt;/pre&gt;
  *
  * A few directives are available in documentation. Note that
  * directives must appear on a single line to be properly
  * identified. The `include` directive includes a markdown file from
  * an external source:
  * &lt;pre&gt;&lt;code&gt;&amp;#40;== include path/to/file ==&amp;#41;&lt;/code&gt;&lt;/pre&gt;
  * The `resource_for` directive marks a message to be the resource of
  * a collection in REST view. If it is not specified, tools attempt
  * to infer the resource from the operations in a collection:
  * &lt;pre&gt;&lt;code&gt;&amp;#40;== resource_for v1.shelves.books ==&amp;#41;&lt;/code&gt;&lt;/pre&gt;
  * The directive `suppress_warning` does not directly affect documentation
  * and is documented together with service config validation.
  *
  * @param summary
  *   A short summary of what the service does. Can only be provided by
  *   plain text.
  * @param pages
  *   The top level pages for the documentation set.
  * @param rules
  *   A list of documentation rules that apply to individual API elements.
  *  
  *   **NOTE:** All service configuration rules follow "last one wins" order.
  * @param documentationRootUrl
  *   The URL to the root of documentation.
  * @param overview
  *   Declares a single overview page. For example:
  *   &lt;pre&gt;&lt;code&gt;documentation:
  *     summary: ...
  *     overview: &amp;#40;== include overview.md ==&amp;#41;
  *   &lt;/code&gt;&lt;/pre&gt;
  *   This is a shortcut for the following declaration (using pages style):
  *   &lt;pre&gt;&lt;code&gt;documentation:
  *     summary: ...
  *     pages:
  *     - name: Overview
  *       content: &amp;#40;== include overview.md ==&amp;#41;
  *   &lt;/code&gt;&lt;/pre&gt;
  *   Note: you cannot specify both `overview` field and `pages` field.
  */
@SerialVersionUID(0L)
final case class Documentation(
    summary: _root_.scala.Predef.String = "",
    pages: _root_.scala.Seq[com.google.api.Page] = _root_.scala.Seq.empty,
    rules: _root_.scala.Seq[com.google.api.DocumentationRule] = _root_.scala.Seq.empty,
    documentationRootUrl: _root_.scala.Predef.String = "",
    overview: _root_.scala.Predef.String = ""
    ) extends scalapb.GeneratedMessage with scalapb.Message[Documentation] with scalapb.lenses.Updatable[Documentation] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = summary
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      pages.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      rules.foreach { __item =>
        val __value = __item
        __size += 1 + _root_.com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(__value.serializedSize) + __value.serializedSize
      }
      
      {
        val __value = documentationRootUrl
        if (__value != "") {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
        }
      };
      
      {
        val __value = overview
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
        val __v = summary
        if (__v != "") {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = overview
        if (__v != "") {
          _output__.writeString(2, __v)
        }
      };
      rules.foreach { __v =>
        val __m = __v
        _output__.writeTag(3, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
      {
        val __v = documentationRootUrl
        if (__v != "") {
          _output__.writeString(4, __v)
        }
      };
      pages.foreach { __v =>
        val __m = __v
        _output__.writeTag(5, 2)
        _output__.writeUInt32NoTag(__m.serializedSize)
        __m.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): com.google.api.Documentation = {
      var __summary = this.summary
      val __pages = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.api.Page] ++= this.pages)
      val __rules = (_root_.scala.collection.immutable.Vector.newBuilder[com.google.api.DocumentationRule] ++= this.rules)
      var __documentationRootUrl = this.documentationRootUrl
      var __overview = this.overview
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __summary = _input__.readString()
          case 42 =>
            __pages += _root_.scalapb.LiteParser.readMessage(_input__, com.google.api.Page.defaultInstance)
          case 26 =>
            __rules += _root_.scalapb.LiteParser.readMessage(_input__, com.google.api.DocumentationRule.defaultInstance)
          case 34 =>
            __documentationRootUrl = _input__.readString()
          case 18 =>
            __overview = _input__.readString()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.api.Documentation(
          summary = __summary,
          pages = __pages.result(),
          rules = __rules.result(),
          documentationRootUrl = __documentationRootUrl,
          overview = __overview
      )
    }
    def withSummary(__v: _root_.scala.Predef.String): Documentation = copy(summary = __v)
    def clearPages = copy(pages = _root_.scala.Seq.empty)
    def addPages(__vs: com.google.api.Page*): Documentation = addAllPages(__vs)
    def addAllPages(__vs: Iterable[com.google.api.Page]): Documentation = copy(pages = pages ++ __vs)
    def withPages(__v: _root_.scala.Seq[com.google.api.Page]): Documentation = copy(pages = __v)
    def clearRules = copy(rules = _root_.scala.Seq.empty)
    def addRules(__vs: com.google.api.DocumentationRule*): Documentation = addAllRules(__vs)
    def addAllRules(__vs: Iterable[com.google.api.DocumentationRule]): Documentation = copy(rules = rules ++ __vs)
    def withRules(__v: _root_.scala.Seq[com.google.api.DocumentationRule]): Documentation = copy(rules = __v)
    def withDocumentationRootUrl(__v: _root_.scala.Predef.String): Documentation = copy(documentationRootUrl = __v)
    def withOverview(__v: _root_.scala.Predef.String): Documentation = copy(overview = __v)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = summary
          if (__t != "") __t else null
        }
        case 5 => pages
        case 3 => rules
        case 4 => {
          val __t = documentationRootUrl
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = overview
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(summary)
        case 5 => _root_.scalapb.descriptors.PRepeated(pages.iterator.map(_.toPMessage).toVector)
        case 3 => _root_.scalapb.descriptors.PRepeated(rules.iterator.map(_.toPMessage).toVector)
        case 4 => _root_.scalapb.descriptors.PString(documentationRootUrl)
        case 2 => _root_.scalapb.descriptors.PString(overview)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.api.Documentation
}

object Documentation extends scalapb.GeneratedMessageCompanion[com.google.api.Documentation] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[com.google.api.Documentation] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): com.google.api.Documentation = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    com.google.api.Documentation(
      __fieldsMap.getOrElse(__fields.get(0), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(1), Nil).asInstanceOf[_root_.scala.Seq[com.google.api.Page]],
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.Seq[com.google.api.DocumentationRule]],
      __fieldsMap.getOrElse(__fields.get(3), "").asInstanceOf[_root_.scala.Predef.String],
      __fieldsMap.getOrElse(__fields.get(4), "").asInstanceOf[_root_.scala.Predef.String]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[com.google.api.Documentation] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      com.google.api.Documentation(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).map(_.as[_root_.scala.Seq[com.google.api.Page]]).getOrElse(_root_.scala.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Seq[com.google.api.DocumentationRule]]).getOrElse(_root_.scala.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DocumentationProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DocumentationProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = {
    var __out: _root_.scalapb.GeneratedMessageCompanion[_] = null
    (__number: @_root_.scala.unchecked) match {
      case 5 => __out = com.google.api.Page
      case 3 => __out = com.google.api.DocumentationRule
    }
    __out
  }
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = com.google.api.Documentation(
    summary = "",
    pages = _root_.scala.Seq.empty,
    rules = _root_.scala.Seq.empty,
    documentationRootUrl = "",
    overview = ""
  )
  implicit class DocumentationLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, com.google.api.Documentation]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, com.google.api.Documentation](_l) {
    def summary: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.summary)((c_, f_) => c_.copy(summary = f_))
    def pages: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.api.Page]] = field(_.pages)((c_, f_) => c_.copy(pages = f_))
    def rules: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[com.google.api.DocumentationRule]] = field(_.rules)((c_, f_) => c_.copy(rules = f_))
    def documentationRootUrl: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.documentationRootUrl)((c_, f_) => c_.copy(documentationRootUrl = f_))
    def overview: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.overview)((c_, f_) => c_.copy(overview = f_))
  }
  final val SUMMARY_FIELD_NUMBER = 1
  final val PAGES_FIELD_NUMBER = 5
  final val RULES_FIELD_NUMBER = 3
  final val DOCUMENTATION_ROOT_URL_FIELD_NUMBER = 4
  final val OVERVIEW_FIELD_NUMBER = 2
  def of(
    summary: _root_.scala.Predef.String,
    pages: _root_.scala.Seq[com.google.api.Page],
    rules: _root_.scala.Seq[com.google.api.DocumentationRule],
    documentationRootUrl: _root_.scala.Predef.String,
    overview: _root_.scala.Predef.String
  ): _root_.com.google.api.Documentation = _root_.com.google.api.Documentation(
    summary,
    pages,
    rules,
    documentationRootUrl,
    overview
  )
}
