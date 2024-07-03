package com.jcj.microservice.vuelos.domain.model;

public class Reservation {
    private final Long id;
    private final Flight flight;
    private final int people;
    private final int netValue;
    private final boolean isActive;

    public Reservation(Long id, Flight flight, int people, int netValue, boolean isActive) {
        this.id = id;
        this.flight = flight;
        this.people = people;
        this.netValue = netValue;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public Flight getFlight() {
        return flight;
    }

    public int getPeople() {
        return people;
    }

    public int getNetValue() {
        return netValue;
    }

    public boolean isActive() {
        return isActive;
    }
}
