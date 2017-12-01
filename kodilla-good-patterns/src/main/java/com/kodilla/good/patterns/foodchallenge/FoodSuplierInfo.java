package com.kodilla.good.patterns.foodchallenge;

public class FoodSuplierInfo implements ProcessDelivery {
    @Override
    public void processInfo(Deliverer deliverer, Product product) {
        System.out.println(deliverer.getProducerName() + "Product you want to buy: " + product.getProductName()+",quantity: " + product.getQuantity());
    }
}
