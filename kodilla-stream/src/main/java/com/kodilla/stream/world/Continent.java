package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class Continent {

    private final Country country;
    private final List<Country> continent = new ArrayList<>();

    public Continent(final Country country) {
        this.country = country;
    }

    public void addCountry(Country country){
        continent.add(country);
    }

    public List<Country> getContinent() {
        return continent;
    }

    public List<BigDecimal> getPopulationOfContinent(){
        return continent.stream()
                .map(country -> country.getPopulation())
                .collect(Collectors.toList());
    }

}
