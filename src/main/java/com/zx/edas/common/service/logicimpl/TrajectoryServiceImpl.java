package com.zx.edas.common.service.logicimpl;

import com.zx.edas.common.DeviceUtils;
import com.zx.edas.common.bo.CMDevice;
import com.zx.edas.common.bo.CMShot;
import com.zx.edas.common.bo.Person;
import com.zx.edas.common.dao.CMDeviceDao;
import com.zx.edas.common.service.CMDeviceService;
import com.zx.edas.common.service.TrajectoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TrajectoryServiceImpl implements TrajectoryService {

    @Autowired
    CMDeviceDao cmDeviceDao;

    @Override
    public List<CMDevice> getRelatedDevice(Person person) {
        return null;
    }

    @Override
    public List<Person> getRelatedPersonByPerson(Person person) {
        return null;
    }

    @Override
    public List<CMDevice> getRelatedDeviceByTrajectory(List<CMShot> trajectory) {
        return null;
    }

    @Override
    public List<Person> getRelatedPersonByTrajectory(List<CMShot> trajectory) {
        return null;
    }
}
