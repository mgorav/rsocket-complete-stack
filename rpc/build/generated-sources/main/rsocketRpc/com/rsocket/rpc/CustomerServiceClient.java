package com.rsocket.rpc;

@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler",
    comments = "Source: service.proto")
@io.rsocket.rpc.annotations.internal.Generated(
    type = io.rsocket.rpc.annotations.internal.ResourceType.CLIENT,
    idlClass = CustomerService.class)
public final class CustomerServiceClient implements CustomerService {
  private final io.rsocket.RSocket rSocket;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<com.rsocket.rpc.CustomerResponse>, ? extends org.reactivestreams.Publisher<com.rsocket.rpc.CustomerResponse>> getCustomer;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<com.rsocket.rpc.CustomerResponse>, ? extends org.reactivestreams.Publisher<com.rsocket.rpc.CustomerResponse>> getCustomers;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<com.google.protobuf.Empty>, ? extends org.reactivestreams.Publisher<com.google.protobuf.Empty>> deleteCustomer;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<com.rsocket.rpc.CustomerResponse>, ? extends org.reactivestreams.Publisher<com.rsocket.rpc.CustomerResponse>> customerChannel;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<com.rsocket.rpc.CustomerResponse>, ? extends org.reactivestreams.Publisher<com.rsocket.rpc.CustomerResponse>>> getCustomerTrace;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<com.rsocket.rpc.CustomerResponse>, ? extends org.reactivestreams.Publisher<com.rsocket.rpc.CustomerResponse>>> getCustomersTrace;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<com.google.protobuf.Empty>, ? extends org.reactivestreams.Publisher<com.google.protobuf.Empty>>> deleteCustomerTrace;
  private final java.util.function.Function<java.util.Map<String, String>, java.util.function.Function<? super org.reactivestreams.Publisher<com.rsocket.rpc.CustomerResponse>, ? extends org.reactivestreams.Publisher<com.rsocket.rpc.CustomerResponse>>> customerChannelTrace;

  public CustomerServiceClient(io.rsocket.RSocket rSocket) {
    this.rSocket = rSocket;
    this.getCustomer = java.util.function.Function.identity();
    this.getCustomers = java.util.function.Function.identity();
    this.deleteCustomer = java.util.function.Function.identity();
    this.customerChannel = java.util.function.Function.identity();
    this.getCustomerTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.getCustomersTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.deleteCustomerTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.customerChannelTrace = io.rsocket.rpc.tracing.Tracing.trace();
  }

  public CustomerServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry) {
    this.rSocket = rSocket;
    this.getCustomer = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", CustomerService.SERVICE, "method", CustomerService.METHOD_GET_CUSTOMER);
    this.getCustomers = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", CustomerService.SERVICE, "method", CustomerService.METHOD_GET_CUSTOMERS);
    this.deleteCustomer = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", CustomerService.SERVICE, "method", CustomerService.METHOD_DELETE_CUSTOMER);
    this.customerChannel = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", CustomerService.SERVICE, "method", CustomerService.METHOD_CUSTOMER_CHANNEL);
    this.getCustomerTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.getCustomersTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.deleteCustomerTrace = io.rsocket.rpc.tracing.Tracing.trace();
    this.customerChannelTrace = io.rsocket.rpc.tracing.Tracing.trace();
  }


  public CustomerServiceClient(io.rsocket.RSocket rSocket, io.opentracing.Tracer tracer) {
    this.rSocket = rSocket;
    this.getCustomer = java.util.function.Function.identity();
    this.getCustomers = java.util.function.Function.identity();
    this.deleteCustomer = java.util.function.Function.identity();
    this.customerChannel = java.util.function.Function.identity();
    this.getCustomerTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, CustomerService.METHOD_GET_CUSTOMER, io.rsocket.rpc.tracing.Tag.of("rsocket.service", CustomerService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.getCustomersTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, CustomerService.METHOD_GET_CUSTOMERS, io.rsocket.rpc.tracing.Tag.of("rsocket.service", CustomerService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.deleteCustomerTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, CustomerService.METHOD_DELETE_CUSTOMER, io.rsocket.rpc.tracing.Tag.of("rsocket.service", CustomerService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.customerChannelTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, CustomerService.METHOD_CUSTOMER_CHANNEL, io.rsocket.rpc.tracing.Tag.of("rsocket.service", CustomerService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
  }


  public CustomerServiceClient(io.rsocket.RSocket rSocket, io.micrometer.core.instrument.MeterRegistry registry, io.opentracing.Tracer tracer) {
    this.rSocket = rSocket;
    this.getCustomer = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", CustomerService.SERVICE, "method", CustomerService.METHOD_GET_CUSTOMER);
    this.getCustomers = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", CustomerService.SERVICE, "method", CustomerService.METHOD_GET_CUSTOMERS);
    this.deleteCustomer = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", CustomerService.SERVICE, "method", CustomerService.METHOD_DELETE_CUSTOMER);
    this.customerChannel = io.rsocket.rpc.metrics.Metrics.timed(registry, "rsocket.client", "service", CustomerService.SERVICE, "method", CustomerService.METHOD_CUSTOMER_CHANNEL);
    this.getCustomerTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, CustomerService.METHOD_GET_CUSTOMER, io.rsocket.rpc.tracing.Tag.of("rsocket.service", CustomerService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.getCustomersTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, CustomerService.METHOD_GET_CUSTOMERS, io.rsocket.rpc.tracing.Tag.of("rsocket.service", CustomerService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.deleteCustomerTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, CustomerService.METHOD_DELETE_CUSTOMER, io.rsocket.rpc.tracing.Tag.of("rsocket.service", CustomerService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    this.customerChannelTrace = io.rsocket.rpc.tracing.Tracing.trace(tracer, CustomerService.METHOD_CUSTOMER_CHANNEL, io.rsocket.rpc.tracing.Tag.of("rsocket.service", CustomerService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "client"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.rsocket.rpc.CustomerResponse.class)
  public reactor.core.publisher.Mono<com.rsocket.rpc.CustomerResponse> getCustomer(com.rsocket.rpc.SingleCustomerRequest message) {
    return getCustomer(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.rsocket.rpc.CustomerResponse.class)
  public reactor.core.publisher.Mono<com.rsocket.rpc.CustomerResponse> getCustomer(com.rsocket.rpc.SingleCustomerRequest message, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return reactor.core.publisher.Mono.defer(new java.util.function.Supplier<reactor.core.publisher.Mono<io.rsocket.Payload>>() {
      @java.lang.Override
      public reactor.core.publisher.Mono<io.rsocket.Payload> get() {
        final io.netty.buffer.ByteBuf data = serialize(message);
        final io.netty.buffer.ByteBuf tracing = io.rsocket.rpc.tracing.Tracing.mapToByteBuf(io.netty.buffer.ByteBufAllocator.DEFAULT, map);
        final io.netty.buffer.ByteBuf metadataBuf = io.rsocket.rpc.frames.Metadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, CustomerService.SERVICE, CustomerService.METHOD_GET_CUSTOMER, tracing, metadata);
        tracing.release();
        metadata.release();
        return rSocket.requestResponse(io.rsocket.util.ByteBufPayload.create(data, metadataBuf));
      }
    }).map(deserializer(com.rsocket.rpc.CustomerResponse.parser())).transform(getCustomer).transform(getCustomerTrace.apply(map));
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.rsocket.rpc.CustomerResponse.class)
  public reactor.core.publisher.Flux<com.rsocket.rpc.CustomerResponse> getCustomers(com.rsocket.rpc.MultipleCustomersRequest message) {
    return getCustomers(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.rsocket.rpc.CustomerResponse.class)
  public reactor.core.publisher.Flux<com.rsocket.rpc.CustomerResponse> getCustomers(com.rsocket.rpc.MultipleCustomersRequest message, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return reactor.core.publisher.Flux.defer(new java.util.function.Supplier<reactor.core.publisher.Flux<io.rsocket.Payload>>() {
      @java.lang.Override
      public reactor.core.publisher.Flux<io.rsocket.Payload> get() {
        final io.netty.buffer.ByteBuf data = serialize(message);
        final io.netty.buffer.ByteBuf tracing = io.rsocket.rpc.tracing.Tracing.mapToByteBuf(io.netty.buffer.ByteBufAllocator.DEFAULT, map);
        final io.netty.buffer.ByteBuf metadataBuf = io.rsocket.rpc.frames.Metadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, CustomerService.SERVICE, CustomerService.METHOD_GET_CUSTOMERS, tracing, metadata);
        tracing.release();
        metadata.release();
        return rSocket.requestStream(io.rsocket.util.ByteBufPayload.create(data, metadataBuf));
      }
    }).map(deserializer(com.rsocket.rpc.CustomerResponse.parser())).transform(getCustomers).transform(getCustomersTrace.apply(map));
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.google.protobuf.Empty.class)
  public reactor.core.publisher.Mono<com.google.protobuf.Empty> deleteCustomer(com.rsocket.rpc.SingleCustomerRequest message) {
    return deleteCustomer(message, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.google.protobuf.Empty.class)
  public reactor.core.publisher.Mono<com.google.protobuf.Empty> deleteCustomer(com.rsocket.rpc.SingleCustomerRequest message, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return reactor.core.publisher.Mono.defer(new java.util.function.Supplier<reactor.core.publisher.Mono<io.rsocket.Payload>>() {
      @java.lang.Override
      public reactor.core.publisher.Mono<io.rsocket.Payload> get() {
        final io.netty.buffer.ByteBuf data = serialize(message);
        final io.netty.buffer.ByteBuf tracing = io.rsocket.rpc.tracing.Tracing.mapToByteBuf(io.netty.buffer.ByteBufAllocator.DEFAULT, map);
        final io.netty.buffer.ByteBuf metadataBuf = io.rsocket.rpc.frames.Metadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, CustomerService.SERVICE, CustomerService.METHOD_DELETE_CUSTOMER, tracing, metadata);
        tracing.release();
        metadata.release();
        return rSocket.requestResponse(io.rsocket.util.ByteBufPayload.create(data, metadataBuf));
      }
    }).map(deserializer(com.google.protobuf.Empty.parser())).transform(deleteCustomer).transform(deleteCustomerTrace.apply(map));
  }

  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.rsocket.rpc.CustomerResponse.class)
  public reactor.core.publisher.Flux<com.rsocket.rpc.CustomerResponse> customerChannel(org.reactivestreams.Publisher<com.rsocket.rpc.MultipleCustomersRequest> messages) {
    return customerChannel(messages, io.netty.buffer.Unpooled.EMPTY_BUFFER);
  }

  @java.lang.Override
  @io.rsocket.rpc.annotations.internal.GeneratedMethod(returnTypeClass = com.rsocket.rpc.CustomerResponse.class)
  public reactor.core.publisher.Flux<com.rsocket.rpc.CustomerResponse> customerChannel(org.reactivestreams.Publisher<com.rsocket.rpc.MultipleCustomersRequest> messages, io.netty.buffer.ByteBuf metadata) {
  java.util.Map<String, String> map = new java.util.HashMap<>();
    return rSocket.requestChannel(reactor.core.publisher.Flux.from(messages).map(
      new java.util.function.Function<com.google.protobuf.MessageLite, io.rsocket.Payload>() {
        private final java.util.concurrent.atomic.AtomicBoolean once = new java.util.concurrent.atomic.AtomicBoolean(false);

        @java.lang.Override
        public io.rsocket.Payload apply(com.google.protobuf.MessageLite message) {
          io.netty.buffer.ByteBuf data = serialize(message);
          if (once.compareAndSet(false, true)) {
            final io.netty.buffer.ByteBuf metadataBuf = io.rsocket.rpc.frames.Metadata.encode(io.netty.buffer.ByteBufAllocator.DEFAULT, CustomerService.SERVICE, CustomerService.METHOD_CUSTOMER_CHANNEL, metadata);
            return io.rsocket.util.ByteBufPayload.create(data, metadataBuf);
          } else {
            return io.rsocket.util.ByteBufPayload.create(data);
          }
        }
      })).map(deserializer(com.rsocket.rpc.CustomerResponse.parser())).transform(customerChannel).transform(customerChannelTrace.apply(map));
  }

  private static io.netty.buffer.ByteBuf serialize(final com.google.protobuf.MessageLite message) {
    int length = message.getSerializedSize();
    io.netty.buffer.ByteBuf byteBuf = io.netty.buffer.ByteBufAllocator.DEFAULT.buffer(length);
    try {
      message.writeTo(com.google.protobuf.CodedOutputStream.newInstance(byteBuf.internalNioBuffer(0, length)));
      byteBuf.writerIndex(length);
      return byteBuf;
    } catch (Throwable t) {
      byteBuf.release();
      throw new RuntimeException(t);
    }
  }

  private static <T> java.util.function.Function<io.rsocket.Payload, T> deserializer(final com.google.protobuf.Parser<T> parser) {
    return new java.util.function.Function<io.rsocket.Payload, T>() {
      @java.lang.Override
      public T apply(io.rsocket.Payload payload) {
        try {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          return parser.parseFrom(is);
        } catch (Throwable t) {
          throw new RuntimeException(t);
        } finally {
          payload.release();
        }
      }
    };
  }
}
