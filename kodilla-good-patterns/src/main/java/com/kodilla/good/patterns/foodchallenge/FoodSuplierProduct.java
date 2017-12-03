package com.kodilla.good.patterns.foodchallenge;

public class FoodSuplierProduct implements ProductInfo {

    @Override
    public Boolean productInfo(Product product) {
        return product!=null;
    }
}
