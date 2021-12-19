package com.rodrigodojo.projectspring.repositories;

import com.rodrigodojo.projectspring.entities.Order;
import com.rodrigodojo.projectspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
