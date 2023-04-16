package com.orkunxy.UberEats.controller;

import com.orkunxy.UberEats.dto.request.customer.ActivateStatusRequestDto;
import com.orkunxy.UberEats.dto.request.customer.LoginRequestDto;
import com.orkunxy.UberEats.dto.request.customer.RegisterRequestDto;
import com.orkunxy.UberEats.repository.entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static com.orkunxy.UberEats.constants.EndPoints.CUSTOMER;

@RestController
@RequestMapping(CUSTOMER)
@RequiredArgsConstructor
public class CustomerController {

}
