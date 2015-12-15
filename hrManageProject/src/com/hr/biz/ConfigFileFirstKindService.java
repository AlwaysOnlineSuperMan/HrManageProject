package com.hr.biz;

import java.util.List;

import com.hr.biz.imp.IConfigFileFirstKindService;
import com.hr.dao.ConfigFileFirstKindDAO;
import com.hr.entity.ConfigFileFirstKind;
import com.hr.entity.ConfigFileFirstKindWithBLOBs;

public class ConfigFileFirstKindService implements IConfigFileFirstKindService {
	private ConfigFileFirstKindDAO configFileFirstKindDao;

	public void setConfigFileFirstKindDao(
			ConfigFileFirstKindDAO configFileFirstKindDao) {
		this.configFileFirstKindDao = configFileFirstKindDao;
	}

	public List<ConfigFileFirstKind> getConfigFileFirstKindList() {
		// TODO Auto-generated method stub
		return configFileFirstKindDao.getConfigFileFirstKindList();
	}
	
	public List<ConfigFileFirstKindWithBLOBs> selectIdName() throws Exception {
		// TODO Auto-generated method stub
		return configFileFirstKindDao.selectIdName();
	}

	public List<ConfigFileFirstKindWithBLOBs> getConfigFileFirstKindWithBLOBsList() {
		// TODO Auto-generated method stub
		return configFileFirstKindDao.getConfigFileFirstKindWithBLOBsList();
	}

	public int insertSelective(ConfigFileFirstKindWithBLOBs record) {
		// TODO Auto-generated method stub
		return configFileFirstKindDao.insertSelective(record);
	}

	public int insert(ConfigFileFirstKindWithBLOBs record) {
		// TODO Auto-generated method stub
		return configFileFirstKindDao.insert(record);
	}

	public ConfigFileFirstKindWithBLOBs getConfigFileFirstKindWithBLOBsByfffId(
			Short fffId) {
		// TODO Auto-generated method stub
		return configFileFirstKindDao.getConfigFileFirstKindWithBLOBsByfffId(fffId);
	}

	public int updateByPrimaryKeySelective(ConfigFileFirstKindWithBLOBs record) {
		// TODO Auto-generated method stub
		return configFileFirstKindDao.updateByPrimaryKeySelective(record);
	}
	
}
