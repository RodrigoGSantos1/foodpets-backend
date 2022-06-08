package br.com.foodpets.services.dto;

import br.com.foodpets.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private String name;
    private String email;

    public UserDTO(User user) {
        name = user.getName();
        email = user.getEmail();
    }
}
