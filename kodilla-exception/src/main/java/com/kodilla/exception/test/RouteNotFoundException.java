package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {

    public String routeNotFoundException(){
        return "No flights on this route";
    }
}
