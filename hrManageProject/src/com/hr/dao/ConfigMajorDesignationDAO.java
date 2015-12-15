package com.hr.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hr.dao.mapper.ConfigMajorDesignationMapper;
import com.hr.entity.ConfigFileSecondKind;
import com.hr.entity.ConfigMajorDesignation;

public class ConfigMajorDesignationDAO extends SqlSessionDaoSupport implements
		ConfigMajorDesignationMapper {

	public int deleteByPrimaryKey(Short cmdId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(ConfigMajorDesignation record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelective(ConfigMajorDesignation record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public ConfigMajorDesignation selectByPrimaryKey(Short cmdId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKey(ConfigMajorDesignation record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeySelective(ConfigMajorDesignation record) {
		// TODO Auto-generated method stub
		return 0;
	}
	//------------
	public List<ConfigMajorDesignation>  getConfigMajorDesignationList() throws Exception {
		List<ConfigMajorDesignation>  configMajorDesignations = null;
		configMajorDesignations = (List<ConfigMajorDesignation>) this.getSqlSession().selectList("com.hr.dao.ConfigMajorDesignationMapper.selectAll");
		return configMajorDesignations;
	}
}
