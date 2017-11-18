package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> world = new ArrayList<>();

    public List<Continent> getWorld() {
        return world;
    }



    public void addContinent(Continent continent){
        world.add(continent);
    }

    public BigDecimal getPopulationOfWorld(){
        return world.stream()
                .flatMap(continent -> continent.getContinent().stream())
                .map(Country::getPopulation)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
    }
}
