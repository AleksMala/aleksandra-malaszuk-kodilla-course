package com.kodilla.good.patterns.flightChallenge;

import com.kodilla.good.patterns.flightchallenge.Flight;
import com.kodilla.good.patterns.flightchallenge.FlightList;
import com.kodilla.good.patterns.flightchallenge.FlightSearch;
import javafx.collections.transformation.FilteredList;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static javafx.beans.binding.Bindings.when;

public class FlightChallenge {
    private FlightList flightListMock = mock(FlightList.class);
    private FlightSearch flightSearch = new FlightSearch(flightListMock);

    @Test
    public void testSearchFlightWithSameArrivalCity(){
        //Given
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Krakow", "Berlin"));
        flightList.add(new Flight("Krakow", "Warsaw"));
        flightList.add(new Flight("Amsterdam", "Katowice"));
        flightList.add(new Flight("Gdansk", "Krakow"));
        flightList.add(new Flight("Krakow", "Katowice"));
        when(flightListMock.flightList()).thenReturn(flightList);
        //When
        List<Flight> ArrivalWithSameNameCity = flightSearch.getArrival();
        //Then
        Assert.assertEquals(3, ArrivalWithSameNameCity.size());
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
        when(flightListMock.flightList()).thenReturn(flightList);
        //When
        List<Flight> ArrivalWithSameNameCity = flightSearch.getDeparture();
        //Then
        Assert.assertEquals(4, ArrivalWithSameNameCity.size());
    }

    @Test
    public void testflightBetween(){
        //Given
        List<Flight> listKatowice = new ArrayList<>();
        listKatowice.add(new Flight("Katowice", "Warsaw"));
        listKatowice.add(new Flight("Katowice", "Berlin"));
        listKatowice.add(new Flight("Gdansk", "Krakow"));
        List<Flight> listKrk = new ArrayList<>();
        listKrk.add(new Flight("Krakow", "Madryt"));
        listKrk.add(new Flight("Katowice", "Madryt"));
        List<List<Flight>> flightList = new ArrayList<>();
        flightList.add(listKatowice);
        flightList.add(listKrk);
        //When
        //Then
    }
}
