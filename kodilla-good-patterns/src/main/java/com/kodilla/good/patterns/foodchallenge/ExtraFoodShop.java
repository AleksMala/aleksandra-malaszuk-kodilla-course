package com.kodilla.good.patterns.foodchallenge;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Producer {

    private static final Map<Product, Integer> stockRoom = new HashMap<>();

    public Map<Product, Integer> getStockRooms() {
        stockRoom.put(new Product("peanut butter"), 10);
        stockRoom.put(new Product("milk"), 10);
        stockRoom.put(new Product("eggs"), 10);

        return new HashMap<>(stockRoom);
    }

    @Override
    public boolean process(Product product, int quantity) {

        Integer quantityInStore = stockRoom.get(product);
        getStockRooms();

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
