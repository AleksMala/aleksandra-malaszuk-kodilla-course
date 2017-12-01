package com.kodilla.good.patterns.foodchallenge;

public class DeliveryDto {

    private Deliverer deliverer;
    private boolean isAvailable;

    public DeliveryDto(Deliverer deliverer, boolean isAvailable) {
        this.deliverer = deliverer;
        this.isAvailable = isAvailable;
    }

    public Deliverer getDeliverer() {
        return deliverer;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
