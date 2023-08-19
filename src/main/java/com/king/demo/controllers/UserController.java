package com.king.demo.controllers;

import com.king.demo.data.repositories.UserRepository;
import com.king.demo.domain.entities.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/find-users")
    public List<UserEntity> findUsers(){
        return userRepository.findAll();
    }

    @GetMapping("")
    public List<UserEntity> createUser(){
        return userRepository.findAll();
    }
}
