package com.jcj.microservice.vuelos.domain.api;

import com.jcj.microservice.vuelos.domain.model.Flight;

import java.util.List;

public interface IFlightServicePort {
    void addFlight (Flight flight);
    Flight getFlight(Long flightId);
    List<Flight> getFlights();
}
