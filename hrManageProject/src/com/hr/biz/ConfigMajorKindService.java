package com.hr.biz;

import java.util.List;


import com.hr.biz.imp.IConfigMajorKindService;
import com.hr.dao.mapper.ConfigMajorKindMapper;
import com.hr.entity.ConfigMajorKind;

public class ConfigMajorKindService implements  IConfigMajorKindService{
	private ConfigMajorKindMapper configMajorKindDao;

	
	public void setConfigMajorKindDao(ConfigMajorKindMapper configMajorKindDao) {
		this.configMajorKindDao = configMajorKindDao;
	}
	public ConfigMajorKind getConfigMajorKind() {
		return configMajorKindDao.getMajorKindName();
	}
	public List<ConfigMajorKind> getConfigMajorKindList() {
		// TODO Auto-generated method stub
		return configMajorKindDao.getConfigMajorKindList();
	}
	public int insertSelective(ConfigMajorKind record) {
		// TODO Auto-generated method stub
		return configMajorKindDao.insertSelective(record);
	}
}
