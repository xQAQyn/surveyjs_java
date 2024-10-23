package com.xqaqyn.survey.dto.question;

import com.xqaqyn.survey.dto.QuestionValidatorDto;
import lombok.Data;

import java.util.List;

@Data
public class BaseQuestionDto {
    // general info
    private String name;
    private String title;
    private String description;
    private Boolean visible;
    private Boolean isRequired;
    private Boolean readOnly;

    // logic
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
    private Integer size;

    // data
    private String defaultValue;
    private String correctAnswer;
    private Boolean useDisplayValuesInDynamicTexts;
    private String clearIfInvisible;
    private String textUpdateMode;
    private List<QuestionValidatorDto> validators;

    // other
    private String readonlyRenderAs;
}
