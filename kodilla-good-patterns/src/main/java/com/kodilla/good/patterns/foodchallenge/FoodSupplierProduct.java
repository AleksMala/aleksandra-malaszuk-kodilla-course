package com.kodilla.good.patterns.foodchallenge;

public class FoodSupplierProduct implements ProductInfo {

    @Override
    public String productInfo(Product product) {
        return product.getProductName();
    }
}
