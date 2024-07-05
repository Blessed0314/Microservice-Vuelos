package com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.mapper;

import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.entity.FlightEntity;
import com.jcj.microservice.vuelos.domain.model.Flight;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IFlightEntityMapper {
    FlightEntity toEntity(Flight flight);
    Flight toModel(FlightEntity entity);
    List<Flight> toModelList(List<FlightEntity> flightEntities);
}
