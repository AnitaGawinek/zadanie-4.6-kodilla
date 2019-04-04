package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.lang.*;
import java.util.*;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addNumbers();
        calculator.subtractNumbers();
        calculator.multiplyNumbers();
        calculator.divideNumbers();
    }
}
