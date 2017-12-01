package com.kodilla.good.patterns.flightchallenge;

public class FlightFromExample implements FlightFrom {

    @Override
    public String flyingFrom(Departure departure) {
        return departure.getDepartureFlight();
    }
}
