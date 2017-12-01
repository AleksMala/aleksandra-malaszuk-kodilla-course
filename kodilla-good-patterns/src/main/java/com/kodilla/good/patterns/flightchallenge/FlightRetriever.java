package com.kodilla.good.patterns.flightchallenge;

import java.util.ArrayList;
import java.util.List;

public class FlightRetriever {

    public List<Flight> flightRetriver(){

        List<Flight> listOfConnection = new ArrayList<>();
        listOfConnection.add(new Flight(new Arrival("Krakow"), new Departure("Warsaw")));
        listOfConnection.add(new Flight(new Arrival("Krakow"), new Departure("Amsterdam")));
        listOfConnection.add(new Flight(new Arrival("Krakow"), new Departure("Barcelona")));
        listOfConnection.add(new Flight(new Arrival("Warsaw"), new Departure("Gdansk")));
        listOfConnection.add(new Flight(new Arrival("Katowice"), new Departure("Krakow")));
        listOfConnection.add(new Flight(new Arrival("Katowice"), new Departure("Warsaw")));
        listOfConnection.add(new Flight(new Arrival("Amsterdam"), new Departure("Krakow")));

        return new ArrayList<>(listOfConnection);
    }
}
