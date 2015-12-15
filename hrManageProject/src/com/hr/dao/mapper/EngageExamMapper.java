package com.hr.dao.mapper;

import com.hr.entity.EngageExam;

public interface EngageExamMapper {
    int deleteByPrimaryKey(Short exaId);

    int insert(EngageExam record);

    int insertSelective(EngageExam record);

    EngageExam selectByPrimaryKey(Short exaId);

    int updateByPrimaryKeySelective(EngageExam record);

    int updateByPrimaryKey(EngageExam record);
}