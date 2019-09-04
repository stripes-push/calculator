package com.codecool.springcalculator.service;

import com.codecool.springcalculator.mode.Calculator;

public class MultiplicationService implements Calculable {
    @Override
    public double calculate(Calculator calc) {
        return calc.getNumber1() * calc.getNumber2();
    }
}
