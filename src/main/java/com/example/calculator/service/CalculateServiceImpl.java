package com.example.calculator.service;

import com.example.calculator.exceptions.DivideException;
import com.example.calculator.interfaces.CalculateService;
import org.springframework.stereotype.Service;

@Service
public class CalculateServiceImpl implements CalculateService {
    @Override
    public int calculatePlus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int calculateMinus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int calculateMultiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public float calculateDivide(float num1, float num2) {
        if (num2 == 0) {
            throw new DivideException();
        }
        return num1 / num2;
    }
}