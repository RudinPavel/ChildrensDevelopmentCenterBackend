package com.samsung.childrensdevelopmentcenter.controller;

import com.samsung.childrensdevelopmentcenter.dto.TutorDto;
import com.samsung.childrensdevelopmentcenter.mapper.TutorMapper;
import com.samsung.childrensdevelopmentcenter.model.Tutor;
import com.samsung.childrensdevelopmentcenter.service.TutorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tutors")
public class TutorController {

    private TutorService tutorService;
    private TutorMapper tutorMapper;

    public TutorController(TutorService tutorService, TutorMapper tutorMapper) {
        this.tutorService = tutorService;
        this.tutorMapper = tutorMapper;
    }

    @PostMapping
    public TutorDto create(@RequestBody TutorDto tutorDto) {
        Tutor tutor = tutorMapper.fromDto(tutorDto);
        Tutor createdTutor = tutorService.create(tutor);
        TutorDto tutorDtoResult = tutorMapper.toDto(createdTutor);
        return tutorDtoResult;
    }

    @GetMapping("/{id}")
    public TutorDto findById(@PathVariable("id") Long id) {
        Tutor tutor = tutorService.findById(id);
        TutorDto tutorDto = tutorMapper.toDto(tutor);
        return tutorDto;
    }

    @GetMapping
    public List<TutorDto> findAll() {
        List<Tutor> tutors = tutorService.findAll();
        List<TutorDto> tutorDtoList = tutorMapper.toDtoList(tutors);
        return tutorDtoList;
    }

    @PutMapping
    public TutorDto update(@RequestBody TutorDto tutorDto) {
        Tutor tutor = tutorMapper.fromDto(tutorDto);
        Tutor updatedTutor = tutorService.update(tutor);
        TutorDto tutorDtoResult = tutorMapper.toDto(updatedTutor);
        return tutorDtoResult;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        tutorService.deleteById(id);
    }
}
