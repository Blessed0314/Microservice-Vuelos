package com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.adapter;

import com.jcj.microservice.vuelos.domain.model.Reservation;
import com.jcj.microservice.vuelos.domain.spi.IReservationPersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ReservationAdapter implements IReservationPersistencePort {
    @Override
    public Reservation createReservation(Reservation reservation) {
        return null;
    }

    @Override
    public Reservation getReservation(Long reservationId) {
        return null;
    }

    @Override
    public void deleteReservation(Long reservationId) {

    }
}
