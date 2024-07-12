package com.jcj.microservice.vuelos.adapters.driving.http.controller;

import com.jcj.microservice.vuelos.adapters.driving.http.dto.request.AddFlightRequest;
import com.jcj.microservice.vuelos.adapters.driving.http.dto.response.FlightResponse;
import com.jcj.microservice.vuelos.adapters.driving.http.mapper.IFlightRequestMapper;
import com.jcj.microservice.vuelos.adapters.driving.http.mapper.IFlightResponseMapper;
import com.jcj.microservice.vuelos.domain.api.IFlightServicePort;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flight")
@RequiredArgsConstructor
@CrossOrigin
public class FlightRequestController {

    private final IFlightServicePort flightServicePort;

    private final IFlightRequestMapper flightRequestMapper;

    private final IFlightResponseMapper flightResponseMapper;

    @PostMapping("/")
    public ResponseEntity<Void> addFlight(@Valid @RequestBody AddFlightRequest request){
        flightServicePort.addFlight(flightRequestMapper.addRequestToFlight(request));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/")
    public ResponseEntity<List<FlightResponse>> getFlights(){
        return ResponseEntity.ok(flightResponseMapper.toFlightResponseList(flightServicePort.getFlights()));
    }

}
