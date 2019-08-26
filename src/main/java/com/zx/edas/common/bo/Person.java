package com.zx.edas.common.bo;

import java.util.List;

public class Person {

    private String personId;
    private String idNumber;
    private List<CMShot> trajectory;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public List<CMShot> getTrajectory() {
        return trajectory;
    }

    public void setTrajectory(List<CMShot> trajectory) {
        this.trajectory = trajectory;
    }
}
