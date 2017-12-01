package com.kodilla.good.patterns.flightchallenge;

public class FlightToExample implements FlightTo{

    @Override
    public String flyingTo(Arrival arrival) {
        return arrival.getArrivalFlight();
    }
}
