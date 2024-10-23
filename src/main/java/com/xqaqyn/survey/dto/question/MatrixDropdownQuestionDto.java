package com.xqaqyn.survey.dto.question;

import lombok.Data;

@Data
public class MatrixDropdownQuestionDto extends BaseQuestionDto{
    // general
    private Boolean showCommentArea;
    private String commentText;
    private String commentPlaceholder;
    private String cellType;
    private String detailPanelMode;
    private String totalText;
    private String placeholder;
}
