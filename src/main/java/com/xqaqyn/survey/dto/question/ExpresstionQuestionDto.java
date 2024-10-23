package com.xqaqyn.survey.dto.question;

import lombok.Data;

@Data
public class ExpresstionQuestionDto extends BaseQuestionDto{
    private String expresstion;
    private String displayStyle;
    private String currency;
    private String format;
    private String maximumFractionDigits;
    private String minimumFractionDigits;
    private Boolean useGrouping;
}
