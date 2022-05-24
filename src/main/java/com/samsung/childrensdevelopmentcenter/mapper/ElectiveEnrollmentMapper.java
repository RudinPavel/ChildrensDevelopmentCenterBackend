package com.samsung.childrensdevelopmentcenter.mapper;

import com.samsung.childrensdevelopmentcenter.dto.ElectiveEnrollmentDto;
import com.samsung.childrensdevelopmentcenter.model.ElectiveEnrollment;

import java.util.List;

public interface ElectiveEnrollmentMapper {

    ElectiveEnrollment fromDto(ElectiveEnrollmentDto electiveEnrollmentDto);

    ElectiveEnrollmentDto toDto(ElectiveEnrollment electiveEnrollment);

    List<ElectiveEnrollment> fromDtoList(List<ElectiveEnrollmentDto> electiveEnrollmentDtoList);

    List<ElectiveEnrollmentDto> toDtoList(List<ElectiveEnrollment> electiveEnrollmentList);
}

