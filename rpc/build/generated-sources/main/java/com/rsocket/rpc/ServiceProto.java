// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package com.rsocket.rpc;

public final class ServiceProto {
  private ServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_rsocket_rpc_SingleCustomerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_rsocket_rpc_SingleCustomerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_rsocket_rpc_MultipleCustomersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_rsocket_rpc_MultipleCustomersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_rsocket_rpc_CustomerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_rsocket_rpc_CustomerResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rservice.proto\022\017com.rsocket.rpc\032\033google" +
      "/protobuf/empty.proto\"#\n\025SingleCustomerR" +
      "equest\022\n\n\002id\030\001 \001(\t\"\'\n\030MultipleCustomersR" +
      "equest\022\013\n\003ids\030\001 \003(\t\",\n\020CustomerResponse\022" +
      "\n\n\002id\030\001 \001(\t\022\014\n\004name\030\002 \001(\t2\212\003\n\017CustomerSe" +
      "rvice\022Z\n\013getCustomer\022&.com.rsocket.rpc.S" +
      "ingleCustomerRequest\032!.com.rsocket.rpc.C" +
      "ustomerResponse\"\000\022`\n\014getCustomers\022).com." +
      "rsocket.rpc.MultipleCustomersRequest\032!.c" +
      "om.rsocket.rpc.CustomerResponse\"\0000\001\022R\n\016d" +
      "eleteCustomer\022&.com.rsocket.rpc.SingleCu" +
      "stomerRequest\032\026.google.protobuf.Empty\"\000\022" +
      "e\n\017customerChannel\022).com.rsocket.rpc.Mul" +
      "tipleCustomersRequest\032!.com.rsocket.rpc." +
      "CustomerResponse\"\000(\0010\001B\020B\014ServiceProtoP\001" +
      "b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        }, assigner);
    internal_static_com_rsocket_rpc_SingleCustomerRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_rsocket_rpc_SingleCustomerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_rsocket_rpc_SingleCustomerRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_rsocket_rpc_MultipleCustomersRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_rsocket_rpc_MultipleCustomersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_rsocket_rpc_MultipleCustomersRequest_descriptor,
        new java.lang.String[] { "Ids", });
    internal_static_com_rsocket_rpc_CustomerResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_rsocket_rpc_CustomerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_rsocket_rpc_CustomerResponse_descriptor,
        new java.lang.String[] { "Id", "Name", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}