package com.samsung.childrensdevelopmentcenter.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class ElectiveDto {

    private Long id;

    private String name;

    private String place;

    private String time;

    private Date date;

    private TutorDto tutorDto;

    private DirectionDto directionDto;
}
