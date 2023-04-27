package com.orkunxy.UberEats.repository;

import com.orkunxy.UberEats.repository.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface IOrderRepository extends JpaRepository<Order,Long> {



}