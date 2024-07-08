package com.jcj.microservice.vuelos.adapters.driving.http.mapper;

import com.jcj.microservice.vuelos.adapters.driving.http.dto.response.FlightResponse;
import com.jcj.microservice.vuelos.domain.model.Flight;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IFlightResponseMapper {

    List<FlightResponse> toFlightResponseList(List<Flight> flights);
}
