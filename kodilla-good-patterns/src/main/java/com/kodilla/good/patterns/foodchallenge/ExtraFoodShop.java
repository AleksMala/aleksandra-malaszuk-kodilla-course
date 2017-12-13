package com.kodilla.good.patterns.foodchallenge;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Producer {

    private static final Map<Product, Integer> stockRoom = new HashMap<>();

    public Map<Product, Integer> getStockRooms() {
        stockRoom.put(new Product("butter"), 10);
        stockRoom.put(new Product("milk"), 10);
        //stockRoom.put(new Product("eggs"), 10);

        return new HashMap<>(stockRoom);
    }

    @Override
    public boolean process(Product product, int quantity) {
        System.out.println(getStockRooms());

        if(product.equals(stockRoom.entrySet())) {
            int result = quantity - stockRoom.get(product);
            System.out.println(result);
        }
        return true;
    }

}
