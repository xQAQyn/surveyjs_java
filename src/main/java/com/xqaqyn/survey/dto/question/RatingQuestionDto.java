package com.xqaqyn.survey.dto.question;

import lombok.Data;

import java.util.List;

@Data
public class RatingQuestionDto extends BaseQuestionDto{
    // general
    private Boolean showCommentArea;
    private String commentText;
    private String commentPlaceholder;
    private List<String> choices;

    // rating values
    private String displayMode;
    private String rateType;
    private String scaleColorMode;
    private String rateColorMode;
    private List<String> rateValues;
    private Integer rateCount;
    private Integer rateMin;
    private Integer rateMax;
    private Integer rateStep;
    private String minRateDescription;
    private String maxRateDescription;
    private String rateDescriptionLocation;
    private Boolean displayRateDescriptionsAsExtremeItems;

    // conditions
    private String setValueExpression;

    // data
    private String valueName;
    private Boolean useDisplayValuesInDynamicTexts;
    private String clearIfInvisible;
}
