package com.example.bank_management.service;

import com.example.bank_management.model.User;
import com.example.bank_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public ResponseEntity<String> authenticate(User user) {
        User foundUser = userRepository.findByLogin(user.getLogin());
        if (foundUser == null || !passwordEncoder.matches(user.getPassword(), foundUser.getPassword())) {
            return ResponseEntity.badRequest().body("Login ou mot de passe erronés");
        }
        // Logique pour générer et retourner un JWT ici
        return ResponseEntity.ok("Authentification réussie");
    }

    public ResponseEntity<String> changePassword(User user) {
        // Implémentation pour changer le mot de passe
        return ResponseEntity.ok("Mot de passe changé avec succès");
    }
}
