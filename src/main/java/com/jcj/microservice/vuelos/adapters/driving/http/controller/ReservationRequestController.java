package com.jcj.microservice.vuelos.adapters.driving.http.controller;

import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.entity.ReservationEntity;
import com.jcj.microservice.vuelos.adapters.driving.http.dto.request.AddReservationRequest;
import com.jcj.microservice.vuelos.adapters.driving.http.mapper.IReservationRequestMapper;
import com.jcj.microservice.vuelos.domain.api.IReservationServicePort;
import com.jcj.microservice.vuelos.domain.model.Reservation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservation")
@RequiredArgsConstructor
public class ReservationRequestController {

    private final IReservationServicePort reservationServicePort;

    private final IReservationRequestMapper reservationRequestMapper;

    @PostMapping("/")
    public Long addReservation(@RequestBody AddReservationRequest request){
        return  reservationServicePort.createReservation(reservationRequestMapper.addRequestToReservation(request));
    }

}
