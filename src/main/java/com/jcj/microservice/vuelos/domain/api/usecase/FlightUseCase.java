package com.jcj.microservice.vuelos.domain.api.usecase;

import com.jcj.microservice.vuelos.domain.api.IFlightServicePort;
import com.jcj.microservice.vuelos.domain.model.Flight;
import com.jcj.microservice.vuelos.domain.spi.IFlightPersistencePort;

import java.util.List;

public class FlightUseCase implements IFlightServicePort {

    private final IFlightPersistencePort flightPersistencePort;

    public FlightUseCase(IFlightPersistencePort flightPersistencePort) {
        this.flightPersistencePort = flightPersistencePort;
    }

    @Override
    public void addFlight(Flight flight) {
        flightPersistencePort.addFlight(flight);
    }

    @Override
    public Flight getFlight(Long flightId) {
        return flightPersistencePort.getFlight(flightId);
    }

    @Override
    public List<Flight> getFlights() {
        return flightPersistencePort.getFlights();
    }
}
