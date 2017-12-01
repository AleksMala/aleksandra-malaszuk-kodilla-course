package com.kodilla.good.patterns.flightchallenge;

import java.util.ArrayList;
import java.util.List;

public class Departure {

    private String departureFlight;
    private List<String> departures = new ArrayList<>();

    public Departure(String departureFlight) {
        this.departureFlight = departureFlight;
    }

    public String getDepartureFlight() {
        return departureFlight;
    }

    public List<String> getDepartures() {
        return departures;
    }
}
