package com.kodilla.good.patterns.foodchallenge;

public class Food2Door {

    private ProductInfo productInfo;
    private OrderService orderService;

    public Food2Door(ProductInfo productInfo, OrderService orderService) {
        this.productInfo = productInfo;
        this.orderService = orderService;
    }

    public DeliveryDto processingDelivery(final Delivery delivery) {
        boolean isAvailable = orderService.processOrder(delivery.getProducer(), delivery.getProduct(), delivery.getQuantity());

        if (isAvailable) {
            productInfo.productInfo(delivery.getProduct());
        }
        return new DeliveryDto(delivery.getProduct(), isAvailable);
    }

    public static void main(String args[]) {

        OrderRetriever orderRetriever = new OrderRetriever();

        FoodSupplierProduct foodSupplierProduct = new FoodSupplierProduct();
        OrderService orderService = new OrderServiceInfo();

        Food2Door foodTwoDoor = new Food2Door(foodSupplierProduct, orderService);
        for (Delivery deliveryInfo : orderRetriever.retrieve()) {
            foodTwoDoor.processingDelivery(deliveryInfo);
        }
    }
}
