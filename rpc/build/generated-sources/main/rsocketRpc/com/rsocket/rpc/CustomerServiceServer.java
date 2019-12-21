package com.rsocket.rpc;

@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler",
    comments = "Source: service.proto")
@io.rsocket.rpc.annotations.internal.Generated(
    type = io.rsocket.rpc.annotations.internal.ResourceType.SERVICE,
    idlClass = CustomerService.class)
@javax.inject.Named(
    value ="CustomerServiceServer")
public final class CustomerServiceServer extends io.rsocket.rpc.AbstractRSocketService {
  private final CustomerService service;
  private final io.opentracing.Tracer tracer;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> getCustomer;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> getCustomers;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> deleteCustomer;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> customerChannel;
  private final java.util.function.Function<io.opentracing.SpanContext, java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>>> getCustomerTrace;
  private final java.util.function.Function<io.opentracing.SpanContext, java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>>> getCustomersTrace;
  private final java.util.function.Function<io.opentracing.SpanContext, java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>>> deleteCustomerTrace;
  private final java.util.function.Function<io.opentracing.SpanContext, java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>>> customerChannelTrace;
  @javax.inject.Inject
  public CustomerServiceServer(CustomerService service, java.util.Optional<io.micrometer.core.instrument.MeterRegistry> registry, java.util.Optional<io.opentracing.Tracer> tracer) {
    this.service = service;
    if (!registry.isPresent()) {
      this.getCustomer = java.util.function.Function.identity();
      this.getCustomers = java.util.function.Function.identity();
      this.deleteCustomer = java.util.function.Function.identity();
      this.customerChannel = java.util.function.Function.identity();
    } else {
      this.getCustomer = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", CustomerService.SERVICE, "method", CustomerService.METHOD_GET_CUSTOMER);
      this.getCustomers = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", CustomerService.SERVICE, "method", CustomerService.METHOD_GET_CUSTOMERS);
      this.deleteCustomer = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", CustomerService.SERVICE, "method", CustomerService.METHOD_DELETE_CUSTOMER);
      this.customerChannel = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", CustomerService.SERVICE, "method", CustomerService.METHOD_CUSTOMER_CHANNEL);
    }

    if (!tracer.isPresent()) {
      this.tracer = null;
      this.getCustomerTrace = (ignored) -> java.util.function.Function.identity();
      this.getCustomersTrace = (ignored) -> java.util.function.Function.identity();
      this.deleteCustomerTrace = (ignored) -> java.util.function.Function.identity();
      this.customerChannelTrace = (ignored) -> java.util.function.Function.identity();
    } else {
      this.tracer = tracer.get();
      this.getCustomerTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild(this.tracer, CustomerService.METHOD_GET_CUSTOMER, io.rsocket.rpc.tracing.Tag.of("rsocket.service", CustomerService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "server"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
      this.getCustomersTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild(this.tracer, CustomerService.METHOD_GET_CUSTOMERS, io.rsocket.rpc.tracing.Tag.of("rsocket.service", CustomerService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "server"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
      this.deleteCustomerTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild(this.tracer, CustomerService.METHOD_DELETE_CUSTOMER, io.rsocket.rpc.tracing.Tag.of("rsocket.service", CustomerService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "server"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
      this.customerChannelTrace = io.rsocket.rpc.tracing.Tracing.traceAsChild(this.tracer, CustomerService.METHOD_CUSTOMER_CHANNEL, io.rsocket.rpc.tracing.Tag.of("rsocket.service", CustomerService.SERVICE), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.role", "server"), io.rsocket.rpc.tracing.Tag.of("rsocket.rpc.version", ""));
    }

  }

  @java.lang.Override
  public String getService() {
    return CustomerService.SERVICE;
  }

  @java.lang.Override
  public Class<?> getServiceClass() {
    return service.getClass();
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> fireAndForget(io.rsocket.Payload payload) {
    return reactor.core.publisher.Mono.error(new UnsupportedOperationException("Fire and forget not implemented."));
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<io.rsocket.Payload> requestResponse(io.rsocket.Payload payload) {
    try {
      io.netty.buffer.ByteBuf metadata = payload.sliceMetadata();
      io.opentracing.SpanContext spanContext = io.rsocket.rpc.tracing.Tracing.deserializeTracingMetadata(tracer, metadata);
      switch(io.rsocket.rpc.frames.Metadata.getMethod(metadata)) {
        case CustomerService.METHOD_GET_CUSTOMER: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          return service.getCustomer(com.rsocket.rpc.SingleCustomerRequest.parseFrom(is), metadata).map(serializer).transform(getCustomer).transform(getCustomerTrace.apply(spanContext));
        }
        case CustomerService.METHOD_DELETE_CUSTOMER: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          return service.deleteCustomer(com.rsocket.rpc.SingleCustomerRequest.parseFrom(is), metadata).map(serializer).transform(deleteCustomer).transform(deleteCustomerTrace.apply(spanContext));
        }
        default: {
          return reactor.core.publisher.Mono.error(new UnsupportedOperationException());
        }
      }
    } catch (Throwable t) {
      return reactor.core.publisher.Mono.error(t);
    } finally {
      payload.release();
    }
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<io.rsocket.Payload> requestStream(io.rsocket.Payload payload) {
    try {
      io.netty.buffer.ByteBuf metadata = payload.sliceMetadata();
      io.opentracing.SpanContext spanContext = io.rsocket.rpc.tracing.Tracing.deserializeTracingMetadata(tracer, metadata);
      switch(io.rsocket.rpc.frames.Metadata.getMethod(metadata)) {
        case CustomerService.METHOD_GET_CUSTOMERS: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          return service.getCustomers(com.rsocket.rpc.MultipleCustomersRequest.parseFrom(is), metadata).map(serializer).transform(getCustomers).transform(getCustomersTrace.apply(spanContext));
        }
        default: {
          return reactor.core.publisher.Flux.error(new UnsupportedOperationException());
        }
      }
    } catch (Throwable t) {
      return reactor.core.publisher.Flux.error(t);
    } finally {
      payload.release();
    }
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<io.rsocket.Payload> requestChannel(io.rsocket.Payload payload, reactor.core.publisher.Flux<io.rsocket.Payload> publisher) {
    try {
      io.netty.buffer.ByteBuf metadata = payload.sliceMetadata();
      io.opentracing.SpanContext spanContext = io.rsocket.rpc.tracing.Tracing.deserializeTracingMetadata(tracer, metadata);
      switch(io.rsocket.rpc.frames.Metadata.getMethod(metadata)) {
        case CustomerService.METHOD_CUSTOMER_CHANNEL: {
          reactor.core.publisher.Flux<com.rsocket.rpc.MultipleCustomersRequest> messages =
            publisher.map(deserializer(com.rsocket.rpc.MultipleCustomersRequest.parser()));
          return service.customerChannel(messages, metadata).map(serializer).transform(customerChannel).transform(customerChannelTrace.apply(spanContext));
        }
        default: {
          return reactor.core.publisher.Flux.error(new UnsupportedOperationException());
        }
      }
    } catch (Throwable t) {
      return reactor.core.publisher.Flux.error(t);
    }
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<io.rsocket.Payload> requestChannel(org.reactivestreams.Publisher<io.rsocket.Payload> payloads) {
    return new io.rsocket.internal.SwitchTransformFlux<io.rsocket.Payload, io.rsocket.Payload>(payloads, new java.util.function.BiFunction<io.rsocket.Payload, reactor.core.publisher.Flux<io.rsocket.Payload>, org.reactivestreams.Publisher<? extends io.rsocket.Payload>>() {
      @java.lang.Override
      public org.reactivestreams.Publisher<io.rsocket.Payload> apply(io.rsocket.Payload payload, reactor.core.publisher.Flux<io.rsocket.Payload> publisher) {
        return requestChannel(payload, publisher);
      }
    });
  }

  private static final java.util.function.Function<com.google.protobuf.MessageLite, io.rsocket.Payload> serializer =
    new java.util.function.Function<com.google.protobuf.MessageLite, io.rsocket.Payload>() {
      @java.lang.Override
      public io.rsocket.Payload apply(com.google.protobuf.MessageLite message) {
        int length = message.getSerializedSize();
        io.netty.buffer.ByteBuf byteBuf = io.netty.buffer.ByteBufAllocator.DEFAULT.buffer(length);
        try {
          message.writeTo(com.google.protobuf.CodedOutputStream.newInstance(byteBuf.internalNioBuffer(0, length)));
          byteBuf.writerIndex(length);
          return io.rsocket.util.ByteBufPayload.create(byteBuf);
        } catch (Throwable t) {
          byteBuf.release();
          throw new RuntimeException(t);
        }
      }
    };

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
