package com.isidora.fleetapp.parameters.services;

import com.isidora.fleetapp.parameters.models.Country;
import com.isidora.fleetapp.parameters.models.Location;
import com.isidora.fleetapp.parameters.repositories.CountryRepository;
import com.isidora.fleetapp.parameters.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    // Get All Countries
    public List<Location> getAll() {
        return locationRepository.findAll();
    }

    // Get State By Id
    public void save(Location location) {
        locationRepository.save(location);
    }

    // Delete State
    public void delete(Integer id) {
        locationRepository.deleteById(id);
    }

    // Update State
    public Location getById(Integer id) {
        return locationRepository.findById(id).orElse(null);
    }
}
