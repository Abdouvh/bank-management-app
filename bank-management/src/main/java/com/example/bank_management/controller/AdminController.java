package com.example.bank_management.controller;

import com.example.bank_management.model.User;
import com.example.bank_management.model.UserRole;
import com.example.bank_management.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/addUser")
    public String addUser(@RequestParam String login, @RequestParam String password, @RequestParam UserRole role) {
        adminService.addUser(login, password, role);
        return "User added successfully";
    }
}
