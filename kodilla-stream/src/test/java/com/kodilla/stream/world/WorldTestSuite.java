package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPopulation(){
        //Given
        World world = new World();
        world.addContinent(new Continent(new Country("Poland",new BigDecimal("36000000"))));
        world.addContinent(new Continent(new Country("Germany", new BigDecimal("82670000"))));
        world.addContinent(new Continent(new Country("Spain", new BigDecimal("46560000"))));
        //When
        world.getPopulationOfWorld();
        //Then
        BigDecimal expected = new BigDecimal("165230000");
        Assert.assertEquals(expected, world.getPopulationOfWorld());

    }
}
