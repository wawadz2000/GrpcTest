package ressources.java.dz.example.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: operation.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OperationsGrpc {

  private OperationsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ressources.java.dz.example.grpc.Operations";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ressources.java.dz.example.grpc.Operands,
      ressources.java.dz.example.grpc.Result> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "add",
      requestType = ressources.java.dz.example.grpc.Operands.class,
      responseType = ressources.java.dz.example.grpc.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ressources.java.dz.example.grpc.Operands,
      ressources.java.dz.example.grpc.Result> getAddMethod() {
    io.grpc.MethodDescriptor<ressources.java.dz.example.grpc.Operands, ressources.java.dz.example.grpc.Result> getAddMethod;
    if ((getAddMethod = OperationsGrpc.getAddMethod) == null) {
      synchronized (OperationsGrpc.class) {
        if ((getAddMethod = OperationsGrpc.getAddMethod) == null) {
          OperationsGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<ressources.java.dz.example.grpc.Operands, ressources.java.dz.example.grpc.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ressources.java.dz.example.grpc.Operands.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ressources.java.dz.example.grpc.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OperationsMethodDescriptorSupplier("add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ressources.java.dz.example.grpc.Operands,
      ressources.java.dz.example.grpc.Result> getSubstractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "substract",
      requestType = ressources.java.dz.example.grpc.Operands.class,
      responseType = ressources.java.dz.example.grpc.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ressources.java.dz.example.grpc.Operands,
      ressources.java.dz.example.grpc.Result> getSubstractMethod() {
    io.grpc.MethodDescriptor<ressources.java.dz.example.grpc.Operands, ressources.java.dz.example.grpc.Result> getSubstractMethod;
    if ((getSubstractMethod = OperationsGrpc.getSubstractMethod) == null) {
      synchronized (OperationsGrpc.class) {
        if ((getSubstractMethod = OperationsGrpc.getSubstractMethod) == null) {
          OperationsGrpc.getSubstractMethod = getSubstractMethod =
              io.grpc.MethodDescriptor.<ressources.java.dz.example.grpc.Operands, ressources.java.dz.example.grpc.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "substract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ressources.java.dz.example.grpc.Operands.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ressources.java.dz.example.grpc.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OperationsMethodDescriptorSupplier("substract"))
              .build();
        }
      }
    }
    return getSubstractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ressources.java.dz.example.grpc.Operands,
      ressources.java.dz.example.grpc.Result> getMultipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "multip",
      requestType = ressources.java.dz.example.grpc.Operands.class,
      responseType = ressources.java.dz.example.grpc.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ressources.java.dz.example.grpc.Operands,
      ressources.java.dz.example.grpc.Result> getMultipMethod() {
    io.grpc.MethodDescriptor<ressources.java.dz.example.grpc.Operands, ressources.java.dz.example.grpc.Result> getMultipMethod;
    if ((getMultipMethod = OperationsGrpc.getMultipMethod) == null) {
      synchronized (OperationsGrpc.class) {
        if ((getMultipMethod = OperationsGrpc.getMultipMethod) == null) {
          OperationsGrpc.getMultipMethod = getMultipMethod =
              io.grpc.MethodDescriptor.<ressources.java.dz.example.grpc.Operands, ressources.java.dz.example.grpc.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "multip"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ressources.java.dz.example.grpc.Operands.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ressources.java.dz.example.grpc.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OperationsMethodDescriptorSupplier("multip"))
              .build();
        }
      }
    }
    return getMultipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ressources.java.dz.example.grpc.Operands,
      ressources.java.dz.example.grpc.Result> getDivideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "divide",
      requestType = ressources.java.dz.example.grpc.Operands.class,
      responseType = ressources.java.dz.example.grpc.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ressources.java.dz.example.grpc.Operands,
      ressources.java.dz.example.grpc.Result> getDivideMethod() {
    io.grpc.MethodDescriptor<ressources.java.dz.example.grpc.Operands, ressources.java.dz.example.grpc.Result> getDivideMethod;
    if ((getDivideMethod = OperationsGrpc.getDivideMethod) == null) {
      synchronized (OperationsGrpc.class) {
        if ((getDivideMethod = OperationsGrpc.getDivideMethod) == null) {
          OperationsGrpc.getDivideMethod = getDivideMethod =
              io.grpc.MethodDescriptor.<ressources.java.dz.example.grpc.Operands, ressources.java.dz.example.grpc.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "divide"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ressources.java.dz.example.grpc.Operands.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ressources.java.dz.example.grpc.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OperationsMethodDescriptorSupplier("divide"))
              .build();
        }
      }
    }
    return getDivideMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ressources.java.dz.example.grpc.Points,
      ressources.java.dz.example.grpc.Result> getDistaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "distace",
      requestType = ressources.java.dz.example.grpc.Points.class,
      responseType = ressources.java.dz.example.grpc.Result.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ressources.java.dz.example.grpc.Points,
      ressources.java.dz.example.grpc.Result> getDistaceMethod() {
    io.grpc.MethodDescriptor<ressources.java.dz.example.grpc.Points, ressources.java.dz.example.grpc.Result> getDistaceMethod;
    if ((getDistaceMethod = OperationsGrpc.getDistaceMethod) == null) {
      synchronized (OperationsGrpc.class) {
        if ((getDistaceMethod = OperationsGrpc.getDistaceMethod) == null) {
          OperationsGrpc.getDistaceMethod = getDistaceMethod =
              io.grpc.MethodDescriptor.<ressources.java.dz.example.grpc.Points, ressources.java.dz.example.grpc.Result>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "distace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ressources.java.dz.example.grpc.Points.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ressources.java.dz.example.grpc.Result.getDefaultInstance()))
              .setSchemaDescriptor(new OperationsMethodDescriptorSupplier("distace"))
              .build();
        }
      }
    }
    return getDistaceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OperationsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperationsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperationsStub>() {
        @java.lang.Override
        public OperationsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperationsStub(channel, callOptions);
        }
      };
    return OperationsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OperationsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperationsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperationsBlockingStub>() {
        @java.lang.Override
        public OperationsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperationsBlockingStub(channel, callOptions);
        }
      };
    return OperationsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OperationsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperationsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperationsFutureStub>() {
        @java.lang.Override
        public OperationsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperationsFutureStub(channel, callOptions);
        }
      };
    return OperationsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void add(ressources.java.dz.example.grpc.Operands request,
        io.grpc.stub.StreamObserver<ressources.java.dz.example.grpc.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     */
    default void substract(ressources.java.dz.example.grpc.Operands request,
        io.grpc.stub.StreamObserver<ressources.java.dz.example.grpc.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubstractMethod(), responseObserver);
    }

    /**
     */
    default void multip(ressources.java.dz.example.grpc.Operands request,
        io.grpc.stub.StreamObserver<ressources.java.dz.example.grpc.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultipMethod(), responseObserver);
    }

    /**
     */
    default void divide(ressources.java.dz.example.grpc.Operands request,
        io.grpc.stub.StreamObserver<ressources.java.dz.example.grpc.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDivideMethod(), responseObserver);
    }

    /**
     */
    default void distace(ressources.java.dz.example.grpc.Points request,
        io.grpc.stub.StreamObserver<ressources.java.dz.example.grpc.Result> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDistaceMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Operations.
   */
  public static abstract class OperationsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OperationsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Operations.
   */
  public static final class OperationsStub
      extends io.grpc.stub.AbstractAsyncStub<OperationsStub> {
    private OperationsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperationsStub(channel, callOptions);
    }

    /**
     */
    public void add(ressources.java.dz.example.grpc.Operands request,
        io.grpc.stub.StreamObserver<ressources.java.dz.example.grpc.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void substract(ressources.java.dz.example.grpc.Operands request,
        io.grpc.stub.StreamObserver<ressources.java.dz.example.grpc.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubstractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void multip(ressources.java.dz.example.grpc.Operands request,
        io.grpc.stub.StreamObserver<ressources.java.dz.example.grpc.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void divide(ressources.java.dz.example.grpc.Operands request,
        io.grpc.stub.StreamObserver<ressources.java.dz.example.grpc.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDivideMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void distace(ressources.java.dz.example.grpc.Points request,
        io.grpc.stub.StreamObserver<ressources.java.dz.example.grpc.Result> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDistaceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Operations.
   */
  public static final class OperationsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OperationsBlockingStub> {
    private OperationsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperationsBlockingStub(channel, callOptions);
    }

    /**
     */
    public ressources.java.dz.example.grpc.Result add(ressources.java.dz.example.grpc.Operands request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public ressources.java.dz.example.grpc.Result substract(ressources.java.dz.example.grpc.Operands request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubstractMethod(), getCallOptions(), request);
    }

    /**
     */
    public ressources.java.dz.example.grpc.Result multip(ressources.java.dz.example.grpc.Operands request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultipMethod(), getCallOptions(), request);
    }

    /**
     */
    public ressources.java.dz.example.grpc.Result divide(ressources.java.dz.example.grpc.Operands request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDivideMethod(), getCallOptions(), request);
    }

    /**
     */
    public ressources.java.dz.example.grpc.Result distace(ressources.java.dz.example.grpc.Points request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDistaceMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Operations.
   */
  public static final class OperationsFutureStub
      extends io.grpc.stub.AbstractFutureStub<OperationsFutureStub> {
    private OperationsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperationsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ressources.java.dz.example.grpc.Result> add(
        ressources.java.dz.example.grpc.Operands request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ressources.java.dz.example.grpc.Result> substract(
        ressources.java.dz.example.grpc.Operands request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubstractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ressources.java.dz.example.grpc.Result> multip(
        ressources.java.dz.example.grpc.Operands request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultipMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ressources.java.dz.example.grpc.Result> divide(
        ressources.java.dz.example.grpc.Operands request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDivideMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ressources.java.dz.example.grpc.Result> distace(
        ressources.java.dz.example.grpc.Points request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDistaceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;
  private static final int METHODID_SUBSTRACT = 1;
  private static final int METHODID_MULTIP = 2;
  private static final int METHODID_DIVIDE = 3;
  private static final int METHODID_DISTACE = 4;

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
          serviceImpl.add((ressources.java.dz.example.grpc.Operands) request,
              (io.grpc.stub.StreamObserver<ressources.java.dz.example.grpc.Result>) responseObserver);
          break;
        case METHODID_SUBSTRACT:
          serviceImpl.substract((ressources.java.dz.example.grpc.Operands) request,
              (io.grpc.stub.StreamObserver<ressources.java.dz.example.grpc.Result>) responseObserver);
          break;
        case METHODID_MULTIP:
          serviceImpl.multip((ressources.java.dz.example.grpc.Operands) request,
              (io.grpc.stub.StreamObserver<ressources.java.dz.example.grpc.Result>) responseObserver);
          break;
        case METHODID_DIVIDE:
          serviceImpl.divide((ressources.java.dz.example.grpc.Operands) request,
              (io.grpc.stub.StreamObserver<ressources.java.dz.example.grpc.Result>) responseObserver);
          break;
        case METHODID_DISTACE:
          serviceImpl.distace((ressources.java.dz.example.grpc.Points) request,
              (io.grpc.stub.StreamObserver<ressources.java.dz.example.grpc.Result>) responseObserver);
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
              ressources.java.dz.example.grpc.Operands,
              ressources.java.dz.example.grpc.Result>(
                service, METHODID_ADD)))
        .addMethod(
          getSubstractMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ressources.java.dz.example.grpc.Operands,
              ressources.java.dz.example.grpc.Result>(
                service, METHODID_SUBSTRACT)))
        .addMethod(
          getMultipMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ressources.java.dz.example.grpc.Operands,
              ressources.java.dz.example.grpc.Result>(
                service, METHODID_MULTIP)))
        .addMethod(
          getDivideMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ressources.java.dz.example.grpc.Operands,
              ressources.java.dz.example.grpc.Result>(
                service, METHODID_DIVIDE)))
        .addMethod(
          getDistaceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ressources.java.dz.example.grpc.Points,
              ressources.java.dz.example.grpc.Result>(
                service, METHODID_DISTACE)))
        .build();
  }

  private static abstract class OperationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OperationsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ressources.java.dz.example.grpc.Operation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Operations");
    }
  }

  private static final class OperationsFileDescriptorSupplier
      extends OperationsBaseDescriptorSupplier {
    OperationsFileDescriptorSupplier() {}
  }

  private static final class OperationsMethodDescriptorSupplier
      extends OperationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OperationsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OperationsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OperationsFileDescriptorSupplier())
              .addMethod(getAddMethod())
              .addMethod(getSubstractMethod())
              .addMethod(getMultipMethod())
              .addMethod(getDivideMethod())
              .addMethod(getDistaceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
