package com.orkunxy.UberEats.mapper;

import com.orkunxy.UberEats.dto.request.RegisterRequestDto;
import com.orkunxy.UberEats.repository.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ICustomerMapper {
    ICustomerMapper INSTANCE = Mappers.getMapper(ICustomerMapper.class);

    Customer toCustomerRegisterDto(final RegisterRequestDto dto);


    }