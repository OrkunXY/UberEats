package com.orkunxy.UberEats.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaveProductRequestDto {
    String name;
    String category;
    Double cost;
}