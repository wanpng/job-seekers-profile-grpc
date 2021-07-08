// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/domain/employment_type.grpc.proto

package com.wanpng.jobseeker.grpc.domain;

/**
 * Protobuf type {@code protos.domain.JobSeekerEmploymentType}
 */
public final class JobSeekerEmploymentType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protos.domain.JobSeekerEmploymentType)
    JobSeekerEmploymentTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JobSeekerEmploymentType.newBuilder() to construct.
  private JobSeekerEmploymentType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JobSeekerEmploymentType() {
    id_ = "";
    jobSeekerId_ = "";
    employmentType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JobSeekerEmploymentType();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JobSeekerEmploymentType(
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

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            jobSeekerId_ = s;
            break;
          }
          case 24: {

            employmentTypeId_ = input.readInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            employmentType_ = s;
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
    return com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentTypeProtos.internal_static_protos_domain_JobSeekerEmploymentType_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentTypeProtos.internal_static_protos_domain_JobSeekerEmploymentType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType.class, com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <pre>
   * &#64;inject_tag: json:"id" gorm:"column:job_seeker_employment_type_id;primary_key;"
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * &#64;inject_tag: json:"id" gorm:"column:job_seeker_employment_type_id;primary_key;"
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JOB_SEEKER_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object jobSeekerId_;
  /**
   * <pre>
   * &#64;inject_tag: json:"jobSeekerId" gorm:"column:job_seeker_id;"
   * </pre>
   *
   * <code>string job_seeker_id = 2;</code>
   * @return The jobSeekerId.
   */
  @java.lang.Override
  public java.lang.String getJobSeekerId() {
    java.lang.Object ref = jobSeekerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jobSeekerId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * &#64;inject_tag: json:"jobSeekerId" gorm:"column:job_seeker_id;"
   * </pre>
   *
   * <code>string job_seeker_id = 2;</code>
   * @return The bytes for jobSeekerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJobSeekerIdBytes() {
    java.lang.Object ref = jobSeekerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jobSeekerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMPLOYMENT_TYPE_ID_FIELD_NUMBER = 3;
  private int employmentTypeId_;
  /**
   * <pre>
   * &#64;inject_tag: json:"employmentTypeId" gorm:"column:employment_type_id;"
   * </pre>
   *
   * <code>int32 employment_type_id = 3;</code>
   * @return The employmentTypeId.
   */
  @java.lang.Override
  public int getEmploymentTypeId() {
    return employmentTypeId_;
  }

  public static final int EMPLOYMENT_TYPE_FIELD_NUMBER = 4;
  private volatile java.lang.Object employmentType_;
  /**
   * <pre>
   * &#64;inject_tag: json:"employmentType" gorm:"column:employment_type;"
   * </pre>
   *
   * <code>string employment_type = 4;</code>
   * @return The employmentType.
   */
  @java.lang.Override
  public java.lang.String getEmploymentType() {
    java.lang.Object ref = employmentType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      employmentType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * &#64;inject_tag: json:"employmentType" gorm:"column:employment_type;"
   * </pre>
   *
   * <code>string employment_type = 4;</code>
   * @return The bytes for employmentType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEmploymentTypeBytes() {
    java.lang.Object ref = employmentType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      employmentType_ = b;
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
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!getJobSeekerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, jobSeekerId_);
    }
    if (employmentTypeId_ != 0) {
      output.writeInt32(3, employmentTypeId_);
    }
    if (!getEmploymentTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, employmentType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!getJobSeekerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, jobSeekerId_);
    }
    if (employmentTypeId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, employmentTypeId_);
    }
    if (!getEmploymentTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, employmentType_);
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
    if (!(obj instanceof com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType)) {
      return super.equals(obj);
    }
    com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType other = (com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getJobSeekerId()
        .equals(other.getJobSeekerId())) return false;
    if (getEmploymentTypeId()
        != other.getEmploymentTypeId()) return false;
    if (!getEmploymentType()
        .equals(other.getEmploymentType())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + JOB_SEEKER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getJobSeekerId().hashCode();
    hash = (37 * hash) + EMPLOYMENT_TYPE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEmploymentTypeId();
    hash = (37 * hash) + EMPLOYMENT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getEmploymentType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType parseFrom(
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
  public static Builder newBuilder(com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType prototype) {
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
   * Protobuf type {@code protos.domain.JobSeekerEmploymentType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protos.domain.JobSeekerEmploymentType)
      com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentTypeProtos.internal_static_protos_domain_JobSeekerEmploymentType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentTypeProtos.internal_static_protos_domain_JobSeekerEmploymentType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType.class, com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType.Builder.class);
    }

    // Construct using com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType.newBuilder()
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
      id_ = "";

      jobSeekerId_ = "";

      employmentTypeId_ = 0;

      employmentType_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentTypeProtos.internal_static_protos_domain_JobSeekerEmploymentType_descriptor;
    }

    @java.lang.Override
    public com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType getDefaultInstanceForType() {
      return com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType.getDefaultInstance();
    }

    @java.lang.Override
    public com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType build() {
      com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType buildPartial() {
      com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType result = new com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType(this);
      result.id_ = id_;
      result.jobSeekerId_ = jobSeekerId_;
      result.employmentTypeId_ = employmentTypeId_;
      result.employmentType_ = employmentType_;
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
      if (other instanceof com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType) {
        return mergeFrom((com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType other) {
      if (other == com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getJobSeekerId().isEmpty()) {
        jobSeekerId_ = other.jobSeekerId_;
        onChanged();
      }
      if (other.getEmploymentTypeId() != 0) {
        setEmploymentTypeId(other.getEmploymentTypeId());
      }
      if (!other.getEmploymentType().isEmpty()) {
        employmentType_ = other.employmentType_;
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
      com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * &#64;inject_tag: json:"id" gorm:"column:job_seeker_employment_type_id;primary_key;"
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"id" gorm:"column:job_seeker_employment_type_id;primary_key;"
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"id" gorm:"column:job_seeker_employment_type_id;primary_key;"
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"id" gorm:"column:job_seeker_employment_type_id;primary_key;"
     * </pre>
     *
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"id" gorm:"column:job_seeker_employment_type_id;primary_key;"
     * </pre>
     *
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object jobSeekerId_ = "";
    /**
     * <pre>
     * &#64;inject_tag: json:"jobSeekerId" gorm:"column:job_seeker_id;"
     * </pre>
     *
     * <code>string job_seeker_id = 2;</code>
     * @return The jobSeekerId.
     */
    public java.lang.String getJobSeekerId() {
      java.lang.Object ref = jobSeekerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jobSeekerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"jobSeekerId" gorm:"column:job_seeker_id;"
     * </pre>
     *
     * <code>string job_seeker_id = 2;</code>
     * @return The bytes for jobSeekerId.
     */
    public com.google.protobuf.ByteString
        getJobSeekerIdBytes() {
      java.lang.Object ref = jobSeekerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jobSeekerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"jobSeekerId" gorm:"column:job_seeker_id;"
     * </pre>
     *
     * <code>string job_seeker_id = 2;</code>
     * @param value The jobSeekerId to set.
     * @return This builder for chaining.
     */
    public Builder setJobSeekerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jobSeekerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"jobSeekerId" gorm:"column:job_seeker_id;"
     * </pre>
     *
     * <code>string job_seeker_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearJobSeekerId() {
      
      jobSeekerId_ = getDefaultInstance().getJobSeekerId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"jobSeekerId" gorm:"column:job_seeker_id;"
     * </pre>
     *
     * <code>string job_seeker_id = 2;</code>
     * @param value The bytes for jobSeekerId to set.
     * @return This builder for chaining.
     */
    public Builder setJobSeekerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jobSeekerId_ = value;
      onChanged();
      return this;
    }

    private int employmentTypeId_ ;
    /**
     * <pre>
     * &#64;inject_tag: json:"employmentTypeId" gorm:"column:employment_type_id;"
     * </pre>
     *
     * <code>int32 employment_type_id = 3;</code>
     * @return The employmentTypeId.
     */
    @java.lang.Override
    public int getEmploymentTypeId() {
      return employmentTypeId_;
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"employmentTypeId" gorm:"column:employment_type_id;"
     * </pre>
     *
     * <code>int32 employment_type_id = 3;</code>
     * @param value The employmentTypeId to set.
     * @return This builder for chaining.
     */
    public Builder setEmploymentTypeId(int value) {
      
      employmentTypeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"employmentTypeId" gorm:"column:employment_type_id;"
     * </pre>
     *
     * <code>int32 employment_type_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmploymentTypeId() {
      
      employmentTypeId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object employmentType_ = "";
    /**
     * <pre>
     * &#64;inject_tag: json:"employmentType" gorm:"column:employment_type;"
     * </pre>
     *
     * <code>string employment_type = 4;</code>
     * @return The employmentType.
     */
    public java.lang.String getEmploymentType() {
      java.lang.Object ref = employmentType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        employmentType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"employmentType" gorm:"column:employment_type;"
     * </pre>
     *
     * <code>string employment_type = 4;</code>
     * @return The bytes for employmentType.
     */
    public com.google.protobuf.ByteString
        getEmploymentTypeBytes() {
      java.lang.Object ref = employmentType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        employmentType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"employmentType" gorm:"column:employment_type;"
     * </pre>
     *
     * <code>string employment_type = 4;</code>
     * @param value The employmentType to set.
     * @return This builder for chaining.
     */
    public Builder setEmploymentType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      employmentType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"employmentType" gorm:"column:employment_type;"
     * </pre>
     *
     * <code>string employment_type = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEmploymentType() {
      
      employmentType_ = getDefaultInstance().getEmploymentType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"employmentType" gorm:"column:employment_type;"
     * </pre>
     *
     * <code>string employment_type = 4;</code>
     * @param value The bytes for employmentType to set.
     * @return This builder for chaining.
     */
    public Builder setEmploymentTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      employmentType_ = value;
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


    // @@protoc_insertion_point(builder_scope:protos.domain.JobSeekerEmploymentType)
  }

  // @@protoc_insertion_point(class_scope:protos.domain.JobSeekerEmploymentType)
  private static final com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType();
  }

  public static com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JobSeekerEmploymentType>
      PARSER = new com.google.protobuf.AbstractParser<JobSeekerEmploymentType>() {
    @java.lang.Override
    public JobSeekerEmploymentType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JobSeekerEmploymentType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JobSeekerEmploymentType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JobSeekerEmploymentType> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

