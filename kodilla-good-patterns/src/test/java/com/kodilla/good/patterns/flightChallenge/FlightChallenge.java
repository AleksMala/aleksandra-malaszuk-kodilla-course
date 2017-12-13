package com.kodilla.good.patterns.flightChallenge;

import com.kodilla.good.patterns.flightchallenge.Flight;
import com.kodilla.good.patterns.flightchallenge.FlightList;
import com.kodilla.good.patterns.flightchallenge.FlightSearch;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FlightChallenge {

    private FlightList flightListMock = mock(FlightList.class);
    private FlightSearch flightSearch = new FlightSearch(flightListMock);

    @Test
    public void testSearchFlightWithSameArrivalCity() {
        //Given
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Krakow", "Berlin"));
        flights.add(new Flight("Krakow", "Warsaw"));
        flights.add(new Flight("Amsterdam", "Katowice"));
        flights.add(new Flight("Gdansk", "Krakow"));
        flights.add(new Flight("Krakow", "Katowice"));
        when(flightListMock.getFlightList()).thenReturn(flights);
        //When
        List<Flight> arrivalWithSameNameCity = flightSearch.findArrivals("Krakow");
        //Then
        Assert.assertEquals(3, arrivalWithSameNameCity.size());
        Assert.assertEquals(Arrays.asList(new Flight("Krakow", "Berlin"), new Flight("Krakow", "Warsaw"),
                new Flight("Krakow", "Katowice")), arrivalWithSameNameCity);
    }

    @Test
    public void testSearchFlightWithSameDepartureCity() {
        //Given
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Krakow", "Berlin"));
        flightList.add(new Flight("Krakow", "Warsaw"));
        flightList.add(new Flight("Paris", "Warsaw"));
        flightList.add(new Flight("Gdansk", "Warsaw"));
        when(flightListMock.getFlightList()).thenReturn(flightList);
        //When
        List<Flight> departuresWithSameNameCity = flightSearch.findDepartures("Warsaw");
        //Then
        Assert.assertEquals(3, departuresWithSameNameCity.size());
        Assert.assertEquals(Arrays.asList(new Flight("Krakow", "Warsaw"), new Flight("Paris", "Warsaw"),
                new Flight("Gdansk", "Warsaw")), departuresWithSameNameCity);
    }


    @Test
    public void testFindFlightByNameOfConnectingCity() {
        //When
        List<Flight> listKatowice = new ArrayList<>();
        listKatowice.add(new Flight("Katowice", "Warsaw"));
        listKatowice.add(new Flight("Warsaw", "Krakow"));
        List<Flight> listKrk = new ArrayList<>();
        listKrk.add(new Flight("Katowice", "Madryt"));
        listKrk.add(new Flight("Madryt", "Krakow"));
        List<List<Flight>> flightList = new ArrayList<>();
        flightList.add(listKatowice);
        flightList.add(listKrk);
        List<Flight> a = flightList.stream().flatMap(f -> f.stream()).collect(Collectors.toList());
        when(flightListMock.getFlightList()).thenReturn(a);
        //Given
        List<Flight> b = flightSearch.findConnectingFlight("Katowice", "Krakow");
        //Then
        Assert.assertEquals("f",b.toString());
    }

}
