package com.xqaqyn.survey.dto.field;

import lombok.Data;

@Data
public class Trigger {
    private String type;
    private String expression;
    private String runExpression;
}
