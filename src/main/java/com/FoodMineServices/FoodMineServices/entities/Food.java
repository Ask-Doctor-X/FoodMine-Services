package com.FoodMineServices.FoodMineServices.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="Food")
@Data
public class Food {
    @Id
    @Column(name="food_id")
    String foodId;
    @Column(name="price")
    int price;
    @Column(name="name")
    String name;
    @Column(name="cook_time")
    String cookTime;
}
