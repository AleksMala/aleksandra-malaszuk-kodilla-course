package com.kodilla.good.patterns.flightchallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch{

    private FlightList flightSearch;

    public FlightSearch(FlightList flightSearch) {
        this.flightSearch = flightSearch;
    }

    public List<Flight> findArrivals(){
        List<Flight> arrivals = new ArrayList<>();
        for(Flight arrivalFlights : flightSearch.getFlightList()) {
            arrivals = flightSearch.getFlightList().stream()
                    .filter(a -> a.getArrival().matches(arrivalFlights.getArrival()))
                    .collect(Collectors.toList());
        }
        return arrivals;
    }

    public List<Flight> findDepartures(){
        List<Flight> departures = new ArrayList<>();
        for(Flight departuresFlights : flightSearch.getFlightList()){
            departures = flightSearch.getFlightList().stream()
                    .filter(d->d.getDeparture().matches(departuresFlights.getDeparture()))
                    .collect(Collectors.toList());
        }
        return departures;
    }

    public List<List<Flight>> findConnectingFlight() {
        List<List<Flight>> flightByConnectingCity = new ArrayList<>();
                flightByConnectingCity.stream()
                .flatMap(f->flightSearch.getFlightList().stream()
                        .filter(d->d.getDeparture().equals(d.getArrival())))
                        .collect(Collectors.toList());
        return flightByConnectingCity;
    }
}
