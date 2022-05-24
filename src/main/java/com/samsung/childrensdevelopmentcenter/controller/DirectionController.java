package com.samsung.childrensdevelopmentcenter.controller;

import com.samsung.childrensdevelopmentcenter.dto.DirectionDto;
import com.samsung.childrensdevelopmentcenter.model.Direction;
import com.samsung.childrensdevelopmentcenter.mapper.DirectionMapper;
import com.samsung.childrensdevelopmentcenter.service.DirectionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/directions")
public class DirectionController {

    private DirectionService directionService;
    private DirectionMapper directionMapper;

    public DirectionController(DirectionService directionService, DirectionMapper directionMapper) {
        this.directionService = directionService;
        this.directionMapper = directionMapper;
    }

    @PostMapping
    public DirectionDto create(@RequestBody DirectionDto directionDto) {
        Direction direction = directionMapper.fromDto(directionDto);
        Direction createdDirection = directionService.create(direction);
        DirectionDto directionDtoResult = directionMapper.toDto(createdDirection);
        return directionDtoResult;
    }

    @GetMapping("/{id}")
    public DirectionDto findById(@PathVariable("id") Long id) {
        Direction direction = directionService.findById(id);
        DirectionDto directionDto = directionMapper.toDto(direction);
        return directionDto;
    }

    @GetMapping
    public List<DirectionDto> findAll() {
        List<Direction> directions = directionService.findAll();
        List<DirectionDto> directionDtoList = directionMapper.toDtoList(directions);
        return directionDtoList;
    }

    @PutMapping
    public DirectionDto update(@RequestBody DirectionDto directionDto) {
        Direction direction = directionMapper.fromDto(directionDto);
        Direction updatedDirection = directionService.update(direction);
        DirectionDto directionDtoResult = directionMapper.toDto(updatedDirection);
        return directionDtoResult;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        directionService.deleteById(id);
    }
}
