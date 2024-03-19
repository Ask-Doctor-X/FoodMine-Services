package com.FoodMineServices.FoodMineServices.repository;

import com.FoodMineServices.FoodMineServices.entities.TagsFood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagsFoodRepository extends JpaRepository<TagsFood, String> {}
