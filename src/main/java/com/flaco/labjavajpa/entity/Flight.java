package com.flaco.labjavajpa.entity;

import jakarta.persistence.*;

@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String flightNumber;
    private String aircraft;
    private Integer seatCapacity;
    private Integer distance;

    public Flight() {
    }

    public Flight(String flightNumber, String aircraft, Integer seatCapacity, Integer distance) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.seatCapacity = seatCapacity;
        this.distance = distance;
    }

    public Long getId() {
        return id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAircraft() {
        return aircraft;
    }

    public Integer getSeatCapacity() {
        return seatCapacity;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public void setSeatCapacity(Integer seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", flightNumber='" + flightNumber + '\'' +
                ", aircraft='" + aircraft + '\'' +
                ", seatCapacity=" + seatCapacity +
                ", distance=" + distance +
                '}';
    }
}