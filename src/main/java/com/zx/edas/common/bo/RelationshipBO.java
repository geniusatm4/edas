package com.zx.edas.common.bo;

import java.sql.Timestamp;
import java.util.List;

public class RelationshipBO {
    private String type;
    private String clueSetId;
    private String srcObjectType;
    private String srcObjectId;
    private String srcObjectText;
    private String srcObjectDesc;
    private String srcObjectImage;
    private String srcObjectFSImage;
    private String targetObjectType;
    private String targetObjectId;
    private String targetObjectText;
    private String targetObjectDesc;
    private String targetObjectImage;
    private String targetObjectFSImage;
    private Scene scene;
    private Timestamp crateDate;

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public String getSrcObjectType() {
        return srcObjectType;
    }

    public void setSrcObjectType(String srcObjectType) {
        this.srcObjectType = srcObjectType;
    }

    public String getSrcObjectId() {
        return srcObjectId;
    }

    public void setSrcObjectId(String srcObjectId) {
        this.srcObjectId = srcObjectId;
    }

    public String getSrcObjectText() {
        return srcObjectText;
    }

    public void setSrcObjectText(String srcObjectText) {
        this.srcObjectText = srcObjectText;
    }

    public String getSrcObjectDesc() {
        return srcObjectDesc;
    }

    public void setSrcObjectDesc(String srcObjectDesc) {
        this.srcObjectDesc = srcObjectDesc;
    }

    public String getSrcObjectImage() {
        return srcObjectImage;
    }

    public void setSrcObjectImage(String srcObjectImage) {
        this.srcObjectImage = srcObjectImage;
    }

    public String getSrcObjectFSImage() {
        return srcObjectFSImage;
    }

    public void setSrcObjectFSImage(String srcObjectFSImage) {
        this.srcObjectFSImage = srcObjectFSImage;
    }

    public String getTargetObjectType() {
        return targetObjectType;
    }

    public void setTargetObjectType(String targetObjectType) {
        this.targetObjectType = targetObjectType;
    }

    public String getTargetObjectId() {
        return targetObjectId;
    }

    public void setTargetObjectId(String targetObjectId) {
        this.targetObjectId = targetObjectId;
    }

    public String getTargetObjectText() {
        return targetObjectText;
    }

    public void setTargetObjectText(String targetObjectText) {
        this.targetObjectText = targetObjectText;
    }

    public String getTargetObjectDesc() {
        return targetObjectDesc;
    }

    public void setTargetObjectDesc(String targetObjectDesc) {
        this.targetObjectDesc = targetObjectDesc;
    }

    public String getTargetObjectImage() {
        return targetObjectImage;
    }

    public void setTargetObjectImage(String targetObjectImage) {
        this.targetObjectImage = targetObjectImage;
    }

    public String getTargetObjectFSImage() {
        return targetObjectFSImage;
    }

    public void setTargetObjectFSImage(String targetObjectFSImage) {
        this.targetObjectFSImage = targetObjectFSImage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getClueSetId() {
        return clueSetId;
    }

    public void setClueSetId(String clueSetId) {
        this.clueSetId = clueSetId;
    }

    public Timestamp getCrateDate() {
        return crateDate;
    }

    public void setCrateDate(Timestamp crateDate) {
        this.crateDate = crateDate;
    }
}
