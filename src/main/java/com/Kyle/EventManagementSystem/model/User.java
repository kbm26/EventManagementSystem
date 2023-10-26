package com.Kyle.EventManagementSystem.model;


import jakarta.persistence.*;

@Entity
@Table
public class User {
    @Id
    @SequenceGenerator(
            name ="user_sequence",
            sequenceName ="user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )

    private String name;
    private String email;
    private Long id;

    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }


}
