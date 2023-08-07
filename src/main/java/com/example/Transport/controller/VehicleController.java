package com.example.Transport.controller;

import com.example.Transport.service.VehicleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class VehicleController {
    private final VehicleService vehicleService;
    @GetMapping("/")
    public String homepage(Model model) {
        model.addAttribute("vehicles", vehicleService.getVehicles());
        return "homepage";
    }
}
