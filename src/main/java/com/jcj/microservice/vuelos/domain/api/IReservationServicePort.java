package com.jcj.microservice.vuelos.domain.api;

import com.jcj.microservice.vuelos.domain.model.Reservation;

public interface IReservationServicePort {
    Long createReservation(Reservation reservation);
    Reservation getReservation(Long reservationId);
    void deleteReservation(Long reservationId);
}
