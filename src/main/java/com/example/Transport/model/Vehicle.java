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
    private Type type;
    private int yearOfManufacture;
    private boolean hasTrailer;

    public enum Type {
        CAR ("Легковой автомобиль"),
        TRUCK ("Грузовой автомобиль"),
        BUS ("Автобус"),
        MOTORBIKE ("Мотоцикл"),
        MOPED ("Мопед");
        private String name;
        Type(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
    }
    public boolean getHasTrailer() {
        return this.hasTrailer;
    }
}
