package com.kodilla.good.patterns.foodchallenge;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Producer {

    private static final Map<Product, Integer> numberOfSupplies = new HashMap<>();

    @Override
    public boolean process(Product product, int quantity) {

        numberOfSupplies.put(new Product("vegetables"), 3);
        numberOfSupplies.put(new Product("water"), 3);

        System.out.println(numberOfSupplies.entrySet());
        return true;
    }
}
