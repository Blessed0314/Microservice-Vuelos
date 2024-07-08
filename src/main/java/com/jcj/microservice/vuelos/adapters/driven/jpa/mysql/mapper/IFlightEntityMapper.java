package com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.mapper;

import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.entity.FlightEntity;
import com.jcj.microservice.vuelos.domain.model.Flight;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IFlightEntityMapper {
    FlightEntity toEntity(Flight flight);

    @Mapping(target = "idAirline", source = "airline.id")
    Flight toModel(FlightEntity entity);

    @Mapping(target = "idAirline", source = "airline")
    List<Flight> toModelList(List<FlightEntity> flightEntities);
}
