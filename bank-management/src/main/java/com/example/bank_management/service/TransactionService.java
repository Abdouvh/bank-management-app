package com.example.bank_management.service;

import com.example.bank_management.model.Transaction;
import com.example.bank_management.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> findAllTransactions() {
        return transactionRepository.findAll();
    }

    public ResponseEntity<Transaction> createTransaction(Transaction transaction) {
        // Ajoute des validations selon RG_11, RG_12, RG_13, RG_14, RG_15
        transactionRepository.save(transaction);
        return ResponseEntity.ok(transaction);
    }
}
