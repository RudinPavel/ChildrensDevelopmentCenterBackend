package com.samsung.childrensdevelopmentcenter.mapper;

import com.samsung.childrensdevelopmentcenter.dto.ChildDto;
import com.samsung.childrensdevelopmentcenter.model.Child;

import java.util.List;

public interface ChildMapper {

    Child fromDto(ChildDto childDto);

    ChildDto toDto(Child child);

    List<Child> fromDtoList(List<ChildDto> childDtoList);

    List<ChildDto> toDtoList(List<Child> childList);
}

