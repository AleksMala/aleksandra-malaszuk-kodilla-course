package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SkyScanner {

    public void findFlight(Flight flight) throws RouteNotFoundException{

        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Krakow", true);
        flights.put("Warsaw", false);

        if (flights.get(flight.getDepartureAirport())){
            throw new RouteNotFoundException();
        }
    }

    public static void main (String args[]){

        Flight flight = new Flight("Krakow", "Warsaw");
        SkyScanner skyScanner = new SkyScanner();

        try {
            skyScanner.findFlight(flight);

        } catch (RouteNotFoundException e) {
            System.out.println(e.routeNotFoundException());

        } finally {
            System.out.println("Time to fly");
        }
    }
}
