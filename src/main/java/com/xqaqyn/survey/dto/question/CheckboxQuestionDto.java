package com.xqaqyn.survey.dto.question;

import lombok.Data;

import java.util.List;

@Data
public class CheckboxQuestionDto extends BaseQuestionDto{
    // general
    private Boolean showCommentArea;
    private String commentPlaceholder;
    private List<String> choices;
}
