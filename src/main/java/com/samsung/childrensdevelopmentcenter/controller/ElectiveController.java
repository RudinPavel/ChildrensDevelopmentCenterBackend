package com.samsung.childrensdevelopmentcenter.controller;

import com.samsung.childrensdevelopmentcenter.dto.ElectiveDto;
import com.samsung.childrensdevelopmentcenter.mapper.ElectiveMapper;
import com.samsung.childrensdevelopmentcenter.model.Elective;
import com.samsung.childrensdevelopmentcenter.service.ElectiveService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/electives")
public class ElectiveController {

    private ElectiveService electiveService;
    private ElectiveMapper electiveMapper;

    public ElectiveController(ElectiveService electiveService, ElectiveMapper electiveMapper) {
        this.electiveService = electiveService;
        this.electiveMapper = electiveMapper;
    }

//    @PostMapping
//    public ElectiveDto create(@RequestBody ElectiveDto electiveDto) {
//        Elective elective = electiveMapper.fromDto(electiveDto);
//        Elective createdElective = electiveService.create(elective);
//        ElectiveDto electiveDtoResult = electiveMapper.toDto(createdElective);
//        return electiveDtoResult;
//    }

    @PostMapping
    public ElectiveDto create(@RequestParam String electiveName,
                              @RequestParam String directionName,
                              @RequestParam String tutorName) {

        Elective createdElective = electiveService.create(electiveName, directionName, tutorName);
        ElectiveDto electiveDtoResult = electiveMapper.toDto(createdElective);
        return electiveDtoResult;
    }

    @PostMapping("/{id}")
    public ElectiveDto updateElectiveById(
            @PathVariable Long id,
            @RequestParam String newElectiveName,
            @RequestParam String newDirectionName,
            @RequestParam String newTutorName
    ) {

        Elective updatedElective = electiveService.update(
                id,
                newElectiveName,
                newDirectionName,
                newTutorName
        );

        ElectiveDto electiveDtoResult = electiveMapper.toDto(updatedElective);
        return electiveDtoResult;
    }

    @GetMapping("/{id}")
    public ElectiveDto findById(@PathVariable("id") Long id) {
        Elective elective = electiveService.findById(id);
        ElectiveDto electiveDto = electiveMapper.toDto(elective);
        return electiveDto;
    }

    @GetMapping
    public List<ElectiveDto> findAll() {
        List<Elective> electives = electiveService.findAll();
        List<ElectiveDto> electiveDtoList = electiveMapper.toDtoList(electives);
        return electiveDtoList;
    }

    @PutMapping
    public ElectiveDto update(@RequestBody ElectiveDto electiveDto) {
        Elective elective = electiveMapper.fromDto(electiveDto);
        Elective updatedElective = electiveService.update(elective);
        ElectiveDto electiveDtoResult = electiveMapper.toDto(updatedElective);
        return electiveDtoResult;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        electiveService.deleteById(id);
    }
}
