// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Communication.proto

package com.mdevv.tpo4.common.protobuf;

public final class Communication {
  private Communication() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SubscriberMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SubscriberMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UpdateMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UpdateMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MessageWrapper_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MessageWrapper_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServerResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023Communication.proto\032\031google/protobuf/a" +
      "ny.proto\"\177\n\021SubscriberMessage\022%\n\004type\030\001 " +
      "\001(\0162\027.SubscriberMessage.Type\022\r\n\005topic\030\002 " +
      "\001(\t\"4\n\004Type\022\014\n\010REGISTER\020\000\022\r\n\tSUBSCRIBE\020\001" +
      "\022\017\n\013UNSUBSCRIBE\020\002\"\217\001\n\rUpdateMessage\022!\n\004t" +
      "ype\030\001 \001(\0162\023.UpdateMessage.Type\022\r\n\005topic\030" +
      "\002 \001(\t\022\017\n\007message\030\003 \001(\t\";\n\004Type\022\022\n\016TOPIC_" +
      "CREATION\020\000\022\022\n\016TOPIC_DELETION\020\001\022\013\n\007MESSAG" +
      "E\020\002\"7\n\016MessageWrapper\022%\n\007message\030\002 \001(\0132\024" +
      ".google.protobuf.Any\"\177\n\016ServerResponse\022&" +
      "\n\006status\030\001 \001(\0162\026.ServerResponse.Status\022\017" +
      "\n\007content\030\002 \003(\t\"4\n\006Status\022\006\n\002OK\020\000\022\023\n\017INV" +
      "ALID_REQUEST\020\001\022\r\n\tNOT_FOUND\020\002B\"\n\036com.mde" +
      "vv.tpo4.common.protobufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
        });
    internal_static_SubscriberMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SubscriberMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SubscriberMessage_descriptor,
        new java.lang.String[] { "Type", "Topic", });
    internal_static_UpdateMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_UpdateMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UpdateMessage_descriptor,
        new java.lang.String[] { "Type", "Topic", "Message", });
    internal_static_MessageWrapper_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_MessageWrapper_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MessageWrapper_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_ServerResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ServerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServerResponse_descriptor,
        new java.lang.String[] { "Status", "Content", });
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
