// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/domain/skill.grpc.proto

package com.wanpng.jobseeker.grpc.domain;

public final class JobSeekerSkillProtos {
  private JobSeekerSkillProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protos_domain_JobSeekerSkill_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protos_domain_JobSeekerSkill_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036protos/domain/skill.grpc.proto\022\rprotos" +
      ".domain\"u\n\016JobSeekerSkill\022\n\n\002id\030\001 \001(\t\022\025\n" +
      "\rjob_seeker_id\030\002 \001(\t\022\020\n\010skill_id\030\003 \001(\t\022\r" +
      "\n\005skill\030\004 \001(\t\022\020\n\010level_id\030\005 \001(\005\022\r\n\005level" +
      "\030\006 \001(\tBr\n com.wanpng.jobseeker.grpc.doma" +
      "inB\024JobSeekerSkillProtosP\001Z6github.com/w" +
      "anpng/job-seekers-profile-grpc/grpc/doma" +
      "inb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_protos_domain_JobSeekerSkill_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protos_domain_JobSeekerSkill_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protos_domain_JobSeekerSkill_descriptor,
        new java.lang.String[] { "Id", "JobSeekerId", "SkillId", "Skill", "LevelId", "Level", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
