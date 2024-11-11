package ma.fpl.clientsvc.config;


import lombok.AllArgsConstructor;
import ma.fpl.clientsvc.web.ClientSOAPController;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class ClientSoapConfig {

    private Bus bus;
    private ClientSOAPController clientSOAPController;


    @Bean
    public EndpointImpl endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, clientSOAPController);
        endpoint.publish("/ClientService");
        return endpoint;
    }
}