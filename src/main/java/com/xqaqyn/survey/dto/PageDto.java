package com.xqaqyn.survey.dto;

import lombok.Data;

import java.util.List;

@Data
public class PageDto {
    private String name;
    private String description;
    private List<QuestionDto> elements;
    private Boolean readOnly;
}
