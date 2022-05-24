package com.samsung.childrensdevelopmentcenter.service;

import com.samsung.childrensdevelopmentcenter.model.Child;

import java.util.List;

public interface ChildService {

    Child create(Child child);

    Child findById(Long id);

    List<Child> findAll();

    Child update(Child child);

    void deleteById(Long id);
}
