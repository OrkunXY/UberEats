package com.orkunxy.UberEats.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RestaurantRegisterRequestDto {
    String name;
    Double point;
    String adress;

}
