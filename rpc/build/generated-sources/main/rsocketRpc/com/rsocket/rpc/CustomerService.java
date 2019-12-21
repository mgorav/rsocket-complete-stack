package com.rsocket.rpc;

/**
 */
@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler",
    comments = "Source: service.proto")
public interface CustomerService {
  String SERVICE = "com.rsocket.rpc.CustomerService";
  String METHOD_GET_CUSTOMER = "getCustomer";
  String METHOD_GET_CUSTOMERS = "getCustomers";
  String METHOD_DELETE_CUSTOMER = "deleteCustomer";
  String METHOD_CUSTOMER_CHANNEL = "customerChannel";

  /**
   */
  reactor.core.publisher.Mono<com.rsocket.rpc.CustomerResponse> getCustomer(com.rsocket.rpc.SingleCustomerRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  reactor.core.publisher.Flux<com.rsocket.rpc.CustomerResponse> getCustomers(com.rsocket.rpc.MultipleCustomersRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  reactor.core.publisher.Mono<com.google.protobuf.Empty> deleteCustomer(com.rsocket.rpc.SingleCustomerRequest message, io.netty.buffer.ByteBuf metadata);

  /**
   */
  reactor.core.publisher.Flux<com.rsocket.rpc.CustomerResponse> customerChannel(org.reactivestreams.Publisher<com.rsocket.rpc.MultipleCustomersRequest> messages, io.netty.buffer.ByteBuf metadata);
}
