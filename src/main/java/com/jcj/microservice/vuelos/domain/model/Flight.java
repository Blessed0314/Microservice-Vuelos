package com.jcj.microservice.vuelos.domain.model;

public class Flight {
    private final Long id;
    private final Long idAirline;


    private final String origin;
    private final String destination;
    private final int seats;
    private final int price;
    private final int reservations;
    private final boolean isFull;

    public Long getIdAirline() {
        return idAirline;
    }

    public Flight(Long id, Long idAirline, String origin, String destination, int seats, int price, int reservations, boolean isFull) {
        this.id = id;
        this.idAirline = idAirline;
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
