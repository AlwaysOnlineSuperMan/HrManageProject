package com.hr.biz.imp;

import java.util.List;

import com.hr.entity.ConfigMajorKind;

public interface IConfigMajorKindService {

	public abstract List<ConfigMajorKind> getConfigMajorKindList();
	public abstract int insertSelective(ConfigMajorKind record) ;
}