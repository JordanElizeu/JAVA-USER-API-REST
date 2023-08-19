package com.king.demo.controllers;

import com.king.demo.data.repositories.UserRepository;
import com.king.demo.domain.entities.UserEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/find-all")
    public List<UserEntity> findUsers(){
        return userRepository.findAll();
    }

    @PostMapping("/user-create")
    @ResponseStatus(HttpStatus.CREATED)
    public UserEntity createUser(@RequestBody UserEntity user){
        System.out.print(user.getName());
        System.out.print(user.getAge());
        return userRepository.save(user);
    }
}
