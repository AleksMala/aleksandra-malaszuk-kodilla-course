package com.kodilla.good.patterns.flightchallenge;

import java.util.List;

public class Flight {

    private String arrival;
    private String departure;

    public Flight(String arrival, String departure) {
        this.arrival = arrival;
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
    }

    /**public List<Flight> getArrival{
        return
    }

    public List<Flight> getDeparture{

    }

    public List<List<Flight>> flightBetween{

    }**/
}
