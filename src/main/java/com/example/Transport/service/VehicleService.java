package com.example.Transport.service;

import com.example.Transport.model.Vehicle;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class VehicleService {
    public List<Vehicle> getVehicles() {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle(1L, "make", "model", "cat", "lp", "type", 2010, false));
        return list;
    }
}
