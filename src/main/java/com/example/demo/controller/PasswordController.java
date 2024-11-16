package com.example.demo.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordController {

    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @GetMapping("/encrypt-password")
    public String encryptPassword(@RequestParam String password) {
        return passwordEncoder.encode(password);
    }
}
