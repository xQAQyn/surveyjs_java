package com.xqaqyn.survey.dto.question;

import com.xqaqyn.survey.dto.question.field.QuestionChoicesByUrlDto;
import lombok.Data;

import java.util.List;

@Data
public class DropdownQuestionDto extends BaseQuestionDto{
    // general
    private Boolean showCommentArea;
    private String commentText;
    private String commentPlaceholder;
    private String placeholder;
    private String autocomplete;

    // choice options
    private List<String> choices;
    private String choicesFromQuestion;
    private String choicesOrder;
    private Boolean showOtherItem;
    private String otherText;
    private String otherPlaceholder;
    private Boolean showNoneItem;
    private String noneText;
    private Boolean showClearButton;
    private Boolean textWrapEnabled;
    private Integer choicesMin;
    private Integer choicesMax;
    private Integer choicesStep;
    private String searchMode;

    // choices from a web service
    private QuestionChoicesByUrlDto choicesByUrl;

    // layout
    private Integer colCount;

    // condition
    private Boolean hideIfChoicesEmpty;
    private String choicesVisibleIf;
    private String choicesEnableIf;

    // data
    private String valueName;
    private String defaultValue;
    private String correctAnswer;
    private String clearIfInvisible;
    private Boolean useDisplayValuesInDynamicTexts;
}
