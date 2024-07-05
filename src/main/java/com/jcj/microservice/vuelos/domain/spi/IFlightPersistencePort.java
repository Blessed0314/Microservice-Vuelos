package com.jcj.microservice.vuelos.domain.spi;

import com.jcj.microservice.vuelos.domain.model.Flight;

import java.util.List;

public interface IFlightPersistencePort {
    void addFlight (Flight flight);
    Flight getFlight(Long flightId);
    List<Flight> getFlights();
}
