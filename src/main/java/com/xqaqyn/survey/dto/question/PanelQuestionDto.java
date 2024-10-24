package com.xqaqyn.survey.dto.question;

import lombok.Data;

import java.util.List;

@Data
public class PanelQuestionDto extends BaseQuestionDto{
    // question settings
    private String questionTitleLocation;
    private String questionErrorLocation;
    private String questionsOrder;
    private Integer innerIndent;

    // Numbering
    private Boolean showNumber;
    private String showQuestionNumbers;
    private String questionStartIndex;

    private List<BaseQuestionDto> elements;
}
