package com.flaco.labjavajpa.controller;

import com.flaco.labjavajpa.entity.FlightBooking;
import com.flaco.labjavajpa.repository.FlightBookingRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class FlightBookingController {

    private final FlightBookingRepository bookingRepo;

    public FlightBookingController(FlightBookingRepository bookingRepo) {
        this.bookingRepo = bookingRepo;
    }

    @GetMapping
    public List<FlightBooking> getAllBookings() {
        return bookingRepo.findAll();
    }
}