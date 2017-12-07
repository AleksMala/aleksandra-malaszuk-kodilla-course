package com.kodilla.good.patterns.foodchallenge;

public class FoodTwoDoor {

    private ProductInfo productInfo;
    private OrderService orderService;

    public FoodTwoDoor (ProductInfo productInfo, OrderService orderService) {
        this.productInfo = productInfo;
        this.orderService = orderService;
    }

    public DeliveryDto processingDelivery (final Delivery delivery){
         boolean isAvailable = orderService.process(delivery.getProduct(), delivery.getQuantity());

        if (isAvailable) {
            productInfo.productInfo(delivery.getProduct());
            orderService.process(delivery.getProduct(), delivery.getQuantity());
        }
        return new DeliveryDto(delivery.getProduct(), isAvailable);
    }

    public static void main (String args []){

        OrderRetriever orderRetriever = new OrderRetriever();

        FoodSuplierProduct foodSuplierProduct = new FoodSuplierProduct();

        FoodTwoDoor foodTwoDoor = new FoodTwoDoor(foodSuplierProduct, orderRetriever.extraFoodShop);
        for(Delivery deliveryInfo : orderRetriever.retrieve()) {
            foodTwoDoor.processingDelivery(deliveryInfo);
        }
    }
}
