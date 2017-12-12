package com.kodilla.good.patterns.flightchallenge;

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

    @Override
    public boolean equals(Object o) {
        Flight a = (Flight) o;
        return (arrival.equals(a.getArrival())) && (departure.equals(a.getDeparture()));
    }

    @Override
    public int hashCode() {
        int result = getArrival().hashCode();
        result = 31 * result + getDeparture().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return arrival + " " + departure;
    }
}
