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

    public OrderDto process(final OrderRequest orderRequest) throws Exception {
        boolean isAvailable = orderService.order(orderRequest.getUser(), orderRequest.getProduct());

        if(isAvailable) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createRepository(orderRequest.getUser(), orderRequest.getProduct());
            //return new OrderDto(orderRequest.getUser(), true);
        //} else {
            //return new OrderDto(orderRequest.getUser(), false);
        }
        return new OrderDto(orderRequest.getUser(), true);
    }

    public static void main (String args []) throws Exception {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve().get(1);

        OrderInformation orderInformation = new OrderInformation();
        OrderRepo orderRepo = new OrderRepo();
        OrderServiceInfo orderServiceInfo = new OrderServiceInfo();

        ProductOrderService productOrderService = new ProductOrderService(orderInformation, orderServiceInfo, orderRepo);
        productOrderService.process(orderRequest);
    }
}
