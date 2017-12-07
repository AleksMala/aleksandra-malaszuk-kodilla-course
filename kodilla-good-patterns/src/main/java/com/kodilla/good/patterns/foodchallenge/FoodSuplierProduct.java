package com.kodilla.good.patterns.foodchallenge;

public class FoodSuplierProduct implements ProductInfo {

    @Override
    public String productInfo(Product product) {
        return product.getProductName();
    }
}
