package com.hr.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hr.dao.mapper.ConfigFileFirstKindMapper;
import com.hr.entity.ConfigFileFirstKind;
import com.hr.entity.ConfigFileFirstKindWithBLOBs;

public class ConfigFileFirstKindDAO extends SqlSessionDaoSupport implements
		ConfigFileFirstKindMapper {

	public int deleteByPrimaryKey(Short ffkId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(ConfigFileFirstKindWithBLOBs record) {
		// TODO Auto-generated method stub
		return this.getSqlSession().insert("com.hr.dao.ConfigFileFirstKindMapper.insert", record);

	}

	public int insertSelective(ConfigFileFirstKindWithBLOBs record) {
		// TODO Auto-generated method stub
		return this.getSqlSession().insert("com.hr.dao.ConfigFileFirstKindMapper.insertSelective", record);
	}

	public ConfigFileFirstKindWithBLOBs selectByPrimaryKey(Short ffkId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKey(ConfigFileFirstKind record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeySelective(ConfigFileFirstKindWithBLOBs record) {
		// TODO Auto-generated method stub
		return this.getSqlSession().update("com.hr.dao.ConfigFileFirstKindMapper.updateByPrimaryKeySelective", record);
	}

	public int updateByPrimaryKeyWithBLOBs(ConfigFileFirstKindWithBLOBs record) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public List<ConfigFileFirstKind> getConfigFileFirstKindList(){
		List<ConfigFileFirstKind> configFileFirstKindList = null;
		configFileFirstKindList = this.getSqlSession().selectList("com.hr.dao.ConfigFileFirstKindMapper.getConfigFileFirstFindList");
		return configFileFirstKindList;
	}
	public List<ConfigFileFirstKindWithBLOBs> getConfigFileFirstKindWithBLOBsList(){
		List<ConfigFileFirstKindWithBLOBs> configFileFirstKindList = null;
		configFileFirstKindList = this.getSqlSession().selectList("com.hr.dao.ConfigFileFirstKindMapper.getConfigFileFirstFindList");
		return configFileFirstKindList;
	}
	
	
	public List<ConfigFileFirstKindWithBLOBs> selectIdName() throws Exception {
		List<ConfigFileFirstKindWithBLOBs> configfirst = null;
		configfirst = this.getSqlSession().selectList("com.hr.dao.ConfigFileFirstKindMapper.selectIdName");
		return configfirst;
	}
	public ConfigFileFirstKindWithBLOBs getConfigFileFirstKindWithBLOBsByfffId(Short fffId){
		ConfigFileFirstKindWithBLOBs  configFileFirstKind  = null;
		configFileFirstKind = (ConfigFileFirstKindWithBLOBs) this.getSqlSession().selectOne("com.hr.dao.ConfigFileFirstKindMapper.selectByPrimaryKey",fffId);
		return configFileFirstKind;
	}
}
