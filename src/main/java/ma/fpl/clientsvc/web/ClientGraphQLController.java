package ma.fpl.clientsvc.web;

import lombok.AllArgsConstructor;
import ma.fpl.clientsvc.dto.ClientRequest;
import ma.fpl.clientsvc.entity.Client;
import ma.fpl.clientsvc.mapper.ClientMapper;
import ma.fpl.clientsvc.repository.ClientRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class ClientGraphQLController {

    private ClientRepository clientRepository;
    private ClientMapper clientMapper;
    @QueryMapping
    public List<Client> AllClients() {
        return clientRepository.findAll();
    }

    @QueryMapping
    public Client ClientById(@Argument Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @MutationMapping
    public Client createClient(@Argument ClientRequest clientRequest) {
        Client client = clientMapper.from(clientRequest);
        return clientRepository.save(client);
    }

    @MutationMapping
    public Client updateClient(@Argument Long id,
                               @Argument String nom,
                               @Argument String adresse,
                               @Argument String email,
                               @Argument String telephone) {
        Optional<Client> clientOpt = clientRepository.findById(id);
        if (clientOpt.isPresent()) {
            Client client = clientOpt.get();
            if (nom != null) client.setNom(nom);
            if (adresse != null) client.setAdresse(adresse);
            if (email != null) client.setEmail(email);
            if (telephone != null) client.setTelephone(telephone);

            return clientRepository.save(client);
        }
        return null;
    }


    @MutationMapping
    public Boolean deleteClient(@Argument Long id) {
        Optional<Client> clientOpt = clientRepository.findById(id);
        if (clientOpt.isPresent()) {
            clientRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
