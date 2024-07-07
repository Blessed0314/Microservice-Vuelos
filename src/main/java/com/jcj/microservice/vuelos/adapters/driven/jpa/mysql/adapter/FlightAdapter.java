package com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.adapter;

import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.entity.AirlineEntity;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.entity.FlightEntity;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.mapper.IFlightEntityMapper;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.repository.IAirlineRepository;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.repository.IFlightRepository;
import com.jcj.microservice.vuelos.domain.model.Flight;
import com.jcj.microservice.vuelos.domain.spi.IFlightPersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class FlightAdapter implements IFlightPersistencePort {

    private final IFlightRepository flightRepository;

    private final IFlightEntityMapper flightEntityMapper;

    private final IAirlineRepository airlineRepository;


    @Override
    public void addFlight(Flight flight) {

        Optional<AirlineEntity> airlineEntity = airlineRepository.findById(flight.getIdAirline());

        FlightEntity flightEntity =  flightRepository.save(flightEntityMapper.toEntity(flight));

        flightEntity.setAirline(airlineEntity.get());

        flightRepository.save(flightEntity);



    }

    @Override
    public Flight getFlight(Long flightId) {
        return null;
    }

    @Override
    public List<Flight> getFlights() {

        return flightEntityMapper.toModelList(flightRepository.findAll());
    }
}
