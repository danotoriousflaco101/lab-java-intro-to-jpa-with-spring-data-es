package com.flaco.labjavajpa;

import com.flaco.labjavajpa.entity.Customer;
import com.flaco.labjavajpa.entity.CustomerStatus;
import com.flaco.labjavajpa.entity.Flight;
import com.flaco.labjavajpa.entity.FlightBooking;
import com.flaco.labjavajpa.repository.CustomerRepository;
import com.flaco.labjavajpa.repository.FlightBookingRepository;
import com.flaco.labjavajpa.repository.FlightRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LabJpaWithSpringDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabJpaWithSpringDataApplication.class, args);
    }

    @Bean
    CommandLineRunner run(CustomerRepository customerRepo,
                          FlightRepository flightRepo,
                          FlightBookingRepository bookingRepo) {
        return args -> {
            // Create customers
            Customer Alino = customerRepo.save(new Customer("Alino", CustomerStatus.GOLD, 120000));
            Customer Marco = customerRepo.save(new Customer("Marco", CustomerStatus.SILVER, 80000));
            Customer Jimi = customerRepo.save(new Customer("Jimi", CustomerStatus.NONE, 30000));
            // Create flights
            Flight flight1 = flightRepo.save(new Flight("AB123", "Boeing 747", 300, 400));
            Flight flight2 = flightRepo.save(new Flight("CD456", "Airbus A320", 150, 200));
            Flight flight3 = flightRepo.save(new Flight("EF789", "Boeing 777", 250, 350));

            // Create bookings
            bookingRepo.save(new FlightBooking(Alino.getId(), flight1.getId()));
            bookingRepo.save(new FlightBooking(Marco.getId(), flight2.getId()));
            bookingRepo.save(new FlightBooking(Jimi.getId(), flight3.getId()));
        };
    }
}