package com.orkunxy.UberEats.service;


import com.orkunxy.UberEats.dto.request.RegisterRequestDto;
import com.orkunxy.UberEats.repository.ICustomerRepository;
import com.orkunxy.UberEats.repository.entity.Customer;
import com.orkunxy.UberEats.utility.IService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class CustomerService implements IService<Customer,Long> {

    private final ICustomerRepository customerRepository;

   /* public CustomerService(ICustomerRepository customerRepository) {
        super(customerRepository);
        this.customerRepository = customerRepository;
    }*/

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Iterable<Customer> saveAll(Iterable<Customer> t) {
        return customerRepository.saveAll(t);
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }

    @Override
    public void delete(Customer customer) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Optional<Customer> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = customerRepository.findAll();
        if (customerList.isEmpty()){
            throw new NullPointerException("Liste boş");
        }
        return customerList;
    }

    public RegisterRequestDto registerDto(RegisterRequestDto dto){
        Customer customer = Customer.builder()
                .name(dto.getName())
                .surname(dto.getSurname())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .rePassword(dto.getRePassword())
                .build();
        if (!dto.getPassword().equals(dto.getRePassword())
                || dto.getPassword().isBlank() || dto.getRePassword().isBlank()){
            throw new RuntimeException("Şifreler aynı değildir.");
        }else {
            customerRepository.save(customer);
        }
        return dto;
    }
    public Customer register(String name, String surname, String email, String password, String repassword){
        Customer customer = Customer.builder()
                .name(name)
                .surname(surname)
                .email(email)
                .password(password)
                .rePassword(repassword)
                .build();
        if (!password.equals(repassword) || password.isBlank() || repassword.isBlank()){
            throw new RuntimeException("Şifreler aynı değildir.");
        }else {
            return customerRepository.save(customer);
        }
    }
}

