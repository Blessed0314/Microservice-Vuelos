package com.jcj.microservice.vuelos.adapters.driving.http.mapper;

import com.jcj.microservice.vuelos.adapters.driving.http.dto.response.AirlineResponse;
import com.jcj.microservice.vuelos.domain.model.Airline;
import org.mapstruct.Mapper;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
@Mapper(componentModel = "spring")
public interface IAirlineResponseMapper {

    List<AirlineResponse> toAirlineResponseList(List<Airline> airlines);
}
