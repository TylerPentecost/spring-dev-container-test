package com.example.springdevcontainertest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello from Spring Boot 3.5.5 with Java 17 in a Dev Container!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is running successfully!";
    }
}