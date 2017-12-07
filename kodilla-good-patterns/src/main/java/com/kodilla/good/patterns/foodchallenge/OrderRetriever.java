package com.kodilla.good.patterns.foodchallenge;

import java.util.ArrayList;
import java.util.List;

public class OrderRetriever {
    OrderService extraFoodShop = new ExtraFoodShop();

    public List<Delivery> retrieve () {

        List<Delivery> deliveryInfos = new ArrayList<>();
        deliveryInfos.add(new Delivery(extraFoodShop, new Product("butter"),1));
        //deliveryInfos.add(new Delivery(extraFoodShop, new Product("milk"), 1));
        //deliveryInfos.add(new Delivery(extraFoodShop, new Product("peanut butter"), 1));
        //deliveryInfos.add(new Delivery(extraFoodShop, new Product("peanut"), 1));

        return new ArrayList<>(deliveryInfos);
    }
}
