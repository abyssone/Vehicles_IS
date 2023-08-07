package com.example.Transport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleController {
    @GetMapping("/")
    public String homepage() {
        return "homepage";
    }
}
