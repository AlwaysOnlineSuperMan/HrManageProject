package com.hr.dao.mapper;

import java.util.List;

import com.hr.entity.ConfigMajorKind;

public interface ConfigMajorKindMapper {
    int deleteByPrimaryKey(Short mfkId);

    int insert(ConfigMajorKind record);

    int insertSelective(ConfigMajorKind record);

    ConfigMajorKind selectByPrimaryKey(Short mfkId);

    int updateByPrimaryKeySelective(ConfigMajorKind record);

    int updateByPrimaryKey(ConfigMajorKind record);
    //职位分类
    public abstract ConfigMajorKind getMajorKindName();
	public abstract List<ConfigMajorKind> getConfigMajorKindList();

}