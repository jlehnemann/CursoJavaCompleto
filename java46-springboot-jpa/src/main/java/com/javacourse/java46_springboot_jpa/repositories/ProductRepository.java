package com.javacourse.java46_springboot_jpa.repositories;

import com.javacourse.java46_springboot_jpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
