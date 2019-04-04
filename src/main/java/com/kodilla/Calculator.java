package com.kodilla;

public class Calculator {
    public double a = 100;
    public double b = 200;

    public void addNumbers() {
        double result = a + b;
        System.out.println("Your result is: " + result);
    }
    public void subtractNumbers() {
        double result = a - b;
        System.out.println("Your result is: " + result);
    }
    public void multiplyNumbers() {
        double result = a * b;
        System.out.println("Your result is: " + result);
    }
    public void divideNumbers() {
        double result = a / b;
        System.out.println("Your result is: " + result);
    }
}
