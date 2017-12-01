package com.kodilla.good.patterns.flightchallenge;

import java.util.List;
import java.util.stream.Collectors;

public class FlightScanner {

    private SearchFlight searchFlight;
    private FlightFrom flightFrom;
    private FlightTo flightTo;

    public FlightScanner(SearchFlight searchFlight, FlightFrom flightFrom, FlightTo flightTo) {
        this.searchFlight = searchFlight;
        this.flightFrom = flightFrom;
        this.flightTo = flightTo;
    }

    public void process(Flight flight) {

        if (flight.getDeparture().getDepartureFlight() == "Krakow") {
            searchFlight.searchFlight(flight);
            flightFrom.flyingFrom(flight.getDeparture());
        } else {
            System.out.println("Choose flight");
        }
    }

    public static void main (String args []){

        FlightRetriever flightRetriever = new FlightRetriever();
        List<Flight> flight = flightRetriever.flightRetriver().stream()
                .filter(f->f.getDeparture().getDepartureFlight()=="Krakow")
                .collect(Collectors.toList());

        FlightFrom flightFrom = new FlightFromExample();
        FlightTo flightTo = new FlightToExample();
        SearchFlight searchFlight = new SearchFlightExample();

        FlightScanner flightScanner = new FlightScanner(searchFlight,flightFrom, flightTo);
        flightScanner.process(flight);
    }
}
