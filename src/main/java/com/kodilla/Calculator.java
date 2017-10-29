package com.kodilla;

import java.util.Random;

class Operations{
    private int a;
    private int b;
    private static final int LENGTH_OF_VARIABLE = 20;
    private int result;

    public Operations(){
        Random rnd = new Random();
        a = rnd.nextInt(LENGTH_OF_VARIABLE);
        b = rnd.nextInt(LENGTH_OF_VARIABLE);
    }

    public int adding(){
        result = a + b;
        System.out.println("Result of adding is: " + result);
        return result;
    }

    public int subtraction(){
        result = a - b;
        System.out.println("Result of subtraction is: " + result);
        return result;
    }
}
public class Calculator {

    public static void main (String[] args){
        Operations calculator = new Operations();
        calculator.adding();
        calculator.subtraction();
    }
}
