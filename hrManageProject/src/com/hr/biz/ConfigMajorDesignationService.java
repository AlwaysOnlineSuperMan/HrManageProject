package com.hr.biz;

import java.util.List;

import com.hr.biz.imp.IConfigMajorDesignationService;
import com.hr.dao.mapper.ConfigMajorDesignationMapper;
import com.hr.entity.ConfigMajorDesignation;

public class ConfigMajorDesignationService implements IConfigMajorDesignationService  {
	private ConfigMajorDesignationMapper configMajorDesignationDAO;

	public void setConfigMajorDesignationDAO(
			ConfigMajorDesignationMapper configMajorDesignationDAO) {
		this.configMajorDesignationDAO = configMajorDesignationDAO;
	}
	
	
	/* (non-Javadoc)
	 * @see com.hr.biz.IConfigMajorDesignationService#getConfigMajorDesignationList()
	 */
	public List<ConfigMajorDesignation>  getConfigMajorDesignationList() throws Exception {
		return configMajorDesignationDAO.getConfigMajorDesignationList();
	}


	
	
}
