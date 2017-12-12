package com.kodilla.good.patterns.foodchallenge;

public interface OrderService {

    boolean processOrder(Producer producer, Product product, int quantity);
}
