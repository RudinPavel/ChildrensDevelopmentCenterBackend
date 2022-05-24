package com.samsung.childrensdevelopmentcenter.service.impl;

import com.samsung.childrensdevelopmentcenter.model.Child;
import com.samsung.childrensdevelopmentcenter.repository.ChildRepository;
import com.samsung.childrensdevelopmentcenter.service.ChildService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ChildServiceImpl implements ChildService {

    private ChildRepository childRepository;

    public ChildServiceImpl(ChildRepository childRepository) {
        this.childRepository = childRepository;
    }

    @Override
    @Transactional
    public Child create(Child child) {
        return childRepository.save(child);
    }

    @Override
    public Child findById(Long id) {
        Optional<Child> child = childRepository.findById(id);
        return child.isPresent() ? child.get() : null;
    }

    @Override
    public List<Child> findAll() {
        return childRepository.findAll();
    }

    @Override
    @Transactional
    public Child update(Child child) {
        return childRepository.save(child);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        childRepository.deleteById(id);
    }
}
