package com.example.bank_management.service;

import com.example.bank_management.model.User;
import com.example.bank_management.model.UserRole;
import com.example.bank_management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(String login, String password, UserRole role) {
        User user = new User();
        user.setLogin(login);
        user.setPassword(encryptPassword(password)); // Assure-toi d'utiliser une méthode pour crypter le mot de passe
        user.setRole(role);
        userRepository.save(user);
    }

    private String encryptPassword(String password) {
        // Implémente la logique de cryptage ici
        return password; // Remplace par la logique de cryptage
    }
}
