package com.xqaqyn.survey.dto.question;

import lombok.Data;

@Data
public class FileQuestionDto extends BaseQuestionDto{
    // general
    private String sourceType;
    private Boolean showCommentArea;
    private String commentText;
    private String commentPlaceholder;
    private Boolean allowMultiple;
    private Boolean showPreview;
    private Boolean allowImagesPreview;
    private Boolean waitForUpload;
    private Boolean needConfirmRemoveFile;
    private Boolean storeDataAsText;
    private String acceptedTypes;
    private Integer maxSize;
    private Integer imageHeight;
    private Integer imageWidth;
    private String filePlaceholder;
    private String photoPlaceholder;
    private String fileOrPhotoPlaceholder;

    // data
    private String valueName;
}
