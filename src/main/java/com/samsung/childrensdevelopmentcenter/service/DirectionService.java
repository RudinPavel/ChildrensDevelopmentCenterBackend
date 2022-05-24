package com.samsung.childrensdevelopmentcenter.service;

import com.samsung.childrensdevelopmentcenter.model.Direction;

import java.util.List;

public interface DirectionService {

    Direction create(Direction direction);

    Direction findById(Long id);

    List<Direction> findAll();

    Direction update(Direction direction);

    void deleteById(Long id);
}
