package com.kodilla.good.patterns.foodchallenge;

public class FoodSuplierProduct implements ProductInfo {

    @Override
    public Boolean productInfo(Product product) {

        if(product.getQuantity()!=0) {
            return true;
        } else {
            return false;
        }
    }
}
