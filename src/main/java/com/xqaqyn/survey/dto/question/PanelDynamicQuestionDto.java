package com.xqaqyn.survey.dto.question;

import lombok.Data;

@Data
public class PanelDynamicQuestionDto extends BaseQuestionDto{
    // general
    private Boolean showCommentArea;
    private String commentText;
    private String commentPlaceholder;
    private String renderMode;
    private Integer minPanelCount;
    private Integer maxPanelCount;
    private Integer panelCount;
    private String panelsState;
    private Boolean allowAddPanel;
    private Boolean allowRemovePanel;
    private String panelAddText;
    private String panelRemoveText;
    private String templateTitle;
    private String templateDescription;
    private String noEntriesText;
    private Boolean confirmDelete;
    private String confirmDeleteText;
    private String panelPrevText;
    private String panelNextText;
    private String showQuestionNumbers;
    private Boolean showRangeInProgress;
}