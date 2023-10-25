package com.Kyle.EventManagementSystem.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class User {
    private String name;
    private String email;
    private UUID id;

    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public UUID getId() {
        return id;
    }


}
