package com.samsung.childrensdevelopmentcenter.repository;


import com.samsung.childrensdevelopmentcenter.model.Child;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepository extends JpaRepository<Child, Long> {
}
