package com.xqaqyn.survey.dto.question;

import lombok.Data;

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
}
