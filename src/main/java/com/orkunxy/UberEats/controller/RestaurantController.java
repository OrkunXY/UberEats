package com.orkunxy.UberEats.controller;

import com.orkunxy.UberEats.dto.request.RestaurantRegisterRequestDto;
import com.orkunxy.UberEats.repository.entity.Restaurant;
import com.orkunxy.UberEats.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static com.orkunxy.UberEats.constants.EndPoints.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/restaurant")
public class RestaurantController {
    private final RestaurantService restaurantService;

   /* @PostMapping(SAVE)
    public ResponseEntity<Restaurant> save (@RequestBody @Valid Restaurant restaurant) {
        return ResponseEntity.ok(restaurantService.save(restaurant));
    }*/

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Restaurant>>findall(){
        return ResponseEntity.ok(restaurantService.findAll());
    }

    @PostMapping(SAVE)
    public ResponseEntity<Restaurant> save(@RequestBody RestaurantRegisterRequestDto dto){//requestbody
        System.out.println(dto);
        return ResponseEntity.ok(restaurantService.restaurantRegisterRequestDto(dto));
    }

}
