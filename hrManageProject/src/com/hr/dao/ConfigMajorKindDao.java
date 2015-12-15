package com.hr.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hr.dao.mapper.ConfigMajorKindMapper;
import com.hr.entity.ConfigMajorKind;
import com.opensymphony.xwork2.ModelDriven;

public class ConfigMajorKindDao extends SqlSessionDaoSupport implements
		ConfigMajorKindMapper {

	public int deleteByPrimaryKey(Short mfkId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(ConfigMajorKind record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelective(ConfigMajorKind record) {
		// TODO Auto-generated method stub
		return 	this.getSqlSession().insert("com.hr.dao.ConfigMajorKindMapper.insertSelective",record);

	}
	public ConfigMajorKind selectByPrimaryKey(Short mfkId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKey(ConfigMajorKind record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeySelective(ConfigMajorKind record) {
		// TODO Auto-generated method stub
		return 0;
	}
	//职位分类查询
	public ConfigMajorKind getMajorKindName() {
		ConfigMajorKind configMajorKind=null;
		configMajorKind = (ConfigMajorKind) this.getSqlSession().selectOne("com.hr.dao.EngageMajorReleaseMapper.getConfigMajorKind");
		return configMajorKind;
	}
	//职位分类查询所有
	public List<ConfigMajorKind> getConfigMajorKindList(){
		List<ConfigMajorKind> configMajorKinds =null;
		System.out.println("+++++++++++++++++++++++");
		configMajorKinds = this.getSqlSession().selectList("com.hr.dao.ConfigMajorKindMapper.getConfigMajorKindList");
		return configMajorKinds;
		
	}
}
