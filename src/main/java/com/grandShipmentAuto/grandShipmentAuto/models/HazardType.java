package com.grandShipmentAuto.grandShipmentAuto.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "hazard_types")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HazardType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id ")
    private long id;

    @Column(name = "type ")
    private String type;
}
