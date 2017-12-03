package com.kodilla.good.patterns.foodchallenge;

public class ExtraFoodShop implements ProcessDelivery {

    @Override
    public String process(Deliverer deliverer, Product product) {
        return deliverer.getProducerName() + product.getProductName();
    }
}
