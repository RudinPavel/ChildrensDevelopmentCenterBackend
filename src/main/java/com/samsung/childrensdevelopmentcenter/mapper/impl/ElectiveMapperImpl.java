package com.samsung.childrensdevelopmentcenter.mapper.impl;

import com.samsung.childrensdevelopmentcenter.dto.ElectiveDto;
import com.samsung.childrensdevelopmentcenter.mapper.DirectionMapper;
import com.samsung.childrensdevelopmentcenter.mapper.ElectiveMapper;
import com.samsung.childrensdevelopmentcenter.mapper.TutorMapper;
import com.samsung.childrensdevelopmentcenter.model.Elective;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ElectiveMapperImpl implements ElectiveMapper {

    private TutorMapper tutorMapper;
    private DirectionMapper directionMapper;

    public ElectiveMapperImpl(TutorMapper tutorMapper, DirectionMapper directionMapper) {
        this.tutorMapper = tutorMapper;
        this.directionMapper = directionMapper;
    }

    @Override
    public Elective fromDto(ElectiveDto electiveDto) {
        Elective elective = new Elective();
        elective.setId(electiveDto.getId());
        elective.setName(electiveDto.getName());
        elective.setPlace(electiveDto.getPlace());
        elective.setTime(electiveDto.getTime());
        elective.setDate(electiveDto.getDate());
        elective.setTutor(tutorMapper.fromDto(electiveDto.getTutorDto()));
        elective.setDirection(directionMapper.fromDto(electiveDto.getDirectionDto()));
        return elective;
    }

    @Override
    public ElectiveDto toDto(Elective elective) {
        ElectiveDto electiveDto = new ElectiveDto();
        electiveDto.setId(elective.getId());
        electiveDto.setName(elective.getName());
        electiveDto.setPlace(elective.getPlace());
        electiveDto.setTime(elective.getTime());
        electiveDto.setDate(elective.getDate());
        electiveDto.setTutorDto(tutorMapper.toDto(elective.getTutor()));
        electiveDto.setDirectionDto(directionMapper.toDto(elective.getDirection()));
        return electiveDto;
    }

    @Override
    public List<Elective> fromDtoList(List<ElectiveDto> electiveDtoList) {
        List<Elective> electiveList = new ArrayList<>();
        for (ElectiveDto electiveDto :
                electiveDtoList) {
            electiveList.add(fromDto(electiveDto));
        }
        return electiveList;
    }

    @Override
    public List<ElectiveDto> toDtoList(List<Elective> electiveList) {
        List<ElectiveDto> electiveDtoList = new ArrayList<>();
        for (Elective elective :
                electiveList) {
            electiveDtoList.add(toDto(elective));
        }
        return electiveDtoList;
    }
}
