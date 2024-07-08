package com.jcj.microservice.vuelos.configuration;

import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.adapter.AirlineAdapter;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.adapter.FlightAdapter;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.adapter.ReservationAdapter;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.mapper.IAirlineEntityMapper;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.mapper.IFlightEntityMapper;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.mapper.IReservationEntityMapper;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.repository.IAirlineRepository;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.repository.IFlightRepository;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.repository.IReservationRepository;
import com.jcj.microservice.vuelos.domain.api.IAirlineServicePort;
import com.jcj.microservice.vuelos.domain.api.IFlightServicePort;
import com.jcj.microservice.vuelos.domain.api.IReservationServicePort;
import com.jcj.microservice.vuelos.domain.api.usecase.AirlineUseCase;
import com.jcj.microservice.vuelos.domain.api.usecase.FlightUseCase;
import com.jcj.microservice.vuelos.domain.api.usecase.ReservationUseCase;
import com.jcj.microservice.vuelos.domain.spi.IAirlinePersistencePort;
import com.jcj.microservice.vuelos.domain.spi.IFlightPersistencePort;
import com.jcj.microservice.vuelos.domain.spi.IReservationPersistencePort;
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

    private final IReservationRepository reservationRepository;

    private final IReservationEntityMapper reservationEntityMapper;


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
        return new FlightAdapter(flightRepository,flightEntityMapper,airlineRepository);
    }

    @Bean
    public IFlightServicePort flightServicePort(){
        return new FlightUseCase(flightPersistencePort());
    }


    @Bean
    public IReservationPersistencePort reservationsPersistencePort() {
        return new ReservationAdapter(reservationRepository, reservationEntityMapper, flightRepository);
    }

    @Bean
    public IReservationServicePort reservationServicePort(){
        return new ReservationUseCase(reservationsPersistencePort());
    }
}
