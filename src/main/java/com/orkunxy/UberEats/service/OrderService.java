package com.orkunxy.UberEats.service;

import com.orkunxy.UberEats.repository.IOrderRepository;
import com.orkunxy.UberEats.repository.entity.Order;
import com.orkunxy.UberEats.utility.IService;
import com.orkunxy.UberEats.utility.ServiceManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService implements IService<Order,Long> {
    private IOrderRepository orderRepository;

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
}
