package com.jcj.microservice.vuelos.adapters.driving.http.dto.request;

import com.jcj.microservice.vuelos.domain.model.Airline;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AddFlightRequest {

    private final Long id;
    private final Long idAirline;
    private final String origin;
    private final String destination;
    private final int seats;
    private final int price;
    private final int reservations;
    private final boolean isFull;

}
