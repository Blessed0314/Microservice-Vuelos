package com.jcj.microservice.vuelos.domain.api.usecase;

import com.jcj.microservice.vuelos.domain.api.IAirlineServicePort;
import com.jcj.microservice.vuelos.domain.model.Airline;
import com.jcj.microservice.vuelos.domain.spi.IAirlinePersistencePort;

import java.util.List;

public class AirlineUseCase implements IAirlineServicePort {

    private final IAirlinePersistencePort airlinePersistencePort;

    public AirlineUseCase(IAirlinePersistencePort airlinePersistencePort) {
        this.airlinePersistencePort = airlinePersistencePort;
    }

    @Override
    public void addAirline(Airline airline) {
        airlinePersistencePort.addAirline(airline);
    }

    @Override
    public Airline getAirline(Long airlineId) {
        return airlinePersistencePort.getAirline(airlineId);
    }

    @Override
    public List<Airline> getAirlines() {
        return airlinePersistencePort.getAirlines();
    }
}
