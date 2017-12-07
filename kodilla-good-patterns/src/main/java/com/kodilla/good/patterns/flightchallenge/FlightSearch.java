package com.kodilla.good.patterns.flightchallenge;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearch {

    private FlightList flightList;

    public FlightSearch(FlightList flightList) {
        this.flightList = flightList;
    }

    public List<Flight> getArrival(){
        return flightList.flightList().stream()
                .filter(f->f.getArrival()
                        .equals("Krakow"))
                .collect(Collectors.toList());
    }

    public List<Flight> getDeparture(){
        return flightList.flightList().stream()
                .filter(f->f.getDeparture()
                        .equals("Warsaw"))
                .collect(Collectors.toList());;
    }

    public List<Flight> get
}
