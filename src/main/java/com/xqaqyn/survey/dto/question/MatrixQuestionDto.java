package com.xqaqyn.survey.dto.question;

import lombok.Data;

@Data
public class MatrixQuestionDto extends BaseQuestionDto{
    // general
    private Boolean showCommentArea;
    private String commentText;
    private String commentPlaceholder;
}
