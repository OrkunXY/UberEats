package com.orkunxy.UberEats.repository.entity;

import lombok.*;

import javax.persistence.*;
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

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotBlank(message = "Address cannot be blank")
    private String address;

    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", message = "Invalid email format")
    @NotBlank(message = "Email cannot be blank")
    private String email;

    @ElementCollection
    @CollectionTable(name = "restaurant_menu")
    private List<Product> productList;

    @ElementCollection
    @CollectionTable(name = "restaurant_orders")
    private List<Order> orders;
}