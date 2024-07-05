package com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "airline")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AirlineEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nit;
    private String name;
    private String phone;
    private int fleetSize;

}
