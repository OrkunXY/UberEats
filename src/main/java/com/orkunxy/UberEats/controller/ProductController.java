package com.orkunxy.UberEats.controller;

import com.orkunxy.UberEats.repository.entity.Product;
import com.orkunxy.UberEats.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.orkunxy.UberEats.constants.EndPoints.*;

@RestController
@RequestMapping(PRODUCT)
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Product>> findall(){
        return ResponseEntity.ok(productService.findAll());
    }

    @PostMapping(SAVE)
    public ResponseEntity<Product> save(@RequestBody Product product){
        return ResponseEntity.ok(productService.save(product));
    }
}
