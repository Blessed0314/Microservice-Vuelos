package com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.repository;

import com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.entity.AirlineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface IAirlineRepository extends JpaRepository<AirlineEntity, Long> {
    @Query("SELECT a FROM AirlineEntity a WHERE TRIM(LOWER(a.name)) = TRIM(LOWER(:name))")
    Optional<AirlineEntity> findByNameIgnoreCaseAndTrim(@Param("name") String name);
}
