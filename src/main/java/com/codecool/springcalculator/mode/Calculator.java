package com.codecool.springcalculator.mode;

import org.springframework.context.annotation.Bean;

public class Calculator {
    private double number1;
    private double number2;
    private double result;
    private String operation;

    public double getNumber1() {
        return this.number1;
    }

    public String getOperation() {
        return this.operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getResult() {
        return this.result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return this.number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
}
