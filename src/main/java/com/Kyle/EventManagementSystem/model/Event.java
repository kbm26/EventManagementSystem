package com.Kyle.EventManagementSystem.model;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

import java.time.LocalDate;
import java.util.UUID;
@Entity
@Table(name = "Event")
public class Event {
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
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="type")
    private String type;
    @Column(name="location")
    private String location;
    @Column(name="eventDate")
    private LocalDate eventDate;

    public Event() {
    }

    public Event(String name, String type, String location, LocalDate eventDate) {
        this.name = name;
        this.type = type;
        this.location = location;
        this.eventDate = eventDate;

    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }
}
