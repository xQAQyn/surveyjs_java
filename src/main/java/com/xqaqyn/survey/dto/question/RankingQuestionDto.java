package com.xqaqyn.survey.dto.question;

import lombok.Data;

@Data
public class RankingQuestionDto extends BaseQuestionDto{
    private Boolean showCommentArea;
    private String commentText;
    private String commentPlaceholder;
    private Boolean selectToRankEnabled;
    private String selectToRankEmptyRankedAreaText;
    private String selectToRankEmptyUnrankedAreaText;
}
