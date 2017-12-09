package com.kodilla.good.patterns.foodchallenge;

public class Product {

    private String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return  productName;
    }
}
