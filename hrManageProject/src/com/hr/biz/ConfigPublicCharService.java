package com.hr.biz;

import java.util.HashMap;
import java.util.List;

import com.hr.biz.imp.IConfigPublicCharService;
import com.hr.dao.mapper.ConfigPublicCharMapper;
import com.hr.entity.ConfigPublicChar;

public class ConfigPublicCharService implements IConfigPublicCharService {
	private ConfigPublicCharMapper configPublicCharDAO;

	public void setConfigPublicCharDAO(ConfigPublicCharMapper configPublicCharDAO) {
		this.configPublicCharDAO = configPublicCharDAO;
	}

	public List<ConfigPublicChar> getConfigPublicCharByAttributeKind(String attributeKind) throws Exception {
		// TODO Auto-generated method stub
		return configPublicCharDAO.getConfigPublicCharByAttributeKind(attributeKind);
	}

	public List<ConfigPublicChar> getConfigPublicCharByListAll()
			throws Exception {
		// TODO Auto-generated method stub
		return configPublicCharDAO.getConfigPublicCharByListAll();
	}

	public int insertSelective(ConfigPublicChar record) {
		// TODO Auto-generated method stub
		return configPublicCharDAO.insertSelective(record);
	}
	
	
}
