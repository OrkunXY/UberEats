package com.orkunxy.UberEats.dto.request.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterRequestDto {
    private String name;
    private String surname;
    private String email;
    private String address;
    private String password;
    private String rePassword;
    private String phoneNumber;
    private String cardDetails;
}