package com.kodilla.good.patterns.flightchallenge;

import java.util.ArrayList;
import java.util.List;

public class Arrival {

    private String arrivalFlight;
    private List<String> arrivals = new ArrayList<>();

    public Arrival(String arrivalFlight) {
        this.arrivalFlight = arrivalFlight;
    }

    public String getArrivalFlight() {
        return arrivalFlight;
    }

    public List<String> getArrivals() {
        return arrivals;
    }
}
