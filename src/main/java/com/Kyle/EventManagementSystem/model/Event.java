package com.Kyle.EventManagementSystem.model;

import java.time.LocalDate;
import java.util.UUID;

public class Event {
    private Long id;
    private String name;
    private String type;
    private String location;
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

}
