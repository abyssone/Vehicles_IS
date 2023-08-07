package com.example.Transport.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
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
