package com.springsecurity.springjwt.repository;

import com.springsecurity.springjwt.models.ERole;
import com.springsecurity.springjwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);

}
