package com.example.server.repository;

import com.example.server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserJpaRepo extends JpaRepository<User, Long> {
    Optional<User> findBySession(String session);

    Optional<User> findByUsername(String username);
}
