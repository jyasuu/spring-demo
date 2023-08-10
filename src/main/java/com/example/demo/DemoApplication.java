package com.example.demo;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

    @GetMapping("/users")
    public String getUserData() {
        // Implementation for retrieving user data
        return "User data retrieved";
    }

    @PostMapping("/users")
    public String createUserData() {
        // Implementation for creating new user data
        return "User data created";
    }

    @PutMapping("/users")
    public String updateUserData() {
        // Implementation for updating existing user data
        return "User data updated";
    }

    @DeleteMapping("/users")
    public String deleteUserData() {
        // Implementation for deleting user data
        return "User data deleted";
    }

    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
        return () -> 42;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

//	public static void main(String[] args) {
//		System.exit(SpringApplication.exit(SpringApplication.run(DemoApplication.class, args)));
//	}

}