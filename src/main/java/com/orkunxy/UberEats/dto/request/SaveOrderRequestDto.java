package com.orkunxy.UberEats.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveOrderRequestDto {

    private List<Integer> productsId;

    private Integer restaurantId;

    private Integer customerId;
}