package com.codecool.springcalculator.factory;

import com.codecool.springcalculator.service.AdditionService;
import com.codecool.springcalculator.service.Calculable;
import com.codecool.springcalculator.service.DivisionService;
import com.codecool.springcalculator.service.MultiplicationService;
import com.codecool.springcalculator.service.SubtractionService;
import org.springframework.stereotype.Component;

@Component
public class CalculationFactory {

    public static Calculable getCalcService(String operation) {
        switch (operation) {
            case "+":
                return new AdditionService();
            case "-":
                return new SubtractionService();
            case "/":
                return new DivisionService();
            case "*":
                return new MultiplicationService();
            default:
                throw new IllegalArgumentException("No operation specified");
        }
    }
}
