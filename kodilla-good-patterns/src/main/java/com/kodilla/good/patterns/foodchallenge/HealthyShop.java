package com.kodilla.good.patterns.foodchallenge;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Producer {

    private static final Map<Product, Integer> stockRoom = new HashMap<>();

    public Map<Product, Integer> getStockRoom() {
        stockRoom.put(new Product("vegetables"), 5);
        stockRoom.put(new Product("water"), 4);

        return stockRoom;
    }

    @Override
    public boolean process(Product product, int quantity) {

        Integer quantityInStore = stockRoom.get(product);
        if (quantityInStore == null) {
            return false;
        } else {
            if (quantityInStore >= quantity) {
                stockRoom.put(product, quantityInStore - quantity);
                System.out.println(stockRoom.entrySet());
                return true;
            } else {
                return false;
            }
        }

    }
}
