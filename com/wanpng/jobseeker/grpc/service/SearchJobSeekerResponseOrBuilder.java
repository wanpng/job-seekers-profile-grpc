// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/service/jobseeker_service.grpc.proto

package com.wanpng.jobseeker.grpc.service;

public interface SearchJobSeekerResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protos.service.SearchJobSeekerResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string jobseeker_ids = 1;</code>
   * @return A list containing the jobseekerIds.
   */
  java.util.List<java.lang.String>
      getJobseekerIdsList();
  /**
   * <code>repeated string jobseeker_ids = 1;</code>
   * @return The count of jobseekerIds.
   */
  int getJobseekerIdsCount();
  /**
   * <code>repeated string jobseeker_ids = 1;</code>
   * @param index The index of the element to return.
   * @return The jobseekerIds at the given index.
   */
  java.lang.String getJobseekerIds(int index);
  /**
   * <code>repeated string jobseeker_ids = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the jobseekerIds at the given index.
   */
  com.google.protobuf.ByteString
      getJobseekerIdsBytes(int index);
}
