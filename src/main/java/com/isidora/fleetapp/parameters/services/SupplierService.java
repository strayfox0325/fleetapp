package com.isidora.fleetapp.parameters.services;

import com.isidora.fleetapp.parameters.models.Country;
import com.isidora.fleetapp.parameters.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private CountryRepository countryRepository;

    // Get All Countries
    public List<Country> getAll() {
        return countryRepository.findAll();
    }

    // Get State By Id
    public void save(Country country) {
        countryRepository.save(country);
    }

    // Delete State
    public void delete(Integer id) {
        countryRepository.deleteById(id);
    }

    // Update State
    public Country getById(Integer id) {
        return countryRepository.findById(id).orElse(null);
    }
}
