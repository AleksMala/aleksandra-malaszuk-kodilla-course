package com.kodilla.good.patterns.foodchallenge;

public class FoodTwoDoor {

    private ProductInfo productInfo;
    private ProcessDelivery processDelivery;
    private DelivererInformation delivererInformation;

    public FoodTwoDoor (DelivererInformation delivererInformation, ProductInfo productInfo, ProcessDelivery processDelivery) {
        this.productInfo = productInfo;
        this.processDelivery = processDelivery;
        this.delivererInformation = delivererInformation;
    }

    public DeliveryDto process (final DeliveryInfo deliveryInfo){
        boolean isAvailable = productInfo.productInfo(deliveryInfo.getProduct());

        if (isAvailable) {
            delivererInformation.delivererInformation(deliveryInfo.getDeliverer());
            processDelivery.processInfo(deliveryInfo.getDeliverer(), deliveryInfo.getProduct());
            return new DeliveryDto(deliveryInfo.getDeliverer(), true);
        } else {
            return new DeliveryDto(deliveryInfo.getDeliverer(), false);
        }
    }

    public static void main (String args []){

        OrderRetriever orderRetriever = new OrderRetriever();
        DeliveryInfo deliveryInfo = orderRetriever.retrieve().get(1);

        FoodSuplier extraFoodShop = new FoodSuplier();
        FoodSuplierInfo extraFoodShopInfo = new FoodSuplierInfo();
        FoodSuplierProduct extraFoodShopProduct = new FoodSuplierProduct();

        FoodTwoDoor foodTwoDoor = new FoodTwoDoor(extraFoodShop, extraFoodShopProduct, extraFoodShopInfo);
        System.out.println(foodTwoDoor.process(deliveryInfo));
    }
}
