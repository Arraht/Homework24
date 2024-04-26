package com.example.calculator.controller;

import com.example.calculator.interfaces.WelcomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeControllerImpl {
    private final WelcomeService welcomeService;

    public WelcomeControllerImpl(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }
    @GetMapping(path = "/calculator")
    public String welcome() {
        return welcomeService.welcome();
    }
}