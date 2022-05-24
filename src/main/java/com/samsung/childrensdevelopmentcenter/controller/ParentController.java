package com.samsung.childrensdevelopmentcenter.controller;

import com.samsung.childrensdevelopmentcenter.dto.ParentDto;
import com.samsung.childrensdevelopmentcenter.mapper.ParentMapper;
import com.samsung.childrensdevelopmentcenter.model.Parent;
import com.samsung.childrensdevelopmentcenter.service.ParentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parents")
public class ParentController {

    private ParentService parentService;
    private ParentMapper parentMapper;

    public ParentController(ParentService parentService, ParentMapper parentMapper) {
        this.parentService = parentService;
        this.parentMapper = parentMapper;
    }

    @PostMapping
    public ParentDto create(@RequestBody ParentDto parentDto) {
        Parent parent = parentMapper.fromDto(parentDto);
        Parent createdParent = parentService.create(parent);
        ParentDto parentDtoResult = parentMapper.toDto(createdParent);
        return parentDtoResult;
    }

    @GetMapping("/{id}")
    public ParentDto findById(@PathVariable("id") Long id) {
        Parent parent = parentService.findById(id);
        ParentDto parentDto = parentMapper.toDto(parent);
        return parentDto;
    }

    @GetMapping
    public List<ParentDto> findAll() {
        List<Parent> parents = parentService.findAll();
        List<ParentDto> parentDtoList = parentMapper.toDtoList(parents);
        return parentDtoList;
    }

    @PutMapping
    public ParentDto update(@RequestBody ParentDto parentDto) {
        Parent parent = parentMapper.fromDto(parentDto);
        Parent updatedParent = parentService.update(parent);
        ParentDto parentDtoResult = parentMapper.toDto(updatedParent);
        return parentDtoResult;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        parentService.deleteById(id);
    }
}
