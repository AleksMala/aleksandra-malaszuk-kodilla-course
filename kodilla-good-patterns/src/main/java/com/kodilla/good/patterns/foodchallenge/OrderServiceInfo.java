package com.kodilla.good.patterns.foodchallenge;

public class OrderServiceInfo implements OrderService {

    @Override
    public boolean process(Producer producer, Product product, int quantity) {
        System.out.println("Completing your order: ");
        return producer.producerStorage(product, quantity);
    }
}
