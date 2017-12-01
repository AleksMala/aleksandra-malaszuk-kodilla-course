package com.kodilla.good.patterns.flightchallenge;

public class SearchFlightExample implements SearchFlight {

    @Override
    public String searchFlight(Flight flight) {
        return flight.toString();
    }
}
