package com.zx.edas.common.bo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cm_device")
public class CMDevice {

    public static final double MIN_LAT = -90;
    public static final double MAX_LAT = 90;
    public static final double MIN_LNG = -180;
    public static final double MAX_LNG = 180;

    @Id
    private String id;
    private double lng;
    private double lat;
    private String gbId;
    private String nm;
    private String dt;
    private String des;
    private String geoHash;

    public CMDevice() {
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

    public String getGbId() {
        return gbId;
    }

    public void setGbId(String gbId) {
        this.gbId = gbId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String desc) {
        this.des = desc;
    }

    public String getNm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public String getGeoHash() {
        return geoHash;
    }

    public void setGeoHash(String geoHash) {
        this.geoHash = geoHash;
    }
}
