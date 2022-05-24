package com.samsung.childrensdevelopmentcenter.service;

import com.samsung.childrensdevelopmentcenter.model.Tutor;

import java.util.List;

public interface TutorService {

    Tutor create(Tutor tutor);

    Tutor findById(Long id);

    List<Tutor> findAll();

    Tutor update(Tutor tutor);

    void deleteById(Long id);
}
