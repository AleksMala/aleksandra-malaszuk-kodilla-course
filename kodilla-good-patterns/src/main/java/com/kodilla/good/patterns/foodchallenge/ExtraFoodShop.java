package com.kodilla.good.patterns.foodchallenge;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Producer {

    private static final Map<Product,Integer> numberOfSupplies = new HashMap<>();

    @Override
    public boolean producerStorage (Product product, int quantity) {

        numberOfSupplies.put(new Product("butter"), 1);
        numberOfSupplies.put(new Product("milk"), 1);
        numberOfSupplies.put(new Product("peanut butter"), 1);
        numberOfSupplies.put(new Product("eggs"), 1);

        System.out.println(numberOfSupplies.entrySet());
        return true;
    }

}
