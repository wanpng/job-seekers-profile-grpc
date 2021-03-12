// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0-devel
// 	protoc        v3.15.5
// source: protos/domain/work_experience.grpc.proto

package domain

import (
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

type WorkExperienceGrpc struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// @inject_tag: json:"id" gorm:"column:work_experience_id;primary_key;"
	WorkExperienceId string `protobuf:"bytes,1,opt,name=work_experience_id,json=workExperienceId,proto3" json:"id" gorm:"column:work_experience_id;primary_key;"`
	// @inject_tag: json:"jobTitle" gorm:"column:job_title;"
	JobTitle string `protobuf:"bytes,2,opt,name=job_title,json=jobTitle,proto3" json:"jobTitle" gorm:"column:job_title;"`
	// @inject_tag: json:"company" gorm:"column:company;"
	Company string `protobuf:"bytes,3,opt,name=company,proto3" json:"company" gorm:"column:company;"`
	// @inject_tag: json:"description" gorm:"column:description;"
	Description string `protobuf:"bytes,4,opt,name=description,proto3" json:"description" gorm:"column:description;"`
	// @inject_tag: json:"isCurrentWork" gorm:"column:is_current_work;"
	IsCurrentWork bool `protobuf:"varint,5,opt,name=is_current_work,json=isCurrentWork,proto3" json:"isCurrentWork" gorm:"column:is_current_work;"`
	// @inject_tag: json:"fromMonthNumber" gorm:"column:from_month_number"
	FromMonth int32 `protobuf:"varint,6,opt,name=from_month,json=fromMonth,proto3" json:"fromMonthNumber" gorm:"column:from_month_number"`
	// @inject_tag: json:"fromYear" gorm:"column:from_year;"
	FromYear int32 `protobuf:"varint,7,opt,name=from_year,json=fromYear,proto3" json:"fromYear" gorm:"column:from_year;"`
	// @inject_tag: json:"toMonthNumber" gorm:"column:to_month_number;"
	ToMonth int32 `protobuf:"varint,8,opt,name=to_month,json=toMonth,proto3" json:"toMonthNumber" gorm:"column:to_month_number;"`
	// @inject_tag: json:"toYear" gorm:"column:to_year;"
	ToYear int32 `protobuf:"varint,9,opt,name=to_year,json=toYear,proto3" json:"toYear" gorm:"column:to_year;"`
}

func (x *WorkExperienceGrpc) Reset() {
	*x = WorkExperienceGrpc{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_domain_work_experience_grpc_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *WorkExperienceGrpc) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*WorkExperienceGrpc) ProtoMessage() {}

func (x *WorkExperienceGrpc) ProtoReflect() protoreflect.Message {
	mi := &file_protos_domain_work_experience_grpc_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use WorkExperienceGrpc.ProtoReflect.Descriptor instead.
func (*WorkExperienceGrpc) Descriptor() ([]byte, []int) {
	return file_protos_domain_work_experience_grpc_proto_rawDescGZIP(), []int{0}
}

func (x *WorkExperienceGrpc) GetWorkExperienceId() string {
	if x != nil {
		return x.WorkExperienceId
	}
	return ""
}

func (x *WorkExperienceGrpc) GetJobTitle() string {
	if x != nil {
		return x.JobTitle
	}
	return ""
}

func (x *WorkExperienceGrpc) GetCompany() string {
	if x != nil {
		return x.Company
	}
	return ""
}

func (x *WorkExperienceGrpc) GetDescription() string {
	if x != nil {
		return x.Description
	}
	return ""
}

func (x *WorkExperienceGrpc) GetIsCurrentWork() bool {
	if x != nil {
		return x.IsCurrentWork
	}
	return false
}

func (x *WorkExperienceGrpc) GetFromMonth() int32 {
	if x != nil {
		return x.FromMonth
	}
	return 0
}

func (x *WorkExperienceGrpc) GetFromYear() int32 {
	if x != nil {
		return x.FromYear
	}
	return 0
}

func (x *WorkExperienceGrpc) GetToMonth() int32 {
	if x != nil {
		return x.ToMonth
	}
	return 0
}

func (x *WorkExperienceGrpc) GetToYear() int32 {
	if x != nil {
		return x.ToYear
	}
	return 0
}

type JobseekerWorkExperienceGrpc struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id              string                `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	WorkExperiences []*WorkExperienceGrpc `protobuf:"bytes,2,rep,name=work_experiences,json=workExperiences,proto3" json:"work_experiences,omitempty"`
}

func (x *JobseekerWorkExperienceGrpc) Reset() {
	*x = JobseekerWorkExperienceGrpc{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_domain_work_experience_grpc_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *JobseekerWorkExperienceGrpc) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*JobseekerWorkExperienceGrpc) ProtoMessage() {}

func (x *JobseekerWorkExperienceGrpc) ProtoReflect() protoreflect.Message {
	mi := &file_protos_domain_work_experience_grpc_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use JobseekerWorkExperienceGrpc.ProtoReflect.Descriptor instead.
func (*JobseekerWorkExperienceGrpc) Descriptor() ([]byte, []int) {
	return file_protos_domain_work_experience_grpc_proto_rawDescGZIP(), []int{1}
}

func (x *JobseekerWorkExperienceGrpc) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *JobseekerWorkExperienceGrpc) GetWorkExperiences() []*WorkExperienceGrpc {
	if x != nil {
		return x.WorkExperiences
	}
	return nil
}

var File_protos_domain_work_experience_grpc_proto protoreflect.FileDescriptor

var file_protos_domain_work_experience_grpc_proto_rawDesc = []byte{
	0x0a, 0x28, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2f, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2f,
	0x77, 0x6f, 0x72, 0x6b, 0x5f, 0x65, 0x78, 0x70, 0x65, 0x72, 0x69, 0x65, 0x6e, 0x63, 0x65, 0x2e,
	0x67, 0x72, 0x70, 0x63, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0d, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x73, 0x2e, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x22, 0xb3, 0x02, 0x0a, 0x12, 0x57, 0x6f,
	0x72, 0x6b, 0x45, 0x78, 0x70, 0x65, 0x72, 0x69, 0x65, 0x6e, 0x63, 0x65, 0x47, 0x72, 0x70, 0x63,
	0x12, 0x2c, 0x0a, 0x12, 0x77, 0x6f, 0x72, 0x6b, 0x5f, 0x65, 0x78, 0x70, 0x65, 0x72, 0x69, 0x65,
	0x6e, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x10, 0x77, 0x6f,
	0x72, 0x6b, 0x45, 0x78, 0x70, 0x65, 0x72, 0x69, 0x65, 0x6e, 0x63, 0x65, 0x49, 0x64, 0x12, 0x1b,
	0x0a, 0x09, 0x6a, 0x6f, 0x62, 0x5f, 0x74, 0x69, 0x74, 0x6c, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x08, 0x6a, 0x6f, 0x62, 0x54, 0x69, 0x74, 0x6c, 0x65, 0x12, 0x18, 0x0a, 0x07, 0x63,
	0x6f, 0x6d, 0x70, 0x61, 0x6e, 0x79, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x63, 0x6f,
	0x6d, 0x70, 0x61, 0x6e, 0x79, 0x12, 0x20, 0x0a, 0x0b, 0x64, 0x65, 0x73, 0x63, 0x72, 0x69, 0x70,
	0x74, 0x69, 0x6f, 0x6e, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x64, 0x65, 0x73, 0x63,
	0x72, 0x69, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x26, 0x0a, 0x0f, 0x69, 0x73, 0x5f, 0x63, 0x75,
	0x72, 0x72, 0x65, 0x6e, 0x74, 0x5f, 0x77, 0x6f, 0x72, 0x6b, 0x18, 0x05, 0x20, 0x01, 0x28, 0x08,
	0x52, 0x0d, 0x69, 0x73, 0x43, 0x75, 0x72, 0x72, 0x65, 0x6e, 0x74, 0x57, 0x6f, 0x72, 0x6b, 0x12,
	0x1d, 0x0a, 0x0a, 0x66, 0x72, 0x6f, 0x6d, 0x5f, 0x6d, 0x6f, 0x6e, 0x74, 0x68, 0x18, 0x06, 0x20,
	0x01, 0x28, 0x05, 0x52, 0x09, 0x66, 0x72, 0x6f, 0x6d, 0x4d, 0x6f, 0x6e, 0x74, 0x68, 0x12, 0x1b,
	0x0a, 0x09, 0x66, 0x72, 0x6f, 0x6d, 0x5f, 0x79, 0x65, 0x61, 0x72, 0x18, 0x07, 0x20, 0x01, 0x28,
	0x05, 0x52, 0x08, 0x66, 0x72, 0x6f, 0x6d, 0x59, 0x65, 0x61, 0x72, 0x12, 0x19, 0x0a, 0x08, 0x74,
	0x6f, 0x5f, 0x6d, 0x6f, 0x6e, 0x74, 0x68, 0x18, 0x08, 0x20, 0x01, 0x28, 0x05, 0x52, 0x07, 0x74,
	0x6f, 0x4d, 0x6f, 0x6e, 0x74, 0x68, 0x12, 0x17, 0x0a, 0x07, 0x74, 0x6f, 0x5f, 0x79, 0x65, 0x61,
	0x72, 0x18, 0x09, 0x20, 0x01, 0x28, 0x05, 0x52, 0x06, 0x74, 0x6f, 0x59, 0x65, 0x61, 0x72, 0x22,
	0x7b, 0x0a, 0x1b, 0x4a, 0x6f, 0x62, 0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x57, 0x6f, 0x72, 0x6b,
	0x45, 0x78, 0x70, 0x65, 0x72, 0x69, 0x65, 0x6e, 0x63, 0x65, 0x47, 0x72, 0x70, 0x63, 0x12, 0x0e,
	0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x4c,
	0x0a, 0x10, 0x77, 0x6f, 0x72, 0x6b, 0x5f, 0x65, 0x78, 0x70, 0x65, 0x72, 0x69, 0x65, 0x6e, 0x63,
	0x65, 0x73, 0x18, 0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x21, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x73, 0x2e, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2e, 0x57, 0x6f, 0x72, 0x6b, 0x45, 0x78, 0x70,
	0x65, 0x72, 0x69, 0x65, 0x6e, 0x63, 0x65, 0x47, 0x72, 0x70, 0x63, 0x52, 0x0f, 0x77, 0x6f, 0x72,
	0x6b, 0x45, 0x78, 0x70, 0x65, 0x72, 0x69, 0x65, 0x6e, 0x63, 0x65, 0x73, 0x42, 0x38, 0x5a, 0x36,
	0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x77, 0x61, 0x6e, 0x70, 0x6e,
	0x67, 0x2f, 0x6a, 0x6f, 0x62, 0x2d, 0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x73, 0x2d, 0x70, 0x72,
	0x6f, 0x66, 0x69, 0x6c, 0x65, 0x2d, 0x67, 0x72, 0x70, 0x63, 0x2f, 0x67, 0x72, 0x70, 0x63, 0x2f,
	0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_protos_domain_work_experience_grpc_proto_rawDescOnce sync.Once
	file_protos_domain_work_experience_grpc_proto_rawDescData = file_protos_domain_work_experience_grpc_proto_rawDesc
)

func file_protos_domain_work_experience_grpc_proto_rawDescGZIP() []byte {
	file_protos_domain_work_experience_grpc_proto_rawDescOnce.Do(func() {
		file_protos_domain_work_experience_grpc_proto_rawDescData = protoimpl.X.CompressGZIP(file_protos_domain_work_experience_grpc_proto_rawDescData)
	})
	return file_protos_domain_work_experience_grpc_proto_rawDescData
}

var file_protos_domain_work_experience_grpc_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_protos_domain_work_experience_grpc_proto_goTypes = []interface{}{
	(*WorkExperienceGrpc)(nil),          // 0: protos.domain.WorkExperienceGrpc
	(*JobseekerWorkExperienceGrpc)(nil), // 1: protos.domain.JobseekerWorkExperienceGrpc
}
var file_protos_domain_work_experience_grpc_proto_depIdxs = []int32{
	0, // 0: protos.domain.JobseekerWorkExperienceGrpc.work_experiences:type_name -> protos.domain.WorkExperienceGrpc
	1, // [1:1] is the sub-list for method output_type
	1, // [1:1] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_protos_domain_work_experience_grpc_proto_init() }
func file_protos_domain_work_experience_grpc_proto_init() {
	if File_protos_domain_work_experience_grpc_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_protos_domain_work_experience_grpc_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*WorkExperienceGrpc); i {
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
		file_protos_domain_work_experience_grpc_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*JobseekerWorkExperienceGrpc); i {
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
			RawDescriptor: file_protos_domain_work_experience_grpc_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_protos_domain_work_experience_grpc_proto_goTypes,
		DependencyIndexes: file_protos_domain_work_experience_grpc_proto_depIdxs,
		MessageInfos:      file_protos_domain_work_experience_grpc_proto_msgTypes,
	}.Build()
	File_protos_domain_work_experience_grpc_proto = out.File
	file_protos_domain_work_experience_grpc_proto_rawDesc = nil
	file_protos_domain_work_experience_grpc_proto_goTypes = nil
	file_protos_domain_work_experience_grpc_proto_depIdxs = nil
}
