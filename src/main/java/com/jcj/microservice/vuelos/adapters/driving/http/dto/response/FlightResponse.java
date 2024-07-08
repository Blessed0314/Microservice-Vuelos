package com.jcj.microservice.vuelos.adapters.driving.http.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class FlightResponse {
    private final Long id;
    private final Long idAirline;


    private final String origin;
    private final String destination;
    private final int seats;
    private final int price;
    private final int reservations;
    private final boolean isFull;
}
