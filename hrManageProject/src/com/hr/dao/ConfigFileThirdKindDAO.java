package com.hr.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hr.dao.mapper.ConfigFileThirdKindMapper;
import com.hr.entity.ConfigFileThirdKind;

public class ConfigFileThirdKindDAO extends SqlSessionDaoSupport implements
		ConfigFileThirdKindMapper {

	public int deleteByPrimaryKey(Short ftkId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(ConfigFileThirdKind record) {
		// TODO Auto-generated method stub
		return 		this.getSqlSession().insert("com.hr.dao.ConfigFileThirdKindMapper.insert",record);

	}

	public int insertSelective(ConfigFileThirdKind record) {
		// TODO Auto-generated method stub
			return 		this.getSqlSession().insert("com.hr.dao.ConfigFileThirdKindMapper.insertSelective",record);
	}

	public ConfigFileThirdKind selectByPrimaryKey(Short ftkId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKey(ConfigFileThirdKind record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeySelective(ConfigFileThirdKind record) {
		// TODO Auto-generated method stub
		return  this.getSqlSession().update("com.hr.dao.ConfigFileThirdKindMapper.updateByPrimaryKeySelective",record);

	}

	public int updateByPrimaryKeyWithBLOBs(ConfigFileThirdKind record) {
		// TODO Auto-generated method stub
		return 0;
	}
	//----------------
	public List<ConfigFileThirdKind>  getConfigFileThirdKindByFirstKindIdAndSecondKindId(HashMap map) throws Exception {
		// TODO Auto-generated method stub
		List<ConfigFileThirdKind>  configFileThirdKinds = null;
		configFileThirdKinds =  this.getSqlSession().selectList("com.hr.dao.ConfigFileThirdKindMapper.getConfigFileThirdKindByFirstKindIdAndSecondKindId",map);
		return configFileThirdKinds;
	}
	public List<ConfigFileThirdKind>  getConfigFileThirdKindByListAll() throws Exception {
		// TODO Auto-generated method stub
		List<ConfigFileThirdKind>  configFileThirdKinds = null;
		configFileThirdKinds =  this.getSqlSession().selectList("com.hr.dao.ConfigFileThirdKindMapper.getConfigFileThirdKindByListAll");
		return configFileThirdKinds;
	}
	
	public ConfigFileThirdKind  getSelectByPrimaryKey(Short ftkId) throws Exception {
		// TODO Auto-generated method stub
	   ConfigFileThirdKind  configFileThirdKind = null;
	   configFileThirdKind =  (ConfigFileThirdKind) this.getSqlSession().selectOne("com.hr.dao.ConfigFileThirdKindMapper.selectByPrimaryKey",ftkId);
		return configFileThirdKind;
	}
}
