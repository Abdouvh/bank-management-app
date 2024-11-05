package com.example.bank_management.service;

import com.example.bank_management.model.Client;
import com.example.bank_management.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> findAllClients() {
        return clientRepository.findAll();
    }

    public ResponseEntity<Client> addClient(Client client) {
        // Ajoute des validations selon RG_4, RG_5, RG_6, RG_7
        // Assurez-vous que le client est unique et respectez les règles
        clientRepository.save(client);
        return ResponseEntity.ok(client);
    }
}
