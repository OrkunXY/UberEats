package com.orkunxy.UberEats.service;

import com.orkunxy.UberEats.repository.IProductRepository;
import com.orkunxy.UberEats.repository.entity.Product;
import com.orkunxy.UberEats.utility.IService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class ProductService implements IService<Product,Long>{

    private final IProductRepository productRepository;

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Iterable<Product> saveAll(Iterable<Product> entities) {
        return null;
    }

    @Override
    public Product update(Product product) {
        return null;
    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public Optional<Product> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
