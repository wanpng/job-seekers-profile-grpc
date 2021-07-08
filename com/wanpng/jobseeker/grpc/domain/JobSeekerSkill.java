// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/domain/skill.grpc.proto

package com.wanpng.jobseeker.grpc.domain;

/**
 * Protobuf type {@code protos.domain.JobSeekerSkill}
 */
public final class JobSeekerSkill extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protos.domain.JobSeekerSkill)
    JobSeekerSkillOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JobSeekerSkill.newBuilder() to construct.
  private JobSeekerSkill(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JobSeekerSkill() {
    id_ = "";
    jobSeekerId_ = "";
    skillId_ = "";
    skill_ = "";
    level_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JobSeekerSkill();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JobSeekerSkill(
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
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            skillId_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            skill_ = s;
            break;
          }
          case 40: {

            levelId_ = input.readInt32();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            level_ = s;
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
    return com.wanpng.jobseeker.grpc.domain.JobSeekerSkillProtos.internal_static_protos_domain_JobSeekerSkill_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanpng.jobseeker.grpc.domain.JobSeekerSkillProtos.internal_static_protos_domain_JobSeekerSkill_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanpng.jobseeker.grpc.domain.JobSeekerSkill.class, com.wanpng.jobseeker.grpc.domain.JobSeekerSkill.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <pre>
   * &#64;inject_tag: json:"id" gorm:"column:job_seeker_skill_id;primary_key;"
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
   * &#64;inject_tag: json:"id" gorm:"column:job_seeker_skill_id;primary_key;"
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

  public static final int SKILL_ID_FIELD_NUMBER = 3;
  private volatile java.lang.Object skillId_;
  /**
   * <pre>
   * &#64;inject_tag: json:"skillId" gorm:"column:skill_id;"
   * </pre>
   *
   * <code>string skill_id = 3;</code>
   * @return The skillId.
   */
  @java.lang.Override
  public java.lang.String getSkillId() {
    java.lang.Object ref = skillId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      skillId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * &#64;inject_tag: json:"skillId" gorm:"column:skill_id;"
   * </pre>
   *
   * <code>string skill_id = 3;</code>
   * @return The bytes for skillId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSkillIdBytes() {
    java.lang.Object ref = skillId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      skillId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SKILL_FIELD_NUMBER = 4;
  private volatile java.lang.Object skill_;
  /**
   * <pre>
   * &#64;inject_tag: json:"skill" gorm:"column:skill;"
   * </pre>
   *
   * <code>string skill = 4;</code>
   * @return The skill.
   */
  @java.lang.Override
  public java.lang.String getSkill() {
    java.lang.Object ref = skill_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      skill_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * &#64;inject_tag: json:"skill" gorm:"column:skill;"
   * </pre>
   *
   * <code>string skill = 4;</code>
   * @return The bytes for skill.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSkillBytes() {
    java.lang.Object ref = skill_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      skill_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LEVEL_ID_FIELD_NUMBER = 5;
  private int levelId_;
  /**
   * <pre>
   * &#64;inject_tag: json:"levelId" gorm:"column:level_id;"
   * </pre>
   *
   * <code>int32 level_id = 5;</code>
   * @return The levelId.
   */
  @java.lang.Override
  public int getLevelId() {
    return levelId_;
  }

  public static final int LEVEL_FIELD_NUMBER = 6;
  private volatile java.lang.Object level_;
  /**
   * <pre>
   * &#64;inject_tag: json:"level" gorm:"column:level;"
   * </pre>
   *
   * <code>string level = 6;</code>
   * @return The level.
   */
  @java.lang.Override
  public java.lang.String getLevel() {
    java.lang.Object ref = level_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      level_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * &#64;inject_tag: json:"level" gorm:"column:level;"
   * </pre>
   *
   * <code>string level = 6;</code>
   * @return The bytes for level.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLevelBytes() {
    java.lang.Object ref = level_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      level_ = b;
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
    if (!getSkillIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, skillId_);
    }
    if (!getSkillBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, skill_);
    }
    if (levelId_ != 0) {
      output.writeInt32(5, levelId_);
    }
    if (!getLevelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, level_);
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
    if (!getSkillIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, skillId_);
    }
    if (!getSkillBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, skill_);
    }
    if (levelId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, levelId_);
    }
    if (!getLevelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, level_);
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
    if (!(obj instanceof com.wanpng.jobseeker.grpc.domain.JobSeekerSkill)) {
      return super.equals(obj);
    }
    com.wanpng.jobseeker.grpc.domain.JobSeekerSkill other = (com.wanpng.jobseeker.grpc.domain.JobSeekerSkill) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getJobSeekerId()
        .equals(other.getJobSeekerId())) return false;
    if (!getSkillId()
        .equals(other.getSkillId())) return false;
    if (!getSkill()
        .equals(other.getSkill())) return false;
    if (getLevelId()
        != other.getLevelId()) return false;
    if (!getLevel()
        .equals(other.getLevel())) return false;
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
    hash = (37 * hash) + SKILL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSkillId().hashCode();
    hash = (37 * hash) + SKILL_FIELD_NUMBER;
    hash = (53 * hash) + getSkill().hashCode();
    hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getLevelId();
    hash = (37 * hash) + LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + getLevel().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanpng.jobseeker.grpc.domain.JobSeekerSkill parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.jobseeker.grpc.domain.JobSeekerSkill parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.domain.JobSeekerSkill parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.jobseeker.grpc.domain.JobSeekerSkill parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.domain.JobSeekerSkill parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanpng.jobseeker.grpc.domain.JobSeekerSkill parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.domain.JobSeekerSkill parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.jobseeker.grpc.domain.JobSeekerSkill parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.domain.JobSeekerSkill parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanpng.jobseeker.grpc.domain.JobSeekerSkill parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanpng.jobseeker.grpc.domain.JobSeekerSkill parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanpng.jobseeker.grpc.domain.JobSeekerSkill parseFrom(
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
  public static Builder newBuilder(com.wanpng.jobseeker.grpc.domain.JobSeekerSkill prototype) {
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
   * Protobuf type {@code protos.domain.JobSeekerSkill}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protos.domain.JobSeekerSkill)
      com.wanpng.jobseeker.grpc.domain.JobSeekerSkillOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanpng.jobseeker.grpc.domain.JobSeekerSkillProtos.internal_static_protos_domain_JobSeekerSkill_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanpng.jobseeker.grpc.domain.JobSeekerSkillProtos.internal_static_protos_domain_JobSeekerSkill_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanpng.jobseeker.grpc.domain.JobSeekerSkill.class, com.wanpng.jobseeker.grpc.domain.JobSeekerSkill.Builder.class);
    }

    // Construct using com.wanpng.jobseeker.grpc.domain.JobSeekerSkill.newBuilder()
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

      skillId_ = "";

      skill_ = "";

      levelId_ = 0;

      level_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanpng.jobseeker.grpc.domain.JobSeekerSkillProtos.internal_static_protos_domain_JobSeekerSkill_descriptor;
    }

    @java.lang.Override
    public com.wanpng.jobseeker.grpc.domain.JobSeekerSkill getDefaultInstanceForType() {
      return com.wanpng.jobseeker.grpc.domain.JobSeekerSkill.getDefaultInstance();
    }

    @java.lang.Override
    public com.wanpng.jobseeker.grpc.domain.JobSeekerSkill build() {
      com.wanpng.jobseeker.grpc.domain.JobSeekerSkill result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wanpng.jobseeker.grpc.domain.JobSeekerSkill buildPartial() {
      com.wanpng.jobseeker.grpc.domain.JobSeekerSkill result = new com.wanpng.jobseeker.grpc.domain.JobSeekerSkill(this);
      result.id_ = id_;
      result.jobSeekerId_ = jobSeekerId_;
      result.skillId_ = skillId_;
      result.skill_ = skill_;
      result.levelId_ = levelId_;
      result.level_ = level_;
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
      if (other instanceof com.wanpng.jobseeker.grpc.domain.JobSeekerSkill) {
        return mergeFrom((com.wanpng.jobseeker.grpc.domain.JobSeekerSkill)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanpng.jobseeker.grpc.domain.JobSeekerSkill other) {
      if (other == com.wanpng.jobseeker.grpc.domain.JobSeekerSkill.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getJobSeekerId().isEmpty()) {
        jobSeekerId_ = other.jobSeekerId_;
        onChanged();
      }
      if (!other.getSkillId().isEmpty()) {
        skillId_ = other.skillId_;
        onChanged();
      }
      if (!other.getSkill().isEmpty()) {
        skill_ = other.skill_;
        onChanged();
      }
      if (other.getLevelId() != 0) {
        setLevelId(other.getLevelId());
      }
      if (!other.getLevel().isEmpty()) {
        level_ = other.level_;
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
      com.wanpng.jobseeker.grpc.domain.JobSeekerSkill parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanpng.jobseeker.grpc.domain.JobSeekerSkill) e.getUnfinishedMessage();
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
     * &#64;inject_tag: json:"id" gorm:"column:job_seeker_skill_id;primary_key;"
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
     * &#64;inject_tag: json:"id" gorm:"column:job_seeker_skill_id;primary_key;"
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
     * &#64;inject_tag: json:"id" gorm:"column:job_seeker_skill_id;primary_key;"
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
     * &#64;inject_tag: json:"id" gorm:"column:job_seeker_skill_id;primary_key;"
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
     * &#64;inject_tag: json:"id" gorm:"column:job_seeker_skill_id;primary_key;"
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

    private java.lang.Object skillId_ = "";
    /**
     * <pre>
     * &#64;inject_tag: json:"skillId" gorm:"column:skill_id;"
     * </pre>
     *
     * <code>string skill_id = 3;</code>
     * @return The skillId.
     */
    public java.lang.String getSkillId() {
      java.lang.Object ref = skillId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        skillId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"skillId" gorm:"column:skill_id;"
     * </pre>
     *
     * <code>string skill_id = 3;</code>
     * @return The bytes for skillId.
     */
    public com.google.protobuf.ByteString
        getSkillIdBytes() {
      java.lang.Object ref = skillId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        skillId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"skillId" gorm:"column:skill_id;"
     * </pre>
     *
     * <code>string skill_id = 3;</code>
     * @param value The skillId to set.
     * @return This builder for chaining.
     */
    public Builder setSkillId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      skillId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"skillId" gorm:"column:skill_id;"
     * </pre>
     *
     * <code>string skill_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSkillId() {
      
      skillId_ = getDefaultInstance().getSkillId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"skillId" gorm:"column:skill_id;"
     * </pre>
     *
     * <code>string skill_id = 3;</code>
     * @param value The bytes for skillId to set.
     * @return This builder for chaining.
     */
    public Builder setSkillIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      skillId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object skill_ = "";
    /**
     * <pre>
     * &#64;inject_tag: json:"skill" gorm:"column:skill;"
     * </pre>
     *
     * <code>string skill = 4;</code>
     * @return The skill.
     */
    public java.lang.String getSkill() {
      java.lang.Object ref = skill_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        skill_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"skill" gorm:"column:skill;"
     * </pre>
     *
     * <code>string skill = 4;</code>
     * @return The bytes for skill.
     */
    public com.google.protobuf.ByteString
        getSkillBytes() {
      java.lang.Object ref = skill_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        skill_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"skill" gorm:"column:skill;"
     * </pre>
     *
     * <code>string skill = 4;</code>
     * @param value The skill to set.
     * @return This builder for chaining.
     */
    public Builder setSkill(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      skill_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"skill" gorm:"column:skill;"
     * </pre>
     *
     * <code>string skill = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSkill() {
      
      skill_ = getDefaultInstance().getSkill();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"skill" gorm:"column:skill;"
     * </pre>
     *
     * <code>string skill = 4;</code>
     * @param value The bytes for skill to set.
     * @return This builder for chaining.
     */
    public Builder setSkillBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      skill_ = value;
      onChanged();
      return this;
    }

    private int levelId_ ;
    /**
     * <pre>
     * &#64;inject_tag: json:"levelId" gorm:"column:level_id;"
     * </pre>
     *
     * <code>int32 level_id = 5;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"levelId" gorm:"column:level_id;"
     * </pre>
     *
     * <code>int32 level_id = 5;</code>
     * @param value The levelId to set.
     * @return This builder for chaining.
     */
    public Builder setLevelId(int value) {
      
      levelId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"levelId" gorm:"column:level_id;"
     * </pre>
     *
     * <code>int32 level_id = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearLevelId() {
      
      levelId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object level_ = "";
    /**
     * <pre>
     * &#64;inject_tag: json:"level" gorm:"column:level;"
     * </pre>
     *
     * <code>string level = 6;</code>
     * @return The level.
     */
    public java.lang.String getLevel() {
      java.lang.Object ref = level_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        level_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"level" gorm:"column:level;"
     * </pre>
     *
     * <code>string level = 6;</code>
     * @return The bytes for level.
     */
    public com.google.protobuf.ByteString
        getLevelBytes() {
      java.lang.Object ref = level_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        level_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"level" gorm:"column:level;"
     * </pre>
     *
     * <code>string level = 6;</code>
     * @param value The level to set.
     * @return This builder for chaining.
     */
    public Builder setLevel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      level_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"level" gorm:"column:level;"
     * </pre>
     *
     * <code>string level = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearLevel() {
      
      level_ = getDefaultInstance().getLevel();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * &#64;inject_tag: json:"level" gorm:"column:level;"
     * </pre>
     *
     * <code>string level = 6;</code>
     * @param value The bytes for level to set.
     * @return This builder for chaining.
     */
    public Builder setLevelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      level_ = value;
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


    // @@protoc_insertion_point(builder_scope:protos.domain.JobSeekerSkill)
  }

  // @@protoc_insertion_point(class_scope:protos.domain.JobSeekerSkill)
  private static final com.wanpng.jobseeker.grpc.domain.JobSeekerSkill DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanpng.jobseeker.grpc.domain.JobSeekerSkill();
  }

  public static com.wanpng.jobseeker.grpc.domain.JobSeekerSkill getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JobSeekerSkill>
      PARSER = new com.google.protobuf.AbstractParser<JobSeekerSkill>() {
    @java.lang.Override
    public JobSeekerSkill parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JobSeekerSkill(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JobSeekerSkill> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JobSeekerSkill> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wanpng.jobseeker.grpc.domain.JobSeekerSkill getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

