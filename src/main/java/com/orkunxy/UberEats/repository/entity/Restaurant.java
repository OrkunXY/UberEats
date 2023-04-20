package com.orkunxy.UberEats.repository.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;
import java.util.Locale;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "tblrestaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Min(0)
    @Max(10)
    @Builder.Default
    private Double point = 5.2;
    @NotBlank(message = "Address cannot be blank")
    private String address;

    @ElementCollection
    List<Integer>productId;

    @ElementCollection
    List<Integer>orderId;



}