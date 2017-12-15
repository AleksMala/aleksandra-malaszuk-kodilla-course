package com.kodilla.good.patterns.flightchallenge;

public class Flight {

    private String arrival;
    private String departure;

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        return getArrival().equals(flight.getArrival()) && getDeparture().equals(flight.getDeparture());
    }

    @Override
    public int hashCode() {
        int result = getArrival().hashCode();
        result = 31 * result + getDeparture().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return departure + " " + arrival;
    }
}
