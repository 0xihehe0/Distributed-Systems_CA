// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RobotServiceProto.proto

package com.ncirl.streaming.streamingclientservice;

/**
 * Protobuf type {@code com.ncirl.streaming.ClientInformation}
 */
public final class ClientInformation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.ncirl.streaming.ClientInformation)
    ClientInformationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientInformation.newBuilder() to construct.
  private ClientInformation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientInformation() {
    clientName_ = "";
    dateTime_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClientInformation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClientInformation(
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

            clientName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            dateTime_ = s;
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
    return com.ncirl.streaming.streamingclientservice.RobotServiceProto.internal_static_com_ncirl_streaming_ClientInformation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ncirl.streaming.streamingclientservice.RobotServiceProto.internal_static_com_ncirl_streaming_ClientInformation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ncirl.streaming.streamingclientservice.ClientInformation.class, com.ncirl.streaming.streamingclientservice.ClientInformation.Builder.class);
  }

  public static final int CLIENTNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object clientName_;
  /**
   * <code>string clientName = 1;</code>
   * @return The clientName.
   */
  @java.lang.Override
  public java.lang.String getClientName() {
    java.lang.Object ref = clientName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientName_ = s;
      return s;
    }
  }
  /**
   * <code>string clientName = 1;</code>
   * @return The bytes for clientName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClientNameBytes() {
    java.lang.Object ref = clientName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATETIME_FIELD_NUMBER = 2;
  private volatile java.lang.Object dateTime_;
  /**
   * <code>string dateTime = 2;</code>
   * @return The dateTime.
   */
  @java.lang.Override
  public java.lang.String getDateTime() {
    java.lang.Object ref = dateTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dateTime_ = s;
      return s;
    }
  }
  /**
   * <code>string dateTime = 2;</code>
   * @return The bytes for dateTime.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDateTimeBytes() {
    java.lang.Object ref = dateTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dateTime_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clientName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dateTime_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dateTime_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clientName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dateTime_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dateTime_);
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
    if (!(obj instanceof com.ncirl.streaming.streamingclientservice.ClientInformation)) {
      return super.equals(obj);
    }
    com.ncirl.streaming.streamingclientservice.ClientInformation other = (com.ncirl.streaming.streamingclientservice.ClientInformation) obj;

    if (!getClientName()
        .equals(other.getClientName())) return false;
    if (!getDateTime()
        .equals(other.getDateTime())) return false;
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
    hash = (37 * hash) + CLIENTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getClientName().hashCode();
    hash = (37 * hash) + DATETIME_FIELD_NUMBER;
    hash = (53 * hash) + getDateTime().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ncirl.streaming.streamingclientservice.ClientInformation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ncirl.streaming.streamingclientservice.ClientInformation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ncirl.streaming.streamingclientservice.ClientInformation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ncirl.streaming.streamingclientservice.ClientInformation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ncirl.streaming.streamingclientservice.ClientInformation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ncirl.streaming.streamingclientservice.ClientInformation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ncirl.streaming.streamingclientservice.ClientInformation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ncirl.streaming.streamingclientservice.ClientInformation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ncirl.streaming.streamingclientservice.ClientInformation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ncirl.streaming.streamingclientservice.ClientInformation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ncirl.streaming.streamingclientservice.ClientInformation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ncirl.streaming.streamingclientservice.ClientInformation parseFrom(
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
  public static Builder newBuilder(com.ncirl.streaming.streamingclientservice.ClientInformation prototype) {
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
   * Protobuf type {@code com.ncirl.streaming.ClientInformation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.ncirl.streaming.ClientInformation)
      com.ncirl.streaming.streamingclientservice.ClientInformationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ncirl.streaming.streamingclientservice.RobotServiceProto.internal_static_com_ncirl_streaming_ClientInformation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ncirl.streaming.streamingclientservice.RobotServiceProto.internal_static_com_ncirl_streaming_ClientInformation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ncirl.streaming.streamingclientservice.ClientInformation.class, com.ncirl.streaming.streamingclientservice.ClientInformation.Builder.class);
    }

    // Construct using com.ncirl.streaming.streamingclientservice.ClientInformation.newBuilder()
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
      clientName_ = "";

      dateTime_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ncirl.streaming.streamingclientservice.RobotServiceProto.internal_static_com_ncirl_streaming_ClientInformation_descriptor;
    }

    @java.lang.Override
    public com.ncirl.streaming.streamingclientservice.ClientInformation getDefaultInstanceForType() {
      return com.ncirl.streaming.streamingclientservice.ClientInformation.getDefaultInstance();
    }

    @java.lang.Override
    public com.ncirl.streaming.streamingclientservice.ClientInformation build() {
      com.ncirl.streaming.streamingclientservice.ClientInformation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ncirl.streaming.streamingclientservice.ClientInformation buildPartial() {
      com.ncirl.streaming.streamingclientservice.ClientInformation result = new com.ncirl.streaming.streamingclientservice.ClientInformation(this);
      result.clientName_ = clientName_;
      result.dateTime_ = dateTime_;
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
      if (other instanceof com.ncirl.streaming.streamingclientservice.ClientInformation) {
        return mergeFrom((com.ncirl.streaming.streamingclientservice.ClientInformation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ncirl.streaming.streamingclientservice.ClientInformation other) {
      if (other == com.ncirl.streaming.streamingclientservice.ClientInformation.getDefaultInstance()) return this;
      if (!other.getClientName().isEmpty()) {
        clientName_ = other.clientName_;
        onChanged();
      }
      if (!other.getDateTime().isEmpty()) {
        dateTime_ = other.dateTime_;
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
      com.ncirl.streaming.streamingclientservice.ClientInformation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ncirl.streaming.streamingclientservice.ClientInformation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object clientName_ = "";
    /**
     * <code>string clientName = 1;</code>
     * @return The clientName.
     */
    public java.lang.String getClientName() {
      java.lang.Object ref = clientName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string clientName = 1;</code>
     * @return The bytes for clientName.
     */
    public com.google.protobuf.ByteString
        getClientNameBytes() {
      java.lang.Object ref = clientName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string clientName = 1;</code>
     * @param value The clientName to set.
     * @return This builder for chaining.
     */
    public Builder setClientName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clientName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string clientName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearClientName() {
      
      clientName_ = getDefaultInstance().getClientName();
      onChanged();
      return this;
    }
    /**
     * <code>string clientName = 1;</code>
     * @param value The bytes for clientName to set.
     * @return This builder for chaining.
     */
    public Builder setClientNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clientName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dateTime_ = "";
    /**
     * <code>string dateTime = 2;</code>
     * @return The dateTime.
     */
    public java.lang.String getDateTime() {
      java.lang.Object ref = dateTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dateTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dateTime = 2;</code>
     * @return The bytes for dateTime.
     */
    public com.google.protobuf.ByteString
        getDateTimeBytes() {
      java.lang.Object ref = dateTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dateTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dateTime = 2;</code>
     * @param value The dateTime to set.
     * @return This builder for chaining.
     */
    public Builder setDateTime(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dateTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dateTime = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDateTime() {
      
      dateTime_ = getDefaultInstance().getDateTime();
      onChanged();
      return this;
    }
    /**
     * <code>string dateTime = 2;</code>
     * @param value The bytes for dateTime to set.
     * @return This builder for chaining.
     */
    public Builder setDateTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dateTime_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.ncirl.streaming.ClientInformation)
  }

  // @@protoc_insertion_point(class_scope:com.ncirl.streaming.ClientInformation)
  private static final com.ncirl.streaming.streamingclientservice.ClientInformation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ncirl.streaming.streamingclientservice.ClientInformation();
  }

  public static com.ncirl.streaming.streamingclientservice.ClientInformation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientInformation>
      PARSER = new com.google.protobuf.AbstractParser<ClientInformation>() {
    @java.lang.Override
    public ClientInformation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClientInformation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClientInformation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientInformation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ncirl.streaming.streamingclientservice.ClientInformation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

