package com.flaco.labjavajpa.repository;

import com.flaco.labjavajpa.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}