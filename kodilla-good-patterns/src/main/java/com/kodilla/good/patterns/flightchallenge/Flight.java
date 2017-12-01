package com.kodilla.good.patterns.flightchallenge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flight {

    private Arrival arrival;
    private Departure departure;
    private Map<Arrival, Departure> arrivalToDeparture = new HashMap<>();
    private Map<Departure, Arrival> departureToArrival = new HashMap<>();

    public Flight(Arrival arrival, Departure departure) {
        this.arrival = arrival;
        this.departure = departure;
    }

    public Arrival getArrival() {
        return arrival;
    }

    public Departure getDeparture() {
        return departure;
    }

    public Map<Arrival, Departure> getArrivalToDeparture() {
        return arrivalToDeparture;
    }

    public Map<Departure, Arrival> getDepartureToArrival() {
        return departureToArrival;
    }
}
