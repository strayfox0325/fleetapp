package com.isidora.fleetapp.parameters.services;

import com.isidora.fleetapp.parameters.models.Client;
import com.isidora.fleetapp.parameters.models.Country;
import com.isidora.fleetapp.parameters.models.State;
import com.isidora.fleetapp.parameters.repositories.ClientRepository;
import com.isidora.fleetapp.parameters.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    // Get All States
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    // Get State By Id
    public void save(Client client) {
        clientRepository.save(client);
    }

    // Delete State
    public void delete(Integer id) {
        clientRepository.deleteById(id);
    }

    // Update State
    public Client getById(Integer id) {
        return clientRepository.findById(id).orElse(null);
    }
}
