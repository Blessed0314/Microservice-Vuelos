package com.jcj.microservice.vuelos.domain.model;

public class Airline {
    private final Long id;
    private final String nit;
    private final String name;
    private final String phone;
    private final int fleetSize;

    public Airline(Long id, String nit, String name, String phone, int fleetSize) {
        this.id = id;
        this.nit = nit;
        this.name = name;
        this.phone = phone;
        this.fleetSize = fleetSize;
    }

    public Long getId() {
        return id;
    }

    public String getNit() {
        return nit;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getFleetSize() {
        return fleetSize;
    }
}
