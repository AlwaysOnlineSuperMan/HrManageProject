package com.hr.biz.imp;

import java.util.List;

import com.hr.entity.ConfigFileFirstKind;
import com.hr.entity.ConfigFileFirstKindWithBLOBs;

public interface IConfigFileFirstKindService {
	  public abstract int insertSelective(ConfigFileFirstKindWithBLOBs record);
    public abstract List<ConfigFileFirstKind> getConfigFileFirstKindList();
    public abstract List<ConfigFileFirstKindWithBLOBs> getConfigFileFirstKindWithBLOBsList();
    public abstract int insert(ConfigFileFirstKindWithBLOBs record);
    public abstract List<ConfigFileFirstKindWithBLOBs> selectIdName() throws Exception;
    public abstract ConfigFileFirstKindWithBLOBs getConfigFileFirstKindWithBLOBsByfffId(Short fffId);
	public abstract int updateByPrimaryKeySelective(ConfigFileFirstKindWithBLOBs record);
}