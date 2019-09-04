package com.codecool.springcalculator.service;

import com.codecool.springcalculator.mode.Calculator;

public class DivisionService implements Calculable{
    @Override
    public double calculate(Calculator calc) {
        if(calc.getNumber2() == 0) throw new IllegalArgumentException("Can't divide by zero");
        return calc.getNumber1() / calc.getNumber2();
    }
}
