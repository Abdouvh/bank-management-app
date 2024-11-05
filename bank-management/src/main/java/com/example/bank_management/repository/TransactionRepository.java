package com.example.bank_management.repository;

import com.example.bank_management.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // Méthodes supplémentaires pour rechercher des transactions par attributs spécifiques peuvent être ajoutées ici
    List<Transaction> findByAccountId(Long accountId);
}
