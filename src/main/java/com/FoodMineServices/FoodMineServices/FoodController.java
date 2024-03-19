package com.FoodMineServices.FoodMineServices;

import com.FoodMineServices.FoodMineServices.entities.Food;
import com.FoodMineServices.FoodMineServices.entities.Tag;
import com.FoodMineServices.FoodMineServices.entities.TagsFood;
import com.FoodMineServices.FoodMineServices.models.FoodRequest;
import com.FoodMineServices.FoodMineServices.repository.TagsFoodRepository;
import com.FoodMineServices.FoodMineServices.services.FoodService;
import com.FoodMineServices.FoodMineServices.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/food")
@RestController
public class FoodController {

    @Autowired
    private FoodService service;

    @Autowired
    private TagService tagService;

    @Autowired
    private TagsFoodRepository tagsFoodRepository;

    @GetMapping("/getAllFoods")
    public List<Food> getAllFoods(){
        return service.getAllFoods();
    }

    @PostMapping("/saveFood")
    public Food saveFood(@RequestBody FoodRequest request){
        Food foodResponse =  service.saveFood(request);
        List<Tag> tags = tagService.getAllTags();
        for(Tag tag : request.getTags()){
            if(!tags.contains(tag)){
                Tag tagUpdate = new Tag();
                tag.setTagName(tag.getTagName());
                Tag newTag = tagService.saveTag(tagUpdate);
                TagsFood tagsFoodUpdate = new TagsFood();
                tagsFoodUpdate.setFoodId(foodResponse.getFoodId());
                tagsFoodUpdate.setTagId(newTag.getTagId());
                tagsFoodRepository.save(tagsFoodUpdate);
            }else{
                TagsFood tagsFoodUpdated = new TagsFood();
                tagsFoodUpdated.setTagId(tag.getTagId());
                tagsFoodUpdated.setFoodId(foodResponse.getFoodId());
                tagsFoodRepository.save(tagsFoodUpdated);
            }
        }
        return foodResponse;
    }

}
