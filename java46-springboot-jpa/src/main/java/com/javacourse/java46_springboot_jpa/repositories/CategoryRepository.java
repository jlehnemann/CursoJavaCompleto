package com.javacourse.java46_springboot_jpa.repositories;

import com.javacourse.java46_springboot_jpa.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
