package com.rsocket.rpc;

/**
 */
@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler (version 0.2.17)",
    comments = "Source: service.proto")
public interface BlockingCustomerService {
  String SERVICE_ID = "com.rsocket.rpc.CustomerService";
  String METHOD_GET_CUSTOMER = "getCustomer";
  String METHOD_GET_CUSTOMERS = "getCustomers";
  String METHOD_DELETE_CUSTOMER = "deleteCustomer";
  String METHOD_CUSTOMER_CHANNEL = "customerChannel";

  /**
   */
  com.rsocket.rpc.CustomerResponse getCustomer(com.rsocket.rpc.SingleCustomerRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  Iterable<com.rsocket.rpc.CustomerResponse> getCustomers(com.rsocket.rpc.MultipleCustomersRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  com.google.protobuf.Empty deleteCustomer(com.rsocket.rpc.SingleCustomerRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  Iterable<com.rsocket.rpc.CustomerResponse> customerChannel(Iterable<com.rsocket.rpc.MultipleCustomersRequest> messages, io.netty.buffer.ByteBuf metadata);
}
