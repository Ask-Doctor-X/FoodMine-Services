package com.FoodMineServices.FoodMineServices.repository;

import com.FoodMineServices.FoodMineServices.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;



@Repository
public interface TagsRepository extends JpaRepository<Tag, String>, QueryByExampleExecutor<Tag> {}
