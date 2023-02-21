package com.isidora.fleetapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/index")
    public String showIndex() {
        return "index";
    }

    @GetMapping("/hr")
    public String showHR() {
        return "/hr/index";
    }

    @GetMapping("/fleet")
    public String showFleet() {
        return "/fleet/index";
    }

    @GetMapping("/accounts")
    public String showAccounts() {
        return "/accounts/index";
    }

    @GetMapping("/helpdesk")
    public String showHelpdesk() {
        return "/helpdesk/index";
    }

    @GetMapping("/parameters")
    public String showParameters() {
        return "/parameters/index";
    }
    @GetMapping("/payroll")
    public String showPayroll() {
        return "/payroll/index";
    }
}
