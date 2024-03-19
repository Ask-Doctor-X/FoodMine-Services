package com.FoodMineServices.FoodMineServices;

import com.FoodMineServices.FoodMineServices.entities.Tag;
import com.FoodMineServices.FoodMineServices.services.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private TagService tagService;

    @PostMapping("/saveTag")
    @ResponseStatus(HttpStatus.CREATED)
    public Tag saveTags(@RequestBody Tag tag){
        return tagService.saveTag(tag);
    }
}
