package com.hr.dao.mapper;

import com.hr.entity.EngageExamDetails;

public interface EngageExamDetailsMapper {
    int deleteByPrimaryKey(Short exdId);

    int insert(EngageExamDetails record);

    int insertSelective(EngageExamDetails record);

    EngageExamDetails selectByPrimaryKey(Short exdId);

    int updateByPrimaryKeySelective(EngageExamDetails record);

    int updateByPrimaryKey(EngageExamDetails record);
}