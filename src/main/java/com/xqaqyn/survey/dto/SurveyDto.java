package com.xqaqyn.survey.dto;

import lombok.Data;

import java.util.List;

@Data
public class SurveyDto {
    private String title;
    private String description;
    private List<PageDto> pages;
    private String showProgressBar;
}
