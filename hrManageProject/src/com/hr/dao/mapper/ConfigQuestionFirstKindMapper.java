package com.hr.dao.mapper;

import com.hr.entity.ConfigQuestionFirstKind;

public interface ConfigQuestionFirstKindMapper {
    int deleteByPrimaryKey(Short qfkId);

    int insert(ConfigQuestionFirstKind record);

    int insertSelective(ConfigQuestionFirstKind record);

    ConfigQuestionFirstKind selectByPrimaryKey(Short qfkId);

    int updateByPrimaryKeySelective(ConfigQuestionFirstKind record);

    int updateByPrimaryKey(ConfigQuestionFirstKind record);
}