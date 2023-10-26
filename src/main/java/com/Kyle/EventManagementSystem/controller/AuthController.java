package com.Kyle.EventManagementSystem.controller;

import com.Kyle.EventManagementSystem.model.User;
import com.Kyle.EventManagementSystem.repository.UserRepository;
import com.Kyle.EventManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class AuthController {
    private final UserRepository user;

    @Autowired
    public AuthController(UserRepository user) {
        this.user = user;
    }

    @GetMapping("/")
    public List<User> index() {
        return this.user.findAll();
    }

    @GetMapping("/message")
    public String message() {
        return "Hello AGAIN";
    }
}
