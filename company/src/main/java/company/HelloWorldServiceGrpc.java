package company;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: hello.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HelloWorldServiceGrpc {

  private HelloWorldServiceGrpc() {}

  public static final String SERVICE_NAME = "company.HelloWorldService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<company.Hello.HelloRequest,
      company.Hello.HelloResponse> getHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hello",
      requestType = company.Hello.HelloRequest.class,
      responseType = company.Hello.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<company.Hello.HelloRequest,
      company.Hello.HelloResponse> getHelloMethod() {
    io.grpc.MethodDescriptor<company.Hello.HelloRequest, company.Hello.HelloResponse> getHelloMethod;
    if ((getHelloMethod = HelloWorldServiceGrpc.getHelloMethod) == null) {
      synchronized (HelloWorldServiceGrpc.class) {
        if ((getHelloMethod = HelloWorldServiceGrpc.getHelloMethod) == null) {
          HelloWorldServiceGrpc.getHelloMethod = getHelloMethod =
              io.grpc.MethodDescriptor.<company.Hello.HelloRequest, company.Hello.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  company.Hello.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  company.Hello.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloWorldServiceMethodDescriptorSupplier("hello"))
              .build();
        }
      }
    }
    return getHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<company.Hello.LoginRequest,
      company.Hello.LoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = company.Hello.LoginRequest.class,
      responseType = company.Hello.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<company.Hello.LoginRequest,
      company.Hello.LoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<company.Hello.LoginRequest, company.Hello.LoginResponse> getLoginMethod;
    if ((getLoginMethod = HelloWorldServiceGrpc.getLoginMethod) == null) {
      synchronized (HelloWorldServiceGrpc.class) {
        if ((getLoginMethod = HelloWorldServiceGrpc.getLoginMethod) == null) {
          HelloWorldServiceGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<company.Hello.LoginRequest, company.Hello.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  company.Hello.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  company.Hello.LoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloWorldServiceMethodDescriptorSupplier("login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<company.Hello.RegisterRequest,
      company.Hello.RegisterRequest> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "register",
      requestType = company.Hello.RegisterRequest.class,
      responseType = company.Hello.RegisterRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<company.Hello.RegisterRequest,
      company.Hello.RegisterRequest> getRegisterMethod() {
    io.grpc.MethodDescriptor<company.Hello.RegisterRequest, company.Hello.RegisterRequest> getRegisterMethod;
    if ((getRegisterMethod = HelloWorldServiceGrpc.getRegisterMethod) == null) {
      synchronized (HelloWorldServiceGrpc.class) {
        if ((getRegisterMethod = HelloWorldServiceGrpc.getRegisterMethod) == null) {
          HelloWorldServiceGrpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<company.Hello.RegisterRequest, company.Hello.RegisterRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  company.Hello.RegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  company.Hello.RegisterRequest.getDefaultInstance()))
              .setSchemaDescriptor(new HelloWorldServiceMethodDescriptorSupplier("register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloWorldServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloWorldServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloWorldServiceStub>() {
        @java.lang.Override
        public HelloWorldServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloWorldServiceStub(channel, callOptions);
        }
      };
    return HelloWorldServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloWorldServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloWorldServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloWorldServiceBlockingStub>() {
        @java.lang.Override
        public HelloWorldServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloWorldServiceBlockingStub(channel, callOptions);
        }
      };
    return HelloWorldServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloWorldServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloWorldServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloWorldServiceFutureStub>() {
        @java.lang.Override
        public HelloWorldServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloWorldServiceFutureStub(channel, callOptions);
        }
      };
    return HelloWorldServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void hello(company.Hello.HelloRequest request,
        io.grpc.stub.StreamObserver<company.Hello.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHelloMethod(), responseObserver);
    }

    /**
     */
    default void login(company.Hello.LoginRequest request,
        io.grpc.stub.StreamObserver<company.Hello.LoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    default void register(company.Hello.RegisterRequest request,
        io.grpc.stub.StreamObserver<company.Hello.RegisterRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HelloWorldService.
   */
  public static abstract class HelloWorldServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HelloWorldServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HelloWorldService.
   */
  public static final class HelloWorldServiceStub
      extends io.grpc.stub.AbstractAsyncStub<HelloWorldServiceStub> {
    private HelloWorldServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloWorldServiceStub(channel, callOptions);
    }

    /**
     */
    public void hello(company.Hello.HelloRequest request,
        io.grpc.stub.StreamObserver<company.Hello.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(company.Hello.LoginRequest request,
        io.grpc.stub.StreamObserver<company.Hello.LoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void register(company.Hello.RegisterRequest request,
        io.grpc.stub.StreamObserver<company.Hello.RegisterRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HelloWorldService.
   */
  public static final class HelloWorldServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HelloWorldServiceBlockingStub> {
    private HelloWorldServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloWorldServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public company.Hello.HelloResponse hello(company.Hello.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public company.Hello.LoginResponse login(company.Hello.LoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public company.Hello.RegisterRequest register(company.Hello.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HelloWorldService.
   */
  public static final class HelloWorldServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<HelloWorldServiceFutureStub> {
    private HelloWorldServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloWorldServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<company.Hello.HelloResponse> hello(
        company.Hello.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<company.Hello.LoginResponse> login(
        company.Hello.LoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<company.Hello.RegisterRequest> register(
        company.Hello.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO = 0;
  private static final int METHODID_LOGIN = 1;
  private static final int METHODID_REGISTER = 2;

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
        case METHODID_HELLO:
          serviceImpl.hello((company.Hello.HelloRequest) request,
              (io.grpc.stub.StreamObserver<company.Hello.HelloResponse>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((company.Hello.LoginRequest) request,
              (io.grpc.stub.StreamObserver<company.Hello.LoginResponse>) responseObserver);
          break;
        case METHODID_REGISTER:
          serviceImpl.register((company.Hello.RegisterRequest) request,
              (io.grpc.stub.StreamObserver<company.Hello.RegisterRequest>) responseObserver);
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
          getHelloMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              company.Hello.HelloRequest,
              company.Hello.HelloResponse>(
                service, METHODID_HELLO)))
        .addMethod(
          getLoginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              company.Hello.LoginRequest,
              company.Hello.LoginResponse>(
                service, METHODID_LOGIN)))
        .addMethod(
          getRegisterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              company.Hello.RegisterRequest,
              company.Hello.RegisterRequest>(
                service, METHODID_REGISTER)))
        .build();
  }

  private static abstract class HelloWorldServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloWorldServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return company.Hello.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloWorldService");
    }
  }

  private static final class HelloWorldServiceFileDescriptorSupplier
      extends HelloWorldServiceBaseDescriptorSupplier {
    HelloWorldServiceFileDescriptorSupplier() {}
  }

  private static final class HelloWorldServiceMethodDescriptorSupplier
      extends HelloWorldServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloWorldServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HelloWorldServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloWorldServiceFileDescriptorSupplier())
              .addMethod(getHelloMethod())
              .addMethod(getLoginMethod())
              .addMethod(getRegisterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
