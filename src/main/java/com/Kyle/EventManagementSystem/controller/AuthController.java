package com.Kyle.EventManagementSystem.controller;

import com.Kyle.EventManagementSystem.model.Client;
import com.Kyle.EventManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class AuthController {
    private final UserService user;

    @Autowired
    public AuthController(UserService user) {
        this.user = user;
    }

    @GetMapping("/")
    public List<Client> index() {
        return user.getUser();
    }

    @GetMapping("/message")
    public String message() {
        user.saveUser();
        return "Hello AGAIN";
    }
}
