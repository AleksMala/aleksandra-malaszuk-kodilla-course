package com.kodilla.good.patterns.foodchallenge;

public class DeliveryInfo {

    private Deliverer deliverer;
    private Product product;

    public DeliveryInfo(Deliverer deliverer, Product product) {
        this.deliverer = deliverer;
        this.product = product;
    }

    public Deliverer getDeliverer() {
        return deliverer;
    }

    public Product getProduct() {
        return product;
    }
}
