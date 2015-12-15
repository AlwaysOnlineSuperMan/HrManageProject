package com.hr.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hr.dao.mapper.ConfigFileSecondKindMapper;
import com.hr.entity.ConfigFileSecondKind;
import com.hr.entity.ConfigFileSecondKindWithBLOBs;

public class ConfigFileSecondKindDAO extends SqlSessionDaoSupport implements
		ConfigFileSecondKindMapper {

	public int deleteByPrimaryKey(Short fskId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(ConfigFileSecondKindWithBLOBs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelective(ConfigFileSecondKindWithBLOBs record) {
		// TODO Auto-generated method stub
		return this.getSqlSession().insert("com.hr.dao.ConfigFileSecondKindMapper.insertSelective",record);
	}

	public ConfigFileSecondKindWithBLOBs selectByPrimaryKey(Short fskId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKey(ConfigFileSecondKind record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeySelective(ConfigFileSecondKindWithBLOBs record) {
		// TODO Auto-generated method stub
		return  this.getSqlSession().update("com.hr.dao.ConfigFileSecondKindMapper.updateByPrimaryKeySelective",record);
	}

	public int updateByPrimaryKeyWithBLOBs(ConfigFileSecondKindWithBLOBs record) {
		// TODO Auto-generated method stub
		return this.getSqlSession().update("com.hr.dao.ConfigFileSecondKindMapper.updateByPrimaryKeyWithBLOBs",record);
	}
	
	
	
	public ConfigFileSecondKindWithBLOBs getSelectByPrimaryKey(Short  fskId) throws Exception {
		ConfigFileSecondKindWithBLOBs configFileSecondKinds = null;
		configFileSecondKinds =  (ConfigFileSecondKindWithBLOBs) this.getSqlSession().selectOne("com.hr.dao.ConfigFileSecondKindMapper.selectByPrimaryKey",fskId);
		return configFileSecondKinds;
	}
	public List<ConfigFileSecondKind> getConfigFileSecondKindByFirst_id(HashMap map) throws Exception {
		List<ConfigFileSecondKind> configFileSecondKinds = null;
		configFileSecondKinds =  this.getSqlSession().selectList("com.hr.dao.ConfigFileSecondKindMapper.getFirstKindId",map);
		return configFileSecondKinds;
	}
	public List<ConfigFileSecondKindWithBLOBs> getConfigFileSecondKindByListAll() throws Exception {
		List<ConfigFileSecondKindWithBLOBs> configFileSecondKinds = null;
		configFileSecondKinds =  this.getSqlSession().selectList("com.hr.dao.ConfigFileSecondKindMapper.getConfigFileSecondKindByListAll");
		return configFileSecondKinds;
	}
}
