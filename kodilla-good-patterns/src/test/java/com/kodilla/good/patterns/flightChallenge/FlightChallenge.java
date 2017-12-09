package com.kodilla.good.patterns.flightChallenge;

import com.kodilla.good.patterns.flightchallenge.Flight;
import com.kodilla.good.patterns.flightchallenge.FlightList;
import com.kodilla.good.patterns.flightchallenge.FlightSearch;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class FlightChallenge {

    private FlightList flightListMock = mock(FlightList.class);
    private FlightSearch flightSearch = new FlightSearch(flightListMock);
    @Test
    public void testSearchFlightWithSameArrivalCity(){
        //Given
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Krakow", "Berlin"));
        flights.add(new Flight("Krakow", "Warsaw"));
        flights.add(new Flight("Amsterdam", "Katowice"));
        flights.add(new Flight("Gdansk", "Krakow"));
        flights.add(new Flight("Krakow", "Katowice"));
        when(flightListMock.getFlightList()).thenReturn(flights);
        //When
        List<Flight> ArrivalWithSameNameCity = flightSearch.findArrivals();
        //Then
        Assert.assertEquals(3, ArrivalWithSameNameCity.size());
        System.out.println(ArrivalWithSameNameCity.toString());
    }

    @Test
        public void testSearchFlightWithSameDepartureCity(){
        //Given
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Krakow", "Berlin"));
        flightList.add(new Flight("Krakow", "Warsaw"));
        flightList.add(new Flight("Paris", "Warsaw"));
        flightList.add(new Flight("Gdansk", "Warsaw"));
        flightList.add(new Flight("Krakow", "Warsaw"));
        when(flightListMock.getFlightList()).thenReturn(flightList);
        //When
        List<Flight> DeparturesWithSameNameCity = flightSearch.findDepartures();
        //Then
        Assert.assertEquals(4, DeparturesWithSameNameCity.size());
        System.out.println(DeparturesWithSameNameCity.toString());
    }

   @Test
        public void testFindFlightByNameOfConnectingCity(){
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
        when(flightListMock.getFlightsList()).thenReturn(flightList);
        //Given
        flightSearch.findConnectingFlight();
        //Then
        System.out.println(flightSearch.findConnectingFlight().toString());
    }
}
