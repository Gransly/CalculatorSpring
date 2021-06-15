package com.example.calculatorspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.Calculator;
import service.ConverterIntToArray;

@SpringBootApplication
@RestController
public class CalculatorSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorSpringApplication.class, args);
    }



    @GetMapping("/sum")
    public String Sum() {

        Calculator calculator = new Calculator(ConverterIntToArray.convertInt2Array(1234));
        return String.valueOf(calculator.Sum());
    }

    @GetMapping("/max")
    public String Max() {

        Calculator calculator = new Calculator(ConverterIntToArray.convertInt2Array(1234));
        return String.valueOf(calculator.Max());
    }
    @GetMapping("/min")
    public String Calculate() {

        Calculator calculator = new Calculator(ConverterIntToArray.convertInt2Array(1234));
        return String.valueOf(calculator.Min());
    }

    @GetMapping("/avg")
    public String Avg() {

        Calculator calculator = new Calculator(ConverterIntToArray.convertInt2Array(1234));
        return String.valueOf(calculator.Avg());
    }

}
