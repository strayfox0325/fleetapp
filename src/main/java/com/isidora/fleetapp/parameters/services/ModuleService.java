package com.isidora.fleetapp.parameters.services;

import com.isidora.fleetapp.parameters.models.Country;
import com.isidora.fleetapp.parameters.models.Module;
import com.isidora.fleetapp.parameters.repositories.CountryRepository;
import com.isidora.fleetapp.parameters.repositories.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;

    // Get All Countries
    public List<Module> getAll() {
        return moduleRepository.findAll();
    }

    // Get State By Id
    public void save(Module module) {
        moduleRepository.save(module);
    }

    // Delete State
    public void delete(Integer id) {
        moduleRepository.deleteById(id);
    }

    // Update State
    public Module getById(Integer id) {
        return moduleRepository.findById(id).orElse(null);
    }
}
