package com.gucardev.basicauthexample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class HomeController {

    @GetMapping
    public String home() {
        return "home";
    }

    @GetMapping("/public")
    public String publicEndpoint() {
        return "public";
    }

    @GetMapping("/test")
    public String testEndpoint() {
        return "test";
    }

    @GetMapping("/user")
    public String user() {
        return "user";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }


}
