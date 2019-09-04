package com.codecool.springcalculator.controller;

import com.codecool.springcalculator.factory.CalculationFactory;
import com.codecool.springcalculator.mode.Calculator;
import com.codecool.springcalculator.service.Calculable;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    CalculationFactory calculationFactory;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("Calculator", new Calculator());
        return "index";
    }

    @PostMapping
    public String getResult(@ModelAttribute("Calculator") Calculator calc) {
        Calculable calculable = CalculationFactory.getCalcService(calc.getOperation());
        double result = calculable.calculate(calc);
        calc.setResult(result);
        System.out.println(calc.getResult());
        return "index";
    }
}
