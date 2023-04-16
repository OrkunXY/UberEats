package com.orkunxy.UberEats.service;


import com.orkunxy.UberEats.repository.ICustomerRepository;
import com.orkunxy.UberEats.repository.entity.Customer;
import com.orkunxy.UberEats.utility.ServiceManager;
import org.springframework.stereotype.Service;



@Service
public class CustomerService extends ServiceManager<Customer,Long> {

    private final ICustomerRepository customerRepository;

    public CustomerService(ICustomerRepository customerRepository) {
        super(customerRepository);
        this.customerRepository = customerRepository;
    }
}

