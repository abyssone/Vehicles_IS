package com.example.Transport.service;

import com.example.Transport.model.Vehicle;
import com.example.Transport.repository.VehicleRepository;
import com.example.Transport.util.Validator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehicleService {
    private final VehicleRepository vehicleRepository;
    public List<Vehicle> getVehicles() {
        return vehicleRepository.findAll();
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
}
