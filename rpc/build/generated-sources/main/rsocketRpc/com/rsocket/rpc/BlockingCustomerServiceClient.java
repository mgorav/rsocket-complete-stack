package com.rsocket.rpc;

@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler (version 0.2.17)",
    comments = "Source: service.proto")
@io.rsocket.rpc.annotations.internal.Generated(
    type = io.rsocket.rpc.annotations.internal.ResourceType.CLIENT,
    idlClass = BlockingCustomerService.class)
public final class BlockingCustomerServiceClient implements BlockingCustomerService {
  private final com.rsocket.rpc.CustomerServiceClient delegate;

  public BlockingCustomerServiceClient(io.rsocket.RSocket rSocket) {
    this.delegate = new com.rsocket.rpc.CustomerServiceClient(rSocket);
  }

  public BlockingCustomerServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry) {
    this.delegate = new com.rsocket.rpc.CustomerServiceClient(rSocket, registry);
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.rsocket.rpc.CustomerResponse.class)
  public com.rsocket.rpc.CustomerResponse getCustomer(com.rsocket.rpc.SingleCustomerRequest message) {
    return getCustomer(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.rsocket.rpc.CustomerResponse.class)
  public com.rsocket.rpc.CustomerResponse getCustomer(com.rsocket.rpc.SingleCustomerRequest message, io.netty.buffer.ByteBuf metadata) {
    return delegate.getCustomer(message, metadata).block();
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.rsocket.rpc.CustomerResponse.class)
  public  io.rsocket.rpc.BlockingIterable<com.rsocket.rpc.CustomerResponse> getCustomers(com.rsocket.rpc.MultipleCustomersRequest message) {
    return getCustomers(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.rsocket.rpc.CustomerResponse.class)
  public  io.rsocket.rpc.BlockingIterable<com.rsocket.rpc.CustomerResponse> getCustomers(com.rsocket.rpc.MultipleCustomersRequest message, io.netty.buffer.ByteBuf metadata) {
    reactor.core.publisher.Flux stream = delegate.getCustomers(message, metadata);
    return new  io.rsocket.rpc.BlockingIterable<>(stream, reactor.util.concurrent.Queues.SMALL_BUFFER_SIZE, reactor.util.concurrent.Queues.small());
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.google.protobuf.Empty.class)
  public com.google.protobuf.Empty deleteCustomer(com.rsocket.rpc.SingleCustomerRequest message) {
    return deleteCustomer(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.google.protobuf.Empty.class)
  public com.google.protobuf.Empty deleteCustomer(com.rsocket.rpc.SingleCustomerRequest message, io.netty.buffer.ByteBuf metadata) {
    return delegate.deleteCustomer(message, metadata).block();
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.rsocket.rpc.CustomerResponse.class)
  public  io.rsocket.rpc.BlockingIterable<com.rsocket.rpc.CustomerResponse> customerChannel(Iterable<com.rsocket.rpc.MultipleCustomersRequest> messages) {
    return customerChannel(messages, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.rsocket.rpc.CustomerResponse.class)
  public  io.rsocket.rpc.BlockingIterable<com.rsocket.rpc.CustomerResponse> customerChannel(Iterable<com.rsocket.rpc.MultipleCustomersRequest> messages, io.netty.buffer.ByteBuf metadata) {
    reactor.core.publisher.Flux stream = delegate.customerChannel(reactor.core.publisher.Flux.defer(() -> reactor.core.publisher.Flux.fromIterable(messages)), metadata);
    return new  io.rsocket.rpc.BlockingIterable<>(stream, reactor.util.concurrent.Queues.SMALL_BUFFER_SIZE, reactor.util.concurrent.Queues.small());
  }

}

