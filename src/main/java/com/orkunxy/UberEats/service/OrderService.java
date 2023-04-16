package com.orkunxy.UberEats.service;

import com.orkunxy.UberEats.repository.IOrderRepository;
import com.orkunxy.UberEats.repository.entity.Order;
import com.orkunxy.UberEats.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends ServiceManager<Order,Long> {
    private final IOrderRepository orderRepository;
    private final ProductService productService;
    private final CustomerService customerService;
    private final RestaurantService restaurantService;
    public OrderService(IOrderRepository orderRepository,
                        ProductService productService,
                        CustomerService customerService,
                        RestaurantService restaurantService){
        super(orderRepository);
        this.orderRepository = orderRepository;
        this.customerService = customerService;
        this.productService = productService;
        this.restaurantService = restaurantService;
    }
