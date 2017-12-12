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
        return productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        return getProductName().equals(product.getProductName());
    }

    @Override
    public int hashCode() {
        return getProductName().hashCode();
    }
}
