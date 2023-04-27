package com.orkunxy.UberEats.controller;

import com.orkunxy.UberEats.dto.request.GiveOrderDto;
import com.orkunxy.UberEats.repository.entity.Order;
import com.orkunxy.UberEats.service.OrderService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
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
}
