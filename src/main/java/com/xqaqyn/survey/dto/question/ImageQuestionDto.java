package com.xqaqyn.survey.dto.question;

import lombok.Data;

@Data
public class ImageQuestionDto extends BaseQuestionDto{
    private String imageLink;
    private String contentMode;
    private String imageFit;
    private String imageHeight;
    private String imageWidth;
    private String altText;
}
