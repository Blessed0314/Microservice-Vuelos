package com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.mapper;

import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.entity.AirlineEntity;
import com.jcj.microservice.vuelos.domain.model.Airline;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IAirlineEntityMapper {
    AirlineEntity toEntity(Airline airline);
    Airline toModel(AirlineEntity entity);
    List<Airline> toModelList(List<AirlineEntity> airlineEntities);
}
