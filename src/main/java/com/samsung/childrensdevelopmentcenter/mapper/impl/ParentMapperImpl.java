package com.samsung.childrensdevelopmentcenter.mapper.impl;

import com.samsung.childrensdevelopmentcenter.dto.ParentDto;
import com.samsung.childrensdevelopmentcenter.mapper.ParentMapper;
import com.samsung.childrensdevelopmentcenter.model.Parent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ParentMapperImpl implements ParentMapper {
    @Override
    public Parent fromDto(ParentDto parentDto) {
        Parent parent = new Parent();
        parent.setId(parentDto.getId());
        parent.setName(parentDto.getName());
        parent.setPhone(parentDto.getPhone());
        return parent;
    }

    @Override
    public ParentDto toDto(Parent parent) {
        ParentDto parentDto = new ParentDto();
        parentDto.setId(parent.getId());
        parentDto.setName(parent.getName());
        parentDto.setPhone(parent.getPhone());
        return parentDto;
    }

    @Override
    public List<Parent> fromDtoList(List<ParentDto> parentDtoList) {
        List<Parent> parentList = new ArrayList<>();
        for (ParentDto parentDto :
                parentDtoList) {
            parentList.add(fromDto(parentDto));
        }
        return parentList;
    }

    @Override
    public List<ParentDto> toDtoList(List<Parent> parentList) {
        List<ParentDto> parentDtoList = new ArrayList<>();
        for (Parent parent :
                parentList) {
            parentDtoList.add(toDto(parent));
        }
        return parentDtoList;
    }
}
