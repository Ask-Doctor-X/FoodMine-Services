package com.FoodMineServices.FoodMineServices.repository;

import com.FoodMineServices.FoodMineServices.entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food,String> {}
