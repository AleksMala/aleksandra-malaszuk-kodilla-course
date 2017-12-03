package com.kodilla.good.patterns.foodchallenge;

public class GlutenFreeShop implements ProcessDelivery{

    @Override
    public String process(Deliverer deliverer, Product product) {
return deliverer.getProducerName();
    }
}
