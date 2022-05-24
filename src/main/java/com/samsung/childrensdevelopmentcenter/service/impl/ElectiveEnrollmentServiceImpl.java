package com.samsung.childrensdevelopmentcenter.service.impl;

import com.samsung.childrensdevelopmentcenter.model.ElectiveEnrollment;
import com.samsung.childrensdevelopmentcenter.repository.ElectiveEnrollmentRepository;
import com.samsung.childrensdevelopmentcenter.service.ElectiveEnrollmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ElectiveEnrollmentServiceImpl implements ElectiveEnrollmentService {
    private ElectiveEnrollmentRepository electiveEnrollmentRepository;

    public ElectiveEnrollmentServiceImpl(ElectiveEnrollmentRepository electiveEnrollmentRepository) {
        this.electiveEnrollmentRepository = electiveEnrollmentRepository;
    }

    @Override
    @Transactional
    public ElectiveEnrollment create(ElectiveEnrollment electiveEnrollment) {
        return electiveEnrollmentRepository.save(electiveEnrollment);
    }

    @Override
    public ElectiveEnrollment findById(Long id) {
        Optional<ElectiveEnrollment> electiveEnrollment = electiveEnrollmentRepository.findById(id);
        return electiveEnrollment.isPresent() ? electiveEnrollment.get() : null;
    }

    @Override
    public List<ElectiveEnrollment> findAll() {
        return electiveEnrollmentRepository.findAll();
    }

    @Override
    @Transactional
    public ElectiveEnrollment update(ElectiveEnrollment electiveEnrollment) {
        return electiveEnrollmentRepository.save(electiveEnrollment);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        electiveEnrollmentRepository.deleteById(id);
    }

    @Override
    public long count() {
        return electiveEnrollmentRepository.count();
    }
}
