package com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.adapter;

import com.jcj.microservice.vuelos.domain.model.Flight;
import com.jcj.microservice.vuelos.domain.spi.IFlightPersistencePort;

import java.util.List;

public class FlightAdapter implements IFlightPersistencePort {
    @Override
    public void addFlight(Flight flight) {

    }

    @Override
    public Flight getFlight(Long flightId) {
        return null;
    }

    @Override
    public List<Flight> getFlights() {
        return List.of();
    }
}
