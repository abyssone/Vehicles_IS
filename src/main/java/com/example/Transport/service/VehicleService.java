package com.example.Transport.service;

import com.example.Transport.model.Vehicle;
import com.example.Transport.repository.VehicleRepository;
import com.example.Transport.util.Validator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VehicleService {
    private final VehicleRepository vehicleRepository;
    public List<Vehicle> getVehicles() {
        return vehicleRepository.findAll();
    }

    //TODO: implement method to search vehicles by parameters using sql queries

    //This non-optimized method is used because @Query does't recognize input params.
    public List<Vehicle> getVehiclesByParams(Vehicle vehParams) {
        List<Vehicle> allVeh = vehicleRepository.findAll();
        List<Vehicle> filteredVeh;
        filteredVeh = allVeh.stream()
                .filter(veh -> compareVehicles(veh, vehParams))
                .collect(Collectors.toList());
        return filteredVeh;
    }
    public Vehicle getVehicleById(Long id) {
        return vehicleRepository.getById(id);
    }

    public void add(Vehicle vehicle) {
        if(!Validator.isValidVehicle(vehicle))
            throw new IllegalArgumentException("Invalid vehicle obj: " + vehicle);
        vehicleRepository.save(vehicle);
    }

    public void update(Long id, Vehicle vehicle) {
        vehicle.setId(id);
        vehicleRepository.save(vehicle);
    }

    private boolean compareVehicles(Vehicle orig, Vehicle param) {
        if(Validator.compareStrings(orig.getMake(), param.getMake()) &&
                Validator.compareStrings(orig.getModel(), param.getModel()) &&
                Validator.compareStrings(orig.getCategory(), param.getCategory()) &&
                Validator.compareStrings(orig.getLicensePlate(), param.getLicensePlate()) &&
                (param.getType() == null || param.getType() == orig.getType()) &&
                (param.getYearOfManufacture() == 0 || param.getYearOfManufacture() == orig.getYearOfManufacture())) {
            return true;
            } else {
            return false;
        }
    }
}
