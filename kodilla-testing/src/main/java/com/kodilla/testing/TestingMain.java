package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

import java.util.concurrent.atomic.AtomicInteger;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //"Test - pierwszy test jednostkowy"
        Calculator calculator1 = new Calculator();

        int calcResult1 = calculator1.add(7, 0);
        if (calcResult1 != 0) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }

        //"Test - drugi test jednostkowy"
        Calculator calculator2 = new Calculator();

        int calcResult2 = calculator2.subtract(4, 7);
        if (calcResult2 != 0) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }

    }
}
