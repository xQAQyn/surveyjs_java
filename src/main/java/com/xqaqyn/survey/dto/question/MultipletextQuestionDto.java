package com.xqaqyn.survey.dto.question;

import com.xqaqyn.survey.dto.question.field.MultitextQuestionItemDto;
import lombok.Data;

import java.util.List;

@Data
public class MultipletextQuestionDto extends BaseQuestionDto{
    // items
    private List<MultitextQuestionItemDto> items;

    // layout
    private Integer colCount;
    private String itemTitleWidth;

}
