package com.jcj.microservice.vuelos.adapters.driving.http.controller;

import com.jcj.microservice.vuelos.adapters.driving.http.dto.request.AddAirlineRequest;
import com.jcj.microservice.vuelos.adapters.driving.http.mapper.IAirlineRequestMapper;
import com.jcj.microservice.vuelos.domain.api.IAirlineServicePort;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/airline")
@RequiredArgsConstructor
public class AirlineRequestController {

    private final IAirlineServicePort airlineServicePort;

    private final IAirlineRequestMapper airlineRequestMapper;

    @PostMapping("/")
    public ResponseEntity<Void> addAirline(@Valid @RequestBody AddAirlineRequest request){
        airlineServicePort.addAirline(airlineRequestMapper.addRequestToAirline(request));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
