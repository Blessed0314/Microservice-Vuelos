package com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.adapter;

import com.jcj.microservice.vuelos.domain.model.Airline;
import com.jcj.microservice.vuelos.domain.spi.IAirlinePersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class AirlineAdapter implements IAirlinePersistencePort {

    @Override
    public void addAirline(Airline airline) {

    }

    @Override
    public Airline getAirline(Long airlineId) {
        return null;
    }

    @Override
    public List<Airline> getAirlines() {
        return List.of();
    }
}
