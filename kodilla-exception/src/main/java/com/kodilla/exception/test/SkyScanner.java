package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SkyScanner {

    public boolean findFlight(Flight flight) throws RouteNotFoundException{

        Map<String, Boolean> flights = new HashMap<>();     // tworzę obiekt mapy
        flights.put("Warsaw", true);    // dodaję element do mapy obiektu flights

        for (Map.Entry map: flights.entrySet()) {   //wywołuję mapę
            map.getKey();    // pobieram klucz

            if (flights.get(flight.getDepartureAirport()) == null || flights.containsValue(false)) {    //podczas gdy wywołuję element sprawdzam czy jego wartość key równa się null
                throw new RouteNotFoundException();     // jeśli tak jest to wywołuję Exception
            }
        }
        return  true;   // jeśli wartośc key jest różna od null to wywołuję mapę,tak (o to chodzi z tym true) ?
    }

    public static void main (String args[]){

        SkyScanner skyScanner = new SkyScanner();

        try {
            skyScanner.findFlight(new Flight ("Warsaw", "Warsaw"));

        } catch (RouteNotFoundException e) {
            System.out.println(e.routeNotFoundException());

        } finally {
            System.out.println("Time to fly");
        }
    }
}
