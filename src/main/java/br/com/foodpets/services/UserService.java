package br.com.foodpets.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.foodpets.exeptions.InvalidLoginExeption;
import br.com.foodpets.model.User;
import br.com.foodpets.repository.userRepository;
import br.com.foodpets.services.dto.UserDTO;
import br.com.foodpets.services.dto.UserLoginDTO;

@Service
public class UserService {

    @Autowired
    private userRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public UserDTO login(UserLoginDTO user) {

        User login = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
        if(login == null){
            throw new InvalidLoginExeption("Usuário ou senha inválidos");
        }
        return new UserDTO(login);

    }

    public List<User> list() {
        return this.userRepository.findAll();
    }

}
