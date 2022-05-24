package com.samsung.childrensdevelopmentcenter.service;

import com.samsung.childrensdevelopmentcenter.model.Elective;

import java.util.List;

public interface ElectiveService {

    Elective create(Elective elective);

    Elective create(String electiveName, String directionName, String tutorName);

    Elective findById(Long id);

    List<Elective> findAll();

    Elective update(Elective elective);

    Elective update(Long id, String newElectiveName, String newDirectionName, String newTutorName);

    void deleteById(Long id);
}
