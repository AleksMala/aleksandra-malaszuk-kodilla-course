package com.kodilla.good.patterns.foodchallenge;

public class DeliveryDto {

    private Product product;
    private boolean isAvailable;

    public DeliveryDto(Product product, boolean isAvailable) {
        this.product = product;
        this.isAvailable = isAvailable;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
