package com.hr.dao.mapper;

import java.util.HashMap;
import java.util.List;

import com.hr.entity.ConfigPublicChar;

public interface ConfigPublicCharMapper {
    int deleteByPrimaryKey(Short pbcId);

    int insert(ConfigPublicChar record);

    int insertSelective(ConfigPublicChar record);

    ConfigPublicChar selectByPrimaryKey(Short pbcId);

    int updateByPrimaryKeySelective(ConfigPublicChar record);

    int updateByPrimaryKey(ConfigPublicChar record);
	public abstract List<ConfigPublicChar> getConfigPublicCharByAttributeKind(String attributeKind)throws Exception;
	public abstract List<ConfigPublicChar> getConfigPublicCharByListAll ()throws Exception ;
}