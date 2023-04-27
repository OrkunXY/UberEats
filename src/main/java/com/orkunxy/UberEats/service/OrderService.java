package com.orkunxy.UberEats.service;

import com.orkunxy.UberEats.dto.request.GiveOrderDto;
import com.orkunxy.UberEats.mapper.IOrderMapper;
import com.orkunxy.UberEats.repository.IOrderRepository;
import com.orkunxy.UberEats.repository.entity.Order;
import com.orkunxy.UberEats.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class OrderService extends ServiceManager<Order,Long> {
    private IOrderRepository orderRepository;

    private CustomerService customerService;

    public OrderService(IOrderRepository orderRepository,

                        CustomerService customerService){
        super(orderRepository);
        this.orderRepository=orderRepository;
        this.customerService=customerService;

    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Iterable<Order> saveAll(Iterable<Order> entities) {
        return null;
    }

    @Override
    public Order update(Order order) {
        return null;
    }

    @Override
    public void delete(Order order) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Optional<Order> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }


    public Order giveOrder(GiveOrderDto dto) {
        System.out.println(dto);
        Order order=orderRepository.save(IOrderMapper.INSTANCE.fromGiveOrder(dto));
        System.out.println("order kaydedildi"+order);
        return order;
    }
}

