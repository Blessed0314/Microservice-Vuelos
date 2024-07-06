package com.jcj.microservice.vuelos.adapters.driving.http.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AddAirlineRequest {


    private final String nit;
    private final String name;
    private final String phone;
    private final int fleetSize;

}
