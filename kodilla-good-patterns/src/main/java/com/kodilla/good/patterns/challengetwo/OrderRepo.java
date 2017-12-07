package com.kodilla.good.patterns.challengetwo;

public class OrderRepo implements OrderRepository {

    @Override
    public void createRepository(User user, Product product){
       System.out.println(user.toString()+"\n"+ product.toString());
    }
}
