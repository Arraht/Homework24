package com.example.calculator.service;

import com.example.calculator.interfaces.CalculateService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateServiceImplParamsTest {
    private final CalculateService calculateService = new CalculateServiceImpl();

    @ParameterizedTest
    @MethodSource("dataSourcePlusTest")
    public void calculatePlusTest(int num1, int num2, int expected) {
        assertEquals(expected, calculateService.calculatePlus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("dataSourceMinusTest")
    public void calculateMinusTest(int num1, int num2, int expected) {
        assertEquals(expected, calculateService.calculateMinus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("dataSourceMultiplyTest")
    public void calculateMultiplyTest(int num1, int num2, int expected) {
        assertEquals(expected, calculateService.calculateMultiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("dataSourceDivideTest")
    public void calculateDivideTest(float num1, float num2, float expected) {
        assertEquals(expected, calculateService.calculateDivide(num1, num2));
    }

    private static Stream<Arguments> dataSourcePlusTest() {
        return Stream.of(
                Arguments.of(2, 2, 4),
                Arguments.of(10, 5, 15),
                Arguments.of(20, 40, 60));
    }

    private static Stream<Arguments> dataSourceMinusTest() {
        return Stream.of(
                Arguments.of(10, 5, 5),
                Arguments.of(19, 5, 14),
                Arguments.of(150, 25, 125)
        );
    }

    private static Stream<Arguments> dataSourceMultiplyTest() {
        return Stream.of(
                Arguments.of(5, 5, 25),
                Arguments.of(20, 2, 40),
                Arguments.of(3, 30, 90)
        );
    }

    private static Stream<Arguments> dataSourceDivideTest() {
        return Stream.of(
                Arguments.of(10, 5, 2),
                Arguments.of(15, 5, 3),
                Arguments.of(40, 4, 10)
        );
    }
}