package com.grandShipmentAuto.grandShipmentAuto.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Container {
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "contains")
    private String contains;

    @Column(name = "weight")
    private long weight;
}
