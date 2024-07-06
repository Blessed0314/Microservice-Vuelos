package com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.adapter;

import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.mapper.IFlightEntityMapper;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.repository.IFlightRepository;
import com.jcj.microservice.vuelos.domain.model.Flight;
import com.jcj.microservice.vuelos.domain.spi.IFlightPersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class FlightAdapter implements IFlightPersistencePort {

    private final IFlightRepository flightRepository;

    private final IFlightEntityMapper flightEntityMapper;


    @Override
    public void addFlight(Flight flight) {

        flightRepository.save(flightEntityMapper.toEntity(flight));



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
