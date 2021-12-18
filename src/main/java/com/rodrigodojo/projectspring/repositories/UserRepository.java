package com.rodrigodojo.projectspring.repositories;

import com.rodrigodojo.projectspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
