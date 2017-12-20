package com.kodilla.good.patterns.foodchallenge;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Producer {

    private static final Map<Product, Integer> stockRoom = new HashMap<>();

    public GlutenFreeShop() {
        stockRoom.put(new Product("oil"), 4);
        stockRoom.put(new Product("chocolate"), 3);
    }

    @Override
    public boolean process(Product product, int quantity) {

        Integer quantityStore = stockRoom.get(product);

        if (quantityStore == null) {
            return false;
        } else {
            if (quantityStore >= quantity) {
                stockRoom.put(product, quantityStore - quantity);
                return true;
            } else {
                return false;
            }
        }
    }
}
