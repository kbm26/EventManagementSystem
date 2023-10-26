package com.Kyle.EventManagementSystem.repository;

import com.Kyle.EventManagementSystem.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository
        extends JpaRepository<Event,Long> {

}
