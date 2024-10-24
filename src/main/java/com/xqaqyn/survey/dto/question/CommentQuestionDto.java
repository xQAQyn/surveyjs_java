package com.xqaqyn.survey.dto.question;

import lombok.Data;

@Data
public class CommentQuestionDto extends BaseQuestionDto{
    // general
    private String placeholder;

    // layout
    private Integer rows;
    private Boolean autoGrow;
    private Boolean allowResize;

    // data
    private String textUpdateMode;
}
