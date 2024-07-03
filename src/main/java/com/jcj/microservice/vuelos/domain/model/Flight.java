package com.jcj.microservice.vuelos.domain.model;

public class Flight {
    private final Long id;
    private final Airline airline;
    private final String origin;
    private final String destination;
    private final int seats;
    private final int price;
    private final int reservations;
    private final boolean isFull;

    public Flight(Long id, Airline airline, String origin, String destination, int seats, int price, int reservations, boolean isFull) {
        this.id = id;
        this.airline = airline;
        this.origin = origin;
        this.destination = destination;
        this.seats = seats;
        this.price = price;
        this.reservations = reservations;
        this.isFull = isFull;
    }

    public Long getId() {
        return id;
    }

    public Airline getAirline() {
        return airline;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public int getSeats() {
        return seats;
    }

    public int getPrice() {
        return price;
    }

    public int getReservations() {
        return reservations;
    }

    public boolean isFull() {
        return isFull;
    }
}
