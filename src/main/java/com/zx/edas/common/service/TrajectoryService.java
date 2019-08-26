package com.zx.edas.common.service;

import com.zx.edas.common.bo.CMDevice;
import com.zx.edas.common.bo.CMShot;
import com.zx.edas.common.bo.Person;

import java.util.List;

public interface TrajectoryService {

    List<CMDevice> getRelatedDevice(Person person);

    List<Person> getRelatedPersonByPerson(Person person);

    List<CMDevice> getRelatedDeviceByTrajectory(List<CMShot> trajectory);

    List<Person> getRelatedPersonByTrajectory(List<CMShot> trajectory);
}
