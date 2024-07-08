package com.jcj.microservice.vuelos.adapters.driving.http.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AddReservationRequest {
    private final Long idFlight;

    private final int people;
    private final int netValue;
    private final boolean isActive;
}
