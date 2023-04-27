package com.orkunxy.UberEats.service;



import com.orkunxy.UberEats.dto.request.RestaurantRegisterRequestDto;
import com.orkunxy.UberEats.mapper.IRestaurantMapper;
import com.orkunxy.UberEats.repository.IRestaurantRepository;
import com.orkunxy.UberEats.repository.entity.Customer;
import com.orkunxy.UberEats.repository.entity.Restaurant;

import com.orkunxy.UberEats.utility.ServiceManager;

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService extends ServiceManager<Restaurant,Long> {

    private final IRestaurantRepository repository;

    public RestaurantService(IRestaurantRepository repository){
        super(repository);
        this.repository=repository;
    }


    public Restaurant restaurantRegisterRequestDto(RestaurantRegisterRequestDto dto){
        System.out.println(dto);
        Restaurant restaurant= Restaurant.builder()
                .name(dto.getName())
                .adress(dto.getAdress())
                .point(dto.getPoint())
                .build();
            System.out.println(restaurant);
        return repository.save(restaurant);

    }
}
