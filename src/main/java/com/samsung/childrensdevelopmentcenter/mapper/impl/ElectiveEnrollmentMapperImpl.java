package com.samsung.childrensdevelopmentcenter.mapper.impl;

import com.samsung.childrensdevelopmentcenter.dto.ElectiveEnrollmentDto;
import com.samsung.childrensdevelopmentcenter.mapper.ChildMapper;
import com.samsung.childrensdevelopmentcenter.mapper.ElectiveEnrollmentMapper;
import com.samsung.childrensdevelopmentcenter.mapper.ElectiveMapper;
import com.samsung.childrensdevelopmentcenter.model.ElectiveEnrollment;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ElectiveEnrollmentMapperImpl implements ElectiveEnrollmentMapper {

    private ChildMapper childMapper;
    private ElectiveMapper electiveMapper;

    public ElectiveEnrollmentMapperImpl(ChildMapper childMapper, ElectiveMapper electiveMapper) {
        this.childMapper = childMapper;
        this.electiveMapper = electiveMapper;
    }

    @Override
    public ElectiveEnrollment fromDto(ElectiveEnrollmentDto electiveEnrollmentDto) {
        ElectiveEnrollment electiveEnrollment = new ElectiveEnrollment();
        electiveEnrollment.setId(electiveEnrollmentDto.getId());
        electiveEnrollment.setChild(childMapper.fromDto(electiveEnrollmentDto.getChildDto()));
        electiveEnrollment.setElective(electiveMapper.fromDto(electiveEnrollmentDto.getElectiveDto()));
        return electiveEnrollment;
    }

    @Override
    public ElectiveEnrollmentDto toDto(ElectiveEnrollment electiveEnrollment) {
        ElectiveEnrollmentDto electiveEnrollmentDto = new ElectiveEnrollmentDto();
        electiveEnrollmentDto.setId(electiveEnrollment.getId());
        electiveEnrollmentDto.setChildDto(childMapper.toDto(electiveEnrollment.getChild()));
        electiveEnrollmentDto.setElectiveDto(electiveMapper.toDto(electiveEnrollment.getElective()));
        return electiveEnrollmentDto;
    }

    @Override
    public List<ElectiveEnrollment> fromDtoList(List<ElectiveEnrollmentDto> electiveEnrollmentDtoList) {
        List<ElectiveEnrollment> electiveEnrollmentList = new ArrayList<>();
        for (ElectiveEnrollmentDto electiveEnrollmentDto :
                electiveEnrollmentDtoList) {
            electiveEnrollmentList.add(fromDto(electiveEnrollmentDto));
        }
        return electiveEnrollmentList;
    }

    @Override
    public List<ElectiveEnrollmentDto> toDtoList(List<ElectiveEnrollment> electiveEnrollmentList) {
        List<ElectiveEnrollmentDto> electiveEnrollmentDtoList = new ArrayList<>();
        for (ElectiveEnrollment electiveEnrollment :
                electiveEnrollmentList) {
            electiveEnrollmentDtoList.add(toDto(electiveEnrollment));
        }
        return electiveEnrollmentDtoList;
    }
}
