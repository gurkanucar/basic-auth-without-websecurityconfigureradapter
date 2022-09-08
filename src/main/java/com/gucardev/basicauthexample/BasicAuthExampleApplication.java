package com.gucardev.basicauthexample;

import com.gucardev.basicauthexample.model.Role;
import com.gucardev.basicauthexample.model.User;
import com.gucardev.basicauthexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Set;

@SpringBootApplication
public class BasicAuthExampleApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BasicAuthExampleApplication.class, args);
    }


    @Autowired
    UserRepository userRepository;


    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User(null, "gurkan", bCryptPasswordEncoder.encode("pass"), Role.ADMIN));
        userRepository.save(new User(null, "mehmet", bCryptPasswordEncoder.encode("pass"), Role.USER));
    }
}
