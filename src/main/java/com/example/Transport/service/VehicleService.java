package com.example.Transport.service;

import com.example.Transport.model.Vehicle;
import com.example.Transport.repository.VehicleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VehicleService {
    private final VehicleRepository vehicleRepository;
    public List<Vehicle> getVehicles() {
        return vehicleRepository.findAll();
    }
}
