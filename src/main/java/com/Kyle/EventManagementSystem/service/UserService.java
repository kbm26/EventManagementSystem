package com.Kyle.EventManagementSystem.service;

import com.Kyle.EventManagementSystem.model.Client;
import com.Kyle.EventManagementSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Client> getUser() {
        return userRepository.findAll();
    }

    public void saveUser(){
        userRepository.save(new Client(
                "kyle","kyle@gmail.com"
        ));
    }
}
