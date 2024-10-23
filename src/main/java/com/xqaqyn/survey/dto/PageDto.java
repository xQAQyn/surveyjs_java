package com.xqaqyn.survey.dto;

import com.xqaqyn.survey.dto.question.BaseQuestionDto;
import lombok.Data;

import java.util.List;

@Data
public class PageDto {
    private String name;
    private String description;
    private List<BaseQuestionDto> elements;
    private Boolean readOnly;
}
