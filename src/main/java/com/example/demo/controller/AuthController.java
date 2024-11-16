package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String loginPage() {
        System.err.println(this.getClass().getName());
        return "login";
    }

    @GetMapping("/home")
    public String homePage() {
        return "home";
    }
}
