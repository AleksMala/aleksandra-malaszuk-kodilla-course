package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPopulation(){
        //Given
        //Country of Europe
        Continent europe = new Continent();
        europe.addCountry(new Country("Poland",new BigDecimal("36000000")));
        europe.addCountry(new Country("Germany", new BigDecimal("82670000")));
        europe.addCountry(new Country("Spain", new BigDecimal("46560000")));
        //Country of Asia
        Continent asia = new Continent();
        asia.addCountry(new Country("Armenia",new BigDecimal("3275000")));
        asia.addCountry(new Country("Indie",new BigDecimal("1102358999")));
        asia.addCountry(new Country("Turkey",new BigDecimal("76704412")));
        asia.addCountry(new Country("Israel", new BigDecimal("6995301")));
        //Country of Africa
        Continent africa = new Continent();
        africa.addCountry(new Country("Algiers", new BigDecimal("34994937")));
        africa.addCountry(new Country("Eritrea", new BigDecimal("5939484")));
        africa.addCountry(new Country("Egypt", new BigDecimal("82079636")));

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);
        //When
        world.getPopulationOfWorld();
        //Then
        BigDecimal expected = new BigDecimal("1477577769");
        Assert.assertEquals(expected, world.getPopulationOfWorld());

    }
}
