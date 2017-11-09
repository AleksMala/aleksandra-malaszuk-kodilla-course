package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

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
        Calculator calculator = new Calculator();

        int addResult = calculator.add(7, 0);
        int subResult = calculator.subtract(7, 4);
        if (addResult == 7 && subResult == 3){
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }
    }
}
