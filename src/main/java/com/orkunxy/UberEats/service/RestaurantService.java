package com.orkunxy.UberEats.service;

import com.orkunxy.UberEats.repository.IRestaurantRepository;
import com.orkunxy.UberEats.repository.entity.Restaurant;
import com.orkunxy.UberEats.utility.IService;
import com.orkunxy.UberEats.utility.ServiceManager;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RestaurantService implements IService<Restaurant,Long> {
private final IRestaurantRepository restaurantRepository;

    @Override
    public Restaurant save(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
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
        List<Restaurant> restaurantList=restaurantRepository.findAll();
        if (restaurantList.isEmpty()){
            System.out.println("listebos?!!?");
        }

        return restaurantRepository.findAll();
    }
}
