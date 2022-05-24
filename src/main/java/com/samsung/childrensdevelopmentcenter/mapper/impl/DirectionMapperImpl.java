package com.samsung.childrensdevelopmentcenter.mapper.impl;

import com.samsung.childrensdevelopmentcenter.dto.DirectionDto;
import com.samsung.childrensdevelopmentcenter.model.Direction;
import com.samsung.childrensdevelopmentcenter.mapper.DirectionMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DirectionMapperImpl implements DirectionMapper {
    @Override
    public Direction fromDto(DirectionDto directionDto) {
        Direction direction = new Direction();
        direction.setId(directionDto.getId());
        direction.setName(directionDto.getName());
        return direction;
    }

    @Override
    public DirectionDto toDto(Direction direction) {
        DirectionDto directionDto = new DirectionDto();
        directionDto.setId(direction.getId());
        directionDto.setName(direction.getName());
        return directionDto;
    }

    @Override
    public List<Direction> fromDtoList(List<DirectionDto> directionDtoList) {
        List<Direction> directionList = new ArrayList<>();
        for (DirectionDto directionDto :
                directionDtoList) {
            directionList.add(fromDto(directionDto));
        }
        return directionList;
    }

    @Override
    public List<DirectionDto> toDtoList(List<Direction> directionList) {
        List<DirectionDto> directionDtoList = new ArrayList<>();
        for (Direction direction :
                directionList) {
            directionDtoList.add(toDto(direction));
        }
        return directionDtoList;
    }
}
