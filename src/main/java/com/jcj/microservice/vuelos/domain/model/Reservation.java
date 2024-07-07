package com.jcj.microservice.vuelos.domain.model;

public class Reservation {
    private final Long id;
    private final Long idFlight;

    private final int people;
    private final int netValue;
    private final boolean isActive;

    public Long getIdFlight() {
        return idFlight;
    }

    public Reservation(Long id, Long idFlight, int people, int netValue, boolean isActive) {
        this.id = id;
        this.idFlight = idFlight;
        this.people = people;
        this.netValue = netValue;
        this.isActive = isActive;
    }




    public Long getId() {
        return id;
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
