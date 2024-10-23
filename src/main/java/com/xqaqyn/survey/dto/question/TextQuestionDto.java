package com.xqaqyn.survey.dto.question;

import lombok.Data;

import java.util.List;

@Data
public class TextQuestionDto extends BaseQuestionDto {
    // general
    private String type;
    private String placeholder;
    private List<String> dataList;
    private String autocomplete;
}
