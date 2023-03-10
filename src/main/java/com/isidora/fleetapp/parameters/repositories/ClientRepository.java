package com.isidora.fleetapp.parameters.repositories;

import com.isidora.fleetapp.parameters.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
