package com.xqaqyn.survey.dto;

import com.xqaqyn.survey.dto.question.BaseQuestionDto;
import lombok.Data;

import java.util.List;

@Data
public class PageDto {
    // general
    private String name;
    private String title;
    private String description;
    private List<BaseQuestionDto> elements;
    private Boolean readOnly;
    private Boolean visible;
    private Integer maxTimeToFinish;

    // logic
    private String visibleIf;
    private String enableIf;
    private String requiredIf;

    // layout
    private String questionTitleLocation;
    private String questionErrorLocation;
    private String questionsOrder;
    private String navigationButtonsVisibility;
}
