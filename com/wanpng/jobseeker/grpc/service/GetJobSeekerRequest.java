// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/service/jobseeker_service.grpc.proto

package com.wanpng.jobseeker.grpc.service;

/**
 * Protobuf type {@code protos.service.GetJobSeekerRequest}
 */
public final class GetJobSeekerRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protos.service.GetJobSeekerRequest)
    GetJobSeekerRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetJobSeekerRequest.newBuilder() to construct.
  private GetJobSeekerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetJobSeekerRequest() {
    jobseekerId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetJobSeekerRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetJobSeekerRequest(
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

            jobseekerId_ = s;
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
    return com.wanpng.jobseeker.grpc.service.JobseeekerServiceProtos.internal_static_protos_service_GetJobSeekerRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanpng.jobseeker.grpc.service.JobseeekerServiceProtos.internal_static_protos_service_GetJobSeekerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest.class, com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest.Builder.class);
  }

  public static final int JOBSEEKER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object jobseekerId_;
  /**
   * <code>string jobseeker_id = 1;</code>
   * @return The jobseekerId.
   */
  @java.lang.Override
  public java.lang.String getJobseekerId() {
    java.lang.Object ref = jobseekerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jobseekerId_ = s;
      return s;
    }
  }
  /**
   * <code>string jobseeker_id = 1;</code>
   * @return The bytes for jobseekerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJobseekerIdBytes() {
    java.lang.Object ref = jobseekerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jobseekerId_ = b;
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
    if (!getJobseekerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, jobseekerId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getJobseekerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, jobseekerId_);
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
    if (!(obj instanceof com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest)) {
      return super.equals(obj);
    }
    com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest other = (com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest) obj;

    if (!getJobseekerId()
        .equals(other.getJobseekerId())) return false;
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
    hash = (37 * hash) + JOBSEEKER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getJobseekerId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest parseFrom(
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
  public static Builder newBuilder(com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest prototype) {
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
   * Protobuf type {@code protos.service.GetJobSeekerRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protos.service.GetJobSeekerRequest)
      com.wanpng.jobseeker.grpc.service.GetJobSeekerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanpng.jobseeker.grpc.service.JobseeekerServiceProtos.internal_static_protos_service_GetJobSeekerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanpng.jobseeker.grpc.service.JobseeekerServiceProtos.internal_static_protos_service_GetJobSeekerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest.class, com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest.Builder.class);
    }

    // Construct using com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest.newBuilder()
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
      jobseekerId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanpng.jobseeker.grpc.service.JobseeekerServiceProtos.internal_static_protos_service_GetJobSeekerRequest_descriptor;
    }

    @java.lang.Override
    public com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest getDefaultInstanceForType() {
      return com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest build() {
      com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest buildPartial() {
      com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest result = new com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest(this);
      result.jobseekerId_ = jobseekerId_;
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
      if (other instanceof com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest) {
        return mergeFrom((com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest other) {
      if (other == com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest.getDefaultInstance()) return this;
      if (!other.getJobseekerId().isEmpty()) {
        jobseekerId_ = other.jobseekerId_;
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
      com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object jobseekerId_ = "";
    /**
     * <code>string jobseeker_id = 1;</code>
     * @return The jobseekerId.
     */
    public java.lang.String getJobseekerId() {
      java.lang.Object ref = jobseekerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jobseekerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string jobseeker_id = 1;</code>
     * @return The bytes for jobseekerId.
     */
    public com.google.protobuf.ByteString
        getJobseekerIdBytes() {
      java.lang.Object ref = jobseekerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jobseekerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string jobseeker_id = 1;</code>
     * @param value The jobseekerId to set.
     * @return This builder for chaining.
     */
    public Builder setJobseekerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jobseekerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string jobseeker_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearJobseekerId() {
      
      jobseekerId_ = getDefaultInstance().getJobseekerId();
      onChanged();
      return this;
    }
    /**
     * <code>string jobseeker_id = 1;</code>
     * @param value The bytes for jobseekerId to set.
     * @return This builder for chaining.
     */
    public Builder setJobseekerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jobseekerId_ = value;
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


    // @@protoc_insertion_point(builder_scope:protos.service.GetJobSeekerRequest)
  }

  // @@protoc_insertion_point(class_scope:protos.service.GetJobSeekerRequest)
  private static final com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest();
  }

  public static com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetJobSeekerRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetJobSeekerRequest>() {
    @java.lang.Override
    public GetJobSeekerRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetJobSeekerRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetJobSeekerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetJobSeekerRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wanpng.jobseeker.grpc.service.GetJobSeekerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

