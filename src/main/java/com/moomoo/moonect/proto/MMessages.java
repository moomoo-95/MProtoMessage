// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mMessages.proto

package com.moomoo.moonect.proto;

public final class MMessages {
  private MMessages() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017mMessages.proto\032\016mHeaders.proto\032\rmBodi" +
      "es.proto\"\266\003\n\010MMessage\022\031\n\007mHeader\030\001 \001(\0132\010" +
      ".MHeader\022#\n\013mConnectReq\030\002 \001(\0132\014.MConnect" +
      "ReqH\000\022\'\n\rmHeartBeatReq\030\003 \001(\0132\016.MHeartBea" +
      "tReqH\000\022/\n\021mSessionCreateReq\030\004 \001(\0132\022.MSes" +
      "sionCreateReqH\000\022/\n\021mSessionDeleteReq\030\005 \001" +
      "(\0132\022.MSessionDeleteReqH\000\022\'\n\rmStatusNotif" +
      "y\030\n \001(\0132\016.MStatusNotifyH\000\022#\n\013mConnectRes" +
      "\030\014 \001(\0132\014.MConnectResH\000\022\'\n\rmHeartBeatRes\030" +
      "\r \001(\0132\016.MHeartBeatResH\000\022/\n\021mSessionCreat" +
      "eRes\030\016 \001(\0132\022.MSessionCreateResH\000\022/\n\021mSes" +
      "sionDeleteRes\030\017 \001(\0132\022.MSessionDeleteResH" +
      "\000B\006\n\004bodyB\'\n\030com.moomoo.moonect.protoB\tM" +
      "MessagesP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.moomoo.moonect.proto.MHeaders.getDescriptor(),
          com.moomoo.moonect.proto.MBodies.getDescriptor(),
        });
    internal_static_MMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MMessage_descriptor,
        new java.lang.String[] { "MHeader", "MConnectReq", "MHeartBeatReq", "MSessionCreateReq", "MSessionDeleteReq", "MStatusNotify", "MConnectRes", "MHeartBeatRes", "MSessionCreateRes", "MSessionDeleteRes", "Body", });
    com.moomoo.moonect.proto.MHeaders.getDescriptor();
    com.moomoo.moonect.proto.MBodies.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
