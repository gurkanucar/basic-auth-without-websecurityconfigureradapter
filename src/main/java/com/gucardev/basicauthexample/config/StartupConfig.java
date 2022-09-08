package com.gucardev.basicauthexample.config;

import com.gucardev.basicauthexample.model.Role;
import com.gucardev.basicauthexample.model.User;
import com.gucardev.basicauthexample.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class StartupConfig implements CommandLineRunner {

    private final UserService userService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public StartupConfig(UserService userService,
                         BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userService = userService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }


    @Override
    public void run(String... args) throws Exception {
        userService.create(new User(null, "gurkan", bCryptPasswordEncoder.encode("pass"), Role.ADMIN));
        userService.create(new User(null, "mehmet", bCryptPasswordEncoder.encode("pass"), Role.USER));

    }
}
