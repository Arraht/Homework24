package com.example.calculator.service;

import com.example.calculator.exceptions.DivideException;
import com.example.calculator.interfaces.CalculateService;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculateServiceImplTest {
    private final CalculateService calculateService = new CalculateServiceImpl();

    @Test
    public void calculatePlusTest() {
        assertEquals(4, calculateService.calculatePlus(2, 2));
        assertEquals(15, calculateService.calculatePlus(10, 5));
    }

    @Test
    public void calculateMinusTest() {
        assertEquals(15, calculateService.calculateMinus(20, 5));
        assertEquals(20, calculateService.calculateMinus(50, 30));
    }

    @Test
    public void calculateMultiplyTest() {
        assertEquals(25, calculateService.calculateMultiply(5, 5));
        assertEquals(8, calculateService.calculateMultiply(2, 4));
    }

    @Test
    public void calculateDivideTest() {
        assertEquals(5.0, calculateService.calculateDivide(10, 2));
        assertEquals(3, calculateService.calculateDivide(30, 10));
    }

    @Test
    public void calculateDivideExceptionTest() {
        assertThrows(DivideException.class, () -> calculateService.calculateDivide(1, 0));
    }
}