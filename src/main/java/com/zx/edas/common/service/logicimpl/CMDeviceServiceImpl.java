package com.zx.edas.common.service.logicimpl;

import com.zx.edas.common.DeviceUtils;
import com.zx.edas.common.bo.CMDevice;
import com.zx.edas.common.dao.CMDeviceDao;
import com.zx.edas.common.service.CMDeviceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CMDeviceServiceImpl implements CMDeviceService {

    @Autowired
    CMDeviceDao cmDeviceDao;

    @Override
    public List<CMDevice> getNearbyDeviceByLocation(double lng, double lat, int distance) {

        // 根据经纬度获取GeoHash
        String geoHash = DeviceUtils.getGeoHashBase32(lat, lng);

        if (geoHash == null) {
            //TODO :
            return new ArrayList<>();
        }

        return cmDeviceDao.findByTargetFlag(geoHash + "%");
    }
}
