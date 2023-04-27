package com.orkunxy.UberEats.repository.entity.joins;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tblRestaurantOrder")
@Entity
@ToString

public class RestaurantOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long restaurantId;
    Long orderId;

}
