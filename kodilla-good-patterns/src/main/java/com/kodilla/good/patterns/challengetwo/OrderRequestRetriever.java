package com.kodilla.good.patterns.challengetwo;

import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {

    public List<OrderRequest> retrieve(){

        List<OrderRequest> orderRequestList = new ArrayList<>();

        User user = new User("John", "Smith");
        Product product = new Product("Book", 45.50);
        User user1 = new User("Alecs", "Dean");
        Product product1 = new Product("game", 50.00);
        User user2 = new User("Jim", "Oneil");
        Product product2 = new Product("Glass", 10.50);

        orderRequestList.add(new OrderRequest(user, product));
        orderRequestList.add(new OrderRequest(user1, product1));
        orderRequestList.add(new OrderRequest(user2, product2));

        return new ArrayList<>(orderRequestList);
    }
}
