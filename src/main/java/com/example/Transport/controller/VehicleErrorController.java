package com.example.Transport.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VehicleErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError(Model model, HttpServletRequest request) {
        model.addAttribute("statusCode",
                request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE));
        model.addAttribute("exception",
                request.getAttribute(RequestDispatcher.ERROR_EXCEPTION));
        model.addAttribute("message",
                request.getAttribute(RequestDispatcher.ERROR_MESSAGE));
        return "error";
    }
}
