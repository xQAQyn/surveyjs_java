package com.xqaqyn.survey.dto.question;

import lombok.Data;

@Data
public class MultiSelectDropdownQuestionDto extends BaseQuestionDto{
    private String placeholder;
    private Boolean closeOnSelect;
}
