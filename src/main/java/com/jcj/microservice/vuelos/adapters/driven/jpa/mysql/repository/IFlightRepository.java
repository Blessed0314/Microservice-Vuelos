package com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.repository;

import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.entity.FlightEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface IFlightRepository extends JpaRepository<FlightEntity, Long> {
    //@Query("SELECT f FROM FlightEntity f WHERE TRIM(LOWER(f.name)) = TRIM(LOWER(:name))")
    //Optional<FlightEntity> findByNameIgnoreCaseAndTrim(@Param("name") String name);

    Optional<FlightEntity> findById(Long id);


}
