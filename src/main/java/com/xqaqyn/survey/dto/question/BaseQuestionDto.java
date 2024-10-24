package com.xqaqyn.survey.dto.question;

import com.xqaqyn.survey.dto.question.field.QuestionValidatorDto;
import lombok.Data;

import java.util.List;

@Data
public class BaseQuestionDto {
    // auto generated field
    private String id;

    // general info
    private String name;
    private String title;
    private String description;
    private Boolean visible;
    private Boolean isRequired;
    private Boolean readOnly;

    // condition
    private String visibleIf;
    private String enableIf;
    private String resetValueIf;
    private String setValueIf;
    private String setValueExpression;
    private String defaultValueExpression;
    private String requiredIf;

    // layout
    private Boolean startWithNewLine;
    private Boolean hideNumber;
    private String state;
    private String titleLocation;
    private String descriptionLocation;
    private String errorLocation;
    private Integer indent;
    private String width;
    private String minWidth;
    private String maxWidth;

    // data
    private String valueName;
    private String defaultValue;
    private String correctAnswer;
    private Boolean useDisplayValuesInDynamicTexts;
    private String clearIfInvisible;

    // validators
    private List<QuestionValidatorDto> validators;
    private String requiredErrorText;

    // other
    private String readonlyRenderAs;
}
