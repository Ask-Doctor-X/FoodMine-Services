package com.FoodMineServices.FoodMineServices.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "TagsAndFood")
public class TagsFood {
    @Column(name = "tag_id")
    String tagId;
    @Id
    @Column(name = "food_id")
    String foodId;
}
