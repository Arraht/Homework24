package com.example.calculator.controller;

import com.example.calculator.interfaces.CalculateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculateController {
    private final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping(path = "/plus")
    public int calculatePlus(@RequestParam("num1") int num1,
                             @RequestParam("num2") int num2) {
        return calculateService.calculatePlus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public int calculateMinus(@RequestParam("num1") int num1,
                              @RequestParam("num2") int num2) {
        return calculateService.calculateMinus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public int calculateMultiply(@RequestParam("num1") int num1,
                                 @RequestParam("num2") int num2) {
        return calculateService.calculateMultiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public float calculateDivide(@RequestParam("num1") int num1,
                                 @RequestParam("num2") int num2) {
        return calculateService.calculateDivide(num1, num2);
    }
}