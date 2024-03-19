package com.FoodMineServices.FoodMineServices.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "MinerFavourites")
public class FoodsFavorite {
    @Id
    @Column(name = "miner_id")
    String minerId;
    @Column(name = "food_id")
    String foodId;
}
