package ma.fpl.clientsvc.web;

import io.grpc.stub.StreamObserver;
import ma.fpl.clientsvc.entity.Client;
import ma.fpl.clientsvc.mapper.ClientMapper;
import ma.fpl.clientsvc.repository.ClientRepository;
import ma.fpl.clientsvc.stub.ClientServiceGrpc;
import ma.fpl.clientsvc.stub.ClientServiceOuterClass;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class ClientGrpcController extends ClientServiceGrpc.ClientServiceImplBase {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ClientMapper clientMapper;

    @Override
    public void getAllClients(ClientServiceOuterClass.GetAllClientsRequest request, StreamObserver<ClientServiceOuterClass.GetAllClientsResponse> responseObserver) {
        List<Client> all = clientRepository.findAll();
        List<ClientServiceOuterClass.Client> grpcAll = all.stream().map(clientMapper::fromClient).collect(Collectors.toList());
        ClientServiceOuterClass.GetAllClientsResponse clientsResponse = ClientServiceOuterClass.GetAllClientsResponse.newBuilder()
                .addAllClients(grpcAll)
                .build();
        responseObserver.onNext(clientsResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getClientById(ClientServiceOuterClass.GetClientByIdRequest request, StreamObserver<ClientServiceOuterClass.GetClientByIdResponse> responseObserver) {
        System.out.println("getClientById invoked with ID: " + request.getId());
        Long id = request.getId();
        Client client = clientRepository.findById(id).orElse(null);
        if (client == null) {
            System.out.println("Client not found");
            responseObserver.onError(new RuntimeException("Client not found"));
        } else {
            ClientServiceOuterClass.Client grpcClient = clientMapper.fromClient(client);
            ClientServiceOuterClass.GetClientByIdResponse response = ClientServiceOuterClass.GetClientByIdResponse.newBuilder()
                    .setClient(grpcClient)
                    .build();
            System.out.println("Client found, returning response");
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }


    @Override
    public void createClient(ClientServiceOuterClass.CreateClientRequest request, StreamObserver<ClientServiceOuterClass.CreateClientResponse> responseObserver) {
        ClientServiceOuterClass.Client grpcClient = request.getClient();
        Client client = clientMapper.toClient(grpcClient);
        Client savedClient = clientRepository.save(client);
        ClientServiceOuterClass.Client createdClient = clientMapper.fromClient(savedClient);
        ClientServiceOuterClass.CreateClientResponse response = ClientServiceOuterClass.CreateClientResponse.newBuilder()
                .setClient(createdClient)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateClient(ClientServiceOuterClass.UpdateClientRequest request, StreamObserver<ClientServiceOuterClass.UpdateClientResponse> responseObserver) {
        Long id = request.getId();
        ClientServiceOuterClass.Client grpcClient = request.getClient();
        Client clientDetails = clientMapper.toClient(grpcClient);

        Client client = clientRepository.findById(id).orElse(null);
        if (client == null) {
            responseObserver.onError(new RuntimeException("Client not found"));
        } else {
            client.setNom(clientDetails.getNom());
            client.setAdresse(clientDetails.getAdresse());
            client.setEmail(clientDetails.getEmail());
            client.setTelephone(clientDetails.getTelephone());
            Client updatedClient = clientRepository.save(client);
            ClientServiceOuterClass.Client grpcUpdatedClient = clientMapper.fromClient(updatedClient);
            ClientServiceOuterClass.UpdateClientResponse response = ClientServiceOuterClass.UpdateClientResponse.newBuilder()
                    .setClient(grpcUpdatedClient)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void deleteClient(ClientServiceOuterClass.DeleteClientRequest request, StreamObserver<ClientServiceOuterClass.DeleteClientResponse> responseObserver) {
        Long id = request.getId();
        boolean exists = clientRepository.existsById(id);
        if (!exists) {
            responseObserver.onError(new RuntimeException("Client not found"));
        } else {
            clientRepository.deleteById(id);
            ClientServiceOuterClass.DeleteClientResponse response = ClientServiceOuterClass.DeleteClientResponse.newBuilder()
                    .setSuccess(true)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}
