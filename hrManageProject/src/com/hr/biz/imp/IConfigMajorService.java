package com.hr.biz.imp;

import java.util.HashMap;
import java.util.List;

import com.hr.entity.ConfigMajor;

public interface IConfigMajorService {

	public abstract List<ConfigMajor> getConfigMajorList(HashMap map)
			throws Exception;
    public abstract List<ConfigMajor> getConfigMajorListAll(HashMap map) throws Exception ;
	public abstract int insertSelective(ConfigMajor record) ;
}