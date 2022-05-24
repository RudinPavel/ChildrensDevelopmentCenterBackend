package com.samsung.childrensdevelopmentcenter.mapper;

import com.samsung.childrensdevelopmentcenter.dto.DirectionDto;
import com.samsung.childrensdevelopmentcenter.model.Direction;

import java.util.List;

public interface DirectionMapper {

    Direction fromDto(DirectionDto directionDto);

    DirectionDto toDto(Direction direction);

    List<Direction> fromDtoList(List<DirectionDto> directionDtoList);

    List<DirectionDto> toDtoList(List<Direction> directionList);
}

