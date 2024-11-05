package com.example.bank_management.service;

import com.example.bank_management.model.Account;
import com.example.bank_management.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> findAllAccounts() {
        return accountRepository.findAll();
    }

    public ResponseEntity<Account> createAccount(Account account) {
        // Ajoute des validations selon RG_8, RG_9, RG_10
        accountRepository.save(account);
        return ResponseEntity.ok(account);
    }
}
