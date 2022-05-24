package com.samsung.childrensdevelopmentcenter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "elective_enrollments")
public class ElectiveEnrollment {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "child_id", referencedColumnName = "id")
    private Child child;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "elective_id", referencedColumnName = "id")
    private Elective elective;
}
