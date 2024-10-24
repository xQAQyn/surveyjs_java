package com.xqaqyn.survey.dto.question;

import com.xqaqyn.survey.dto.question.field.QuestionChoicesByUrlDto;
import lombok.Data;

import java.util.List;

@Data
public class RankingQuestionDto extends BaseQuestionDto{
    // general
    private Boolean showCommentArea;
    private String commentText;
    private String commentPlaceholder;
    private Boolean selectToRankEnabled;
    private String selectToRankEmptyRankedAreaText;
    private String selectToRankEmptyUnrankedAreaText;

    // choice options
    private List<String> choices;
    private String choicesFromQuestion;
    private String choicesOrder;

    // choices from a web service
    private QuestionChoicesByUrlDto choicesByUrl;

    // condition
    private Boolean hideIfChoicesEmpty;
    private String choicesVisibleIf;
    private String choicesEnableIf;

    // data
    private String valuePropertyName;
}
