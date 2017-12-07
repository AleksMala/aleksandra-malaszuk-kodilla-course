package com.kodilla.good.patterns.foodchallenge;

public class GlutenFreeShop implements OrderService{

    @Override
    public boolean process(Product product, int quantity) {
        return false;
    }
}
