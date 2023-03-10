package com.isidora.fleetapp.parameters.services;

import com.isidora.fleetapp.parameters.models.Contact;
import com.isidora.fleetapp.parameters.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    // Get All Countries
    public List<Contact> getAll() {
        return contactRepository.findAll();
    }

    // Get State By Id
    public void save(Contact contact) {
        contactRepository.save(contact);
    }

    // Delete State
    public void delete(Integer id) {
        contactRepository.deleteById(id);
    }

    // Update State
    public Contact getById(Integer id) {
        return contactRepository.findById(id).orElse(null);
    }
}
