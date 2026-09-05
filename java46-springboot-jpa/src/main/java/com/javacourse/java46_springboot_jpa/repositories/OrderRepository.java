package com.javacourse.java46_springboot_jpa.repositories;

import com.javacourse.java46_springboot_jpa.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
