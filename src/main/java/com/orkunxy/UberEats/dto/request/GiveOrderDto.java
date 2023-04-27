package com.orkunxy.UberEats.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GiveOrderDto {
    private List<Long> productId;

    private Long customerId;
}