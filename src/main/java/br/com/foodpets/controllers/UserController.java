package br.com.foodpets.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.foodpets.model.User;
import br.com.foodpets.services.UserService;
import br.com.foodpets.services.dto.UserDTO;
import br.com.foodpets.services.dto.UserLoginDTO;



@RestController
@CrossOrigin("*")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("user")
    public User user(@RequestBody User user) {
        return userService.save(user); 
    }

    @PostMapping("login")
    public ResponseEntity<UserDTO> Login(@RequestBody UserLoginDTO dto) {
        return ResponseEntity.ok().body(userService.login(dto));
    }

    @GetMapping("users")
    public List<User> list() {
        return userService.list();
    }

}
