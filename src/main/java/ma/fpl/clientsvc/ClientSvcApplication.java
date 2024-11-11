package ma.fpl.clientsvc;

import ma.fpl.clientsvc.entity.Client;
import ma.fpl.clientsvc.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientSvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientSvcApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(ClientRepository clientRepository){
        return args -> {
            clientRepository.save(Client.builder()
                            .adresse("Sidi Ouaaziz")
                            .email("ayoubajdour10@gmail.com")
                            .nom("ayoub ajdour1")
                            .telephone("0657017246")
                    .build());
            clientRepository.save(Client.builder()
                            .adresse("Sidi Ouaaziz")
                            .email("ayoubajdour20@gmail.com")
                            .nom("ayoub ajdour2")
                            .telephone("0657017246")
                    .build());
            clientRepository.save(Client.builder()
                            .adresse("Sidi Ouaaziz")
                            .email("ayoubajdour30@gmail.com")
                            .nom("ayoub ajdour3")
                            .telephone("0657017246")
                    .build());
        };
    }
}
