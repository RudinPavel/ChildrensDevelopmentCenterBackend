package com.samsung.childrensdevelopmentcenter.mapper;

import com.samsung.childrensdevelopmentcenter.dto.TutorDto;
import com.samsung.childrensdevelopmentcenter.model.Tutor;

import java.util.List;

public interface TutorMapper {

    Tutor fromDto(TutorDto tutorDto);

    TutorDto toDto(Tutor tutor);

    List<Tutor> fromDtoList(List<TutorDto> tutorDtoList);

    List<TutorDto> toDtoList(List<Tutor> tutorList);
}

