package com.Kyle.EventManagementSystem.repository;

import com.Kyle.EventManagementSystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository
        extends JpaRepository<User,Long> {

}
