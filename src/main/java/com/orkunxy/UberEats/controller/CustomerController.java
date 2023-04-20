package com.orkunxy.UberEats.controller;

import com.orkunxy.UberEats.dto.request.RegisterRequestDto;
import com.orkunxy.UberEats.repository.entity.Customer;
import com.orkunxy.UberEats.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.orkunxy.UberEats.constants.EndPoints.*;

@RestController
@RequestMapping(CUSTOMER)
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;


    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Customer>> findAll(){

        return ResponseEntity.ok(customerService.findAll());
    }
    @PostMapping(REGISTERdto)
    public ResponseEntity<RegisterRequestDto> registerDto(@RequestBody RegisterRequestDto dto){
        return ResponseEntity.ok(customerService.registerDto(dto));
    }
    @PostMapping(REGISTER)
    public ResponseEntity<Customer> register(String name,String surname,String email,String password,String repassword){
        return ResponseEntity.ok(customerService.register(name, surname, email, password, repassword));
    }
}
