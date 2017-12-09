package com.kodilla.good.patterns.challengetwo;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                           final OrderService orderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isAvailable = orderService.order(orderRequest.getUser(),orderRequest.getProduct());

        if(isAvailable) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createRepository(orderRequest.getUser(), orderRequest.getProduct());
        }
        return new OrderDto(orderRequest.getUser(), isAvailable);
    }

    public static void main (String args []){

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();

        OrderInformation orderInformation = new OrderInformation();
        OrderRepo orderRepo = new OrderRepo();
        OrderServiceInfo orderServiceInfo = new OrderServiceInfo();

        ProductOrderService productOrderService = new ProductOrderService(orderInformation, orderServiceInfo, orderRepo);
        for (OrderRequest orderRequest: orderRequestRetriever.retrieve()) {
            productOrderService.process(orderRequest);
        }
    }
}
