package com.example.bank_management.repository;

import com.example.bank_management.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    // Méthodes supplémentaires pour rechercher des comptes par attributs spécifiques peuvent être ajoutées ici
    Account findByRIB(String rib);
}
