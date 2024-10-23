package com.xqaqyn.survey.dto.question;

import lombok.Data;

import java.util.List;

@Data
public class RatioGroupQuestionDto extends BaseQuestionDto {
    // general
    private Boolean showCommentArea;
    private String commentText;
    private String commentPlaceholder;
    private List<String> choices;
}
