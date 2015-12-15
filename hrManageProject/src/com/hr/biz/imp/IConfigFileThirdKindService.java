package com.hr.biz.imp;

import java.util.HashMap;
import java.util.List;

import com.hr.entity.ConfigFileThirdKind;

public interface IConfigFileThirdKindService {
    public abstract List<ConfigFileThirdKind>  getConfigFileThirdKindByFirstKindIdAndSecondKindId(HashMap map)throws Exception;
	public abstract List<ConfigFileThirdKind>  getConfigFileThirdKindByListAll() throws Exception ;
	public abstract int insert(ConfigFileThirdKind record);
	public abstract int insertSelective(ConfigFileThirdKind record) ;
	public abstract ConfigFileThirdKind  getSelectByPrimaryKey(Short ftkId) throws Exception ;
	public abstract int updateByPrimaryKeySelective(ConfigFileThirdKind record)throws Exception ;
}