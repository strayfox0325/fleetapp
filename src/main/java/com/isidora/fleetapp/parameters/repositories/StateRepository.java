package com.isidora.fleetapp.parameters.repositories;

import com.isidora.fleetapp.parameters.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {


}
