// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p3beta1/image_annotator.proto

package com.google.cloud.vision.v1p3beta1;

/**
 * <pre>
 * Parameters for crop hints annotation request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p3beta1.CropHintsParams}
 */
public  final class CropHintsParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p3beta1.CropHintsParams)
    CropHintsParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CropHintsParams.newBuilder() to construct.
  private CropHintsParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CropHintsParams() {
    aspectRatios_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CropHintsParams(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 13: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              aspectRatios_ = new java.util.ArrayList<java.lang.Float>();
              mutable_bitField0_ |= 0x00000001;
            }
            aspectRatios_.add(input.readFloat());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
              aspectRatios_ = new java.util.ArrayList<java.lang.Float>();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              aspectRatios_.add(input.readFloat());
            }
            input.popLimit(limit);
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        aspectRatios_ = java.util.Collections.unmodifiableList(aspectRatios_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.vision.v1p3beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p3beta1_CropHintsParams_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p3beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p3beta1_CropHintsParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p3beta1.CropHintsParams.class, com.google.cloud.vision.v1p3beta1.CropHintsParams.Builder.class);
  }

  public static final int ASPECT_RATIOS_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Float> aspectRatios_;
  /**
   * <pre>
   * Aspect ratios in floats, representing the ratio of the width to the height
   * of the image. For example, if the desired aspect ratio is 4/3, the
   * corresponding float value should be 1.33333.  If not specified, the
   * best possible crop is returned. The number of provided aspect ratios is
   * limited to a maximum of 16; any aspect ratios provided after the 16th are
   * ignored.
   * </pre>
   *
   * <code>repeated float aspect_ratios = 1;</code>
   */
  public java.util.List<java.lang.Float>
      getAspectRatiosList() {
    return aspectRatios_;
  }
  /**
   * <pre>
   * Aspect ratios in floats, representing the ratio of the width to the height
   * of the image. For example, if the desired aspect ratio is 4/3, the
   * corresponding float value should be 1.33333.  If not specified, the
   * best possible crop is returned. The number of provided aspect ratios is
   * limited to a maximum of 16; any aspect ratios provided after the 16th are
   * ignored.
   * </pre>
   *
   * <code>repeated float aspect_ratios = 1;</code>
   */
  public int getAspectRatiosCount() {
    return aspectRatios_.size();
  }
  /**
   * <pre>
   * Aspect ratios in floats, representing the ratio of the width to the height
   * of the image. For example, if the desired aspect ratio is 4/3, the
   * corresponding float value should be 1.33333.  If not specified, the
   * best possible crop is returned. The number of provided aspect ratios is
   * limited to a maximum of 16; any aspect ratios provided after the 16th are
   * ignored.
   * </pre>
   *
   * <code>repeated float aspect_ratios = 1;</code>
   */
  public float getAspectRatios(int index) {
    return aspectRatios_.get(index);
  }
  private int aspectRatiosMemoizedSerializedSize = -1;

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (getAspectRatiosList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(aspectRatiosMemoizedSerializedSize);
    }
    for (int i = 0; i < aspectRatios_.size(); i++) {
      output.writeFloatNoTag(aspectRatios_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      dataSize = 4 * getAspectRatiosList().size();
      size += dataSize;
      if (!getAspectRatiosList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      aspectRatiosMemoizedSerializedSize = dataSize;
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.vision.v1p3beta1.CropHintsParams)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p3beta1.CropHintsParams other = (com.google.cloud.vision.v1p3beta1.CropHintsParams) obj;

    boolean result = true;
    result = result && getAspectRatiosList()
        .equals(other.getAspectRatiosList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getAspectRatiosCount() > 0) {
      hash = (37 * hash) + ASPECT_RATIOS_FIELD_NUMBER;
      hash = (53 * hash) + getAspectRatiosList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p3beta1.CropHintsParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1p3beta1.CropHintsParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p3beta1.CropHintsParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1p3beta1.CropHintsParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p3beta1.CropHintsParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.vision.v1p3beta1.CropHintsParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p3beta1.CropHintsParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1p3beta1.CropHintsParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p3beta1.CropHintsParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1p3beta1.CropHintsParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.vision.v1p3beta1.CropHintsParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.vision.v1p3beta1.CropHintsParams parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.vision.v1p3beta1.CropHintsParams prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Parameters for crop hints annotation request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p3beta1.CropHintsParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p3beta1.CropHintsParams)
      com.google.cloud.vision.v1p3beta1.CropHintsParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.vision.v1p3beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p3beta1_CropHintsParams_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p3beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p3beta1_CropHintsParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p3beta1.CropHintsParams.class, com.google.cloud.vision.v1p3beta1.CropHintsParams.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p3beta1.CropHintsParams.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      aspectRatios_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.vision.v1p3beta1.ImageAnnotatorProto.internal_static_google_cloud_vision_v1p3beta1_CropHintsParams_descriptor;
    }

    public com.google.cloud.vision.v1p3beta1.CropHintsParams getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p3beta1.CropHintsParams.getDefaultInstance();
    }

    public com.google.cloud.vision.v1p3beta1.CropHintsParams build() {
      com.google.cloud.vision.v1p3beta1.CropHintsParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.vision.v1p3beta1.CropHintsParams buildPartial() {
      com.google.cloud.vision.v1p3beta1.CropHintsParams result = new com.google.cloud.vision.v1p3beta1.CropHintsParams(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        aspectRatios_ = java.util.Collections.unmodifiableList(aspectRatios_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.aspectRatios_ = aspectRatios_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.vision.v1p3beta1.CropHintsParams) {
        return mergeFrom((com.google.cloud.vision.v1p3beta1.CropHintsParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p3beta1.CropHintsParams other) {
      if (other == com.google.cloud.vision.v1p3beta1.CropHintsParams.getDefaultInstance()) return this;
      if (!other.aspectRatios_.isEmpty()) {
        if (aspectRatios_.isEmpty()) {
          aspectRatios_ = other.aspectRatios_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAspectRatiosIsMutable();
          aspectRatios_.addAll(other.aspectRatios_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.vision.v1p3beta1.CropHintsParams parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.vision.v1p3beta1.CropHintsParams) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Float> aspectRatios_ = java.util.Collections.emptyList();
    private void ensureAspectRatiosIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        aspectRatios_ = new java.util.ArrayList<java.lang.Float>(aspectRatios_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Aspect ratios in floats, representing the ratio of the width to the height
     * of the image. For example, if the desired aspect ratio is 4/3, the
     * corresponding float value should be 1.33333.  If not specified, the
     * best possible crop is returned. The number of provided aspect ratios is
     * limited to a maximum of 16; any aspect ratios provided after the 16th are
     * ignored.
     * </pre>
     *
     * <code>repeated float aspect_ratios = 1;</code>
     */
    public java.util.List<java.lang.Float>
        getAspectRatiosList() {
      return java.util.Collections.unmodifiableList(aspectRatios_);
    }
    /**
     * <pre>
     * Aspect ratios in floats, representing the ratio of the width to the height
     * of the image. For example, if the desired aspect ratio is 4/3, the
     * corresponding float value should be 1.33333.  If not specified, the
     * best possible crop is returned. The number of provided aspect ratios is
     * limited to a maximum of 16; any aspect ratios provided after the 16th are
     * ignored.
     * </pre>
     *
     * <code>repeated float aspect_ratios = 1;</code>
     */
    public int getAspectRatiosCount() {
      return aspectRatios_.size();
    }
    /**
     * <pre>
     * Aspect ratios in floats, representing the ratio of the width to the height
     * of the image. For example, if the desired aspect ratio is 4/3, the
     * corresponding float value should be 1.33333.  If not specified, the
     * best possible crop is returned. The number of provided aspect ratios is
     * limited to a maximum of 16; any aspect ratios provided after the 16th are
     * ignored.
     * </pre>
     *
     * <code>repeated float aspect_ratios = 1;</code>
     */
    public float getAspectRatios(int index) {
      return aspectRatios_.get(index);
    }
    /**
     * <pre>
     * Aspect ratios in floats, representing the ratio of the width to the height
     * of the image. For example, if the desired aspect ratio is 4/3, the
     * corresponding float value should be 1.33333.  If not specified, the
     * best possible crop is returned. The number of provided aspect ratios is
     * limited to a maximum of 16; any aspect ratios provided after the 16th are
     * ignored.
     * </pre>
     *
     * <code>repeated float aspect_ratios = 1;</code>
     */
    public Builder setAspectRatios(
        int index, float value) {
      ensureAspectRatiosIsMutable();
      aspectRatios_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Aspect ratios in floats, representing the ratio of the width to the height
     * of the image. For example, if the desired aspect ratio is 4/3, the
     * corresponding float value should be 1.33333.  If not specified, the
     * best possible crop is returned. The number of provided aspect ratios is
     * limited to a maximum of 16; any aspect ratios provided after the 16th are
     * ignored.
     * </pre>
     *
     * <code>repeated float aspect_ratios = 1;</code>
     */
    public Builder addAspectRatios(float value) {
      ensureAspectRatiosIsMutable();
      aspectRatios_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Aspect ratios in floats, representing the ratio of the width to the height
     * of the image. For example, if the desired aspect ratio is 4/3, the
     * corresponding float value should be 1.33333.  If not specified, the
     * best possible crop is returned. The number of provided aspect ratios is
     * limited to a maximum of 16; any aspect ratios provided after the 16th are
     * ignored.
     * </pre>
     *
     * <code>repeated float aspect_ratios = 1;</code>
     */
    public Builder addAllAspectRatios(
        java.lang.Iterable<? extends java.lang.Float> values) {
      ensureAspectRatiosIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, aspectRatios_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Aspect ratios in floats, representing the ratio of the width to the height
     * of the image. For example, if the desired aspect ratio is 4/3, the
     * corresponding float value should be 1.33333.  If not specified, the
     * best possible crop is returned. The number of provided aspect ratios is
     * limited to a maximum of 16; any aspect ratios provided after the 16th are
     * ignored.
     * </pre>
     *
     * <code>repeated float aspect_ratios = 1;</code>
     */
    public Builder clearAspectRatios() {
      aspectRatios_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p3beta1.CropHintsParams)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p3beta1.CropHintsParams)
  private static final com.google.cloud.vision.v1p3beta1.CropHintsParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p3beta1.CropHintsParams();
  }

  public static com.google.cloud.vision.v1p3beta1.CropHintsParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CropHintsParams>
      PARSER = new com.google.protobuf.AbstractParser<CropHintsParams>() {
    public CropHintsParams parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CropHintsParams(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CropHintsParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CropHintsParams> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.vision.v1p3beta1.CropHintsParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

