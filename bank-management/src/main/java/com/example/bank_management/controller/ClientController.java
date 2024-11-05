package com.example.bank_management.controller;

import com.example.bank_management.model.Client;
import com.example.bank_management.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.findAllClients();
    }

    @PostMapping
    public ResponseEntity<Client> addClient(@RequestBody Client client) {
        return clientService.addClient(client);
    }
}
