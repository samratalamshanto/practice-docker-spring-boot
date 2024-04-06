package com.example.basicdockerpracticespringboot.controller;

import com.example.basicdockerpracticespringboot.entity.UserEntity;
import com.example.basicdockerpracticespringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserRestController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/add")
    public UserEntity addUser(@RequestBody UserEntity user) {
        return userRepository.save(user);
    }

    @GetMapping("/get-all")
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }
}
