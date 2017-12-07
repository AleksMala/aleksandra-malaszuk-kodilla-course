package com.kodilla.good.patterns.foodchallenge;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements OrderService {

    private static final Map<Product,Integer> numberOfSuplies = new HashMap<>();
    private Delivery delivery;

    @Override
    public boolean process(Product product, int quantity) {

        numberOfSuplies.put(new Product("butter"), 6);
        //numberOfSuplies.put(new Product("milk"), 0);
        //numberOfSuplies.put(new Product("peanut butter"), 0);
       // numberOfSuplies.put(new Product("eggs"), 0);

        System.out.println(numberOfSuplies.entrySet());
        return true;
    }

}
