package com.FoodMineServices.FoodMineServices.repository;

import com.FoodMineServices.FoodMineServices.entities.Miner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Miner, String> {}
