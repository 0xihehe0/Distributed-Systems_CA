// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RobotServiceProto.proto

package com.ncirl.robotics.robot;

/**
 * <pre>
 * Request message for inventory monitoring
 * </pre>
 *
 * Protobuf type {@code com.ncirl.robotics.InventoryMonitorRequest}
 */
public final class InventoryMonitorRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ncirl.robotics.InventoryMonitorRequest)
    InventoryMonitorRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InventoryMonitorRequest.newBuilder() to construct.
  private InventoryMonitorRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InventoryMonitorRequest() {
    area_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InventoryMonitorRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InventoryMonitorRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            area_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ncirl.robotics.robot.RobotServiceProto.internal_static_com_ncirl_robotics_InventoryMonitorRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ncirl.robotics.robot.RobotServiceProto.internal_static_com_ncirl_robotics_InventoryMonitorRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ncirl.robotics.robot.InventoryMonitorRequest.class, com.ncirl.robotics.robot.InventoryMonitorRequest.Builder.class);
  }

  public static final int AREA_FIELD_NUMBER = 1;
  private volatile java.lang.Object area_;
  /**
   * <pre>
   * Similar specifics can be included if needed
   * </pre>
   *
   * <code>string area = 1;</code>
   * @return The area.
   */
  @java.lang.Override
  public java.lang.String getArea() {
    java.lang.Object ref = area_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      area_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Similar specifics can be included if needed
   * </pre>
   *
   * <code>string area = 1;</code>
   * @return The bytes for area.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAreaBytes() {
    java.lang.Object ref = area_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      area_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(area_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, area_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(area_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, area_);
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
    if (!(obj instanceof com.ncirl.robotics.robot.InventoryMonitorRequest)) {
      return super.equals(obj);
    }
    com.ncirl.robotics.robot.InventoryMonitorRequest other = (com.ncirl.robotics.robot.InventoryMonitorRequest) obj;

    if (!getArea()
        .equals(other.getArea())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + AREA_FIELD_NUMBER;
    hash = (53 * hash) + getArea().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ncirl.robotics.robot.InventoryMonitorRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ncirl.robotics.robot.InventoryMonitorRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ncirl.robotics.robot.InventoryMonitorRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ncirl.robotics.robot.InventoryMonitorRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ncirl.robotics.robot.InventoryMonitorRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ncirl.robotics.robot.InventoryMonitorRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ncirl.robotics.robot.InventoryMonitorRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ncirl.robotics.robot.InventoryMonitorRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ncirl.robotics.robot.InventoryMonitorRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ncirl.robotics.robot.InventoryMonitorRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ncirl.robotics.robot.InventoryMonitorRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ncirl.robotics.robot.InventoryMonitorRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ncirl.robotics.robot.InventoryMonitorRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Request message for inventory monitoring
   * </pre>
   *
   * Protobuf type {@code com.ncirl.robotics.InventoryMonitorRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ncirl.robotics.InventoryMonitorRequest)
      com.ncirl.robotics.robot.InventoryMonitorRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ncirl.robotics.robot.RobotServiceProto.internal_static_com_ncirl_robotics_InventoryMonitorRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ncirl.robotics.robot.RobotServiceProto.internal_static_com_ncirl_robotics_InventoryMonitorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ncirl.robotics.robot.InventoryMonitorRequest.class, com.ncirl.robotics.robot.InventoryMonitorRequest.Builder.class);
    }

    // Construct using com.ncirl.robotics.robot.InventoryMonitorRequest.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      area_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ncirl.robotics.robot.RobotServiceProto.internal_static_com_ncirl_robotics_InventoryMonitorRequest_descriptor;
    }

    @java.lang.Override
    public com.ncirl.robotics.robot.InventoryMonitorRequest getDefaultInstanceForType() {
      return com.ncirl.robotics.robot.InventoryMonitorRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.ncirl.robotics.robot.InventoryMonitorRequest build() {
      com.ncirl.robotics.robot.InventoryMonitorRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ncirl.robotics.robot.InventoryMonitorRequest buildPartial() {
      com.ncirl.robotics.robot.InventoryMonitorRequest result = new com.ncirl.robotics.robot.InventoryMonitorRequest(this);
      result.area_ = area_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ncirl.robotics.robot.InventoryMonitorRequest) {
        return mergeFrom((com.ncirl.robotics.robot.InventoryMonitorRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ncirl.robotics.robot.InventoryMonitorRequest other) {
      if (other == com.ncirl.robotics.robot.InventoryMonitorRequest.getDefaultInstance()) return this;
      if (!other.getArea().isEmpty()) {
        area_ = other.area_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.ncirl.robotics.robot.InventoryMonitorRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ncirl.robotics.robot.InventoryMonitorRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object area_ = "";
    /**
     * <pre>
     * Similar specifics can be included if needed
     * </pre>
     *
     * <code>string area = 1;</code>
     * @return The area.
     */
    public java.lang.String getArea() {
      java.lang.Object ref = area_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        area_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Similar specifics can be included if needed
     * </pre>
     *
     * <code>string area = 1;</code>
     * @return The bytes for area.
     */
    public com.google.protobuf.ByteString
        getAreaBytes() {
      java.lang.Object ref = area_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        area_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Similar specifics can be included if needed
     * </pre>
     *
     * <code>string area = 1;</code>
     * @param value The area to set.
     * @return This builder for chaining.
     */
    public Builder setArea(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      area_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Similar specifics can be included if needed
     * </pre>
     *
     * <code>string area = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearArea() {
      
      area_ = getDefaultInstance().getArea();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Similar specifics can be included if needed
     * </pre>
     *
     * <code>string area = 1;</code>
     * @param value The bytes for area to set.
     * @return This builder for chaining.
     */
    public Builder setAreaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      area_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.ncirl.robotics.InventoryMonitorRequest)
  }

  // @@protoc_insertion_point(class_scope:com.ncirl.robotics.InventoryMonitorRequest)
  private static final com.ncirl.robotics.robot.InventoryMonitorRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ncirl.robotics.robot.InventoryMonitorRequest();
  }

  public static com.ncirl.robotics.robot.InventoryMonitorRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InventoryMonitorRequest>
      PARSER = new com.google.protobuf.AbstractParser<InventoryMonitorRequest>() {
    @java.lang.Override
    public InventoryMonitorRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InventoryMonitorRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InventoryMonitorRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InventoryMonitorRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ncirl.robotics.robot.InventoryMonitorRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

