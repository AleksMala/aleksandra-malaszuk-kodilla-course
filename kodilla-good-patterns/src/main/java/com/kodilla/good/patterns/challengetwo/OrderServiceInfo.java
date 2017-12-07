package com.kodilla.good.patterns.challengetwo;

import java.util.Random;

public class OrderServiceInfo implements OrderService {

    private static final Random generator = new Random();

    @Override
    public boolean order(User user, Product product) throws Exception {

        try {
            if (product != null) {
                System.out.println("Product is available, you order will begin soon");
            }

        } catch (Exception e) {
            System.out.println("We don't have any requested products");

        } finally {
            System.out.println("Order status: ");
        }
        return generator.nextBoolean();
    }
}
