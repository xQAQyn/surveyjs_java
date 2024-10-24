package com.xqaqyn.survey.dto.question;

import com.xqaqyn.survey.dto.question.field.ImageDto;
import lombok.Data;

import java.util.List;

@Data
public class ImagePickerQuestionDto extends BaseQuestionDto{
    // general
    private String contentMode;
    private String imageFit;
    private Integer minImageWidth;
    private Integer minImageHeight;
    private Integer maxImageWidth;
    private Integer maxImageHeight;
    private Integer imageHeight;
    private Integer imageWidth;
    private Boolean multiSelect;
    private Boolean showLabel;

    // choice options
    private List<ImageDto> choices;
    private String choicesFromQuestion;
    private String choicesOrder;

    // condition
    private Boolean hideIfChoicesEmpty;
    private String choicesVisibleIf;
    private String choicesEnableIf;
}
