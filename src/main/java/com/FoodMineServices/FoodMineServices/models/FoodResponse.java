package com.FoodMineServices.FoodMineServices.models;

import com.FoodMineServices.FoodMineServices.entities.Food;
import com.FoodMineServices.FoodMineServices.entities.Tag;
import lombok.Builder;

import java.util.List;

@Builder
public record FoodResponse(
        Food food,
        List<Tag> tags
) {
    public static FoodResponse createFoodResponse(Food food, List<Tag> tags){
        return FoodResponse.builder()
                .food(food)
                .tags(tags)
                .build();
    }
}
