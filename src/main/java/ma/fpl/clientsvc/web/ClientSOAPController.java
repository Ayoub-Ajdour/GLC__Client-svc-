package ma.fpl.clientsvc.web;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import ma.fpl.clientsvc.dto.ClientRequest;
import ma.fpl.clientsvc.entity.Client;
import ma.fpl.clientsvc.mapper.ClientMapper;
import ma.fpl.clientsvc.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService(serviceName = "ClientWService")
@AllArgsConstructor
public class ClientSOAPController {

    private ClientService clientService;
    private ClientMapper clientMapper;
    @WebMethod
    public Client getClientById(@WebParam(name = "id") Long id) {
        Client client = clientService.getClientById(id);
        if (client == null) {
            throw new RuntimeException("Client not found with id: " + id);
        }
        return client;
    }

    @WebMethod
    public Client createClient(@WebParam(name = "client") ClientRequest clientRequest) {
        return clientService.saveClient(clientMapper.from(clientRequest));
    }

    @WebMethod
    public Client updateClient(Long id, Client clientDetails) {
        return clientService.updateClient(id, clientDetails);
    }

    @WebMethod
    public boolean deleteClient(Long id) {
        return clientService.deleteClient(id);
    }

    @WebMethod
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }
}