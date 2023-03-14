package com.isidora.fleetapp.parameters.controllers;

import com.isidora.fleetapp.parameters.models.*;
import com.isidora.fleetapp.parameters.models.Location;
import com.isidora.fleetapp.parameters.models.Location;
import com.isidora.fleetapp.parameters.services.*;
import com.isidora.fleetapp.parameters.services.LocationService;
import com.isidora.fleetapp.parameters.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class LocationController {

    @Autowired
    private LocationService locationService;
    @Autowired
    private StateService stateService;
    @Autowired
    private CountryService countryService;

    // Get All Locations
    @GetMapping("/parameters/locations")
    public String getAll(Model model) {

        List<Location> locations = locationService.getAll();
        List<State> states = stateService.getAll();
        List<Country> countries = countryService.getAll();

        model.addAttribute("locations", locations);
        model.addAttribute("states", states);
        model.addAttribute("countries", countries);

        return "parameters/locationList";
    }

    // Add a Location
    @GetMapping("/parameters/location-add")
    public String addLocation(Model model) {

        List<Location> locations = locationService.getAll();
        List<State> states = stateService.getAll();
        List<Country> countries = countryService.getAll();

        model.addAttribute("locations", locations);
        model.addAttribute("states", states);
        model.addAttribute("countries", countries);

        return "parameters/locationAdd";
    }

    // Save a Location
    @PostMapping("/parameters/locations")
    public String save(Location location) {
        locationService.save(location);
        return "redirect:/parameters/locations";
    }

    // Edit a Location
    @GetMapping("/parameters/location-edit/{id}")
    public String editLocation(@PathVariable Integer id, Model model) {

        List<Location> locations = locationService.getAll();
        List<State> states = stateService.getAll();
        List<Country> countries = countryService.getAll();
        Location location = locationService.getById(id);

        model.addAttribute("locations", locations);
        model.addAttribute("states", states);
        model.addAttribute("countries", countries);

        return "parameters/locationEdit";
    }

    // Update a Location
    @RequestMapping(value = "/parameters/locations/update/{id}", method = {RequestMethod.GET, RequestMethod.PUT})
    public String update(Location location) {
        locationService.save(location);
        return "redirect:/parameters/locations";
    }

    // Location Details
    @GetMapping("/parameters/location-details/{id}")
    public String detailsLocation(@PathVariable Integer id, Model model) {
        Location location = locationService.getById(id);
        model.addAttribute("location", location);
        return "parameters/locationDetails";
    }

    // Delete a Location
    @RequestMapping(value = "/parameters/locations/delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public String deleteLocation(@PathVariable Integer id) {
        locationService.delete(id);
        return "redirect:/parameters/locations";
    }
}
