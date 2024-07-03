package com.jcj.microservice.vuelos.domain.api;

import com.jcj.microservice.vuelos.domain.model.Airline;

import java.util.List;

public interface IAirlineServicePort {
    void addAirline(Airline airline);
    Airline getAirline(Long airlineId);
    List<Airline> getAirlines();
}
