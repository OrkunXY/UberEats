package com.orkunxy.UberEats.repository;

import com.orkunxy.UberEats.repository.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRestaurantRepository extends JpaRepository<Restaurant,Long> {
}
