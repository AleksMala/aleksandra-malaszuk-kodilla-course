package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SkyScanner {

    public boolean findFlight(Flight flight) throws RouteNotFoundException{

        Map<String, Boolean> flights = new HashMap<>();     // tworzę obiekt mapy
        flights.put("Krakow", true);    // dodaję element do mapy obiektu flights
        flights.put("Warsaw", false);

        Boolean flyTime = flights.get(flight.getDepartureAirport()); // przypisuje do klucza prawdę

        if (flyTime == null) {    // przypisuje Boolean obiekt zerowy
            throw new RouteNotFoundException();  // wywołuję wyjątek
        }

        if (flyTime){ // sprawdzam prawdziwość lotów
            System.out.println("You can see the world");

        } else {
            System.out.println("You can not see the world");
        }

        return flyTime;// wywołuję boolean
    }

    public static void main (String args[]){

        SkyScanner skyScanner = new SkyScanner();

        try {
            skyScanner.findFlight(new Flight ("Krakow" , "Warsaw"));

        } catch (RouteNotFoundException e) {
            System.out.println(e.routeNotFoundException());

        } finally {
            System.out.println("Time to fly");
        }
    }
}
