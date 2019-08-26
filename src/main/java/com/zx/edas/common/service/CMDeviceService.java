package com.zx.edas.common.service;

import com.zx.edas.common.bo.CMDevice;

import java.util.List;

public interface CMDeviceService {
    
    List<CMDevice> getNearbyDeviceByLocation(double lng, double lat, int distance);
}
