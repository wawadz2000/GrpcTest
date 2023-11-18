package services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: Addition.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AdditionGrpc {

  private AdditionGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Addition";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Operands,
      Result> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "add",
      requestType = Operands.class,
      responseType = Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Operands,
      Result> getAddMethod() {
    io.grpc.MethodDescriptor<Operands, Result> getAddMethod;
    if ((getAddMethod = AdditionGrpc.getAddMethod) == null) {
      synchronized (AdditionGrpc.class) {
        if ((getAddMethod = AdditionGrpc.getAddMethod) == null) {
          AdditionGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<Operands, Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Operands.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Result.getDefaultInstance()))
              .setSchemaDescriptor(new AdditionMethodDescriptorSupplier("add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AdditionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdditionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdditionStub>() {
        @java.lang.Override
        public AdditionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdditionStub(channel, callOptions);
        }
      };
    return AdditionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AdditionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdditionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdditionBlockingStub>() {
        @java.lang.Override
        public AdditionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdditionBlockingStub(channel, callOptions);
        }
      };
    return AdditionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AdditionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AdditionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AdditionFutureStub>() {
        @java.lang.Override
        public AdditionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AdditionFutureStub(channel, callOptions);
        }
      };
    return AdditionFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void add(Operands request,
        io.grpc.stub.StreamObserver<Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Addition.
   */
  public static abstract class AdditionImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AdditionGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Addition.
   */
  public static final class AdditionStub
      extends io.grpc.stub.AbstractAsyncStub<AdditionStub> {
    private AdditionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdditionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdditionStub(channel, callOptions);
    }

    /**
     */
    public void add(Operands request,
        io.grpc.stub.StreamObserver<Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Addition.
   */
  public static final class AdditionBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AdditionBlockingStub> {
    private AdditionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdditionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdditionBlockingStub(channel, callOptions);
    }

    /**
     */
    public Result add(Operands request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Addition.
   */
  public static final class AdditionFutureStub
      extends io.grpc.stub.AbstractFutureStub<AdditionFutureStub> {
    private AdditionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AdditionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AdditionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Result> add(
        Operands request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((Operands) request,
              (io.grpc.stub.StreamObserver<Result>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getAddMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              Operands,
              Result>(
                service, METHODID_ADD)))
        .build();
  }

  private static abstract class AdditionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AdditionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return AdditionOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Addition");
    }
  }

  private static final class AdditionFileDescriptorSupplier
      extends AdditionBaseDescriptorSupplier {
    AdditionFileDescriptorSupplier() {}
  }

  private static final class AdditionMethodDescriptorSupplier
      extends AdditionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AdditionMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AdditionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AdditionFileDescriptorSupplier())
              .addMethod(getAddMethod())
              .build();
        }
      }
    }
    return result;
  }
}
