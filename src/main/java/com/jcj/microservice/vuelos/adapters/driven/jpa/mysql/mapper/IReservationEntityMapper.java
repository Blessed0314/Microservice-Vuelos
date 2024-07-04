package com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.mapper;

import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.entity.ReservationEntity;
import com.jcj.microservice.vuelos.domain.model.Reservation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IReservationEntityMapper {
    ReservationEntity toEntity(Reservation reservation);
    Reservation toModel(ReservationEntity entity);
}
