package com.xqaqyn.survey.dto.field;

import lombok.Data;

@Data
public class CalculatedValue {
    private String name;
    private String expression;
    private Boolean includeIntoResult;
}
