package com.marc2web.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marc2web.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
