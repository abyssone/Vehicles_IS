package com.example.Transport.controller;

import com.example.Transport.model.Vehicle;
import com.example.Transport.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class VehicleController {
    private final VehicleService vehicleService;
    @GetMapping("/")
    public String homePage(Vehicle vehicle, Model model) {
        model.addAttribute("vehicles", vehicleService.getVehicles());
        return "homepage";
    }

    @GetMapping("vehicle/add")
    public String createVehicle() {
        return "add-vehicle";
    }

    @PostMapping("vehicle/add")
    public String addVehicle(Vehicle vehicle) {
        vehicleService.add(vehicle);
        return "redirect:/";
    }

    @GetMapping("vehicle/info/{id}")
    public String vehicleInfo(@PathVariable(value = "id") Long id, Model model) {
        model.addAttribute("vehicle", vehicleService.getVehicleById(id));
        return "vehicle-info";
    }

    @PostMapping("change/{id}")
    public String vehicleChange(@PathVariable(value = "id") Long id, Vehicle vehicle) {
        vehicleService.update(id, vehicle);
        return "redirect:/";
    }
}
