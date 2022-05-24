package com.samsung.childrensdevelopmentcenter.repository;


import com.samsung.childrensdevelopmentcenter.model.Direction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectionRepository extends JpaRepository<Direction, Long> {
    Direction findByName(String name);
}
