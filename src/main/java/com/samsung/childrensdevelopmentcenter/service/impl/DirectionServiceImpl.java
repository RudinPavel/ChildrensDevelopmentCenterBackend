package com.samsung.childrensdevelopmentcenter.service.impl;

import com.samsung.childrensdevelopmentcenter.model.Direction;
import com.samsung.childrensdevelopmentcenter.service.DirectionService;
import com.samsung.childrensdevelopmentcenter.repository.DirectionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DirectionServiceImpl implements DirectionService {

    private DirectionRepository directionRepository;

    public DirectionServiceImpl(DirectionRepository directionRepository) {
        this.directionRepository = directionRepository;
    }

    @Override
    public Direction create(Direction direction) {
        return directionRepository.save(direction);
    }

    @Override
    public Direction findById(Long id) {
        Optional<Direction> direction = directionRepository.findById(id);
        return direction.isPresent() ? direction.get() : null;
    }

    @Override
    public List<Direction> findAll() {
        return directionRepository.findAll();
    }

    @Override
    public Direction update(Direction direction) {
        return directionRepository.save(direction);
    }

    @Override
    public void deleteById(Long id) {
        directionRepository.deleteById(id);
    }
}
