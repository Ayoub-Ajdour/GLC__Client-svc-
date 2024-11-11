package ma.fpl.clientsvc.repository;

import ma.fpl.clientsvc.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ClientRepository extends JpaRepository<Client,Long> {
}
