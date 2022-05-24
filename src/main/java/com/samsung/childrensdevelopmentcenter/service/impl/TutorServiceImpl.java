package com.samsung.childrensdevelopmentcenter.service.impl;

import com.samsung.childrensdevelopmentcenter.model.Tutor;
import com.samsung.childrensdevelopmentcenter.repository.TutorRepository;
import com.samsung.childrensdevelopmentcenter.service.TutorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TutorServiceImpl implements TutorService {

    private TutorRepository staffRepository;

    public TutorServiceImpl(TutorRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @Override
    public Tutor create(Tutor tutor) {
        return staffRepository.save(tutor);
    }

    @Override
    public Tutor findById(Long id) {
        Optional<Tutor> staff = staffRepository.findById(id);
        return staff.isPresent() ? staff.get() : null;
    }

    @Override
    public List<Tutor> findAll() {
        return staffRepository.findAll();
    }

    @Override
    public Tutor update(Tutor tutor) {
        return staffRepository.save(tutor);
    }

    @Override
    public void deleteById(Long id) {
        staffRepository.deleteById(id);
    }
}
