package com.samsung.childrensdevelopmentcenter.controller;


import com.samsung.childrensdevelopmentcenter.dto.ChildDto;
import com.samsung.childrensdevelopmentcenter.mapper.ChildMapper;
import com.samsung.childrensdevelopmentcenter.model.Child;
import com.samsung.childrensdevelopmentcenter.service.ChildService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/childs")
public class ChildController {

    private ChildService childService;
    private ChildMapper childMapper;

    public ChildController(ChildService childService, ChildMapper childMapper) {
        this.childService = childService;
        this.childMapper = childMapper;
    }

    @PostMapping
    public ChildDto create(@RequestBody ChildDto childDto) {
        Child child = childMapper.fromDto(childDto);
        Child createdChild = childService.create(child);
        ChildDto childDtoResult = childMapper.toDto(createdChild);
        return childDtoResult;
    }

    @GetMapping("/{id}")
    public ChildDto findById(@PathVariable("id") Long id) {
        Child child = childService.findById(id);
        ChildDto childDto = childMapper.toDto(child);
        return childDto;
    }

    @GetMapping
    public List<ChildDto> findAll() {
        List<Child> childs = childService.findAll();
        List<ChildDto> childDtoList = childMapper.toDtoList(childs);
        return childDtoList;
    }

    @PutMapping
    public ChildDto update(@RequestBody ChildDto childDto) {
        Child child = childMapper.fromDto(childDto);
        Child updatedChild = childService.update(child);
        ChildDto childDtoResult = childMapper.toDto(updatedChild);
        return childDtoResult;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        childService.deleteById(id);
    }
}
