package com.xqaqyn.survey.dto.question;

import com.xqaqyn.survey.dto.question.field.MatrixLabelDto;
import lombok.Data;

import java.util.List;

@Data
public class MatrixDropdownQuestionDto extends BaseQuestionDto{
    // general
    private Boolean showCommentArea;
    private String commentText;
    private String commentPlaceholder;
    private String cellType;
    private String detailPanelMode;
    private String totalText;
    private String placeholder;

    // columns
    private List<MatrixLabelDto> columns;

    // rows
    private List<MatrixLabelDto> rows;
    private Boolean hideIfRowsEmpty;

    // choice options
    private List<MatrixLabelDto> choices;

    // layout
    private Boolean showHeader;
    private String verticalAlign;
    private Boolean alternateRows;
    private Boolean transposeData;
    private Integer columnColCount;
    private String columnMinWidth;
    private String rowTitleWidth;
    private String cellErrorLocation;

    // condition
    private String columnsVisibleIf;
    private String rowsVisibleIf;

    // validator
    private String requiredErrorText;
    private String keyDuplicationError;

}
