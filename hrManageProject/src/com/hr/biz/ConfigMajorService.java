package com.hr.biz;

import java.util.HashMap;
import java.util.List;

import com.hr.biz.imp.IConfigMajorService;
import com.hr.dao.ConfigMajorDAO;
import com.hr.entity.ConfigMajor;

public class ConfigMajorService implements IConfigMajorService {
	private ConfigMajorDAO configMajorDao;

	public void setConfigMajorDao(ConfigMajorDAO configMajorDao) {
		this.configMajorDao = configMajorDao;
	}
	
	/* (non-Javadoc)
	 * @see com.hr.biz.IConfigMajorService#getConfigMajorList(java.util.HashMap)
	 */
	public List<ConfigMajor> getConfigMajorList(HashMap map) throws Exception {
		return configMajorDao.getConfigMajorList(map);
	}

	public List<ConfigMajor> getConfigMajorListAll(HashMap map)
			throws Exception {
		// TODO Auto-generated method stub
		return configMajorDao.getConfigMajorListAll(map);
	}

	public int insertSelective(ConfigMajor record) {
		// TODO Auto-generated method stub
		return configMajorDao.insertSelective(record);
	}
	
	
	
}
