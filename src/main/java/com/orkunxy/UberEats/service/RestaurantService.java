package com.orkunxy.UberEats.service;



import com.orkunxy.UberEats.dto.request.RestaurantRegisterRequestDto;
import com.orkunxy.UberEats.mapper.IRestaurantMapper;
import com.orkunxy.UberEats.repository.IRestaurantRepository;
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

    @Override
    public Restaurant save(Restaurant restaurant) {
        return repository.save(restaurant);
    }

    @Override
    public Iterable<Restaurant> saveAll(Iterable<Restaurant> entities) {
        return null;
    }

    @Override
    public Restaurant update(Restaurant restaurant) {
        return null;
    }

    @Override
    public void delete(Restaurant restaurant) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Optional<Restaurant> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public List<Restaurant> findAll() {
        List<Restaurant> restaurantList=repository.findAll();
        if (restaurantList.isEmpty()){
            System.out.println("listebos?!!?");
        }

        return repository.findAll();
    }
    public void save(RestaurantRegisterRequestDto dto){
        save(IRestaurantMapper.INSTANCE.toRestaurantRegisterDto(dto));

    }
}
