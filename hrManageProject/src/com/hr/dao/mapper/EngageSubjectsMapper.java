package com.hr.dao.mapper;

import com.hr.entity.EngageSubjects;
import com.hr.entity.EngageSubjectsWithBLOBs;

public interface EngageSubjectsMapper {
    int deleteByPrimaryKey(Short subId);

    int insert(EngageSubjectsWithBLOBs record);

    int insertSelective(EngageSubjectsWithBLOBs record);

    EngageSubjectsWithBLOBs selectByPrimaryKey(Short subId);

    int updateByPrimaryKeySelective(EngageSubjectsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EngageSubjectsWithBLOBs record);

    int updateByPrimaryKey(EngageSubjects record);
}