package com.orkunxy.UberEats.repository.entity;

import com.orkunxy.UberEats.repository.entity.joins.RestaurantProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRestaurantProduct extends JpaRepository<RestaurantProduct,Long> {
}
