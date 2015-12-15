package com.hr.biz;

import java.util.HashMap;
import java.util.List;

import com.hr.biz.imp.IConfigFileSecondKindService;
import com.hr.dao.ConfigFileSecondKindDAO;
import com.hr.entity.ConfigFileFirstKindWithBLOBs;
import com.hr.entity.ConfigFileSecondKind;
import com.hr.entity.ConfigFileSecondKindWithBLOBs;

public class ConfigFileSecondKindService implements IConfigFileSecondKindService {
	private ConfigFileSecondKindDAO configFileSecondKindDao;

	public void setConfigFileSecondKindDao(
			ConfigFileSecondKindDAO configFileSecondKindDao) {
		this.configFileSecondKindDao = configFileSecondKindDao;
	}

	public List<ConfigFileSecondKind> getConfigFileSecondKindByFirst_id(HashMap map)
			throws Exception {
		return configFileSecondKindDao.getConfigFileSecondKindByFirst_id(map);
	}

	public List<ConfigFileSecondKindWithBLOBs> getConfigFileSecondKindByListAll()
			throws Exception {
		// TODO Auto-generated method stub
		return configFileSecondKindDao.getConfigFileSecondKindByListAll();
	}

	public int insertSelective(ConfigFileSecondKindWithBLOBs record)
			throws Exception {
		// TODO Auto-generated method stub
		return configFileSecondKindDao.insertSelective(record);
	}

	public ConfigFileSecondKindWithBLOBs getSelectByPrimaryKey(Short fskId)
			throws Exception {
		// TODO Auto-generated method stub
		return configFileSecondKindDao.getSelectByPrimaryKey(fskId);
	}

	public int updateByPrimaryKeySelective(ConfigFileSecondKindWithBLOBs record)
			throws Exception {
		// TODO Auto-generated method stub
		return configFileSecondKindDao.updateByPrimaryKeyWithBLOBs(record);
	}
	
}
