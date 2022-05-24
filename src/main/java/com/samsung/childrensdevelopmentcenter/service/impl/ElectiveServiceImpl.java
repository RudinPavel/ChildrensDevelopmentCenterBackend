package com.samsung.childrensdevelopmentcenter.service.impl;

import com.samsung.childrensdevelopmentcenter.model.Direction;
import com.samsung.childrensdevelopmentcenter.model.Elective;
import com.samsung.childrensdevelopmentcenter.model.Tutor;
import com.samsung.childrensdevelopmentcenter.repository.DirectionRepository;
import com.samsung.childrensdevelopmentcenter.repository.ElectiveRepository;
import com.samsung.childrensdevelopmentcenter.repository.TutorRepository;
import com.samsung.childrensdevelopmentcenter.service.ElectiveService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ElectiveServiceImpl implements ElectiveService {

    private ElectiveRepository electiveRepository;
    private DirectionRepository directionRepository;
    private TutorRepository tutorRepository;

    public ElectiveServiceImpl(ElectiveRepository electiveRepository, DirectionRepository directionRepository, TutorRepository tutorRepository) {
        this.electiveRepository = electiveRepository;
        this.directionRepository = directionRepository;
        this.tutorRepository = tutorRepository;
    }

    @Override
    @Transactional
    public Elective create(Elective elective) {
        return electiveRepository.save(elective);
    }

    @Override
    public Elective create(String electiveName, String directionName, String tutorName) {

        //на скок адекватно делать так? не придумал иначе
        Direction direction = directionRepository.findByName(directionName);
        if (direction == null) {
            direction = Direction.builder()
                    .name(directionName)
                    .build();
        }

        Tutor tutor = tutorRepository.findByName(tutorName);
        if (tutor == null) {
            tutor = Tutor.builder()
                    .name(tutorName)
                    .build();
        }

        Elective elective = Elective.builder()
                .name(electiveName)
                .direction(direction)
                .tutor(tutor)
                .place("1") // fixme
                .date(Date.valueOf("2022-01-01")) // fixme
                .time("18:00") // fixme
                .build();

        return electiveRepository.save(elective);
    }

    @Override
    public Elective findById(Long id) {
        Optional<Elective> elective = electiveRepository.findById(id);
        return elective.isPresent() ? elective.get() : null;
    }

    @Override
    public List<Elective> findAll() {
        return electiveRepository.findAll();
    }

    @Override
    @Transactional
    public Elective update(Elective elective) {
        return electiveRepository.save(elective);
    }

    @Override
    public Elective update(Long id, String newElectiveName, String newDirectionName, String newTutorName) {
        Elective elective = Elective.builder()
                .id(id)
                .name(newElectiveName)
                .direction(directionRepository.findByName(newDirectionName))
                .tutor(tutorRepository.findByName(newTutorName))
                .place("1") // fixme
                .date(Date.valueOf("2022-01-01")) // fixme
                .time("18:00") // fixme
                .build();

        return electiveRepository.save(elective);
    }

    @Override
    public void deleteById(Long id) {
        electiveRepository.deleteById(id);
    }

}
