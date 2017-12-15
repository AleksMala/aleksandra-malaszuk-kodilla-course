package com.kodilla.good.patterns.flightChallenge;

import com.kodilla.good.patterns.flightchallenge.Flight;
import com.kodilla.good.patterns.flightchallenge.FlightList;
import com.kodilla.good.patterns.flightchallenge.FlightSearch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FlightChallenge {

    private FlightList flightListMock = mock(FlightList.class);
    private FlightSearch flightSearch = new FlightSearch(flightListMock);

    @Before
    public void test() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Krakow", "Berlin"));
        flights.add(new Flight("Krakow", "Warsaw"));
        flights.add(new Flight("Amsterdam", "Katowice"));
        flights.add(new Flight("Katowice", "Gdansk"));
        flights.add(new Flight("Gdansk", "Krakow"));
        flights.add(new Flight("Warsaw", "Gdansk"));
        flights.add(new Flight("Krakow", "Katowice"));
        when(flightListMock.getFlightList()).thenReturn(flights);
    }

    @Test
    public void testSearchFlightWithSameArrivalCity() {
        //Given
        //When
        List<Flight> arrivalWithSameNameCity = flightSearch.findArrivals("Katowice");
        //Then
        Assert.assertEquals(2, arrivalWithSameNameCity.size());
        Assert.assertEquals(Arrays.asList(new Flight("Amsterdam", "Katowice"),
                new Flight("Krakow", "Katowice")), arrivalWithSameNameCity);
    }

    @Test
    public void testSearchFlightWithSameDepartureCity() {
        //Given
        //When
        List<Flight> departuresWithSameNameCity = flightSearch.findDepartures("Warsaw");
        //Then
        Assert.assertEquals(1, departuresWithSameNameCity.size());
        Assert.assertEquals(Collections.singletonList(new Flight("Warsaw", "Gdansk")), departuresWithSameNameCity);
    }

    @Test
    public void testFindFlightByNameOfConnectingCity() {
        //When
        //Given
        List<List<Flight>> connectingFlight = flightSearch.findConnectingFlight("Katowice", "Krakow");
        //Then
        Assert.assertEquals(Arrays.asList(Arrays.asList(new Flight("Katowice", "Gdansk"),
                new Flight("Gdansk", "Krakow"))), connectingFlight);
    }
}
