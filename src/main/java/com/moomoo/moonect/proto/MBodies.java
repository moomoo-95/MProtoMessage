// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mBodies.proto

package com.moomoo.moonect.proto;

public final class MBodies {
  private MBodies() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MConnectReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MConnectReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MConnectRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MConnectRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MHeartBeatReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MHeartBeatReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MHeartBeatRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MHeartBeatRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MSessionCreateReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MSessionCreateReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MSessionCreateRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MSessionCreateRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MSessionDeleteReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MSessionDeleteReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MSessionDeleteRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MSessionDeleteRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MStatusNotify_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MStatusNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rmBodies.proto\" \n\013MConnectReq\022\021\n\tservic" +
      "eId\030\001 \001(\t\" \n\013MConnectRes\022\021\n\tserviceId\030\001 " +
      "\001(\t\"\"\n\rMHeartBeatReq\022\021\n\tserviceId\030\001 \001(\t\"" +
      "\"\n\rMHeartBeatRes\022\021\n\tserviceId\030\001 \001(\t\"&\n\021M" +
      "SessionCreateReq\022\021\n\tsessionId\030\001 \001(\t\"&\n\021M" +
      "SessionCreateRes\022\021\n\tsessionId\030\001 \001(\t\"&\n\021M" +
      "SessionDeleteReq\022\021\n\tsessionId\030\001 \001(\t\"&\n\021M" +
      "SessionDeleteRes\022\021\n\tsessionId\030\001 \001(\t\"6\n\rM" +
      "StatusNotify\022\021\n\tsessionId\030\001 \001(\t\022\022\n\ncreat" +
      "eTime\030\002 \001(\004B%\n\030com.moomoo.moonect.protoB" +
      "\007MBodiesP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MConnectReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MConnectReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MConnectReq_descriptor,
        new java.lang.String[] { "ServiceId", });
    internal_static_MConnectRes_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_MConnectRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MConnectRes_descriptor,
        new java.lang.String[] { "ServiceId", });
    internal_static_MHeartBeatReq_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_MHeartBeatReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MHeartBeatReq_descriptor,
        new java.lang.String[] { "ServiceId", });
    internal_static_MHeartBeatRes_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_MHeartBeatRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MHeartBeatRes_descriptor,
        new java.lang.String[] { "ServiceId", });
    internal_static_MSessionCreateReq_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_MSessionCreateReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MSessionCreateReq_descriptor,
        new java.lang.String[] { "SessionId", });
    internal_static_MSessionCreateRes_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_MSessionCreateRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MSessionCreateRes_descriptor,
        new java.lang.String[] { "SessionId", });
    internal_static_MSessionDeleteReq_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_MSessionDeleteReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MSessionDeleteReq_descriptor,
        new java.lang.String[] { "SessionId", });
    internal_static_MSessionDeleteRes_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_MSessionDeleteRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MSessionDeleteRes_descriptor,
        new java.lang.String[] { "SessionId", });
    internal_static_MStatusNotify_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_MStatusNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MStatusNotify_descriptor,
        new java.lang.String[] { "SessionId", "CreateTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
