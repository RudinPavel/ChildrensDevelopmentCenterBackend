package com.samsung.childrensdevelopmentcenter.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class TutorDto {

    private Long id;

    private String name;

    private Date startDate;
}
