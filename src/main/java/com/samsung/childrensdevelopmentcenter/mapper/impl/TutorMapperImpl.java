package com.samsung.childrensdevelopmentcenter.mapper.impl;

import com.samsung.childrensdevelopmentcenter.dto.TutorDto;
import com.samsung.childrensdevelopmentcenter.mapper.TutorMapper;
import com.samsung.childrensdevelopmentcenter.model.Tutor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TutorMapperImpl implements TutorMapper {
    @Override
    public Tutor fromDto(TutorDto tutorDto) {
        Tutor tutor = new Tutor();
        tutor.setId(tutorDto.getId());
        tutor.setName(tutorDto.getName());
        tutor.setStartDate(tutorDto.getStartDate());
        return tutor;
    }

    @Override
    public TutorDto toDto(Tutor tutor) {
        TutorDto tutorDto = new TutorDto();
        tutorDto.setId(tutor.getId());
        tutorDto.setName(tutor.getName());
        tutorDto.setStartDate(tutor.getStartDate());
        return tutorDto;
    }

    @Override
    public List<Tutor> fromDtoList(List<TutorDto> tutorDtoList) {
        List<Tutor> tutorList = new ArrayList<>();
        for (TutorDto tutorDto :
                tutorDtoList) {
            tutorList.add(fromDto(tutorDto));
        }
        return tutorList;
    }

    @Override
    public List<TutorDto> toDtoList(List<Tutor> tutorList) {
        List<TutorDto> tutorDtoList = new ArrayList<>();
        for (Tutor tutor :
                tutorList) {
            tutorDtoList.add(toDto(tutor));
        }
        return tutorDtoList;
    }
}
