package com.xqaqyn.survey.dto;

import com.xqaqyn.survey.dto.field.CalculatedValue;
import com.xqaqyn.survey.dto.field.HtmlOnCondition;
import com.xqaqyn.survey.dto.field.Trigger;
import com.xqaqyn.survey.dto.field.UrlOnCondition;
import lombok.Data;

import java.util.List;

@Data
public class SurveyDto {
    // general
    private String title;
    private String description;
    private Boolean showTitle;
    private String mode;
    private String cookieName;
    private String widthMode;
    private String width;
    private Boolean fitToContainer;

    // survey header logo
    private String logo;
    private String logoWidth;
    private String logoHeight;
    private String logoFit;

    // navigation
    private String showPreviewBeforeComplete;
    private String pagePrevText;
    private String pageNextText;
    private String completeText;
    private String previewText;
    private String editText;
    private String startSurveyText;
    private String showNavigationButtons;
    private Boolean showPrevButton;
    private Boolean firstPageIsStarted;
    private Boolean goNextPageAutomatic;
    private String showProgressBar;
    private String progressBarType;
    private String questionsOnPageMode;
    private String showTOC;
    private String tocLocation;

    // question
    private String showQuestionNumbers;
    private String questionTitleLocation;
    private String questionDescriptionLocation;
    private String questionTitlePattern;
    private String requiredText;
    private String questionStartIndex;
    private String questionErrorLocation;
    private Boolean focusFirstQuestionAutomatic;
    private String questionsOrder;
    private Integer maxTextLength;
    private Integer maxOthersLength;
    private Boolean autoGrowComment;
    private Boolean allowResizeComment;

    // pages
    private List<PageDto> pages;
    private Boolean showPageNumbers;
    private Boolean showPageTitles;

    // logic
    private List<Trigger> triggers;
    private List<CalculatedValue> calculatedValues;

    // data
    private String clearInvisibleValues;
    private String textUpdateMode;
    private Boolean sendResultOnPageNext;
    private Boolean storeOthersAsComment;

    // validation
    private Boolean focusOnFirstError;
    private String checkErrorsMode;

    // complete
    private String navigateToUrl;
    private Boolean showCompletedPage;
    private String completedHtml;
    private List<HtmlOnCondition> completedHtmlOnCondition;
    private List<UrlOnCondition> navigateToUrlOnCondition;
    private String loadingHtml;
    private String completedBeforeHtml;

    // timer
    private Integer maxTimeToFinish;
    private Integer maxTimeToFinishPage;
    private String showTimerPanel;
    private String showTimerPanelMode;
}
