// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0-devel
// 	protoc        v3.15.5
// source: protos/domain/skill.proto

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

type Skill struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// @inject_tag: json:"id" gorm:"column:job_seeker_skill_id;primary_key;"
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id" gorm:"column:job_seeker_skill_id;primary_key;"`
	// @inject_tag: json:"jobSeekerId" gorm:"column:job_seeker_id;"
	JobSeekerId string `protobuf:"bytes,2,opt,name=job_seeker_id,json=jobSeekerId,proto3" json:"jobSeekerId" gorm:"column:job_seeker_id;"`
	// @inject_tag: json:"skillId" gorm:"column:skill_id;"
	SkillId string `protobuf:"bytes,3,opt,name=skill_id,json=skillId,proto3" json:"skillId" gorm:"column:skill_id;"`
	// @inject_tag: json:"skill" gorm:"column:skill;"
	Skill string `protobuf:"bytes,4,opt,name=skill,proto3" json:"skill" gorm:"column:skill;"`
	// @inject_tag: json:"levelId" gorm:"column:level_id;"
	LevelId int32 `protobuf:"varint,5,opt,name=level_id,json=levelId,proto3" json:"levelId" gorm:"column:level_id;"`
	// @inject_tag: json:"level" gorm:"column:level;"
	Level string `protobuf:"bytes,6,opt,name=level,proto3" json:"level" gorm:"column:level;"`
}

func (x *Skill) Reset() {
	*x = Skill{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_domain_skill_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Skill) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Skill) ProtoMessage() {}

func (x *Skill) ProtoReflect() protoreflect.Message {
	mi := &file_protos_domain_skill_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Skill.ProtoReflect.Descriptor instead.
func (*Skill) Descriptor() ([]byte, []int) {
	return file_protos_domain_skill_proto_rawDescGZIP(), []int{0}
}

func (x *Skill) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *Skill) GetJobSeekerId() string {
	if x != nil {
		return x.JobSeekerId
	}
	return ""
}

func (x *Skill) GetSkillId() string {
	if x != nil {
		return x.SkillId
	}
	return ""
}

func (x *Skill) GetSkill() string {
	if x != nil {
		return x.Skill
	}
	return ""
}

func (x *Skill) GetLevelId() int32 {
	if x != nil {
		return x.LevelId
	}
	return 0
}

func (x *Skill) GetLevel() string {
	if x != nil {
		return x.Level
	}
	return ""
}

type JobseekerSkill struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id     string   `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Skills []*Skill `protobuf:"bytes,2,rep,name=skills,proto3" json:"skills,omitempty"`
}

func (x *JobseekerSkill) Reset() {
	*x = JobseekerSkill{}
	if protoimpl.UnsafeEnabled {
		mi := &file_protos_domain_skill_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *JobseekerSkill) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*JobseekerSkill) ProtoMessage() {}

func (x *JobseekerSkill) ProtoReflect() protoreflect.Message {
	mi := &file_protos_domain_skill_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use JobseekerSkill.ProtoReflect.Descriptor instead.
func (*JobseekerSkill) Descriptor() ([]byte, []int) {
	return file_protos_domain_skill_proto_rawDescGZIP(), []int{1}
}

func (x *JobseekerSkill) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *JobseekerSkill) GetSkills() []*Skill {
	if x != nil {
		return x.Skills
	}
	return nil
}

var File_protos_domain_skill_proto protoreflect.FileDescriptor

var file_protos_domain_skill_proto_rawDesc = []byte{
	0x0a, 0x19, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2f, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2f,
	0x73, 0x6b, 0x69, 0x6c, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0d, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x73, 0x2e, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x22, 0x9d, 0x01, 0x0a, 0x05, 0x53,
	0x6b, 0x69, 0x6c, 0x6c, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x02, 0x69, 0x64, 0x12, 0x22, 0x0a, 0x0d, 0x6a, 0x6f, 0x62, 0x5f, 0x73, 0x65, 0x65, 0x6b,
	0x65, 0x72, 0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x6a, 0x6f, 0x62,
	0x53, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x49, 0x64, 0x12, 0x19, 0x0a, 0x08, 0x73, 0x6b, 0x69, 0x6c,
	0x6c, 0x5f, 0x69, 0x64, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x73, 0x6b, 0x69, 0x6c,
	0x6c, 0x49, 0x64, 0x12, 0x14, 0x0a, 0x05, 0x73, 0x6b, 0x69, 0x6c, 0x6c, 0x18, 0x04, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x05, 0x73, 0x6b, 0x69, 0x6c, 0x6c, 0x12, 0x19, 0x0a, 0x08, 0x6c, 0x65, 0x76,
	0x65, 0x6c, 0x5f, 0x69, 0x64, 0x18, 0x05, 0x20, 0x01, 0x28, 0x05, 0x52, 0x07, 0x6c, 0x65, 0x76,
	0x65, 0x6c, 0x49, 0x64, 0x12, 0x14, 0x0a, 0x05, 0x6c, 0x65, 0x76, 0x65, 0x6c, 0x18, 0x06, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x05, 0x6c, 0x65, 0x76, 0x65, 0x6c, 0x22, 0x4e, 0x0a, 0x0e, 0x4a, 0x6f,
	0x62, 0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x53, 0x6b, 0x69, 0x6c, 0x6c, 0x12, 0x0e, 0x0a, 0x02,
	0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x2c, 0x0a, 0x06,
	0x73, 0x6b, 0x69, 0x6c, 0x6c, 0x73, 0x18, 0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x14, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x73, 0x2e, 0x64, 0x6f, 0x6d, 0x61, 0x69, 0x6e, 0x2e, 0x53, 0x6b, 0x69,
	0x6c, 0x6c, 0x52, 0x06, 0x73, 0x6b, 0x69, 0x6c, 0x6c, 0x73, 0x42, 0x38, 0x5a, 0x36, 0x67, 0x69,
	0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x77, 0x61, 0x6e, 0x70, 0x6e, 0x67, 0x2f,
	0x6a, 0x6f, 0x62, 0x2d, 0x73, 0x65, 0x65, 0x6b, 0x65, 0x72, 0x73, 0x2d, 0x70, 0x72, 0x6f, 0x66,
	0x69, 0x6c, 0x65, 0x2d, 0x67, 0x72, 0x70, 0x63, 0x2f, 0x67, 0x72, 0x70, 0x63, 0x2f, 0x64, 0x6f,
	0x6d, 0x61, 0x69, 0x6e, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_protos_domain_skill_proto_rawDescOnce sync.Once
	file_protos_domain_skill_proto_rawDescData = file_protos_domain_skill_proto_rawDesc
)

func file_protos_domain_skill_proto_rawDescGZIP() []byte {
	file_protos_domain_skill_proto_rawDescOnce.Do(func() {
		file_protos_domain_skill_proto_rawDescData = protoimpl.X.CompressGZIP(file_protos_domain_skill_proto_rawDescData)
	})
	return file_protos_domain_skill_proto_rawDescData
}

var file_protos_domain_skill_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_protos_domain_skill_proto_goTypes = []interface{}{
	(*Skill)(nil),          // 0: protos.domain.Skill
	(*JobseekerSkill)(nil), // 1: protos.domain.JobseekerSkill
}
var file_protos_domain_skill_proto_depIdxs = []int32{
	0, // 0: protos.domain.JobseekerSkill.skills:type_name -> protos.domain.Skill
	1, // [1:1] is the sub-list for method output_type
	1, // [1:1] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_protos_domain_skill_proto_init() }
func file_protos_domain_skill_proto_init() {
	if File_protos_domain_skill_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_protos_domain_skill_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Skill); i {
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
		file_protos_domain_skill_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*JobseekerSkill); i {
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
			RawDescriptor: file_protos_domain_skill_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_protos_domain_skill_proto_goTypes,
		DependencyIndexes: file_protos_domain_skill_proto_depIdxs,
		MessageInfos:      file_protos_domain_skill_proto_msgTypes,
	}.Build()
	File_protos_domain_skill_proto = out.File
	file_protos_domain_skill_proto_rawDesc = nil
	file_protos_domain_skill_proto_goTypes = nil
	file_protos_domain_skill_proto_depIdxs = nil
}
