package com.jcj.microservice.vuelos.adapters.driving.http.dto.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AirlineResponse {

    private final Long id;
    private final String nit;
    private final String name;
    private final String phone;
    private final int fleetSize;
}
