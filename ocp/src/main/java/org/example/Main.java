package org.example;

import org.example.ocpcompliant.Addition;
import org.example.ocpcompliant.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Addition addition = new Addition();
        addition.setLeft(1);
        addition.setRight(1);

        calculator.calculate(addition);

        System.out.println("Result: " + addition.getResult());
    }
}