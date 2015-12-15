package com.hr.dao.mapper;

import java.util.HashMap;
import java.util.List;

import com.hr.entity.ConfigFileThirdKind;

public interface ConfigFileThirdKindMapper {
    int deleteByPrimaryKey(Short ftkId);

    int insert(ConfigFileThirdKind record);

    int insertSelective(ConfigFileThirdKind record);

    ConfigFileThirdKind selectByPrimaryKey(Short ftkId);

    int updateByPrimaryKeySelective(ConfigFileThirdKind record);

    int updateByPrimaryKeyWithBLOBs(ConfigFileThirdKind record);

    int updateByPrimaryKey(ConfigFileThirdKind record);
    //---------------
    public abstract List<ConfigFileThirdKind>  getConfigFileThirdKindByFirstKindIdAndSecondKindId(HashMap map)throws Exception;
	public abstract List<ConfigFileThirdKind>  getConfigFileThirdKindByListAll() throws Exception ;
	public abstract ConfigFileThirdKind  getSelectByPrimaryKey(Short ftkId) throws Exception ;
}