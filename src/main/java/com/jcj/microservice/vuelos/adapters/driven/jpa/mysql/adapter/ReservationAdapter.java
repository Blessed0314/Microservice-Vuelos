package com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.adapter;

import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.entity.FlightEntity;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.entity.ReservationEntity;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.mapper.IReservationEntityMapper;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.repository.IFlightRepository;
import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.repository.IReservationRepository;
import com.jcj.microservice.vuelos.domain.model.Reservation;
import com.jcj.microservice.vuelos.domain.spi.IReservationPersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ReservationAdapter implements IReservationPersistencePort {

    private final IReservationRepository reservationRepository;

    private final IReservationEntityMapper reservationEntityMapper;

    private final IFlightRepository flightRepository;
    @Override
    public Long createReservation(Reservation reservation) {
        FlightEntity flightEntity = flightRepository.findById(reservation.getIdFlight()).get();

        ReservationEntity reservationEntity = reservationRepository.save(reservationEntityMapper.toEntity(reservation));

        reservationEntity.setFlight(flightEntity);

        return reservationEntityMapper.toModel(reservationRepository.save(reservationEntity)).getId();
    }
    @Override
    public Reservation getReservation(Long reservationId) {
        return null;
    }

    @Override
    public void deleteReservation(Long reservationId) {

    }
}
