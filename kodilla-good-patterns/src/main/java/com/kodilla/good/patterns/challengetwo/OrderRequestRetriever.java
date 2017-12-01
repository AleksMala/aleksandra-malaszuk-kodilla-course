package com.kodilla.good.patterns.challengetwo;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){

        User user = new User("John", "Smith");

        Product product = new Product("Book", 45.50, 1);

        return new OrderRequest(user, product);
    }
}
