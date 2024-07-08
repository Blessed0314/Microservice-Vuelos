package com.jcj.microservice.vuelos.adapters.driven.jpa.mysql.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "reservation")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "flight_id", referencedColumnName = "id")
    private FlightEntity flight;

    private int people;
    private int netValue;
    private boolean isActive = true;

    @PrePersist
    @PreUpdate
    private void calculateNetValue() {
        if (this.flight != null && this.flight.getPrice() > 0) {
            this.netValue = this.people * this.flight.getPrice();
        } else {
            this.netValue = 0;
        }
    }
}
