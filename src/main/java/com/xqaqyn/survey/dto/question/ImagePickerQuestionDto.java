package com.xqaqyn.survey.dto.question;

import lombok.Data;

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
}
