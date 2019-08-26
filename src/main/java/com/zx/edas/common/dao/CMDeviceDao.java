package com.zx.edas.common.dao;

import com.zx.edas.common.bo.CMDevice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CMDeviceDao extends PagingAndSortingRepository<CMDevice, Long> {

    @Query("from CMDevice where geoHash like :geoHash")
    List<CMDevice> findByTargetFlag(@Param("geoHash") String geoHash);
}
