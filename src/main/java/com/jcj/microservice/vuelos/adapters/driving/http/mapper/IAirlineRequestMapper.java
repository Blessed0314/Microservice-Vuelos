package com.jcj.microservice.vuelos.adapters.driving.http.mapper;

import com.jcj.microservice.vuelos.adapters.driving.http.dto.request.AddAirlineRequest;
import com.jcj.microservice.vuelos.domain.model.Airline;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IAirlineRequestMapper {

    @Mapping(target = "id", ignore = true)
    Airline addRequestToAirline(AddAirlineRequest airlineRequest);
}
