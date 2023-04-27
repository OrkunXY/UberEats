package com.orkunxy.UberEats.mapper;

import com.orkunxy.UberEats.dto.request.RestaurantRegisterRequestDto;
import com.orkunxy.UberEats.repository.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IRestaurantMapper {
    IRestaurantMapper INSTANCE = Mappers.getMapper(IRestaurantMapper.class);

    Restaurant toRestaurantRegisterDto(final RestaurantRegisterRequestDto dto);
}
