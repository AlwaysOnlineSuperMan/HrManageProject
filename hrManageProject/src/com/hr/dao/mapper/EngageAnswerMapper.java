package com.hr.dao.mapper;

import com.hr.entity.EngageAnswer;

public interface EngageAnswerMapper {
    int deleteByPrimaryKey(Short ansId);

    int insert(EngageAnswer record);

    int insertSelective(EngageAnswer record);

    EngageAnswer selectByPrimaryKey(Short ansId);

    int updateByPrimaryKeySelective(EngageAnswer record);

    int updateByPrimaryKey(EngageAnswer record);
}