package com.isidora.fleetapp.parameters.controllers;

import com.isidora.fleetapp.parameters.models.Country;
import com.isidora.fleetapp.parameters.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public String getAll(Model model) {
        List<Country> countries = countryService.getAll();
        model.addAttribute("countries", countries);
        return "parameters/countryList";
    }

    @GetMapping("/country-add")
    public String addCountry() {
        return "parameters/countryAdd";
    }

    @PostMapping("/countries")
    public String save(Country country) {
        countryService.save(country);
        return "redirect:/countries";
    }

    @RequestMapping(value = "/countries/delete/{id}", method = {RequestMethod.GET, RequestMethod.DELETE})
    public String delete(@PathVariable Integer id) {
        countryService.delete(id);
        return "redirect:/countries";
    }

    @GetMapping("/country-edit/{id}")
    public String editCountry(@PathVariable Integer id, Model model) {
        Country country = countryService.getById(id);
        model.addAttribute("country", country);
        return "parameters/countryEdit";
    }

    @RequestMapping(value = "/countries/update/{id}", method = {RequestMethod.GET, RequestMethod.PUT})
    public String update(Country country) {
        countryService.save(country);
        return "redirect:/countries";
    }

    @GetMapping("/country-details/{id}")
    public String detailsCountry(@PathVariable Integer id, Model model) {
        Country country = countryService.getById(id);
        model.addAttribute("country", country);
        return "parameters/countryDetails";
    }
}
