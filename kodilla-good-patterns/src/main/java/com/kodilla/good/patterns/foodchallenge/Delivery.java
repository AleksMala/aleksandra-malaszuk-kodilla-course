package com.kodilla.good.patterns.foodchallenge;

public class Delivery {

    private Product product;
    private OrderService orderService;
    private int quantity;

    public Delivery(OrderService orderService, Product product, int quantity) {
        this.orderService = orderService;
        this.quantity = quantity;
        this.product = product;
    }

    public OrderService orderService(){
        return orderService;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }
}
