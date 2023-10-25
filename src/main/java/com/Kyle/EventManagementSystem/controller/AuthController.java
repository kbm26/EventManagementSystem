package com.Kyle.EventManagementSystem.controller;

import com.Kyle.EventManagementSystem.model.User;
import com.Kyle.EventManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AuthController {
    private final UserService user;

    @Autowired
    public AuthController(UserService user) {
        this.user = user;
    }

    @GetMapping("/")
    public User index() {
        return this.user.getUser();
    }

    @GetMapping("/message")
    public String message() {
        return "Hello AGAIN";
    }
}
