package com.samsung.childrensdevelopmentcenter.repository;


import com.samsung.childrensdevelopmentcenter.model.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorRepository extends JpaRepository<Tutor, Long> {
    Tutor findByName(String name);
}
