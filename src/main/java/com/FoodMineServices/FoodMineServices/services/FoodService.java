package com.FoodMineServices.FoodMineServices.services;

import com.FoodMineServices.FoodMineServices.entities.Food;
import com.FoodMineServices.FoodMineServices.entities.Tag;
import com.FoodMineServices.FoodMineServices.entities.TagsFood;
import com.FoodMineServices.FoodMineServices.models.FoodRequest;
import com.FoodMineServices.FoodMineServices.repository.FoodRepository;
import com.FoodMineServices.FoodMineServices.repository.TagsFoodRepository;
import com.FoodMineServices.FoodMineServices.repository.TagsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    @Autowired
    private TagsRepository tagsRepository;

    @Autowired
    private TagsFoodRepository tagsFoodRepository;

    public List<Food> getAllFoods(){
        return foodRepository.findAll();
    }

    public Food saveFood(FoodRequest request){
        Food food = new Food();
        String foodId = UUID.randomUUID().toString();
        food.setFoodId(foodId);
        food.setName(request.getName());
        food.setPrice(request.getPrice());
        food.setCookTime(request.getCookTime());

        List<Tag> tags = tagsRepository.findAll();

        if(!request.getTags().isEmpty()){
            for(Tag tag : request.getTags()){
                Optional<Tag> requestedTag = tags.stream().filter(value -> value.getTagName().equalsIgnoreCase(tag.getTagName())).findFirst();
                if(requestedTag.isPresent()){
                    TagsFood tagsFood = new TagsFood();
                    tagsFood.setFoodId(foodId);
                    tagsFood.setTagId(requestedTag.get().getTagId());
                    tagsFoodRepository.save(tagsFood);
                }else{
                    Tag newTag = new Tag();
                    newTag.setTagName(tag.getTagName());
                    Tag addedtag = tagsRepository.save(newTag);
                    TagsFood addedTagsFood = new TagsFood();
                    addedTagsFood.setFoodId(foodId);
                    addedTagsFood.setTagId(addedtag.getTagId());
                    tagsFoodRepository.save(addedTagsFood);
                }
            }
        }
        return foodRepository.save(food);
    }
}
