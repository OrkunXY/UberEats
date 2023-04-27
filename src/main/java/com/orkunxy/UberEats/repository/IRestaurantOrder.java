package com.orkunxy.UberEats.repository;

import com.orkunxy.UberEats.repository.entity.joins.RestaurantOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRestaurantOrder extends JpaRepository<RestaurantOrder,Long> {
}
