package com.jcj.microservice.vuelos.domain.spi;

import com.jcj.microservice.vuelos.domain.model.Reservation;

public interface IReservationPersistencePort {
    Long createReservation(Reservation reservation);
    Reservation getReservation(Long reservationId);
    void deleteReservation(Long reservationId);
}
