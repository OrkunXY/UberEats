package com.orkunxy.UberEats.repository;

import com.orkunxy.UberEats.repository.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface IProductRepository extends JpaRepository<Product,Long> {
    @Override
    Optional<Product> findById(Long aLong);

    Optional<Product>findOptionalByName(String name);

}


