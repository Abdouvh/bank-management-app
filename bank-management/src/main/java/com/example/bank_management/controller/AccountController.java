package com.example.bank_management.controller;

import com.example.bank_management.model.Account;
import com.example.bank_management.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping
    public List<Account> getAllAccounts() {
        return accountService.findAllAccounts();
    }

    @PostMapping
    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }
}
