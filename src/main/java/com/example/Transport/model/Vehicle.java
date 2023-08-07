package com.example.Transport.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vehicles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String make;
    private String model;
    private String category;
    private String licensePlate;
    private String type;
    private int yearOfManufacture;
    private boolean hasTrailer;

    public boolean getHasTrailer() {
        return this.hasTrailer;
    }
}
