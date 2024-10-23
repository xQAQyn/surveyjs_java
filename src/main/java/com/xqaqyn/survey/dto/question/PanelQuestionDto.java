package com.xqaqyn.survey.dto.question;

import lombok.Data;

import java.util.List;

@Data
public class PanelQuestionDto extends BaseQuestionDto{
    private List<BaseQuestionDto> elements;
}
