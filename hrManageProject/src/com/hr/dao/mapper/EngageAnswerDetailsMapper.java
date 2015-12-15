package com.hr.dao.mapper;

import com.hr.entity.EngageAnswerDetails;

public interface EngageAnswerDetailsMapper {
    int deleteByPrimaryKey(Short andId);

    int insert(EngageAnswerDetails record);

    int insertSelective(EngageAnswerDetails record);

    EngageAnswerDetails selectByPrimaryKey(Short andId);

    int updateByPrimaryKeySelective(EngageAnswerDetails record);

    int updateByPrimaryKey(EngageAnswerDetails record);
}