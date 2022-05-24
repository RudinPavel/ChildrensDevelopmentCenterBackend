package com.samsung.childrensdevelopmentcenter.controller;

import com.samsung.childrensdevelopmentcenter.dto.ElectiveEnrollmentDto;
import com.samsung.childrensdevelopmentcenter.mapper.ElectiveEnrollmentMapper;
import com.samsung.childrensdevelopmentcenter.model.ElectiveEnrollment;
import com.samsung.childrensdevelopmentcenter.service.ElectiveEnrollmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/electiveenrollments")
public class ElectiveEnrollmentController {

    private ElectiveEnrollmentService electiveEnrollmentService;
    private ElectiveEnrollmentMapper electiveEnrollmentMapper;

    public ElectiveEnrollmentController(ElectiveEnrollmentService electiveEnrollmentService, ElectiveEnrollmentMapper electiveEnrollmentMapper) {
        this.electiveEnrollmentService = electiveEnrollmentService;
        this.electiveEnrollmentMapper = electiveEnrollmentMapper;
    }

    @PostMapping
    public ElectiveEnrollmentDto create(@RequestBody ElectiveEnrollmentDto electiveEnrollmentDto) {
        ElectiveEnrollment electiveEnrollment = electiveEnrollmentMapper.fromDto(electiveEnrollmentDto);
        ElectiveEnrollment createdElectiveEnrollment = electiveEnrollmentService.create(electiveEnrollment);
        ElectiveEnrollmentDto electiveEnrollmentDtoResult = electiveEnrollmentMapper.toDto(createdElectiveEnrollment);
        return electiveEnrollmentDtoResult;
    }

    @GetMapping("/{id}")
    public ElectiveEnrollmentDto findById(@PathVariable("id") Long id) {
        ElectiveEnrollment electiveEnrollment = electiveEnrollmentService.findById(id);
        ElectiveEnrollmentDto electiveEnrollmentDto = electiveEnrollmentMapper.toDto(electiveEnrollment);
        return electiveEnrollmentDto;
    }

    @GetMapping
    public List<ElectiveEnrollmentDto> findAll() {
        List<ElectiveEnrollment> electiveEnrollments = electiveEnrollmentService.findAll();
        List<ElectiveEnrollmentDto> electiveEnrollmentDtoList = electiveEnrollmentMapper.toDtoList(electiveEnrollments);
        return electiveEnrollmentDtoList;
    }

    @PutMapping
    public ElectiveEnrollmentDto update(@RequestBody ElectiveEnrollmentDto electiveEnrollmentDto) {
        ElectiveEnrollment electiveEnrollment = electiveEnrollmentMapper.fromDto(electiveEnrollmentDto);
        ElectiveEnrollment updatedElectiveEnrollment = electiveEnrollmentService.update(electiveEnrollment);
        ElectiveEnrollmentDto electiveEnrollmentDtoResult = electiveEnrollmentMapper.toDto(updatedElectiveEnrollment);
        return electiveEnrollmentDtoResult;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        electiveEnrollmentService.deleteById(id);
    }
}
