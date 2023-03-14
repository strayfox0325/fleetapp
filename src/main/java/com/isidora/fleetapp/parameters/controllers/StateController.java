package com.isidora.fleetapp.parameters.controllers;

import com.isidora.fleetapp.parameters.models.Country;
import com.isidora.fleetapp.parameters.models.State;
import com.isidora.fleetapp.parameters.services.CountryService;
import com.isidora.fleetapp.parameters.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StateController {

    @Autowired
    private StateService stateService;
    @Autowired
    private CountryService countryService;

    // Get All States
    @GetMapping("/parameters/states")
    public String getAll(Model model) {

        List<State> states = stateService.getAll();
        List<Country> countries = countryService.getAll();

        model.addAttribute("countries", countries);
        model.addAttribute("states", states);

        return "parameters/stateList";
    }

    // Add a State
    @GetMapping("/parameters/state-add")
    public String addState(Model model) {

        List<State> states = stateService.getAll();
        List<Country> countries = countryService.getAll();

        model.addAttribute("countries", countries);
        model.addAttribute("states", states);

        return "parameters/stateAdd";
    }

    // Save a State
    @PostMapping("/parameters/states")
    public String save(State state) {
        stateService.save(state);
        return "redirect:/parameters/states";
    }

    // Edit a State
    @GetMapping("/parameters/state-edit/{id}")
    public String editState(@PathVariable Integer id, Model model) {

        List<State> states = stateService.getAll();
        List<Country> countries = countryService.getAll();
        State state = stateService.getById(id);

        model.addAttribute("state", state);
        model.addAttribute("countries", countries);
        model.addAttribute("states", states);

        return "parameters/stateEdit";
    }

    // Update a State
    @RequestMapping(value = "/parameters/states/update/{id}", method = {RequestMethod.GET, RequestMethod.PUT})
    public String update(State state) {
        stateService.save(state);
        return "redirect:/parameters/states";
    }

    // State Details
    @GetMapping("/parameters/state-details/{id}")
    public String detailsState(@PathVariable Integer id, Model model) {
        State state = stateService.getById(id);
        model.addAttribute("state", state);
        return "parameters/stateDetails";
    }

    // Delete a State
    @RequestMapping(value = "/parameters/states/delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public String deleteState(@PathVariable Integer id) {
        stateService.delete(id);
        return "redirect:/parameters/states";
    }
}
