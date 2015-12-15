package com.hr.dao.mapper;

import com.hr.entity.ConfigQuestionSecondKind;

public interface ConfigQuestionSecondKindMapper {
    int deleteByPrimaryKey(Short qskId);

    int insert(ConfigQuestionSecondKind record);

    int insertSelective(ConfigQuestionSecondKind record);

    ConfigQuestionSecondKind selectByPrimaryKey(Short qskId);

    int updateByPrimaryKeySelective(ConfigQuestionSecondKind record);

    int updateByPrimaryKey(ConfigQuestionSecondKind record);
}