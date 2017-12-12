package com.kodilla.good.patterns.foodchallenge;

public class OrderServiceInfo implements OrderService {

    @Override
    public boolean processOrder(Producer producer, Product product, int quantity) {
        System.out.println("Completing your order: ");
        return producer.process(product, quantity);
    }
}
