package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;


@Slf4j
@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public ResponseEntity<String> hello() {

        log.info("Hello!!!");

        return ResponseEntity.ok().body("hello");
    }
}
