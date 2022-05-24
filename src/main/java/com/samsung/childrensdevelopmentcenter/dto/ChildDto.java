package com.samsung.childrensdevelopmentcenter.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class ChildDto {

    private Long id;

    private String name;

    private Date birthday;

    private ParentDto motherDto;

    private ParentDto fatherDto;
}
