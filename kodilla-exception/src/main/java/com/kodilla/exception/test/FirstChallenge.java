package com.kodilla.exception.test;


public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        try {
            if (b == 0) {
                throw new ArithmeticException();
            }

        } catch (ArithmeticException o) {
            System.out.println("You can't divide by 0");

        } finally {
            System.out.println("Time to start learn");
        }
        return a / b;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);
    }
}
