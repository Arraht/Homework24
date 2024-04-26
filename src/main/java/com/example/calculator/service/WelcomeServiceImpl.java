package com.example.calculator.service;

import com.example.calculator.interfaces.WelcomeService;
import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService {
    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }
}