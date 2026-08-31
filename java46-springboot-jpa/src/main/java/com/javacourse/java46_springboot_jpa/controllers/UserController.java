package com.javacourse.java46_springboot_jpa.controllers;

import com.javacourse.java46_springboot_jpa.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {


    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "maria@gmail.com", "99 99654-3210", "12345");
        return ResponseEntity.ok().body(u);
    }
}
