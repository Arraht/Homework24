package com.example.calculator.controller;

import com.example.calculator.interfaces.WelcomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    private final WelcomeService welcomeService;

    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }
    @GetMapping(path = "/calculator")
    public String welcome() {
        return welcomeService.welcome();
    }
}