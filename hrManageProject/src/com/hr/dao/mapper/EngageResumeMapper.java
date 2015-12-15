package com.hr.dao.mapper;

import com.hr.entity.EngageResume;
import com.hr.entity.EngageResumeWithBLOBs;

public interface EngageResumeMapper {
    int deleteByPrimaryKey(Short resId);

    int insert(EngageResumeWithBLOBs record);

    int insertSelective(EngageResumeWithBLOBs record);

    EngageResumeWithBLOBs selectByPrimaryKey(Short resId);

    int updateByPrimaryKeySelective(EngageResumeWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EngageResumeWithBLOBs record);

    int updateByPrimaryKey(EngageResume record);
}