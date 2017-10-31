package com.kodilla;

import java.util.Random;

public class Calculator {

    private int a;
    private int b;
    private static final int LENGTH_OF_VARIABLE = 20;
    private int result;

    public Calculator() {
        Random rnd = new Random();
        a = rnd.nextInt(LENGTH_OF_VARIABLE);
        b = rnd.nextInt(LENGTH_OF_VARIABLE);
    }

    public void add(){
        result = a + b;
        System.out.println("Result of adding is: " + result);
    }

    public void subtract(){
        result = a - b;
        System.out.println("Result of subtraction is: " + result);
    }
    
    public static void main (String[] args) {
        Calculator calculator = new Calculator();
        calculator.add();
        calculator.subtract();
    }
}
