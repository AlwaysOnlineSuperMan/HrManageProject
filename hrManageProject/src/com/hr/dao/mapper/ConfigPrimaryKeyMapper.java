package com.hr.dao.mapper;

import com.hr.entity.ConfigPrimaryKey;

public interface ConfigPrimaryKeyMapper {
    int deleteByPrimaryKey(Short prkId);

    int insert(ConfigPrimaryKey record);

    int insertSelective(ConfigPrimaryKey record);

    ConfigPrimaryKey selectByPrimaryKey(Short prkId);

    int updateByPrimaryKeySelective(ConfigPrimaryKey record);

    int updateByPrimaryKey(ConfigPrimaryKey record);
}