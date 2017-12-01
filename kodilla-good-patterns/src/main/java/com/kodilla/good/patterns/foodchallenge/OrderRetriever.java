package com.kodilla.good.patterns.foodchallenge;

import java.util.ArrayList;
import java.util.List;

public class OrderRetriever {

    public List<DeliveryInfo> retrieve() {

        Product product = new Product("Peanut butter", 0);
        Deliverer deliverer = new Deliverer("ExtraFoodShop ");

        Product product1 = new Product("Vegetables ", 3);
        Deliverer deliverer1 = new Deliverer("HealthyShop ");

        Product product2 = new Product("flour ", 2);
        Deliverer deliverer2 = new Deliverer("GlutenFreeShop ");

        List<DeliveryInfo> deliverOptions = new ArrayList<>();
        deliverOptions.add(new DeliveryInfo(deliverer, product));
        deliverOptions.add(new DeliveryInfo(deliverer1, product1));
        deliverOptions.add(new DeliveryInfo(deliverer2, product2));

        return new ArrayList<>(deliverOptions);
    }
}
