package com.FoodMineServices.FoodMineServices.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="Miners")
@Data
public class Miner {
    @Id
    @Column(name="miner_id")
    String minerId;
    @Column(name="miner_name")
    String minerName;

}
