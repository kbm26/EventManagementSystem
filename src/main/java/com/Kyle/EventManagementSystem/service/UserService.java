package com.Kyle.EventManagementSystem.service;

import com.Kyle.EventManagementSystem.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User getUser(){
        return new User("kyle","banana");
    }
}
