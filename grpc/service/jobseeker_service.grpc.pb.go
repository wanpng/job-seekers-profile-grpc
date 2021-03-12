// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0-devel
// 	protoc        v3.15.5
// source: protos/service/jobseeker_service.grpc.proto

package service

import (
	domain "github.com/wanpng/job-seekers-profile-grpc/grpc/domain"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type ApplicationStatus int32

const (
	ApplicationStatus_APPLIED      ApplicationStatus = 0
	ApplicationStatus_REVIEWING    ApplicationStatus = 1
	ApplicationStatus_INTERVIEWING ApplicationStatus = 2
	ApplicationStatus_SHORTLIST    ApplicationStatus = 3
	ApplicationStatus_OFFERING     ApplicationStatus = 4
	ApplicationStatus_HIRED        ApplicationStatus = 5
	ApplicationStatus_NOT_SELECTED ApplicationStatus = 6
	ApplicationStatus_WITHDRAW     ApplicationStatus = 7
)

// Enum value maps for ApplicationStatus.
var (
	ApplicationStatus_name = map[int32]string{
		0: "APPLIED",
		1: "REVIEWING",
		2: "INTERVIEWING",
		3: "SHORTLIST",
		4: "OFFERING",
		5: "HIRED",
		6: "NOT_SELECTED",
		7: "WITHDRAW",
	}
	ApplicationStatus_value = map[string]int32{
		"APPLIED":      0,
		"REVIEWING":    1,
		"INTERVIEWING": 2,
		"SHORTLIST":    3,
		"OFFERING":     4,
		"HIRED":        5,
		"NOT_SELECTED": 6,
		"WITHDRAW":     7,
	}
)

func (x ApplicationStatus) Enum() *ApplicationStatus {
	p := new(ApplicationStatus)
	*p = x
	return p
}

func (x ApplicationStatus) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (ApplicationStatus) Descriptor() protoreflect.EnumDescriptor {
	return file_protos_service_jobseeker_service_grpc_proto_enumTypes[0].Descriptor()
}

func (ApplicationStatus) Type() protoreflect.EnumType {
	return &file_protos_service_jobseeker_service_grpc_proto_enumTypes[0]
}

func (x ApplicationStatus) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use ApplicationStatus.Descriptor instead.
func (ApplicationStatus) EnumDescriptor() ([]byte, []int) {
	return file_protos_service_jobseeker_service_grpc_proto_rawDescGZIP(), []int{0}
}

type GetJobseekersRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	ApplicationStatus ApplicationStatus `protobuf:"varint,1,opt,name=application_status,json=applicationStatus,proto3,enum=protos.service.ApplicationStatus" json:"application_status,omitempty"`
	JobseekerIds      []string          `protobuf:"bytes,2,rep,name=jobseeker_ids,json=jobseekerIds,proto3" json:"jobseeker_ids,omitempty"`
}

func (x *GetJobseekersRequest) Reset() {
	*x = GetJobseekersRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_service_jobseeker_service_grpc_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetJobseekersRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetJobseekersRequest) ProtoMessage() {}

func (x *GetJobseekersRequest) ProtoReflect() protoreflect.Message {
	mi := &file_protos_service_jobseeker_service_grpc_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetJobseekersRequest.ProtoReflect.Descriptor instead.
func (*GetJobseekersRequest) Descriptor() ([]byte, []int) {
	return file_protos_service_jobseeker_service_grpc_proto_rawDescGZIP(), []int{0}
}

func (x *GetJobseekersRequest) GetApplicationStatus() ApplicationStatus {
	if x != nil {
		return x.ApplicationStatus
	}
	return ApplicationStatus_APPLIED
}

func (x *GetJobseekersRequest) GetJobseekerIds() []string {
	if x != nil {
		return x.JobseekerIds
	}
	return nil
}

type GetJobseekersResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Jobseekers []*domain.JobseekerGrpc `protobuf:"bytes,1,rep,name=jobseekers,proto3" json:"jobseekers,omitempty"`
}

func (x *GetJobseekersResponse) Reset() {
	*x = GetJobseekersResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_service_jobseeker_service_grpc_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetJobseekersResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetJobseekersResponse) ProtoMessage() {}

func (x *GetJobseekersResponse) ProtoReflect() protoreflect.Message {
	mi := &file_protos_service_jobseeker_service_grpc_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetJobseekersResponse.ProtoReflect.Descriptor instead.
func (*GetJobseekersResponse) Descriptor() ([]byte, []int) {
	return file_protos_service_jobseeker_service_grpc_proto_rawDescGZIP(), []int{1}
}

func (x *GetJobseekersResponse) GetJobseekers() []*domain.JobseekerGrpc {
	if x != nil {
		return x.Jobseekers
	}
	return nil
}

var File_protos_service_jobseeker_service_grpc_proto protoreflect.FileDescriptor

var file_protos_service_jobseeker_service_grpc_proto_rawDesc = []byte{
	0x0a, 0x2b, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x2f, 0x6a, 0x6f, 0x62, 0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x5f, 0x73, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x1a, 0x22, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2f, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2f, 0x6a, 0x6f, 0x62,
	0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x22, 0x8d, 0x01, 0x0a, 0x14, 0x47, 0x65, 0x74, 0x4a, 0x6f, 0x62, 0x73, 0x65, 0x65, 0x6b,
	0x65, 0x72, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x50, 0x0a, 0x12, 0x61, 0x70,
	0x70, 0x6c, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x21, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2e,
	0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x41, 0x70, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x74,
	0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x52, 0x11, 0x61, 0x70, 0x70, 0x6c, 0x69,
	0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x23, 0x0a, 0x0d,
	0x6a, 0x6f, 0x62, 0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x73, 0x18, 0x02, 0x20,
	0x03, 0x28, 0x09, 0x52, 0x0c, 0x6a, 0x6f, 0x62, 0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x49, 0x64,
	0x73, 0x22, 0x55, 0x0a, 0x15, 0x47, 0x65, 0x74, 0x4a, 0x6f, 0x62, 0x73, 0x65, 0x65, 0x6b, 0x65,
	0x72, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x3c, 0x0a, 0x0a, 0x6a, 0x6f,
	0x62, 0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x1c,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2e, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2e, 0x4a,
	0x6f, 0x62, 0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x47, 0x72, 0x70, 0x63, 0x52, 0x0a, 0x6a, 0x6f,
	0x62, 0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x73, 0x2a, 0x89, 0x01, 0x0a, 0x11, 0x41, 0x70, 0x70,
	0x6c, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x0b,
	0x0a, 0x07, 0x41, 0x50, 0x50, 0x4c, 0x49, 0x45, 0x44, 0x10, 0x00, 0x12, 0x0d, 0x0a, 0x09, 0x52,
	0x45, 0x56, 0x49, 0x45, 0x57, 0x49, 0x4e, 0x47, 0x10, 0x01, 0x12, 0x10, 0x0a, 0x0c, 0x49, 0x4e,
	0x54, 0x45, 0x52, 0x56, 0x49, 0x45, 0x57, 0x49, 0x4e, 0x47, 0x10, 0x02, 0x12, 0x0d, 0x0a, 0x09,
	0x53, 0x48, 0x4f, 0x52, 0x54, 0x4c, 0x49, 0x53, 0x54, 0x10, 0x03, 0x12, 0x0c, 0x0a, 0x08, 0x4f,
	0x46, 0x46, 0x45, 0x52, 0x49, 0x4e, 0x47, 0x10, 0x04, 0x12, 0x09, 0x0a, 0x05, 0x48, 0x49, 0x52,
	0x45, 0x44, 0x10, 0x05, 0x12, 0x10, 0x0a, 0x0c, 0x4e, 0x4f, 0x54, 0x5f, 0x53, 0x45, 0x4c, 0x45,
	0x43, 0x54, 0x45, 0x44, 0x10, 0x06, 0x12, 0x0c, 0x0a, 0x08, 0x57, 0x49, 0x54, 0x48, 0x44, 0x52,
	0x41, 0x57, 0x10, 0x07, 0x32, 0x71, 0x0a, 0x11, 0x4a, 0x6f, 0x62, 0x73, 0x65, 0x65, 0x65, 0x6b,
	0x65, 0x72, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0x5c, 0x0a, 0x0d, 0x47, 0x65, 0x74,
	0x4a, 0x6f, 0x62, 0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x73, 0x12, 0x24, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x73, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x47, 0x65, 0x74, 0x4a,
	0x6f, 0x62, 0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x1a, 0x25, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x2e, 0x47, 0x65, 0x74, 0x4a, 0x6f, 0x62, 0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x73, 0x52,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x42, 0x39, 0x5a, 0x37, 0x67, 0x69, 0x74, 0x68, 0x75,
	0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x77, 0x61, 0x6e, 0x70, 0x6e, 0x67, 0x2f, 0x6a, 0x6f, 0x62,
	0x2d, 0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x73, 0x2d, 0x70, 0x72, 0x6f, 0x66, 0x69, 0x6c, 0x65,
	0x2d, 0x67, 0x72, 0x70, 0x63, 0x2f, 0x67, 0x72, 0x70, 0x63, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_protos_service_jobseeker_service_grpc_proto_rawDescOnce sync.Once
	file_protos_service_jobseeker_service_grpc_proto_rawDescData = file_protos_service_jobseeker_service_grpc_proto_rawDesc
)

func file_protos_service_jobseeker_service_grpc_proto_rawDescGZIP() []byte {
	file_protos_service_jobseeker_service_grpc_proto_rawDescOnce.Do(func() {
		file_protos_service_jobseeker_service_grpc_proto_rawDescData = protoimpl.X.CompressGZIP(file_protos_service_jobseeker_service_grpc_proto_rawDescData)
	})
	return file_protos_service_jobseeker_service_grpc_proto_rawDescData
}

var file_protos_service_jobseeker_service_grpc_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_protos_service_jobseeker_service_grpc_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_protos_service_jobseeker_service_grpc_proto_goTypes = []interface{}{
	(ApplicationStatus)(0),        // 0: protos.service.ApplicationStatus
	(*GetJobseekersRequest)(nil),  // 1: protos.service.GetJobseekersRequest
	(*GetJobseekersResponse)(nil), // 2: protos.service.GetJobseekersResponse
	(*domain.JobseekerGrpc)(nil),  // 3: protos.domain.JobseekerGrpc
}
var file_protos_service_jobseeker_service_grpc_proto_depIdxs = []int32{
	0, // 0: protos.service.GetJobseekersRequest.application_status:type_name -> protos.service.ApplicationStatus
	3, // 1: protos.service.GetJobseekersResponse.jobseekers:type_name -> protos.domain.JobseekerGrpc
	1, // 2: protos.service.JobseeekerService.GetJobseekers:input_type -> protos.service.GetJobseekersRequest
	2, // 3: protos.service.JobseeekerService.GetJobseekers:output_type -> protos.service.GetJobseekersResponse
	3, // [3:4] is the sub-list for method output_type
	2, // [2:3] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_protos_service_jobseeker_service_grpc_proto_init() }
func file_protos_service_jobseeker_service_grpc_proto_init() {
	if File_protos_service_jobseeker_service_grpc_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_protos_service_jobseeker_service_grpc_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetJobseekersRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_protos_service_jobseeker_service_grpc_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetJobseekersResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_protos_service_jobseeker_service_grpc_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_protos_service_jobseeker_service_grpc_proto_goTypes,
		DependencyIndexes: file_protos_service_jobseeker_service_grpc_proto_depIdxs,
		EnumInfos:         file_protos_service_jobseeker_service_grpc_proto_enumTypes,
		MessageInfos:      file_protos_service_jobseeker_service_grpc_proto_msgTypes,
	}.Build()
	File_protos_service_jobseeker_service_grpc_proto = out.File
	file_protos_service_jobseeker_service_grpc_proto_rawDesc = nil
	file_protos_service_jobseeker_service_grpc_proto_goTypes = nil
	file_protos_service_jobseeker_service_grpc_proto_depIdxs = nil
}
