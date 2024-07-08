package com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "flight")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FlightEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String origin;
        private String destination;
        private int seats;
        private int price;
        private int reservations = 0;
        private boolean isFull;

        @ManyToOne
        @JoinColumn(name = "airline_id")
        private AirlineEntity airline;

        @PrePersist
        @PreUpdate
        private void updateIsFull() {
            this.isFull = this.seats == this.reservations;
        }
}
