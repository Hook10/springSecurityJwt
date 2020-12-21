package com.springsecurity.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springsecurity.springjwt.models.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
