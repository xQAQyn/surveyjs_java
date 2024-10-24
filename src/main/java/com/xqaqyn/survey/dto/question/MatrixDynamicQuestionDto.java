package com.xqaqyn.survey.dto.question;

import com.xqaqyn.survey.dto.question.field.MatrixLabelDto;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class MatrixDynamicQuestionDto extends BaseQuestionDto {
    // general
    private Boolean showCommentArea;
    private String commentText;
    private String commentPlaceholder;
    private String cellType;
    private String detailPanelMode;
    private Boolean allowAddRows;
    private Boolean allowRemoveRows;
    private Boolean allowRowsDragAndDrop;
    private Integer rowCount;
    private Integer minRowCount;
    private Integer maxRowCount;
    private String addRowLocation;
    private String addRowText;
    private String removeRowText;
    private Boolean confirmDelete;
    private String confirmDeleteText;
    private String placeholder;

    // column
    private List<MatrixLabelDto> columns;
    private Boolean hideColumnsIfEmpty;
    private String emptyRowsText;

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

    // data
    private Map<String, Object> defaultRowValue;
    private Boolean defaultValueFromLastRow;

    // validator
    private String requiredErrorText;
    private String keyDuplicationError;
}
