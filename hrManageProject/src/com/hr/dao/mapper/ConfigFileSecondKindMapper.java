package com.hr.dao.mapper;

import java.util.HashMap;
import java.util.List;

import com.hr.entity.ConfigFileSecondKind;
import com.hr.entity.ConfigFileSecondKindWithBLOBs;

public interface ConfigFileSecondKindMapper {
    int deleteByPrimaryKey(Short fskId);

    int insert(ConfigFileSecondKindWithBLOBs record);

    int insertSelective(ConfigFileSecondKindWithBLOBs record);

    ConfigFileSecondKindWithBLOBs selectByPrimaryKey(Short fskId);

    int updateByPrimaryKeySelective(ConfigFileSecondKindWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ConfigFileSecondKindWithBLOBs record);

    int updateByPrimaryKey(ConfigFileSecondKind record);
	public abstract ConfigFileSecondKindWithBLOBs getSelectByPrimaryKey(Short  fskId) throws Exception ;
    public abstract List<ConfigFileSecondKind> getConfigFileSecondKindByFirst_id(HashMap map)throws Exception;
    public abstract List<ConfigFileSecondKindWithBLOBs> getConfigFileSecondKindByListAll() throws Exception ;
}