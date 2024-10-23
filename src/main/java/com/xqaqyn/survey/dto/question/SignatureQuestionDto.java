package com.xqaqyn.survey.dto.question;

import lombok.Data;

@Data
public class SignatureQuestionDto extends BaseQuestionDto{
    private Boolean waitForUpload;
    private Boolean storeDataAsText;
    private Integer signatureWidth;
    private Integer signatureHeight;
    private Boolean signatureAutoScaleEnabled;
    private Integer penMinWidth;
    private Integer penMaxWidth;
    private Boolean allowClear;
    private Boolean showPlaceholder;
    private Boolean placeholder;
    private String backgroundImage;
    private String backgroundColor;
    private String penColor;
    private String dataFormat;
}
