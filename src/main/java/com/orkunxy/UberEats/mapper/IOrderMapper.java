package com.orkunxy.UberEats.mapper;

import com.orkunxy.UberEats.dto.request.GiveOrderDto;
import com.orkunxy.UberEats.repository.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IOrderMapper {
    IOrderMapper INSTANCE = Mappers.getMapper(IOrderMapper.class);

    Order fromGiveOrder(final GiveOrderDto dto);


}
