package com.samsung.childrensdevelopmentcenter.service;

import com.samsung.childrensdevelopmentcenter.model.Parent;

import java.util.List;

public interface ParentService {

    Parent create(Parent parent);

    Parent findById(Long id);

    List<Parent> findAll();

    Parent update(Parent parent);

    void deleteById(Long id);
}
