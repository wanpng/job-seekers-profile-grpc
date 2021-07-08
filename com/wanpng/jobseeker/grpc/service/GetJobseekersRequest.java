// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/service/jobseeker_service.grpc.proto

package com.wanpng.jobseeker.grpc.service;

/**
 * Protobuf type {@code protos.service.GetJobseekersRequest}
 */
public final class GetJobseekersRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protos.service.GetJobseekersRequest)
    GetJobseekersRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetJobseekersRequest.newBuilder() to construct.
  private GetJobseekersRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetJobseekersRequest() {
    applicationStatus_ = 0;
    jobseekerIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetJobseekersRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetJobseekersRequest(
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
          case 8: {
            int rawValue = input.readEnum();

            applicationStatus_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              jobseekerIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            jobseekerIds_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        jobseekerIds_ = jobseekerIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wanpng.jobseeker.grpc.service.JobseeekerServiceProtos.internal_static_protos_service_GetJobseekersRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanpng.jobseeker.grpc.service.JobseeekerServiceProtos.internal_static_protos_service_GetJobseekersRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanpng.jobseeker.grpc.service.GetJobseekersRequest.class, com.wanpng.jobseeker.grpc.service.GetJobseekersRequest.Builder.class);
  }

  public static final int APPLICATION_STATUS_FIELD_NUMBER = 1;
  private int applicationStatus_;
  /**
   * <code>.protos.service.ApplicationStatus application_status = 1;</code>
   * @return The enum numeric value on the wire for applicationStatus.
   */
  @java.lang.Override public int getApplicationStatusValue() {
    return applicationStatus_;
  }
  /**
   * <code>.protos.service.ApplicationStatus application_status = 1;</code>
   * @return The applicationStatus.
   */
  @java.lang.Override public com.wanpng.jobseeker.grpc.service.ApplicationStatus getApplicationStatus() {
    @SuppressWarnings("deprecation")
    com.wanpng.jobseeker.grpc.service.ApplicationStatus result = com.wanpng.jobseeker.grpc.service.ApplicationStatus.valueOf(applicationStatus_);
    return result == null ? com.wanpng.jobseeker.grpc.service.ApplicationStatus.UNRECOGNIZED : result;
  }

  public static final int JOBSEEKER_IDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList jobseekerIds_;
  /**
   * <code>repeated string jobseeker_ids = 2;</code>
   * @return A list containing the jobseekerIds.
   */
  public com.google.protobuf.ProtocolStringList
      getJobseekerIdsList() {
    return jobseekerIds_;
  }
  /**
   * <code>repeated string jobseeker_ids = 2;</code>
   * @return The count of jobseekerIds.
   */
  public int getJobseekerIdsCount() {
    return jobseekerIds_.size();
  }
  /**
   * <code>repeated string jobseeker_ids = 2;</code>
   * @param index The index of the element to return.
   * @return The jobseekerIds at the given index.
   */
  public java.lang.String getJobseekerIds(int index) {
    return jobseekerIds_.get(index);
  }
  /**
   * <code>repeated string jobseeker_ids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the jobseekerIds at the given index.
   */
  public com.google.protobuf.ByteString
      getJobseekerIdsBytes(int index) {
    return jobseekerIds_.getByteString(index);
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
    if (applicationStatus_ != com.wanpng.jobseeker.grpc.service.ApplicationStatus.APPLIED.getNumber()) {
      output.writeEnum(1, applicationStatus_);
    }
    for (int i = 0; i < jobseekerIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, jobseekerIds_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (applicationStatus_ != com.wanpng.jobseeker.grpc.service.ApplicationStatus.APPLIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, applicationStatus_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < jobseekerIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(jobseekerIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getJobseekerIdsList().size();
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
    if (!(obj instanceof com.wanpng.jobseeker.grpc.service.GetJobseekersRequest)) {
      return super.equals(obj);
    }
    com.wanpng.jobseeker.grpc.service.GetJobseekersRequest other = (com.wanpng.jobseeker.grpc.service.GetJobseekersRequest) obj;

    if (applicationStatus_ != other.applicationStatus_) return false;
    if (!getJobseekerIdsList()
        .equals(other.getJobseekerIdsList())) return false;
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
    hash = (37 * hash) + APPLICATION_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + applicationStatus_;
    if (getJobseekerIdsCount() > 0) {
      hash = (37 * hash) + JOBSEEKER_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getJobseekerIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanpng.jobseeker.grpc.service.GetJobseekersRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.jobseeker.grpc.service.GetJobseekersRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.service.GetJobseekersRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.jobseeker.grpc.service.GetJobseekersRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.service.GetJobseekersRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.jobseeker.grpc.service.GetJobseekersRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.service.GetJobseekersRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.jobseeker.grpc.service.GetJobseekersRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.service.GetJobseekersRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanpng.jobseeker.grpc.service.GetJobseekersRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.service.GetJobseekersRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.jobseeker.grpc.service.GetJobseekersRequest parseFrom(
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
  public static Builder newBuilder(com.wanpng.jobseeker.grpc.service.GetJobseekersRequest prototype) {
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
   * Protobuf type {@code protos.service.GetJobseekersRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protos.service.GetJobseekersRequest)
      com.wanpng.jobseeker.grpc.service.GetJobseekersRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanpng.jobseeker.grpc.service.JobseeekerServiceProtos.internal_static_protos_service_GetJobseekersRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanpng.jobseeker.grpc.service.JobseeekerServiceProtos.internal_static_protos_service_GetJobseekersRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanpng.jobseeker.grpc.service.GetJobseekersRequest.class, com.wanpng.jobseeker.grpc.service.GetJobseekersRequest.Builder.class);
    }

    // Construct using com.wanpng.jobseeker.grpc.service.GetJobseekersRequest.newBuilder()
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
      applicationStatus_ = 0;

      jobseekerIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanpng.jobseeker.grpc.service.JobseeekerServiceProtos.internal_static_protos_service_GetJobseekersRequest_descriptor;
    }

    @java.lang.Override
    public com.wanpng.jobseeker.grpc.service.GetJobseekersRequest getDefaultInstanceForType() {
      return com.wanpng.jobseeker.grpc.service.GetJobseekersRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.wanpng.jobseeker.grpc.service.GetJobseekersRequest build() {
      com.wanpng.jobseeker.grpc.service.GetJobseekersRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wanpng.jobseeker.grpc.service.GetJobseekersRequest buildPartial() {
      com.wanpng.jobseeker.grpc.service.GetJobseekersRequest result = new com.wanpng.jobseeker.grpc.service.GetJobseekersRequest(this);
      int from_bitField0_ = bitField0_;
      result.applicationStatus_ = applicationStatus_;
      if (((bitField0_ & 0x00000001) != 0)) {
        jobseekerIds_ = jobseekerIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.jobseekerIds_ = jobseekerIds_;
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
      if (other instanceof com.wanpng.jobseeker.grpc.service.GetJobseekersRequest) {
        return mergeFrom((com.wanpng.jobseeker.grpc.service.GetJobseekersRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanpng.jobseeker.grpc.service.GetJobseekersRequest other) {
      if (other == com.wanpng.jobseeker.grpc.service.GetJobseekersRequest.getDefaultInstance()) return this;
      if (other.applicationStatus_ != 0) {
        setApplicationStatusValue(other.getApplicationStatusValue());
      }
      if (!other.jobseekerIds_.isEmpty()) {
        if (jobseekerIds_.isEmpty()) {
          jobseekerIds_ = other.jobseekerIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureJobseekerIdsIsMutable();
          jobseekerIds_.addAll(other.jobseekerIds_);
        }
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
      com.wanpng.jobseeker.grpc.service.GetJobseekersRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanpng.jobseeker.grpc.service.GetJobseekersRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int applicationStatus_ = 0;
    /**
     * <code>.protos.service.ApplicationStatus application_status = 1;</code>
     * @return The enum numeric value on the wire for applicationStatus.
     */
    @java.lang.Override public int getApplicationStatusValue() {
      return applicationStatus_;
    }
    /**
     * <code>.protos.service.ApplicationStatus application_status = 1;</code>
     * @param value The enum numeric value on the wire for applicationStatus to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationStatusValue(int value) {
      
      applicationStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.protos.service.ApplicationStatus application_status = 1;</code>
     * @return The applicationStatus.
     */
    @java.lang.Override
    public com.wanpng.jobseeker.grpc.service.ApplicationStatus getApplicationStatus() {
      @SuppressWarnings("deprecation")
      com.wanpng.jobseeker.grpc.service.ApplicationStatus result = com.wanpng.jobseeker.grpc.service.ApplicationStatus.valueOf(applicationStatus_);
      return result == null ? com.wanpng.jobseeker.grpc.service.ApplicationStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>.protos.service.ApplicationStatus application_status = 1;</code>
     * @param value The applicationStatus to set.
     * @return This builder for chaining.
     */
    public Builder setApplicationStatus(com.wanpng.jobseeker.grpc.service.ApplicationStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      applicationStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.protos.service.ApplicationStatus application_status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearApplicationStatus() {
      
      applicationStatus_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList jobseekerIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureJobseekerIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        jobseekerIds_ = new com.google.protobuf.LazyStringArrayList(jobseekerIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string jobseeker_ids = 2;</code>
     * @return A list containing the jobseekerIds.
     */
    public com.google.protobuf.ProtocolStringList
        getJobseekerIdsList() {
      return jobseekerIds_.getUnmodifiableView();
    }
    /**
     * <code>repeated string jobseeker_ids = 2;</code>
     * @return The count of jobseekerIds.
     */
    public int getJobseekerIdsCount() {
      return jobseekerIds_.size();
    }
    /**
     * <code>repeated string jobseeker_ids = 2;</code>
     * @param index The index of the element to return.
     * @return The jobseekerIds at the given index.
     */
    public java.lang.String getJobseekerIds(int index) {
      return jobseekerIds_.get(index);
    }
    /**
     * <code>repeated string jobseeker_ids = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the jobseekerIds at the given index.
     */
    public com.google.protobuf.ByteString
        getJobseekerIdsBytes(int index) {
      return jobseekerIds_.getByteString(index);
    }
    /**
     * <code>repeated string jobseeker_ids = 2;</code>
     * @param index The index to set the value at.
     * @param value The jobseekerIds to set.
     * @return This builder for chaining.
     */
    public Builder setJobseekerIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureJobseekerIdsIsMutable();
      jobseekerIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string jobseeker_ids = 2;</code>
     * @param value The jobseekerIds to add.
     * @return This builder for chaining.
     */
    public Builder addJobseekerIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureJobseekerIdsIsMutable();
      jobseekerIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string jobseeker_ids = 2;</code>
     * @param values The jobseekerIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllJobseekerIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureJobseekerIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, jobseekerIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string jobseeker_ids = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearJobseekerIds() {
      jobseekerIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string jobseeker_ids = 2;</code>
     * @param value The bytes of the jobseekerIds to add.
     * @return This builder for chaining.
     */
    public Builder addJobseekerIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureJobseekerIdsIsMutable();
      jobseekerIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:protos.service.GetJobseekersRequest)
  }

  // @@protoc_insertion_point(class_scope:protos.service.GetJobseekersRequest)
  private static final com.wanpng.jobseeker.grpc.service.GetJobseekersRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanpng.jobseeker.grpc.service.GetJobseekersRequest();
  }

  public static com.wanpng.jobseeker.grpc.service.GetJobseekersRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetJobseekersRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetJobseekersRequest>() {
    @java.lang.Override
    public GetJobseekersRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetJobseekersRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetJobseekersRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetJobseekersRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wanpng.jobseeker.grpc.service.GetJobseekersRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

