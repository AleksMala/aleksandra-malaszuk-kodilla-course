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

    public DeliveryDto processingDelivery (final DeliveryInfo deliveryInfo){
        boolean isAvailable = productInfo.productInfo(deliveryInfo.getProduct());

        if (isAvailable) {
            delivererInformation.delivererInfo(deliveryInfo.getDeliverer());
            processDelivery.process(deliveryInfo.getDeliverer(), deliveryInfo.getProduct());
            return new DeliveryDto(deliveryInfo.getDeliverer(), true);
        } else {
            return new DeliveryDto(deliveryInfo.getDeliverer(), false);
        }
    }

    public static void main (String args []){

        OrderRetriever orderRetriever = new OrderRetriever();
        DeliveryInfo deliveryInfo = orderRetriever.retrieve().iterator().next();

        ProcessDelivery processDelivery = new ExtraFoodShop();
        FoodSuplierProduct extraFoodShopProduct = new FoodSuplierProduct();
        DelivererInformation delivererInformation = new DelivererName();

        FoodTwoDoor foodTwoDoor = new FoodTwoDoor(delivererInformation, extraFoodShopProduct,processDelivery);
        foodTwoDoor.processingDelivery(deliveryInfo);
    }
}
