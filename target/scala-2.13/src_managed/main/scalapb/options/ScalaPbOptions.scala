// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package scalapb.options

/** @param packageName
  *   If set then it overrides the java_package and package.
  * @param flatPackage
  *   If true, the compiler does not append the proto base file name
  *   into the generated package name. If false (the default), the
  *   generated scala package name is the package_name.basename where
  *   basename is the proto file name without the .proto extension.
  * @param import
  *   Adds the following imports at the top of the file (this is meant
  *   to provide implicit TypeMappers)
  * @param preamble
  *   Text to add to the generated scala file.  This can be used only
  *   when single_file is true.
  * @param singleFile
  *   If true, all messages and enums (but not services) will be written
  *   to a single Scala file.
  * @param noPrimitiveWrappers
  *   By default, wrappers defined at
  *   https://github.com/google/protobuf/blob/master/src/google/protobuf/wrappers.proto,
  *   are mapped to an Option[T] where T is a primitive type. When this field
  *   is set to true, we do not perform this transformation.
  * @param primitiveWrappers
  *   DEPRECATED. In ScalaPB &lt;= 0.5.47, it was necessary to explicitly enable
  *   primitive_wrappers. This field remains here for backwards compatibility,
  *   but it has no effect on generated code. It is an error to set both
  *   `primitive_wrappers` and `no_primitive_wrappers`.
  * @param collectionType
  *   Scala type to be used for repeated fields. If unspecified,
  *   `scala.collection.Seq` will be used.
  * @param preserveUnknownFields
  *   If set to true, all generated messages in this file will preserve unknown
  *   fields.
  * @param objectName
  *   If defined, sets the name of the file-level object that would be generated. This
  *   object extends `GeneratedFileObject` and contains descriptors, and list of message
  *   and enum companions.
  * @param scope
  *   Experimental: scope to apply the given options.
  * @param lenses
  *   If true, lenses will be generated.
  * @param retainSourceCodeInfo
  *   If true, then source-code info information will be included in the
  *   generated code - normally the source code info is cleared out to reduce
  *   code size.  The source code info is useful for extracting source code
  *   location from the descriptors as well as comments.
  * @param mapType
  *   Scala type to be used for maps. If unspecified,
  *   `scala.collection.immutable.Map` will be used.
  * @param noDefaultValuesInConstructor
  *   If true, no default values will be generated in message constructors.
  * @param testOnlyNoJavaConversions
  *   For use in tests only. Inhibit Java conversions even when when generator parameters
  *   request for it.
  */
@SerialVersionUID(0L)
final case class ScalaPbOptions(
    packageName: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    flatPackage: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    `import`: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    preamble: _root_.scala.Seq[_root_.scala.Predef.String] = _root_.scala.Seq.empty,
    singleFile: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    noPrimitiveWrappers: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    primitiveWrappers: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    collectionType: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    preserveUnknownFields: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    objectName: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    scope: _root_.scala.Option[scalapb.options.ScalaPbOptions.OptionsScope] = _root_.scala.None,
    lenses: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    retainSourceCodeInfo: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    mapType: _root_.scala.Option[_root_.scala.Predef.String] = _root_.scala.None,
    noDefaultValuesInConstructor: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None,
    testOnlyNoJavaConversions: _root_.scala.Option[_root_.scala.Boolean] = _root_.scala.None
    ) extends scalapb.GeneratedMessage with scalapb.Message[ScalaPbOptions] with scalapb.lenses.Updatable[ScalaPbOptions] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      if (packageName.isDefined) {
        val __value = packageName.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
      };
      if (flatPackage.isDefined) {
        val __value = flatPackage.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(2, __value)
      };
      `import`.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(3, __value)
      }
      preamble.foreach { __item =>
        val __value = __item
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(4, __value)
      }
      if (singleFile.isDefined) {
        val __value = singleFile.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(5, __value)
      };
      if (noPrimitiveWrappers.isDefined) {
        val __value = noPrimitiveWrappers.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(7, __value)
      };
      if (primitiveWrappers.isDefined) {
        val __value = primitiveWrappers.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(6, __value)
      };
      if (collectionType.isDefined) {
        val __value = collectionType.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(8, __value)
      };
      if (preserveUnknownFields.isDefined) {
        val __value = preserveUnknownFields.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(9, __value)
      };
      if (objectName.isDefined) {
        val __value = objectName.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(10, __value)
      };
      if (scope.isDefined) {
        val __value = scope.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeEnumSize(11, __value.value)
      };
      if (lenses.isDefined) {
        val __value = lenses.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(12, __value)
      };
      if (retainSourceCodeInfo.isDefined) {
        val __value = retainSourceCodeInfo.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(13, __value)
      };
      if (mapType.isDefined) {
        val __value = mapType.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(14, __value)
      };
      if (noDefaultValuesInConstructor.isDefined) {
        val __value = noDefaultValuesInConstructor.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(15, __value)
      };
      if (testOnlyNoJavaConversions.isDefined) {
        val __value = testOnlyNoJavaConversions.get
        __size += _root_.com.google.protobuf.CodedOutputStream.computeBoolSize(100001, __value)
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
      packageName.foreach { __v =>
        val __m = __v
        _output__.writeString(1, __m)
      };
      flatPackage.foreach { __v =>
        val __m = __v
        _output__.writeBool(2, __m)
      };
      `import`.foreach { __v =>
        val __m = __v
        _output__.writeString(3, __m)
      };
      preamble.foreach { __v =>
        val __m = __v
        _output__.writeString(4, __m)
      };
      singleFile.foreach { __v =>
        val __m = __v
        _output__.writeBool(5, __m)
      };
      primitiveWrappers.foreach { __v =>
        val __m = __v
        _output__.writeBool(6, __m)
      };
      noPrimitiveWrappers.foreach { __v =>
        val __m = __v
        _output__.writeBool(7, __m)
      };
      collectionType.foreach { __v =>
        val __m = __v
        _output__.writeString(8, __m)
      };
      preserveUnknownFields.foreach { __v =>
        val __m = __v
        _output__.writeBool(9, __m)
      };
      objectName.foreach { __v =>
        val __m = __v
        _output__.writeString(10, __m)
      };
      scope.foreach { __v =>
        val __m = __v
        _output__.writeEnum(11, __m.value)
      };
      lenses.foreach { __v =>
        val __m = __v
        _output__.writeBool(12, __m)
      };
      retainSourceCodeInfo.foreach { __v =>
        val __m = __v
        _output__.writeBool(13, __m)
      };
      mapType.foreach { __v =>
        val __m = __v
        _output__.writeString(14, __m)
      };
      noDefaultValuesInConstructor.foreach { __v =>
        val __m = __v
        _output__.writeBool(15, __m)
      };
      testOnlyNoJavaConversions.foreach { __v =>
        val __m = __v
        _output__.writeBool(100001, __m)
      };
    }
    def mergeFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): scalapb.options.ScalaPbOptions = {
      var __packageName = this.packageName
      var __flatPackage = this.flatPackage
      val __import = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= this.`import`)
      val __preamble = (_root_.scala.collection.immutable.Vector.newBuilder[_root_.scala.Predef.String] ++= this.preamble)
      var __singleFile = this.singleFile
      var __noPrimitiveWrappers = this.noPrimitiveWrappers
      var __primitiveWrappers = this.primitiveWrappers
      var __collectionType = this.collectionType
      var __preserveUnknownFields = this.preserveUnknownFields
      var __objectName = this.objectName
      var __scope = this.scope
      var __lenses = this.lenses
      var __retainSourceCodeInfo = this.retainSourceCodeInfo
      var __mapType = this.mapType
      var __noDefaultValuesInConstructor = this.noDefaultValuesInConstructor
      var __testOnlyNoJavaConversions = this.testOnlyNoJavaConversions
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __packageName = Option(_input__.readString())
          case 16 =>
            __flatPackage = Option(_input__.readBool())
          case 26 =>
            __import += _input__.readString()
          case 34 =>
            __preamble += _input__.readString()
          case 40 =>
            __singleFile = Option(_input__.readBool())
          case 56 =>
            __noPrimitiveWrappers = Option(_input__.readBool())
          case 48 =>
            __primitiveWrappers = Option(_input__.readBool())
          case 66 =>
            __collectionType = Option(_input__.readString())
          case 72 =>
            __preserveUnknownFields = Option(_input__.readBool())
          case 82 =>
            __objectName = Option(_input__.readString())
          case 88 =>
            __scope = Option(scalapb.options.ScalaPbOptions.OptionsScope.fromValue(_input__.readEnum()))
          case 96 =>
            __lenses = Option(_input__.readBool())
          case 104 =>
            __retainSourceCodeInfo = Option(_input__.readBool())
          case 114 =>
            __mapType = Option(_input__.readString())
          case 120 =>
            __noDefaultValuesInConstructor = Option(_input__.readBool())
          case 800008 =>
            __testOnlyNoJavaConversions = Option(_input__.readBool())
          case tag => _input__.skipField(tag)
        }
      }
      scalapb.options.ScalaPbOptions(
          packageName = __packageName,
          flatPackage = __flatPackage,
          `import` = __import.result(),
          preamble = __preamble.result(),
          singleFile = __singleFile,
          noPrimitiveWrappers = __noPrimitiveWrappers,
          primitiveWrappers = __primitiveWrappers,
          collectionType = __collectionType,
          preserveUnknownFields = __preserveUnknownFields,
          objectName = __objectName,
          scope = __scope,
          lenses = __lenses,
          retainSourceCodeInfo = __retainSourceCodeInfo,
          mapType = __mapType,
          noDefaultValuesInConstructor = __noDefaultValuesInConstructor,
          testOnlyNoJavaConversions = __testOnlyNoJavaConversions
      )
    }
    def getPackageName: _root_.scala.Predef.String = packageName.getOrElse("")
    def clearPackageName: ScalaPbOptions = copy(packageName = _root_.scala.None)
    def withPackageName(__v: _root_.scala.Predef.String): ScalaPbOptions = copy(packageName = Option(__v))
    def getFlatPackage: _root_.scala.Boolean = flatPackage.getOrElse(false)
    def clearFlatPackage: ScalaPbOptions = copy(flatPackage = _root_.scala.None)
    def withFlatPackage(__v: _root_.scala.Boolean): ScalaPbOptions = copy(flatPackage = Option(__v))
    def clearImport = copy(`import` = _root_.scala.Seq.empty)
    def addImport(__vs: _root_.scala.Predef.String*): ScalaPbOptions = addAllImport(__vs)
    def addAllImport(__vs: Iterable[_root_.scala.Predef.String]): ScalaPbOptions = copy(`import` = `import` ++ __vs)
    def withImport(__v: _root_.scala.Seq[_root_.scala.Predef.String]): ScalaPbOptions = copy(`import` = __v)
    def clearPreamble = copy(preamble = _root_.scala.Seq.empty)
    def addPreamble(__vs: _root_.scala.Predef.String*): ScalaPbOptions = addAllPreamble(__vs)
    def addAllPreamble(__vs: Iterable[_root_.scala.Predef.String]): ScalaPbOptions = copy(preamble = preamble ++ __vs)
    def withPreamble(__v: _root_.scala.Seq[_root_.scala.Predef.String]): ScalaPbOptions = copy(preamble = __v)
    def getSingleFile: _root_.scala.Boolean = singleFile.getOrElse(false)
    def clearSingleFile: ScalaPbOptions = copy(singleFile = _root_.scala.None)
    def withSingleFile(__v: _root_.scala.Boolean): ScalaPbOptions = copy(singleFile = Option(__v))
    def getNoPrimitiveWrappers: _root_.scala.Boolean = noPrimitiveWrappers.getOrElse(false)
    def clearNoPrimitiveWrappers: ScalaPbOptions = copy(noPrimitiveWrappers = _root_.scala.None)
    def withNoPrimitiveWrappers(__v: _root_.scala.Boolean): ScalaPbOptions = copy(noPrimitiveWrappers = Option(__v))
    def getPrimitiveWrappers: _root_.scala.Boolean = primitiveWrappers.getOrElse(false)
    def clearPrimitiveWrappers: ScalaPbOptions = copy(primitiveWrappers = _root_.scala.None)
    def withPrimitiveWrappers(__v: _root_.scala.Boolean): ScalaPbOptions = copy(primitiveWrappers = Option(__v))
    def getCollectionType: _root_.scala.Predef.String = collectionType.getOrElse("")
    def clearCollectionType: ScalaPbOptions = copy(collectionType = _root_.scala.None)
    def withCollectionType(__v: _root_.scala.Predef.String): ScalaPbOptions = copy(collectionType = Option(__v))
    def getPreserveUnknownFields: _root_.scala.Boolean = preserveUnknownFields.getOrElse(false)
    def clearPreserveUnknownFields: ScalaPbOptions = copy(preserveUnknownFields = _root_.scala.None)
    def withPreserveUnknownFields(__v: _root_.scala.Boolean): ScalaPbOptions = copy(preserveUnknownFields = Option(__v))
    def getObjectName: _root_.scala.Predef.String = objectName.getOrElse("")
    def clearObjectName: ScalaPbOptions = copy(objectName = _root_.scala.None)
    def withObjectName(__v: _root_.scala.Predef.String): ScalaPbOptions = copy(objectName = Option(__v))
    def getScope: scalapb.options.ScalaPbOptions.OptionsScope = scope.getOrElse(scalapb.options.ScalaPbOptions.OptionsScope.FILE)
    def clearScope: ScalaPbOptions = copy(scope = _root_.scala.None)
    def withScope(__v: scalapb.options.ScalaPbOptions.OptionsScope): ScalaPbOptions = copy(scope = Option(__v))
    def getLenses: _root_.scala.Boolean = lenses.getOrElse(true)
    def clearLenses: ScalaPbOptions = copy(lenses = _root_.scala.None)
    def withLenses(__v: _root_.scala.Boolean): ScalaPbOptions = copy(lenses = Option(__v))
    def getRetainSourceCodeInfo: _root_.scala.Boolean = retainSourceCodeInfo.getOrElse(false)
    def clearRetainSourceCodeInfo: ScalaPbOptions = copy(retainSourceCodeInfo = _root_.scala.None)
    def withRetainSourceCodeInfo(__v: _root_.scala.Boolean): ScalaPbOptions = copy(retainSourceCodeInfo = Option(__v))
    def getMapType: _root_.scala.Predef.String = mapType.getOrElse("")
    def clearMapType: ScalaPbOptions = copy(mapType = _root_.scala.None)
    def withMapType(__v: _root_.scala.Predef.String): ScalaPbOptions = copy(mapType = Option(__v))
    def getNoDefaultValuesInConstructor: _root_.scala.Boolean = noDefaultValuesInConstructor.getOrElse(false)
    def clearNoDefaultValuesInConstructor: ScalaPbOptions = copy(noDefaultValuesInConstructor = _root_.scala.None)
    def withNoDefaultValuesInConstructor(__v: _root_.scala.Boolean): ScalaPbOptions = copy(noDefaultValuesInConstructor = Option(__v))
    def getTestOnlyNoJavaConversions: _root_.scala.Boolean = testOnlyNoJavaConversions.getOrElse(false)
    def clearTestOnlyNoJavaConversions: ScalaPbOptions = copy(testOnlyNoJavaConversions = _root_.scala.None)
    def withTestOnlyNoJavaConversions(__v: _root_.scala.Boolean): ScalaPbOptions = copy(testOnlyNoJavaConversions = Option(__v))
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => packageName.orNull
        case 2 => flatPackage.orNull
        case 3 => `import`
        case 4 => preamble
        case 5 => singleFile.orNull
        case 7 => noPrimitiveWrappers.orNull
        case 6 => primitiveWrappers.orNull
        case 8 => collectionType.orNull
        case 9 => preserveUnknownFields.orNull
        case 10 => objectName.orNull
        case 11 => scope.map(_.javaValueDescriptor).orNull
        case 12 => lenses.orNull
        case 13 => retainSourceCodeInfo.orNull
        case 14 => mapType.orNull
        case 15 => noDefaultValuesInConstructor.orNull
        case 100001 => testOnlyNoJavaConversions.orNull
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => packageName.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 2 => flatPackage.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 3 => _root_.scalapb.descriptors.PRepeated(`import`.iterator.map(_root_.scalapb.descriptors.PString).toVector)
        case 4 => _root_.scalapb.descriptors.PRepeated(preamble.iterator.map(_root_.scalapb.descriptors.PString).toVector)
        case 5 => singleFile.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 7 => noPrimitiveWrappers.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 6 => primitiveWrappers.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 8 => collectionType.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 9 => preserveUnknownFields.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 10 => objectName.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 11 => scope.map(__e => _root_.scalapb.descriptors.PEnum(__e.scalaValueDescriptor)).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 12 => lenses.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 13 => retainSourceCodeInfo.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 14 => mapType.map(_root_.scalapb.descriptors.PString).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 15 => noDefaultValuesInConstructor.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
        case 100001 => testOnlyNoJavaConversions.map(_root_.scalapb.descriptors.PBoolean).getOrElse(_root_.scalapb.descriptors.PEmpty)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = scalapb.options.ScalaPbOptions
}

object ScalaPbOptions extends scalapb.GeneratedMessageCompanion[scalapb.options.ScalaPbOptions] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[scalapb.options.ScalaPbOptions] = this
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[_root_.com.google.protobuf.Descriptors.FieldDescriptor, _root_.scala.Any]): scalapb.options.ScalaPbOptions = {
    _root_.scala.Predef.require(__fieldsMap.keys.forall(_.getContainingType() == javaDescriptor), "FieldDescriptor does not match message type.")
    val __fields = javaDescriptor.getFields
    scalapb.options.ScalaPbOptions(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[_root_.scala.Option[_root_.scala.Predef.String]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[_root_.scala.Option[_root_.scala.Boolean]],
      __fieldsMap.getOrElse(__fields.get(2), Nil).asInstanceOf[_root_.scala.Seq[_root_.scala.Predef.String]],
      __fieldsMap.getOrElse(__fields.get(3), Nil).asInstanceOf[_root_.scala.Seq[_root_.scala.Predef.String]],
      __fieldsMap.get(__fields.get(4)).asInstanceOf[_root_.scala.Option[_root_.scala.Boolean]],
      __fieldsMap.get(__fields.get(5)).asInstanceOf[_root_.scala.Option[_root_.scala.Boolean]],
      __fieldsMap.get(__fields.get(6)).asInstanceOf[_root_.scala.Option[_root_.scala.Boolean]],
      __fieldsMap.get(__fields.get(7)).asInstanceOf[_root_.scala.Option[_root_.scala.Predef.String]],
      __fieldsMap.get(__fields.get(8)).asInstanceOf[_root_.scala.Option[_root_.scala.Boolean]],
      __fieldsMap.get(__fields.get(9)).asInstanceOf[_root_.scala.Option[_root_.scala.Predef.String]],
      __fieldsMap.get(__fields.get(10)).asInstanceOf[_root_.scala.Option[_root_.com.google.protobuf.Descriptors.EnumValueDescriptor]].map(__e => scalapb.options.ScalaPbOptions.OptionsScope.fromValue(__e.getNumber)),
      __fieldsMap.get(__fields.get(11)).asInstanceOf[_root_.scala.Option[_root_.scala.Boolean]],
      __fieldsMap.get(__fields.get(12)).asInstanceOf[_root_.scala.Option[_root_.scala.Boolean]],
      __fieldsMap.get(__fields.get(13)).asInstanceOf[_root_.scala.Option[_root_.scala.Predef.String]],
      __fieldsMap.get(__fields.get(14)).asInstanceOf[_root_.scala.Option[_root_.scala.Boolean]],
      __fieldsMap.get(__fields.get(15)).asInstanceOf[_root_.scala.Option[_root_.scala.Boolean]]
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[scalapb.options.ScalaPbOptions] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage == scalaDescriptor), "FieldDescriptor does not match message type.")
      scalapb.options.ScalaPbOptions(
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(3).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(4).get).map(_.as[_root_.scala.Seq[_root_.scala.Predef.String]]).getOrElse(_root_.scala.Seq.empty),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(5).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(7).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(6).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(8).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(9).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(10).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(11).get).flatMap(_.as[_root_.scala.Option[_root_.scalapb.descriptors.EnumValueDescriptor]]).map(__e => scalapb.options.ScalaPbOptions.OptionsScope.fromValue(__e.number)),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(12).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(13).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(14).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Predef.String]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(15).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]]),
        __fieldsMap.get(scalaDescriptor.findFieldByNumber(100001).get).flatMap(_.as[_root_.scala.Option[_root_.scala.Boolean]])
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = ScalapbProto.javaDescriptor.getMessageTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = ScalapbProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = {
    (__fieldNumber: @_root_.scala.unchecked) match {
      case 11 => scalapb.options.ScalaPbOptions.OptionsScope
    }
  }
  lazy val defaultInstance = scalapb.options.ScalaPbOptions(
    packageName = _root_.scala.None,
    flatPackage = _root_.scala.None,
    `import` = _root_.scala.Seq.empty,
    preamble = _root_.scala.Seq.empty,
    singleFile = _root_.scala.None,
    noPrimitiveWrappers = _root_.scala.None,
    primitiveWrappers = _root_.scala.None,
    collectionType = _root_.scala.None,
    preserveUnknownFields = _root_.scala.None,
    objectName = _root_.scala.None,
    scope = _root_.scala.None,
    lenses = _root_.scala.None,
    retainSourceCodeInfo = _root_.scala.None,
    mapType = _root_.scala.None,
    noDefaultValuesInConstructor = _root_.scala.None,
    testOnlyNoJavaConversions = _root_.scala.None
  )
  /** Whether to apply the options only to this file, or for the entire package (and its subpackages)
    */
  sealed trait OptionsScope extends _root_.scalapb.GeneratedEnum {
    type EnumType = OptionsScope
    def isFile: _root_.scala.Boolean = false
    def isPackage: _root_.scala.Boolean = false
    def companion: _root_.scalapb.GeneratedEnumCompanion[OptionsScope] = scalapb.options.ScalaPbOptions.OptionsScope
  }
  
  object OptionsScope extends _root_.scalapb.GeneratedEnumCompanion[OptionsScope] {
    implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[OptionsScope] = this
    /** Apply the options for this file only (default)
      */
    @SerialVersionUID(0L)
    case object FILE extends OptionsScope {
      val value = 0
      val index = 0
      val name = "FILE"
      override def isFile: _root_.scala.Boolean = true
    }
    
    /** Apply the options for the entire package and its subpackages.
      */
    @SerialVersionUID(0L)
    case object PACKAGE extends OptionsScope {
      val value = 1
      val index = 1
      val name = "PACKAGE"
      override def isPackage: _root_.scala.Boolean = true
    }
    
    @SerialVersionUID(0L)
    final case class Unrecognized(value: _root_.scala.Int) extends OptionsScope with _root_.scalapb.UnrecognizedEnum
    
    lazy val values = scala.collection.immutable.Seq(FILE, PACKAGE)
    def fromValue(value: _root_.scala.Int): OptionsScope = value match {
      case 0 => FILE
      case 1 => PACKAGE
      case __other => Unrecognized(__other)
    }
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = scalapb.options.ScalaPbOptions.javaDescriptor.getEnumTypes.get(0)
    def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = scalapb.options.ScalaPbOptions.scalaDescriptor.enums(0)
  }
  implicit class ScalaPbOptionsLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, scalapb.options.ScalaPbOptions]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, scalapb.options.ScalaPbOptions](_l) {
    def packageName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getPackageName)((c_, f_) => c_.copy(packageName = Option(f_)))
    def optionalPackageName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.packageName)((c_, f_) => c_.copy(packageName = f_))
    def flatPackage: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getFlatPackage)((c_, f_) => c_.copy(flatPackage = Option(f_)))
    def optionalFlatPackage: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.flatPackage)((c_, f_) => c_.copy(flatPackage = f_))
    def `import`: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.`import`)((c_, f_) => c_.copy(`import` = f_))
    def preamble: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Seq[_root_.scala.Predef.String]] = field(_.preamble)((c_, f_) => c_.copy(preamble = f_))
    def singleFile: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getSingleFile)((c_, f_) => c_.copy(singleFile = Option(f_)))
    def optionalSingleFile: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.singleFile)((c_, f_) => c_.copy(singleFile = f_))
    def noPrimitiveWrappers: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getNoPrimitiveWrappers)((c_, f_) => c_.copy(noPrimitiveWrappers = Option(f_)))
    def optionalNoPrimitiveWrappers: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.noPrimitiveWrappers)((c_, f_) => c_.copy(noPrimitiveWrappers = f_))
    def primitiveWrappers: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getPrimitiveWrappers)((c_, f_) => c_.copy(primitiveWrappers = Option(f_)))
    def optionalPrimitiveWrappers: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.primitiveWrappers)((c_, f_) => c_.copy(primitiveWrappers = f_))
    def collectionType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getCollectionType)((c_, f_) => c_.copy(collectionType = Option(f_)))
    def optionalCollectionType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.collectionType)((c_, f_) => c_.copy(collectionType = f_))
    def preserveUnknownFields: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getPreserveUnknownFields)((c_, f_) => c_.copy(preserveUnknownFields = Option(f_)))
    def optionalPreserveUnknownFields: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.preserveUnknownFields)((c_, f_) => c_.copy(preserveUnknownFields = f_))
    def objectName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getObjectName)((c_, f_) => c_.copy(objectName = Option(f_)))
    def optionalObjectName: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.objectName)((c_, f_) => c_.copy(objectName = f_))
    def scope: _root_.scalapb.lenses.Lens[UpperPB, scalapb.options.ScalaPbOptions.OptionsScope] = field(_.getScope)((c_, f_) => c_.copy(scope = Option(f_)))
    def optionalScope: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[scalapb.options.ScalaPbOptions.OptionsScope]] = field(_.scope)((c_, f_) => c_.copy(scope = f_))
    def lenses: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getLenses)((c_, f_) => c_.copy(lenses = Option(f_)))
    def optionalLenses: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.lenses)((c_, f_) => c_.copy(lenses = f_))
    def retainSourceCodeInfo: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getRetainSourceCodeInfo)((c_, f_) => c_.copy(retainSourceCodeInfo = Option(f_)))
    def optionalRetainSourceCodeInfo: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.retainSourceCodeInfo)((c_, f_) => c_.copy(retainSourceCodeInfo = f_))
    def mapType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.getMapType)((c_, f_) => c_.copy(mapType = Option(f_)))
    def optionalMapType: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Predef.String]] = field(_.mapType)((c_, f_) => c_.copy(mapType = f_))
    def noDefaultValuesInConstructor: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getNoDefaultValuesInConstructor)((c_, f_) => c_.copy(noDefaultValuesInConstructor = Option(f_)))
    def optionalNoDefaultValuesInConstructor: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.noDefaultValuesInConstructor)((c_, f_) => c_.copy(noDefaultValuesInConstructor = f_))
    def testOnlyNoJavaConversions: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Boolean] = field(_.getTestOnlyNoJavaConversions)((c_, f_) => c_.copy(testOnlyNoJavaConversions = Option(f_)))
    def optionalTestOnlyNoJavaConversions: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Option[_root_.scala.Boolean]] = field(_.testOnlyNoJavaConversions)((c_, f_) => c_.copy(testOnlyNoJavaConversions = f_))
  }
  final val PACKAGE_NAME_FIELD_NUMBER = 1
  final val FLAT_PACKAGE_FIELD_NUMBER = 2
  final val IMPORT_FIELD_NUMBER = 3
  final val PREAMBLE_FIELD_NUMBER = 4
  final val SINGLE_FILE_FIELD_NUMBER = 5
  final val NO_PRIMITIVE_WRAPPERS_FIELD_NUMBER = 7
  final val PRIMITIVE_WRAPPERS_FIELD_NUMBER = 6
  final val COLLECTION_TYPE_FIELD_NUMBER = 8
  final val PRESERVE_UNKNOWN_FIELDS_FIELD_NUMBER = 9
  final val OBJECT_NAME_FIELD_NUMBER = 10
  final val SCOPE_FIELD_NUMBER = 11
  final val LENSES_FIELD_NUMBER = 12
  final val RETAIN_SOURCE_CODE_INFO_FIELD_NUMBER = 13
  final val MAP_TYPE_FIELD_NUMBER = 14
  final val NO_DEFAULT_VALUES_IN_CONSTRUCTOR_FIELD_NUMBER = 15
  final val TEST_ONLY_NO_JAVA_CONVERSIONS_FIELD_NUMBER = 100001
  def of(
    packageName: _root_.scala.Option[_root_.scala.Predef.String],
    flatPackage: _root_.scala.Option[_root_.scala.Boolean],
    `import`: _root_.scala.Seq[_root_.scala.Predef.String],
    preamble: _root_.scala.Seq[_root_.scala.Predef.String],
    singleFile: _root_.scala.Option[_root_.scala.Boolean],
    noPrimitiveWrappers: _root_.scala.Option[_root_.scala.Boolean],
    primitiveWrappers: _root_.scala.Option[_root_.scala.Boolean],
    collectionType: _root_.scala.Option[_root_.scala.Predef.String],
    preserveUnknownFields: _root_.scala.Option[_root_.scala.Boolean],
    objectName: _root_.scala.Option[_root_.scala.Predef.String],
    scope: _root_.scala.Option[scalapb.options.ScalaPbOptions.OptionsScope],
    lenses: _root_.scala.Option[_root_.scala.Boolean],
    retainSourceCodeInfo: _root_.scala.Option[_root_.scala.Boolean],
    mapType: _root_.scala.Option[_root_.scala.Predef.String],
    noDefaultValuesInConstructor: _root_.scala.Option[_root_.scala.Boolean],
    testOnlyNoJavaConversions: _root_.scala.Option[_root_.scala.Boolean]
  ): _root_.scalapb.options.ScalaPbOptions = _root_.scalapb.options.ScalaPbOptions(
    packageName,
    flatPackage,
    `import`,
    preamble,
    singleFile,
    noPrimitiveWrappers,
    primitiveWrappers,
    collectionType,
    preserveUnknownFields,
    objectName,
    scope,
    lenses,
    retainSourceCodeInfo,
    mapType,
    noDefaultValuesInConstructor,
    testOnlyNoJavaConversions
  )
}
