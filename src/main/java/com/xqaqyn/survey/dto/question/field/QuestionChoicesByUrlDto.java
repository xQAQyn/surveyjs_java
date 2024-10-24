package com.xqaqyn.survey.dto.question.field;

import lombok.Data;

@Data
public class QuestionChoicesByUrlDto {
    private String url;
    private String path;
    private String valueName;
    private String titleName;
    private Boolean allowEmptyResponse;
}
