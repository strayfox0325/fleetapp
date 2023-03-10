package com.isidora.fleetapp.parameters.repositories;

import com.isidora.fleetapp.parameters.models.Contact;
import com.isidora.fleetapp.parameters.models.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
