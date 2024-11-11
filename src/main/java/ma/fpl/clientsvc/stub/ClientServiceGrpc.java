package ma.fpl.clientsvc.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ClientService.proto")
public final class ClientServiceGrpc {

  private ClientServiceGrpc() {}

  public static final String SERVICE_NAME = "ClientService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsRequest,
      ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsResponse> getGetAllClientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllClients",
      requestType = ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsRequest.class,
      responseType = ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsRequest,
      ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsResponse> getGetAllClientsMethod() {
    io.grpc.MethodDescriptor<ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsRequest, ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsResponse> getGetAllClientsMethod;
    if ((getGetAllClientsMethod = ClientServiceGrpc.getGetAllClientsMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getGetAllClientsMethod = ClientServiceGrpc.getGetAllClientsMethod) == null) {
          ClientServiceGrpc.getGetAllClientsMethod = getGetAllClientsMethod = 
              io.grpc.MethodDescriptor.<ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsRequest, ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientService", "GetAllClients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("GetAllClients"))
                  .build();
          }
        }
     }
     return getGetAllClientsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdRequest,
      ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdResponse> getGetClientByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClientById",
      requestType = ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdRequest.class,
      responseType = ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdRequest,
      ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdResponse> getGetClientByIdMethod() {
    io.grpc.MethodDescriptor<ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdRequest, ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdResponse> getGetClientByIdMethod;
    if ((getGetClientByIdMethod = ClientServiceGrpc.getGetClientByIdMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getGetClientByIdMethod = ClientServiceGrpc.getGetClientByIdMethod) == null) {
          ClientServiceGrpc.getGetClientByIdMethod = getGetClientByIdMethod = 
              io.grpc.MethodDescriptor.<ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdRequest, ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientService", "GetClientById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("GetClientById"))
                  .build();
          }
        }
     }
     return getGetClientByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientRequest,
      ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientResponse> getCreateClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateClient",
      requestType = ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientRequest.class,
      responseType = ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientRequest,
      ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientResponse> getCreateClientMethod() {
    io.grpc.MethodDescriptor<ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientRequest, ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientResponse> getCreateClientMethod;
    if ((getCreateClientMethod = ClientServiceGrpc.getCreateClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getCreateClientMethod = ClientServiceGrpc.getCreateClientMethod) == null) {
          ClientServiceGrpc.getCreateClientMethod = getCreateClientMethod = 
              io.grpc.MethodDescriptor.<ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientRequest, ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientService", "CreateClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("CreateClient"))
                  .build();
          }
        }
     }
     return getCreateClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientRequest,
      ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientResponse> getUpdateClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateClient",
      requestType = ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientRequest.class,
      responseType = ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientRequest,
      ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientResponse> getUpdateClientMethod() {
    io.grpc.MethodDescriptor<ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientRequest, ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientResponse> getUpdateClientMethod;
    if ((getUpdateClientMethod = ClientServiceGrpc.getUpdateClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getUpdateClientMethod = ClientServiceGrpc.getUpdateClientMethod) == null) {
          ClientServiceGrpc.getUpdateClientMethod = getUpdateClientMethod = 
              io.grpc.MethodDescriptor.<ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientRequest, ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientService", "UpdateClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("UpdateClient"))
                  .build();
          }
        }
     }
     return getUpdateClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientRequest,
      ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientResponse> getDeleteClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteClient",
      requestType = ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientRequest.class,
      responseType = ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientRequest,
      ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientResponse> getDeleteClientMethod() {
    io.grpc.MethodDescriptor<ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientRequest, ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientResponse> getDeleteClientMethod;
    if ((getDeleteClientMethod = ClientServiceGrpc.getDeleteClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getDeleteClientMethod = ClientServiceGrpc.getDeleteClientMethod) == null) {
          ClientServiceGrpc.getDeleteClientMethod = getDeleteClientMethod = 
              io.grpc.MethodDescriptor.<ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientRequest, ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientService", "DeleteClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("DeleteClient"))
                  .build();
          }
        }
     }
     return getDeleteClientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientServiceStub newStub(io.grpc.Channel channel) {
    return new ClientServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClientServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClientServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ClientServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllClients(ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsRequest request,
        io.grpc.stub.StreamObserver<ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllClientsMethod(), responseObserver);
    }

    /**
     */
    public void getClientById(ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdRequest request,
        io.grpc.stub.StreamObserver<ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetClientByIdMethod(), responseObserver);
    }

    /**
     */
    public void createClient(ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientRequest request,
        io.grpc.stub.StreamObserver<ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateClientMethod(), responseObserver);
    }

    /**
     */
    public void updateClient(ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientRequest request,
        io.grpc.stub.StreamObserver<ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateClientMethod(), responseObserver);
    }

    /**
     */
    public void deleteClient(ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientRequest request,
        io.grpc.stub.StreamObserver<ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteClientMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllClientsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsRequest,
                ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsResponse>(
                  this, METHODID_GET_ALL_CLIENTS)))
          .addMethod(
            getGetClientByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdRequest,
                ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdResponse>(
                  this, METHODID_GET_CLIENT_BY_ID)))
          .addMethod(
            getCreateClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientRequest,
                ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientResponse>(
                  this, METHODID_CREATE_CLIENT)))
          .addMethod(
            getUpdateClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientRequest,
                ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientResponse>(
                  this, METHODID_UPDATE_CLIENT)))
          .addMethod(
            getDeleteClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientRequest,
                ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientResponse>(
                  this, METHODID_DELETE_CLIENT)))
          .build();
    }
  }

  /**
   */
  public static final class ClientServiceStub extends io.grpc.stub.AbstractStub<ClientServiceStub> {
    private ClientServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllClients(ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsRequest request,
        io.grpc.stub.StreamObserver<ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllClientsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getClientById(ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdRequest request,
        io.grpc.stub.StreamObserver<ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetClientByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createClient(ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientRequest request,
        io.grpc.stub.StreamObserver<ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateClient(ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientRequest request,
        io.grpc.stub.StreamObserver<ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteClient(ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientRequest request,
        io.grpc.stub.StreamObserver<ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteClientMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClientServiceBlockingStub extends io.grpc.stub.AbstractStub<ClientServiceBlockingStub> {
    private ClientServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsResponse getAllClients(ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllClientsMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdResponse getClientById(ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetClientByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientResponse createClient(ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientResponse updateClient(ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientResponse deleteClient(ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteClientMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClientServiceFutureStub extends io.grpc.stub.AbstractStub<ClientServiceFutureStub> {
    private ClientServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsResponse> getAllClients(
        ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllClientsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdResponse> getClientById(
        ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetClientByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientResponse> createClient(
        ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientResponse> updateClient(
        ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientResponse> deleteClient(
        ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteClientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_CLIENTS = 0;
  private static final int METHODID_GET_CLIENT_BY_ID = 1;
  private static final int METHODID_CREATE_CLIENT = 2;
  private static final int METHODID_UPDATE_CLIENT = 3;
  private static final int METHODID_DELETE_CLIENT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClientServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClientServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_CLIENTS:
          serviceImpl.getAllClients((ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsRequest) request,
              (io.grpc.stub.StreamObserver<ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetAllClientsResponse>) responseObserver);
          break;
        case METHODID_GET_CLIENT_BY_ID:
          serviceImpl.getClientById((ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdRequest) request,
              (io.grpc.stub.StreamObserver<ma.fpl.clientsvc.stub.ClientServiceOuterClass.GetClientByIdResponse>) responseObserver);
          break;
        case METHODID_CREATE_CLIENT:
          serviceImpl.createClient((ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientRequest) request,
              (io.grpc.stub.StreamObserver<ma.fpl.clientsvc.stub.ClientServiceOuterClass.CreateClientResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CLIENT:
          serviceImpl.updateClient((ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientRequest) request,
              (io.grpc.stub.StreamObserver<ma.fpl.clientsvc.stub.ClientServiceOuterClass.UpdateClientResponse>) responseObserver);
          break;
        case METHODID_DELETE_CLIENT:
          serviceImpl.deleteClient((ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientRequest) request,
              (io.grpc.stub.StreamObserver<ma.fpl.clientsvc.stub.ClientServiceOuterClass.DeleteClientResponse>) responseObserver);
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

  private static abstract class ClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClientServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.fpl.clientsvc.stub.ClientServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClientService");
    }
  }

  private static final class ClientServiceFileDescriptorSupplier
      extends ClientServiceBaseDescriptorSupplier {
    ClientServiceFileDescriptorSupplier() {}
  }

  private static final class ClientServiceMethodDescriptorSupplier
      extends ClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClientServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClientServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClientServiceFileDescriptorSupplier())
              .addMethod(getGetAllClientsMethod())
              .addMethod(getGetClientByIdMethod())
              .addMethod(getCreateClientMethod())
              .addMethod(getUpdateClientMethod())
              .addMethod(getDeleteClientMethod())
              .build();
        }
      }
    }
    return result;
  }
}
