package com.FoodMineServices.FoodMineServices.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Objects;

@Entity
@Data
@Table(name="Tag")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="tag_id")
    String tagId;
    @Column(name="tag_name")
    String tagName;

    @Override
    public boolean equals(Object object){
        if (object == this) {
            return true;
        }

        if (!(object instanceof Tag tag)) {
            return false;
        }

        return this.tagId.equals(tag.tagId) || this.tagName.equalsIgnoreCase(tag.tagName);
    }
}
