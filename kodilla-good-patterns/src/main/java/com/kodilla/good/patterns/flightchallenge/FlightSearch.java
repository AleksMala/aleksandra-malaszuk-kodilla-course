package com.kodilla.good.patterns.flightchallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {

    private FlightList flightSearch;

    public FlightSearch(FlightList flightSearch) {
        this.flightSearch = flightSearch;
    }

    public List<Flight> findArrivals(String arrival) {
        List<Flight> arrivals;
        arrivals = flightSearch.getFlightList().stream()
                .filter(a -> a.getArrival().equals(arrival))
                .collect(Collectors.toList());
        return arrivals;
    }

    public List<Flight> findDepartures(String departure) {
        List<Flight> departures;
        departures = flightSearch.getFlightList().stream()
                .filter(d -> d.getDeparture().equals(departure))
                .collect(Collectors.toList());
        return departures;
    }

    public List<List<Flight>> findConnectingFlight(String departure, String arrival) {

        List<Flight> departures = flightSearch.getFlightList().stream()
                .filter(f -> f.getDeparture().equals(departure))
                .filter(f -> !f.getDeparture().equals(arrival))
                .collect(Collectors.toList());

        List<Flight> arrivals = flightSearch.getFlightList().stream()
                .filter(f -> f.getArrival().equals(arrival))
                .filter(f -> !f.getArrival().equals(departure))
                .collect(Collectors.toList());

        List<List<Flight>> flightByConnectingCity = new ArrayList<>();
        for (Flight departuresFlight : departures) {
            for (Flight arrivalsFlight : arrivals) {
                if (departuresFlight.getArrival().equals(arrivalsFlight.getDeparture())) {
                    flightByConnectingCity.add(Arrays.asList(departuresFlight, arrivalsFlight));
                }
            }
        }
        return flightByConnectingCity;
    }
}
