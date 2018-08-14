package com.marc2web.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marc2web.auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
