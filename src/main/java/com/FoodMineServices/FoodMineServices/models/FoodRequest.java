package com.FoodMineServices.FoodMineServices.models;

import com.FoodMineServices.FoodMineServices.entities.Tag;
import lombok.Data;;import java.util.List;

@Data
public class FoodRequest {
    String name;
    int price;
    String cookTime;
    List<Tag> tags;
}
