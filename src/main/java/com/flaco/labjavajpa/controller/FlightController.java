package com.flaco.labjavajpa.controller;

import com.flaco.labjavajpa.entity.Flight;
import com.flaco.labjavajpa.repository.FlightRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    private final FlightRepository flightRepo;

    public FlightController(FlightRepository flightRepo) {
        this.flightRepo = flightRepo;
    }

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightRepo.findAll();
    }
}