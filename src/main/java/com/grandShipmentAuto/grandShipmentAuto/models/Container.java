package com.grandShipmentAuto.grandShipmentAuto.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "containers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Container {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "contains")
    private String contains;

    @Column(name = "weight")
    private long weight;

    @ManyToOne
    @JoinColumn(name = "hazard_id", referencedColumnName = "id")
    private HazardType hazardType;

}
