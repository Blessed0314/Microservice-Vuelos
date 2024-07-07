package com.jcj.microservice.vuelos.adapters.driving.http.mapper;

import com.jcj.microservice.vuelos.adapters.driving.http.dto.request.AddReservationRequest;
import com.jcj.microservice.vuelos.domain.model.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IReservationRequestMapper {
    @Mapping(target = "id", ignore = true)
    Reservation addRequestToReservation(AddReservationRequest reservationRequest);
}
