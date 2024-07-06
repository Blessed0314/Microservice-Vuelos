package com.jcj.microservice.vuelos.adapters.driving.http.controller;

import com.jcj.microservice.vuelos.adapters.driving.http.dto.request.AddFlightRequest;
import com.jcj.microservice.vuelos.adapters.driving.http.mapper.IFlightRequestMapper;
import com.jcj.microservice.vuelos.domain.api.IFlightServicePort;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flight")
@RequiredArgsConstructor
public class FlightRequestController {

    private final IFlightServicePort flightServicePort;

    private final IFlightRequestMapper flightRequestMapper;

    @PostMapping("/")
    public ResponseEntity<Void> addFlight(@Valid @RequestBody AddFlightRequest request){
        flightServicePort.addFlight(flightRequestMapper.addRequestToFlight(request));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
