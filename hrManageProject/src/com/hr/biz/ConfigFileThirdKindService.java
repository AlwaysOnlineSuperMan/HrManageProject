package com.hr.biz;

import java.util.HashMap;
import java.util.List;

import com.hr.biz.imp.IConfigFileThirdKindService;
import com.hr.dao.ConfigFileThirdKindDAO;
import com.hr.entity.ConfigFileThirdKind;

public class ConfigFileThirdKindService implements IConfigFileThirdKindService {
	private ConfigFileThirdKindDAO configFileThirdKindDao;

	public void setConfigFileThirdKindDao(
			ConfigFileThirdKindDAO configFileThirdKindDao) {
		this.configFileThirdKindDao = configFileThirdKindDao;
	}

	public List<ConfigFileThirdKind> getConfigFileThirdKindByFirstKindIdAndSecondKindId(
			HashMap map) throws Exception {
		return configFileThirdKindDao.getConfigFileThirdKindByFirstKindIdAndSecondKindId(map);
	}

	public List<ConfigFileThirdKind> getConfigFileThirdKindByListAll()
			throws Exception {
		// TODO Auto-generated method stub
		return configFileThirdKindDao.getConfigFileThirdKindByListAll();
	}

	public int insert(ConfigFileThirdKind record) {
		// TODO Auto-generated method stub
		return configFileThirdKindDao.insert(record);
	}

	public int insertSelective(ConfigFileThirdKind record) {
		// TODO Auto-generated method stub
		return configFileThirdKindDao.insertSelective(record);
	}

	public ConfigFileThirdKind getSelectByPrimaryKey(Short ftkId)
			throws Exception {
		// TODO Auto-generated method stub
		return configFileThirdKindDao.getSelectByPrimaryKey(ftkId);
	}

	public int updateByPrimaryKeySelective(ConfigFileThirdKind record)
			throws Exception {
		// TODO Auto-generated method stub
		return configFileThirdKindDao.updateByPrimaryKeySelective(record);
	}
}
