package com.example.springdevcontainertest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String hello() {
        var message = "Hello Tyler";
        log.info("message: {}", message);

        return "Hello from Spring Boot 3.5.5 with Java 17 in a Dev Container! This is another test.";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is running successfully!";
    }
}
