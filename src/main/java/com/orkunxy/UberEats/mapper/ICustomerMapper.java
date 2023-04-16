package com.orkunxy.UberEats.mapper;

import com.orkunxy.UberEats.dto.request.customer.RegisterRequestDto;
import com.orkunxy.UberEats.dto.response.CustomerRegisterResponseDto;
import com.orkunxy.UberEats.repository.entity.Customer;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ICustomerMapper {

    ICustomerMapper INSTANCE= Mappers.getMapper(ICustomerMapper.class);

    Customer toCustomer(final RegisterRequestDto dto);

    CustomerRegisterResponseDto toCustomerRegisterResponseDto(final Customer customer);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void customerUpdateFromDto
            (CustomerUpdateRequestDto dto, @MappingTarget Customer customer);

}
