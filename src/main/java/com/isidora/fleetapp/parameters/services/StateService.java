package com.isidora.fleetapp.parameters.services;

import com.isidora.fleetapp.parameters.models.Country;
import com.isidora.fleetapp.parameters.models.State;
import com.isidora.fleetapp.parameters.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    // Get All States
    public List<State> getAll() {
        return stateRepository.findAll();
    }

    // Get State By Id
    public void save(State state) {
        stateRepository.save(state);
    }

    // Delete State
    public void delete(Integer id) {
        stateRepository.deleteById(id);
    }

    // Update State
    public State getById(Integer id) {
        return stateRepository.findById(id).orElse(null);
    }
}
