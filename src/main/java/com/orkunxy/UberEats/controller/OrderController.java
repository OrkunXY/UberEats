package com.orkunxy.UberEats.controller;

import com.orkunxy.UberEats.dto.request.GiveOrderDto;
import com.orkunxy.UberEats.repository.entity.Order;
import com.orkunxy.UberEats.repository.entity.joins.OrderCustomer;
import com.orkunxy.UberEats.service.OrderService;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

import static com.orkunxy.UberEats.constants.EndPoints.SEND_ORDER;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Order")
public class OrderController {
    private final OrderService orderService;



    @PostMapping(SEND_ORDER)
    public ResponseEntity<Order> sendOrder(@RequestBody @Valid GiveOrderDto dto){
        return ResponseEntity.ok(orderService.giveOrder(dto));
    }

    @PostMapping("/give-order")
    public  ResponseEntity<OrderCustomer>save(@RequestBody OrderCustomer orderCustomer){
        return ResponseEntity.ok(orderService.save(orderCustomer));
    }
}
