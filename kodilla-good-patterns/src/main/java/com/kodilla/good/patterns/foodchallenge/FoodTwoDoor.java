package com.kodilla.good.patterns.foodchallenge;

public class FoodTwoDoor {

    private ProductInfo productInfo;
    private OrderService orderService;
    private Producer producer;

    public FoodTwoDoor(ProductInfo productInfo, OrderService orderService, Producer producer) {
        this.productInfo = productInfo;
        this.orderService = orderService;
        this.producer = producer;
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

        FoodTwoDoor foodTwoDoor = new FoodTwoDoor(foodSupplierProduct, orderService, orderRetriever.efs);
        for (Delivery deliveryInfo : orderRetriever.retrieve()) {
            foodTwoDoor.processingDelivery(deliveryInfo);
        }
    }
}
