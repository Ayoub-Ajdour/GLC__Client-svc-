package ma.fpl.clientsvc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class ClientRequest{
    private String nom;

    private String adresse;

    private String email;

    private String telephone;
}
