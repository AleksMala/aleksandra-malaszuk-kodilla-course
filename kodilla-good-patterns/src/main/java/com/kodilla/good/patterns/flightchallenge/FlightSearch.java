package com.kodilla.good.patterns.flightchallenge;

import java.util.ArrayList;
import java.util.List;

public class FlightSearch {

    List<Flight> flightList = new ArrayList<>();

    public FlightSearch(List<Flight> flightList) {
        this.flightList = flightList;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }
}
