package com.kodilla.good.patterns.challengetwo;

import java.util.Random;

public class OrderServiceInfo implements OrderService {

    private static final Random generator = new Random();

    @Override
    public boolean order(User user, Product product){
        return generator.nextBoolean();
    }
}
