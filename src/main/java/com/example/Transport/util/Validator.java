package com.example.Transport.util;

import com.example.Transport.model.Vehicle;

public class Validator {
    public static boolean isValidVehicle(Vehicle vehicle) {
        if(vehicle != null &&
        vehicle.getMake() != null && vehicle.getMake() != "" &&
        vehicle.getModel() != null && vehicle.getModel() != "" &&
        vehicle.getCategory() != null && vehicle.getCategory() != "" &&
        vehicle.getLicensePlate() != null && vehicle.getLicensePlate() != "" &&
        vehicle.getType() != null && vehicle.getType() != "" &&
        vehicle.getYearOfManufacture() != 0) {
            return true;
        } else {
            return false;
        }
    }
}
