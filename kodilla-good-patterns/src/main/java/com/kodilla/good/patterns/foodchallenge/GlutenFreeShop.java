package com.kodilla.good.patterns.foodchallenge;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Producer {

    private static final Map<Product, Integer> numberOfSupplies = new HashMap<>();

    @Override
    public boolean producerStorage(Product product, int quantity) {

        numberOfSupplies.put(new Product("peanut butter"), 3);
        numberOfSupplies.put(new Product("eggs"), 3);

        System.out.println(numberOfSupplies.entrySet());
        return true;
    }
}
