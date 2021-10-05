// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/service/jobseeker_service.grpc.proto

package com.wanpng.jobseeker.grpc.service;

/**
 * Protobuf type {@code protos.service.GetEmploymentTypesResponse}
 */
public final class GetEmploymentTypesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protos.service.GetEmploymentTypesResponse)
    GetEmploymentTypesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetEmploymentTypesResponse.newBuilder() to construct.
  private GetEmploymentTypesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetEmploymentTypesResponse() {
    employmentTypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetEmploymentTypesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetEmploymentTypesResponse(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              employmentTypes_ = new java.util.ArrayList<com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType>();
              mutable_bitField0_ |= 0x00000001;
            }
            employmentTypes_.add(
                input.readMessage(com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType.parser(), extensionRegistry));
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
        employmentTypes_ = java.util.Collections.unmodifiableList(employmentTypes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wanpng.jobseeker.grpc.service.JobseeekerServiceProtos.internal_static_protos_service_GetEmploymentTypesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanpng.jobseeker.grpc.service.JobseeekerServiceProtos.internal_static_protos_service_GetEmploymentTypesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse.class, com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse.Builder.class);
  }

  public static final int EMPLOYMENTTYPES_FIELD_NUMBER = 1;
  private java.util.List<com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType> employmentTypes_;
  /**
   * <code>repeated .protos.domain.JobSeekerEmploymentType employmentTypes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType> getEmploymentTypesList() {
    return employmentTypes_;
  }
  /**
   * <code>repeated .protos.domain.JobSeekerEmploymentType employmentTypes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentTypeOrBuilder> 
      getEmploymentTypesOrBuilderList() {
    return employmentTypes_;
  }
  /**
   * <code>repeated .protos.domain.JobSeekerEmploymentType employmentTypes = 1;</code>
   */
  @java.lang.Override
  public int getEmploymentTypesCount() {
    return employmentTypes_.size();
  }
  /**
   * <code>repeated .protos.domain.JobSeekerEmploymentType employmentTypes = 1;</code>
   */
  @java.lang.Override
  public com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType getEmploymentTypes(int index) {
    return employmentTypes_.get(index);
  }
  /**
   * <code>repeated .protos.domain.JobSeekerEmploymentType employmentTypes = 1;</code>
   */
  @java.lang.Override
  public com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentTypeOrBuilder getEmploymentTypesOrBuilder(
      int index) {
    return employmentTypes_.get(index);
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
    for (int i = 0; i < employmentTypes_.size(); i++) {
      output.writeMessage(1, employmentTypes_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < employmentTypes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, employmentTypes_.get(i));
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
    if (!(obj instanceof com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse)) {
      return super.equals(obj);
    }
    com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse other = (com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse) obj;

    if (!getEmploymentTypesList()
        .equals(other.getEmploymentTypesList())) return false;
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
    if (getEmploymentTypesCount() > 0) {
      hash = (37 * hash) + EMPLOYMENTTYPES_FIELD_NUMBER;
      hash = (53 * hash) + getEmploymentTypesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse parseFrom(
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
  public static Builder newBuilder(com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse prototype) {
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
   * Protobuf type {@code protos.service.GetEmploymentTypesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protos.service.GetEmploymentTypesResponse)
      com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanpng.jobseeker.grpc.service.JobseeekerServiceProtos.internal_static_protos_service_GetEmploymentTypesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanpng.jobseeker.grpc.service.JobseeekerServiceProtos.internal_static_protos_service_GetEmploymentTypesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse.class, com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse.Builder.class);
    }

    // Construct using com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse.newBuilder()
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
        getEmploymentTypesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (employmentTypesBuilder_ == null) {
        employmentTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        employmentTypesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanpng.jobseeker.grpc.service.JobseeekerServiceProtos.internal_static_protos_service_GetEmploymentTypesResponse_descriptor;
    }

    @java.lang.Override
    public com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse getDefaultInstanceForType() {
      return com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse build() {
      com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse buildPartial() {
      com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse result = new com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse(this);
      int from_bitField0_ = bitField0_;
      if (employmentTypesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          employmentTypes_ = java.util.Collections.unmodifiableList(employmentTypes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.employmentTypes_ = employmentTypes_;
      } else {
        result.employmentTypes_ = employmentTypesBuilder_.build();
      }
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
      if (other instanceof com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse) {
        return mergeFrom((com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse other) {
      if (other == com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse.getDefaultInstance()) return this;
      if (employmentTypesBuilder_ == null) {
        if (!other.employmentTypes_.isEmpty()) {
          if (employmentTypes_.isEmpty()) {
            employmentTypes_ = other.employmentTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEmploymentTypesIsMutable();
            employmentTypes_.addAll(other.employmentTypes_);
          }
          onChanged();
        }
      } else {
        if (!other.employmentTypes_.isEmpty()) {
          if (employmentTypesBuilder_.isEmpty()) {
            employmentTypesBuilder_.dispose();
            employmentTypesBuilder_ = null;
            employmentTypes_ = other.employmentTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            employmentTypesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEmploymentTypesFieldBuilder() : null;
          } else {
            employmentTypesBuilder_.addAllMessages(other.employmentTypes_);
          }
        }
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
      com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType> employmentTypes_ =
      java.util.Collections.emptyList();
    private void ensureEmploymentTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        employmentTypes_ = new java.util.ArrayList<com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType>(employmentTypes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType, com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType.Builder, com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentTypeOrBuilder> employmentTypesBuilder_;

    /**
     * <code>repeated .protos.domain.JobSeekerEmploymentType employmentTypes = 1;</code>
     */
    public java.util.List<com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType> getEmploymentTypesList() {
      if (employmentTypesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(employmentTypes_);
      } else {
        return employmentTypesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .protos.domain.JobSeekerEmploymentType employmentTypes = 1;</code>
     */
    public int getEmploymentTypesCount() {
      if (employmentTypesBuilder_ == null) {
        return employmentTypes_.size();
      } else {
        return employmentTypesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .protos.domain.JobSeekerEmploymentType employmentTypes = 1;</code>
     */
    public com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType getEmploymentTypes(int index) {
      if (employmentTypesBuilder_ == null) {
        return employmentTypes_.get(index);
      } else {
        return employmentTypesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .protos.domain.JobSeekerEmploymentType employmentTypes = 1;</code>
     */
    public Builder setEmploymentTypes(
        int index, com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType value) {
      if (employmentTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEmploymentTypesIsMutable();
        employmentTypes_.set(index, value);
        onChanged();
      } else {
        employmentTypesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .protos.domain.JobSeekerEmploymentType employmentTypes = 1;</code>
     */
    public Builder setEmploymentTypes(
        int index, com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType.Builder builderForValue) {
      if (employmentTypesBuilder_ == null) {
        ensureEmploymentTypesIsMutable();
        employmentTypes_.set(index, builderForValue.build());
        onChanged();
      } else {
        employmentTypesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protos.domain.JobSeekerEmploymentType employmentTypes = 1;</code>
     */
    public Builder addEmploymentTypes(com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType value) {
      if (employmentTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEmploymentTypesIsMutable();
        employmentTypes_.add(value);
        onChanged();
      } else {
        employmentTypesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .protos.domain.JobSeekerEmploymentType employmentTypes = 1;</code>
     */
    public Builder addEmploymentTypes(
        int index, com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType value) {
      if (employmentTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEmploymentTypesIsMutable();
        employmentTypes_.add(index, value);
        onChanged();
      } else {
        employmentTypesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .protos.domain.JobSeekerEmploymentType employmentTypes = 1;</code>
     */
    public Builder addEmploymentTypes(
        com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType.Builder builderForValue) {
      if (employmentTypesBuilder_ == null) {
        ensureEmploymentTypesIsMutable();
        employmentTypes_.add(builderForValue.build());
        onChanged();
      } else {
        employmentTypesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protos.domain.JobSeekerEmploymentType employmentTypes = 1;</code>
     */
    public Builder addEmploymentTypes(
        int index, com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType.Builder builderForValue) {
      if (employmentTypesBuilder_ == null) {
        ensureEmploymentTypesIsMutable();
        employmentTypes_.add(index, builderForValue.build());
        onChanged();
      } else {
        employmentTypesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protos.domain.JobSeekerEmploymentType employmentTypes = 1;</code>
     */
    public Builder addAllEmploymentTypes(
        java.lang.Iterable<? extends com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType> values) {
      if (employmentTypesBuilder_ == null) {
        ensureEmploymentTypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, employmentTypes_);
        onChanged();
      } else {
        employmentTypesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .protos.domain.JobSeekerEmploymentType employmentTypes = 1;</code>
     */
    public Builder clearEmploymentTypes() {
      if (employmentTypesBuilder_ == null) {
        employmentTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        employmentTypesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .protos.domain.JobSeekerEmploymentType employmentTypes = 1;</code>
     */
    public Builder removeEmploymentTypes(int index) {
      if (employmentTypesBuilder_ == null) {
        ensureEmploymentTypesIsMutable();
        employmentTypes_.remove(index);
        onChanged();
      } else {
        employmentTypesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .protos.domain.JobSeekerEmploymentType employmentTypes = 1;</code>
     */
    public com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType.Builder getEmploymentTypesBuilder(
        int index) {
      return getEmploymentTypesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .protos.domain.JobSeekerEmploymentType employmentTypes = 1;</code>
     */
    public com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentTypeOrBuilder getEmploymentTypesOrBuilder(
        int index) {
      if (employmentTypesBuilder_ == null) {
        return employmentTypes_.get(index);  } else {
        return employmentTypesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .protos.domain.JobSeekerEmploymentType employmentTypes = 1;</code>
     */
    public java.util.List<? extends com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentTypeOrBuilder> 
         getEmploymentTypesOrBuilderList() {
      if (employmentTypesBuilder_ != null) {
        return employmentTypesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(employmentTypes_);
      }
    }
    /**
     * <code>repeated .protos.domain.JobSeekerEmploymentType employmentTypes = 1;</code>
     */
    public com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType.Builder addEmploymentTypesBuilder() {
      return getEmploymentTypesFieldBuilder().addBuilder(
          com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType.getDefaultInstance());
    }
    /**
     * <code>repeated .protos.domain.JobSeekerEmploymentType employmentTypes = 1;</code>
     */
    public com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType.Builder addEmploymentTypesBuilder(
        int index) {
      return getEmploymentTypesFieldBuilder().addBuilder(
          index, com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType.getDefaultInstance());
    }
    /**
     * <code>repeated .protos.domain.JobSeekerEmploymentType employmentTypes = 1;</code>
     */
    public java.util.List<com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType.Builder> 
         getEmploymentTypesBuilderList() {
      return getEmploymentTypesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType, com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType.Builder, com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentTypeOrBuilder> 
        getEmploymentTypesFieldBuilder() {
      if (employmentTypesBuilder_ == null) {
        employmentTypesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType, com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentType.Builder, com.wanpng.jobseeker.grpc.domain.JobSeekerEmploymentTypeOrBuilder>(
                employmentTypes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        employmentTypes_ = null;
      }
      return employmentTypesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:protos.service.GetEmploymentTypesResponse)
  }

  // @@protoc_insertion_point(class_scope:protos.service.GetEmploymentTypesResponse)
  private static final com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse();
  }

  public static com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetEmploymentTypesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetEmploymentTypesResponse>() {
    @java.lang.Override
    public GetEmploymentTypesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetEmploymentTypesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetEmploymentTypesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetEmploymentTypesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wanpng.jobseeker.grpc.service.GetEmploymentTypesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
