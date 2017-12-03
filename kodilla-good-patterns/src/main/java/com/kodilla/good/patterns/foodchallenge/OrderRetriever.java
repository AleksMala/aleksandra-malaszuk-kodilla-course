package com.kodilla.good.patterns.foodchallenge;

import java.util.ArrayList;
import java.util.List;

public class OrderRetriever {

    public List<DeliveryInfo> retrieve() {

        List<DeliveryInfo> deliveryInfos = new ArrayList<>();
        deliveryInfos.add(new DeliveryInfo(new Deliverer("EFS"), new Product("butter")));
        deliveryInfos.add(new DeliveryInfo(new Deliverer("GFS"), new Product("mik")));
        deliveryInfos.add(new DeliveryInfo(new Deliverer("HS"), new Product("eggs")));

        return new ArrayList<>(deliveryInfos);
    }
}
