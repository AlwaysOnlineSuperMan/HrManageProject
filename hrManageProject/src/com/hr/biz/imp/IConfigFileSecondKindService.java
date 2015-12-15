package com.hr.biz.imp;

import java.util.HashMap;
import java.util.List;

import com.hr.entity.ConfigFileFirstKindWithBLOBs;
import com.hr.entity.ConfigFileSecondKind;
import com.hr.entity.ConfigFileSecondKindWithBLOBs;

public interface IConfigFileSecondKindService {
    public abstract List<ConfigFileSecondKind> getConfigFileSecondKindByFirst_id(HashMap map)throws Exception;
    public abstract List<ConfigFileSecondKindWithBLOBs> getConfigFileSecondKindByListAll() throws Exception ;
    public abstract int insertSelective(ConfigFileSecondKindWithBLOBs record) throws Exception ;
	public abstract ConfigFileSecondKindWithBLOBs getSelectByPrimaryKey(Short  fskId) throws Exception ;
	public abstract int updateByPrimaryKeySelective(ConfigFileSecondKindWithBLOBs record) throws Exception ;
   
}