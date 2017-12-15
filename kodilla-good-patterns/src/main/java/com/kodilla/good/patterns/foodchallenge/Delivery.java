package com.kodilla.good.patterns.foodchallenge;

public class Delivery {

    private Product product;
    private Producer producer;
    private int quantity;

    public Delivery(Producer producer, Product product, int quantity) {
        this.producer = producer;
        this.quantity = quantity;
        this.product = product;
    }

    public Producer getProducer() {
        return producer;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

}
