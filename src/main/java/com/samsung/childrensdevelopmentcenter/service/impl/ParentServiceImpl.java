package com.samsung.childrensdevelopmentcenter.service.impl;

import com.samsung.childrensdevelopmentcenter.model.Parent;
import com.samsung.childrensdevelopmentcenter.repository.ParentRepository;
import com.samsung.childrensdevelopmentcenter.service.ParentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParentServiceImpl implements ParentService {

    private ParentRepository parentRepository;

    public ParentServiceImpl(ParentRepository parentRepository) {
        this.parentRepository = parentRepository;
    }

    @Override
    public Parent create(Parent parent) {
        return parentRepository.save(parent);
    }

    @Override
    public Parent findById(Long id) {
        Optional<Parent> parent = parentRepository.findById(id);
        return parent.isPresent() ? parent.get() : null;
    }

    @Override
    public List<Parent> findAll() {
        return parentRepository.findAll();
    }

    @Override
    public Parent update(Parent parent) {
        return parentRepository.save(parent);
    }

    @Override
    public void deleteById(Long id) {
        parentRepository.deleteById(id);
    }
}
