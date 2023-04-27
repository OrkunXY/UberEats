package com.orkunxy.UberEats.repository;

import com.orkunxy.UberEats.repository.entity.joins.OrderCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderCustomer extends JpaRepository<OrderCustomer,Long> {
}
