package com.jcj.microservice.vuelos.domain.api.usecase;

import com.jcj.microservice.vuelos.domain.api.IReservationServicePort;
import com.jcj.microservice.vuelos.domain.model.Reservation;
import com.jcj.microservice.vuelos.domain.spi.IReservationPersistencePort;

public class ReservationUseCase implements IReservationServicePort {

    private final IReservationPersistencePort reservationPersistencePort;

    public ReservationUseCase(IReservationPersistencePort reservationPersistencePort) {
        this.reservationPersistencePort = reservationPersistencePort;
    }

    @Override
    public Long createReservation(Reservation reservation) {
        return reservationPersistencePort.createReservation(reservation);
    }

    @Override
    public Reservation getReservation(Long reservationId) {
        return reservationPersistencePort.getReservation(reservationId);
    }

    @Override
    public void deleteReservation(Long reservationId) {
        reservationPersistencePort.deleteReservation(reservationId);
    }


    @Override
    public Object bringFlight(Long reservationId) {
        return reservationPersistencePort.bringFlight(reservationId);
    }

}
