package com.example.bank_management.repository;

import com.example.bank_management.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    // Méthodes supplémentaires pour rechercher des clients par attributs spécifiques peuvent être ajoutées ici
    Client findByIdentityNumber(String identityNumber);
}
