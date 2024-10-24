package com.xqaqyn.survey.dto.question.field;

import lombok.Data;

@Data
public class MaskSettingsDto {
    private Boolean saveMaskedValue;
    private String pattern;
    private Object min;
    private Object max;
    private Integer precision;
    private Boolean allowNegativeValues;
    private String prefix;
    private String suffix;
}
