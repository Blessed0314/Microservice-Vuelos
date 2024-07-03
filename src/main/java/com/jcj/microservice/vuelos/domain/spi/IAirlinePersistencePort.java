package com.jcj.microservice.vuelos.domain.spi;

import com.jcj.microservice.vuelos.domain.model.Airline;

import java.util.List;

public interface IAirlinePersistencePort {
    void addAirline(Airline airline);
    Airline getAirline(Long airlineId);
    List<Airline> getAirlines();
}
