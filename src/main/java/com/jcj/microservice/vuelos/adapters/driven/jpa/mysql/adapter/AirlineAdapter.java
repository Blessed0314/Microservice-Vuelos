package com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.adapter;

import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.entity.AirlineEntity;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.mapper.IAirlineEntityMapper;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.repository.IAirlineRepository;
import com.jcj.microservice.vuelos.domain.model.Airline;
import com.jcj.microservice.vuelos.domain.spi.IAirlinePersistencePort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class AirlineAdapter implements IAirlinePersistencePort {
    private final IAirlineRepository airlineRepository;

    private final IAirlineEntityMapper airlineEntityMapper;


    @Override
    public void addAirline(Airline airline) {

        AirlineEntity airlineEntity = airlineEntityMapper.toEntity(airline);
        airlineRepository.save(airlineEntity);

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
