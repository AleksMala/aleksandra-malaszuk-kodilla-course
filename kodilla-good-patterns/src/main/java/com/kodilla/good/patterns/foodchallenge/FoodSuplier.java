package com.kodilla.good.patterns.foodchallenge;

public class FoodSuplier implements DelivererInformation {

    @Override
    public void delivererInformation(Deliverer deliverer) {
        System.out.println("Food contractor: "+deliverer.getProducerName());
    }
}
