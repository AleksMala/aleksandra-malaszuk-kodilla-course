package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SkyScanner {

    public String findFlight(Flight flight) throws RouteNotFoundException{
        Map<String, String> flights = new HashMap<>();

        flights.put(flight.getDepartureAirport(), flight.getArrivalAirport());

            if (flights.get(flight.getDepartureAirport()).equals("Dublin")){
                throw new RouteNotFoundException();
            }
        return flights.toString();
    }

    public static void main (String args[]){

        Flight flight = new Flight("Amsterdam", "Krakow");
        SkyScanner skyScanner = new SkyScanner();

        try {
            skyScanner.findFlight(flight);
            System.out.println(skyScanner.findFlight(flight));

        } catch (RouteNotFoundException e) {
            System.out.println("Sorry, No such flights.");

        } finally {
            System.out.println("Time to fly");
        }


    }
}
