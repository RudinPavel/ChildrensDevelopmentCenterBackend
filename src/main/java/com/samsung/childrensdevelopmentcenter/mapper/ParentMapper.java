package com.samsung.childrensdevelopmentcenter.mapper;

import com.samsung.childrensdevelopmentcenter.dto.ParentDto;
import com.samsung.childrensdevelopmentcenter.model.Parent;

import java.util.List;

public interface ParentMapper {

    Parent fromDto(ParentDto parentDto);

    ParentDto toDto(Parent parent);

    List<Parent> fromDtoList(List<ParentDto> parentDtoList);

    List<ParentDto> toDtoList(List<Parent> parentList);
}

