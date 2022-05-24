package com.samsung.childrensdevelopmentcenter.mapper;

import com.samsung.childrensdevelopmentcenter.dto.ElectiveDto;
import com.samsung.childrensdevelopmentcenter.model.Elective;

import java.util.List;

public interface ElectiveMapper {

    Elective fromDto(ElectiveDto electiveDto);

    ElectiveDto toDto(Elective elective);

    List<Elective> fromDtoList(List<ElectiveDto> electiveDtoList);

    List<ElectiveDto> toDtoList(List<Elective> electiveList);
}

