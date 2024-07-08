package com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.repository;

import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.entity.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IReservationRepository extends JpaRepository<ReservationEntity, Long> {
}
