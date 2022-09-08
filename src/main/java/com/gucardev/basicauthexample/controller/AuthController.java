package com.gucardev.basicauthexample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@Slf4j
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity login(@RequestHeader(name = "Authorization", required = false) String authorization) {

        if (authorization == null)
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();

        log.info("auth header: " + authorization);
        return ResponseEntity.ok().build();

    }


}
