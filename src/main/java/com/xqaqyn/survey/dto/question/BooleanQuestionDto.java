package com.xqaqyn.survey.dto.question;

import lombok.Data;

import java.util.List;

@Data
public class BooleanQuestionDto extends BaseQuestionDto{
    // general
    private Boolean showCommentArea;
    private String commentPlaceholder;
    private List<String> choices;
    private String labelTrue;
    private String labelFalse;
    private Boolean swapOrder;
}
