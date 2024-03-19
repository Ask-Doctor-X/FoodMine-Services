package com.FoodMineServices.FoodMineServices.repository;

import com.FoodMineServices.FoodMineServices.entities.FoodsFavorite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodsFavouriteRepository extends JpaRepository<FoodsFavorite, String> {}
