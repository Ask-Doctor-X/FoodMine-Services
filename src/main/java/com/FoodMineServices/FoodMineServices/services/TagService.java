package com.FoodMineServices.FoodMineServices.services;

import com.FoodMineServices.FoodMineServices.entities.Tag;
import com.FoodMineServices.FoodMineServices.entities.TagsFood;
import com.FoodMineServices.FoodMineServices.repository.TagsFoodRepository;
import com.FoodMineServices.FoodMineServices.repository.TagsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {

    @Autowired
    private TagsRepository tagsRepository;

    @Autowired
    private TagsFoodRepository tagsFoodRepository;

    public Tag saveTag(Tag tag){
        return tagsRepository.save(tag);
    }
    public List<Tag> getAllTags(){return tagsRepository.findAll();}
    
}
