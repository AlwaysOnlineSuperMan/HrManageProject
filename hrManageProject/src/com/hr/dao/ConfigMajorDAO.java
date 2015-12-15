package com.hr.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hr.dao.mapper.ConfigMajorMapper;
import com.hr.entity.ConfigMajor;
import com.hr.entity.ConfigMajorKind;

public class ConfigMajorDAO extends SqlSessionDaoSupport implements
		ConfigMajorMapper {

	public int deleteByPrimaryKey(Short makId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(ConfigMajor record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelective(ConfigMajor record) {
		// TODO Auto-generated method stub
		return  this.getSqlSession().insert("com.hr.dao.ConfigMajorMapper.insertSelective",record);

	}

	public ConfigMajor selectByPrimaryKey(Short makId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKey(ConfigMajor record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeySelective(ConfigMajor record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<ConfigMajor> getConfigMajorList(HashMap map) throws Exception {
		List<ConfigMajor> configMajor =null;
		configMajor = this.getSqlSession().selectList("com.hr.dao.ConfigMajorMapper.selectByMajorKindId",map);
		return configMajor;
	}
	public List<ConfigMajor> getConfigMajorListAll(HashMap map) throws Exception {
		List<ConfigMajor> configMajor =null;
		configMajor = this.getSqlSession().selectList("com.hr.dao.ConfigMajorMapper.getConfigMajorListAll",map);
		return configMajor;
	}

}
