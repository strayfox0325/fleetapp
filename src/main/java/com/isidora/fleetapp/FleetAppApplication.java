package com.isidora.fleetapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class FleetAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(FleetAppApplication.class, args);
    }

}
