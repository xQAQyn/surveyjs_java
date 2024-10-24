package com.xqaqyn.survey.dto.question;

import com.xqaqyn.survey.dto.question.field.MaskSettingsDto;
import lombok.Data;

import java.util.List;

@Data
public class TextQuestionDto extends BaseQuestionDto {
    // general
    private String type;
    private String placeholder;
    private List<String> dataList;
    private String autocomplete;

    // layout
    private Integer size;
    private String inputTextAlignment;

    // input mask settings
    private String maskType;
    private MaskSettingsDto maskSettings;

    // data
    private String textUpdateMode;

}
