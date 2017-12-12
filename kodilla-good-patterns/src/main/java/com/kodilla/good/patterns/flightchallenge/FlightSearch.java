package com.kodilla.good.patterns.flightchallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FlightSearch {

    private FlightList flightSearch;

    public FlightSearch(FlightList flightSearch) {
        this.flightSearch = flightSearch;
    }

    public List<Flight> findArrivals(String arrival) {
        List<Flight> arrivals;
        arrivals = flightSearch.getFlightList().stream()
                .filter(a -> a.getArrival().matches(arrival))
                .collect(Collectors.toList());
        return arrivals;
    }

    public List<Flight> findDepartures(String departure) {
        List<Flight> departures;
        departures = flightSearch.getFlightList().stream()
                .filter(d -> d.getDeparture().matches(departure))
                .collect(Collectors.toList());
        return departures;
    }

    public List<List<Flight>> findConnectingFlight(String departure, String arrival) {
        List<List<Flight>> flightByConnectingCity = new ArrayList<>();

        String regexString = Pattern.quote(arrival) + "(.*?)" + Pattern.quote(departure);
        Pattern pattern = Pattern.compile(regexString);

        Matcher matcher = pattern.matcher(flightByConnectingCity.stream().flatMap(f -> f.stream()).toString());
        if (matcher.find())
            return flightByConnectingCity;
        return new ArrayList<>();
    }
}
