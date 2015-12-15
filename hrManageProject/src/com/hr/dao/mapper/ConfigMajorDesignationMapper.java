package com.hr.dao.mapper;

import java.util.HashMap;
import java.util.List;

import com.hr.entity.ConfigFileSecondKind;
import com.hr.entity.ConfigMajorDesignation;

public interface ConfigMajorDesignationMapper {
    int deleteByPrimaryKey(Short cmdId);

    int insert(ConfigMajorDesignation record);

    int insertSelective(ConfigMajorDesignation record);

    ConfigMajorDesignation selectByPrimaryKey(Short cmdId);

    int updateByPrimaryKeySelective(ConfigMajorDesignation record);

    int updateByPrimaryKey(ConfigMajorDesignation record);
	public abstract List<ConfigMajorDesignation>  getConfigMajorDesignationList() throws Exception ;
}