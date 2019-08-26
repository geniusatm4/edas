package com.zx.edas.common.bo;

import java.sql.Timestamp;

public class CMShot {

    private String uuid;
    private String extId;
    private String st;
    private String did;
    private String gbId;
    private String img;
    private String fsImg;
    private String des;
    private double lng;
    private double lat;
    private Timestamp shotTIme;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getGbId() {
        return gbId;
    }

    public void setGbId(String gbId) {
        this.gbId = gbId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getFsImg() {
        return fsImg;
    }

    public void setFsImg(String fsImg) {
        this.fsImg = fsImg;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public Timestamp getShotTIme() {
        return shotTIme;
    }

    public void setShotTIme(Timestamp shotTIme) {
        this.shotTIme = shotTIme;
    }
}
