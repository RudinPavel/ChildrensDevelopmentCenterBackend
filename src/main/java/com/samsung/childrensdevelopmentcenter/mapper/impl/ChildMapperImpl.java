package com.samsung.childrensdevelopmentcenter.mapper.impl;


import com.samsung.childrensdevelopmentcenter.dto.ChildDto;
import com.samsung.childrensdevelopmentcenter.mapper.ChildMapper;
import com.samsung.childrensdevelopmentcenter.mapper.ParentMapper;
import com.samsung.childrensdevelopmentcenter.model.Child;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ChildMapperImpl implements ChildMapper {

    private ParentMapper parentMapper;

    public ChildMapperImpl(ParentMapperImpl parentMapper) {
        this.parentMapper = parentMapper;
    }

    @Override
    public Child fromDto(ChildDto childDto) {
        Child child = new Child();
        child.setId(childDto.getId());
        child.setName(childDto.getName());
        child.setBirthday(childDto.getBirthday());
        child.setMother(parentMapper.fromDto(childDto.getMotherDto()));
        child.setFather(parentMapper.fromDto(childDto.getFatherDto()));
        return child;
    }

    @Override
    public ChildDto toDto(Child child) {
        ChildDto childDto = new ChildDto();
        childDto.setId(child.getId());
        childDto.setName(child.getName());
        childDto.setBirthday(child.getBirthday());
        childDto.setMotherDto(parentMapper.toDto(child.getMother()));
        childDto.setFatherDto(parentMapper.toDto(child.getFather()));
        return childDto;
    }

    @Override
    public List<Child> fromDtoList(List<ChildDto> childDtoList) {
        List<Child> childList = new ArrayList<>();
        for (ChildDto childDto :
                childDtoList) {
            childList.add(fromDto(childDto));
        }
        return childList;
    }

    @Override
    public List<ChildDto> toDtoList(List<Child> childList) {
        List<ChildDto> childDtoList = new ArrayList<>();
        for (Child child :
                childList) {
            childDtoList.add(toDto(child));
        }
        return childDtoList;
    }
}
