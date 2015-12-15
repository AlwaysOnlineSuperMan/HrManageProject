package com.hr.dao.mapper;

import com.hr.entity.EngageInterview;
import com.hr.entity.EngageInterviewWithBLOBs;

public interface EngageInterviewMapper {
    int deleteByPrimaryKey(Short einId);

    int insert(EngageInterviewWithBLOBs record);

    int insertSelective(EngageInterviewWithBLOBs record);

    EngageInterviewWithBLOBs selectByPrimaryKey(Short einId);

    int updateByPrimaryKeySelective(EngageInterviewWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EngageInterviewWithBLOBs record);

    int updateByPrimaryKey(EngageInterview record);
}