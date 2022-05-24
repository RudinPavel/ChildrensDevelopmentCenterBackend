package com.samsung.childrensdevelopmentcenter.service;

import com.samsung.childrensdevelopmentcenter.model.ElectiveEnrollment;

import java.util.List;

public interface ElectiveEnrollmentService {

    ElectiveEnrollment create(ElectiveEnrollment electiveEnrollment);

    ElectiveEnrollment findById(Long id);

    List<ElectiveEnrollment> findAll();

    ElectiveEnrollment update(ElectiveEnrollment electiveEnrollment);

    void deleteById(Long id);

    long count();
}
