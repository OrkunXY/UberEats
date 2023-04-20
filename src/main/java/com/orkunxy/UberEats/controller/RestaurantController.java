package com.orkunxy.UberEats.controller;

import com.orkunxy.UberEats.repository.entity.Restaurant;
import com.orkunxy.UberEats.service.RestaurantService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.orkunxy.UberEats.constants.EndPoints.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Restaurant")
public class RestaurantController {
    private final RestaurantService restaurantService;

    @PostMapping(SAVE)
    public ResponseEntity<Restaurant> save (@RequestBody Restaurant restaurant) {
        return ResponseEntity.ok(restaurantService.save(restaurant));
    }

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Restaurant>>findall(){
        return ResponseEntity.ok(restaurantService.findAll());
    }

}
