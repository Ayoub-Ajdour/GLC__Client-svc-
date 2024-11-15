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
    CommandLineRunner commandLineRunner(ClientRepository clientRepository) {
        return args -> {
            for (long i = 1; i <= 30; i++) {
                clientRepository.save(Client.builder()
                        .adresse("Sidi Ouaaziz " + i)
                        .email("ayoubajdour" + (i * 10) + "@gmail.com")
                        .nom("Ayoub Ajdour " + i)
                        .telephone("0657017" + (i + 1000))
                        .build());
            }
            clientRepository.save(Client.builder()
                    .adresse("Casablanca")
                    .email("mohammed123@gmail.com")
                    .nom("Mohammed Ali")
                    .telephone("0657080900")
                    .build());

            clientRepository.save(Client.builder()
                    .adresse("Rabat")
                    .email("ahmed456@gmail.com")
                    .nom("Ahmed Ouahbi")
                    .telephone("0657080950")
                    .build());

            clientRepository.save(Client.builder()
                    .adresse("Marrakech")
                    .email("sarah789@gmail.com")
                    .nom("Sarah Boussaid")
                    .telephone("0657080800")
                    .build());

            clientRepository.save(Client.builder()
                    .adresse("Tangier")
                    .email("khalid999@gmail.com")
                    .nom("Khalid El Amrani")
                    .telephone("0657080750")
                    .build());

            clientRepository.save(Client.builder()
                    .adresse("Agadir")
                    .email("imane111@gmail.com")
                    .nom("Imane El Jami")
                    .telephone("0657080700")
                    .build());
        };
    }

}
