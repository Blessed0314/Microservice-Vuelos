package com.jcj.microservice.vuelos.adapters.driving.http.mapper;


import com.jcj.microservice.vuelos.adapters.driving.http.dto.request.AddFlightRequest;
import com.jcj.microservice.vuelos.domain.model.Flight;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IFlightRequestMapper {
     @Mapping(target = "id", ignore = true)
     Flight addRequestToFlight(AddFlightRequest flightRequest);
}
