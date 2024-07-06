package com.jcj.microservice.vuelos.configuration;

import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.adapter.AirlineAdapter;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.adapter.FlightAdapter;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.mapper.IAirlineEntityMapper;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.mapper.IFlightEntityMapper;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.repository.IAirlineRepository;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.repository.IFlightRepository;
import com.jcj.microservice.vuelos.domain.api.IAirlineServicePort;
import com.jcj.microservice.vuelos.domain.api.IFlightServicePort;
import com.jcj.microservice.vuelos.domain.api.usecase.AirlineUseCase;
import com.jcj.microservice.vuelos.domain.api.usecase.FlightUseCase;
import com.jcj.microservice.vuelos.domain.spi.IAirlinePersistencePort;
import com.jcj.microservice.vuelos.domain.spi.IFlightPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final IAirlineEntityMapper airlineEntityMapper;

    private final IAirlineRepository airlineRepository;

    private final IFlightRepository flightRepository;

    private final IFlightEntityMapper flightEntityMapper;


    @Bean
    public IAirlinePersistencePort airlinePersistencePort(){
        return new AirlineAdapter(airlineRepository,airlineEntityMapper);
    }

    @Bean
    public IAirlineServicePort airlineServicePort(){
        return new AirlineUseCase(airlinePersistencePort());
    }

    @Bean
    public IFlightPersistencePort flightPersistencePort(){
        return new FlightAdapter(flightRepository,flightEntityMapper);
    }

    @Bean
    public IFlightServicePort flightServicePort(){
        return new FlightUseCase(flightPersistencePort());
    }
}
