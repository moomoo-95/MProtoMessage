// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mHeaders.proto

package com.moomoo.moonect.proto;

public final class MHeaders {
  private MHeaders() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MHeader_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MHeader_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016mHeaders.proto\"\370\002\n\007MHeader\022\017\n\007version\030" +
      "\001 \001(\t\022\016\n\006sender\030\002 \001(\t\022\021\n\tmessageId\030\003 \001(\t" +
      "\022)\n\013messageName\030\004 \001(\0162\024.MHeader.MessageN" +
      "ame\022\021\n\ttimeStamp\030\005 \001(\004\022\022\n\nstatusCode\030\006 \001" +
      "(\r\"\346\001\n\013MessageName\022\010\n\004NONE\020\000\022\021\n\rM_CONNEC" +
      "T_REQ\020\001\022\024\n\020M_HEART_BEAT_REQ\020\002\022\030\n\024M_SESSI" +
      "ON_CREATE_REQ\020\003\022\030\n\024M_SESSION_DELETE_REQ\020" +
      "\004\022\023\n\017M_STATUS_NOTIFY\020\005\022\021\n\rM_CONNECT_RES\020" +
      "\006\022\024\n\020M_HEART_BEAT_RES\020\007\022\030\n\024M_SESSION_CRE" +
      "ATE_RES\020\010\022\030\n\024M_SESSION_DELETE_RES\020\tB&\n\030c" +
      "om.moomoo.moonect.protoB\010MHeadersP\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MHeader_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MHeader_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MHeader_descriptor,
        new java.lang.String[] { "Version", "Sender", "MessageId", "MessageName", "TimeStamp", "StatusCode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}