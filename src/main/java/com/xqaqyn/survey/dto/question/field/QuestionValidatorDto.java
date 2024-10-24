package com.xqaqyn.survey.dto.question.field;

import lombok.Data;

@Data
public class QuestionValidatorDto {
    private String type;
    private String text;

    private String expression;

    private Integer minValue;
    private Integer maxValue;

    private Integer minLength;
    private Integer maxLength;

    private String regex;
}
