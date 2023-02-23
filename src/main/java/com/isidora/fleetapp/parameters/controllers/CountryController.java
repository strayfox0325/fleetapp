package com.isidora.fleetapp.parameters.controllers;

import com.isidora.fleetapp.parameters.models.Country;
import com.isidora.fleetapp.parameters.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    @ResponseBody // return JSON
    public List<Country> getAll() {
        return  countryService.getAll();
    }
}
