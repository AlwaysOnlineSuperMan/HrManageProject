package com.hr.dao.mapper;

import java.util.HashMap;
import java.util.List;

import com.hr.entity.ConfigMajor;

public interface ConfigMajorMapper {
    int deleteByPrimaryKey(Short makId);

    int insert(ConfigMajor record);

    int insertSelective(ConfigMajor record);

    ConfigMajor selectByPrimaryKey(Short makId);

    int updateByPrimaryKeySelective(ConfigMajor record);

    int updateByPrimaryKey(ConfigMajor record);
   
    public abstract List<ConfigMajor> getConfigMajorList(HashMap map) throws Exception;
    public abstract List<ConfigMajor> getConfigMajorListAll(HashMap map) throws Exception ;
}