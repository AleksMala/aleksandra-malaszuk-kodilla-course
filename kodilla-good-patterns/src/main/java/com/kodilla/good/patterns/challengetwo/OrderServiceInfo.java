package com.kodilla.good.patterns.challengetwo;

public class OrderServiceInfo implements OrderService {

    @Override
    public boolean order(User user, Product product) throws Exception {

        try {
            product.getProductName().equals(product);
            System.out.println("Product is available, you order will begin soon");

        } catch (Exception e) {
            System.out.println("We don't have any requested products");

        } finally {
            System.out.println("Order status: ");
        }
        return true;
    }
}
