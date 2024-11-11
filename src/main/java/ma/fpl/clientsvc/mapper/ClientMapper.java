package ma.fpl.clientsvc.mapper;

import ma.fpl.clientsvc.dto.ClientRequest;
import ma.fpl.clientsvc.entity.Client;
import ma.fpl.clientsvc.stub.ClientServiceOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ClientMapper {
    private ModelMapper modelMapper=new ModelMapper();
    public Client from(ClientRequest request) {
        return modelMapper.map(request, Client.class);
    }
     public ClientServiceOuterClass.Client fromClient(Client client){
        return modelMapper.map(client, ClientServiceOuterClass.Client.Builder.class).build();
    }
    public Client toClient(ClientServiceOuterClass.Client grpcClient) {
        return modelMapper.map(grpcClient, Client.class);
    }

    public List<ClientServiceOuterClass.Client> fromClientList(List<Client> clients) {
        return clients.stream()
                .map(this::fromClient)
                .collect(Collectors.toList());
    }
}
