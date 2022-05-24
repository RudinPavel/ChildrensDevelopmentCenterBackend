package com.samsung.childrensdevelopmentcenter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "childs")
public class Child {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "birthday")
    private Date birthday;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "mother_id", referencedColumnName = "id")
    private Parent mother;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "father_id", referencedColumnName = "id")
    private Parent father;
}
