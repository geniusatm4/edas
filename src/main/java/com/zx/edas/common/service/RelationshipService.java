package com.zx.edas.common.service;

import com.zx.edas.common.bo.CMObject;
import com.zx.edas.common.bo.RelationshipBO;

import java.util.List;

public interface RelationshipService {

    List<RelationshipBO> getRelatedObjects(CMObject object);
}
