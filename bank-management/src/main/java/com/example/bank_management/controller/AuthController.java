package com.example.bank_management.controller;

import com.example.bank_management.model.User;
import com.example.bank_management.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        return authService.authenticate(user);
    }

    @PostMapping("/change-password")
    public ResponseEntity<String> changePassword(@RequestBody User user) {
        return authService.changePassword(user);
    }
}
