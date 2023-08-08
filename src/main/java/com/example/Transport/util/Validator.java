package com.example.Transport.util;

import com.example.Transport.model.Vehicle;

public class Validator {

    public static boolean isValidVehicle(Vehicle vehicle) {
        if(vehicle != null &&
        vehicle.getMake() != null && vehicle.getMake() != "" &&
        vehicle.getModel() != null && vehicle.getModel() != "" &&
        vehicle.getCategory() != null && vehicle.getCategory() != "" &&
        vehicle.getLicensePlate() != null && vehicle.getLicensePlate() != "" &&
                //TODO: correct validation of type
        vehicle.getType() != null && //vehicle.getType() != "" &&
        vehicle.getYearOfManufacture() != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean compareStrings(String orig, String param) {
        if(param != null && param != ""){
            if(!orig.equals(param)) return false;
        }
        return true;
    }
}
