package com.xqaqyn.survey.dto.question;

import com.xqaqyn.survey.dto.question.field.MatrixLabelDto;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class MatrixQuestionDto extends BaseQuestionDto{
    // general
    private Boolean showCommentArea;
    private String commentText;
    private String commentPlaceholder;

    // columns
    private List<MatrixLabelDto> columns;

    // rows
    private List<MatrixLabelDto> rows;
    private String rowsOrder;
    private Boolean hideIfRowsEmpty;

    // layout
    private Boolean showHeader;
    private String verticalAlign;
    private Boolean alternateRows;
    private String columnMinWidth;
    private String rowTitleWidth;

    // condition
    private String columnsVisibleIf;
    private String rowsVisibleIf;

    // validator
    private Boolean isAllRowRequired;
    private Boolean eachRowUnique;

    // individual cell text
    private Map<String, Object> cells;
}
