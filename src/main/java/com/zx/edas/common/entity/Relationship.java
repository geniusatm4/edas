package com.zx.edas.common.entity;

import java.sql.Timestamp;

public class Relationship {

    private String srcObjectType;
    private String srcObjectId;
    private String targetObjectType;
    private String targetObjectId;
    private String type;
    private String clueSetId;
    private Timestamp crateDate;

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
