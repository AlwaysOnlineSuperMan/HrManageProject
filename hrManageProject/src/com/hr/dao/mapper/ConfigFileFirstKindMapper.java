package com.hr.dao.mapper;

import java.util.List;

import com.hr.entity.ConfigFileFirstKind;
import com.hr.entity.ConfigFileFirstKindWithBLOBs;

public interface ConfigFileFirstKindMapper {
    int deleteByPrimaryKey(Short ffkId);

    int insert(ConfigFileFirstKindWithBLOBs record);

    int insertSelective(ConfigFileFirstKindWithBLOBs record);

    ConfigFileFirstKindWithBLOBs selectByPrimaryKey(Short ffkId);

    int updateByPrimaryKeySelective(ConfigFileFirstKindWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ConfigFileFirstKindWithBLOBs record);

    int updateByPrimaryKey(ConfigFileFirstKind record);
    //-------------------
    public abstract List<ConfigFileFirstKind> getConfigFileFirstKindList();
    
    public abstract List<ConfigFileFirstKindWithBLOBs> selectIdName() throws Exception;
    public abstract List<ConfigFileFirstKindWithBLOBs> getConfigFileFirstKindWithBLOBsList();
	public abstract ConfigFileFirstKindWithBLOBs getConfigFileFirstKindWithBLOBsByfffId(Short fffId);
}