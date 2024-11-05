package com.example.bank_management.repository;

import com.example.bank_management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Méthodes supplémentaires pour rechercher des utilisateurs par attributs spécifiques peuvent être ajoutées ici
    User findByLogin(String login);
}
