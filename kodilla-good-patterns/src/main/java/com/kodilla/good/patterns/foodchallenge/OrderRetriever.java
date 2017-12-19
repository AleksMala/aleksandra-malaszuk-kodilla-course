package com.kodilla.good.patterns.foodchallenge;

import java.util.ArrayList;
import java.util.List;

public class OrderRetriever {
    Producer efs = new ExtraFoodShop();
    Producer gfs = new GlutenFreeShop();
    Producer hs = new HealthyShop();

    public List<Delivery> retrieve() {

        List<Delivery> deliveryInfos = new ArrayList<>();
        deliveryInfos.add(new Delivery(efs, new Product("butter"), 1));
        deliveryInfos.add(new Delivery(efs, new Product("milk"), 1));
        deliveryInfos.add(new Delivery(efs, new Product("peanut butter"), 2));
        deliveryInfos.add(new Delivery(efs, new Product("eggs"), 1));
        deliveryInfos.add(new Delivery(gfs, new Product("chocolate"), 1));
        deliveryInfos.add(new Delivery(hs, new Product("water"), 1));

        return new ArrayList<>(deliveryInfos);
    }
}
