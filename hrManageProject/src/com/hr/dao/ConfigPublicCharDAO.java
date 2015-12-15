package com.hr.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hr.dao.mapper.ConfigPublicCharMapper;
import com.hr.entity.ConfigPublicChar;

public class ConfigPublicCharDAO extends SqlSessionDaoSupport implements
		ConfigPublicCharMapper {

	public int deleteByPrimaryKey(Short pbcId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(ConfigPublicChar record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelective(ConfigPublicChar record) {
		// TODO Auto-generated method stub
		return this.getSqlSession().insert("com.hr.dao.ConfigPublicCharMapper.insertSelective",record);
	}

	public ConfigPublicChar selectByPrimaryKey(Short pbcId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKey(ConfigPublicChar record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeySelective(ConfigPublicChar record) {
		// TODO Auto-generated method stub
		return 0;
	}
	public List<ConfigPublicChar> getConfigPublicCharByAttributeKind(String attributeKind)throws Exception {
		// TODO Auto-generated method stub
		List<ConfigPublicChar> configPublicChars = null;
		configPublicChars = this.getSqlSession().selectList("com.hr.dao.ConfigPublicCharMapper.selectByAttributeKind",attributeKind);
		return configPublicChars;
	}
	
	public List<ConfigPublicChar> getConfigPublicCharByListAll ()throws Exception {
		// TODO Auto-generated method stub
		List<ConfigPublicChar> configPublicChars = null;
		configPublicChars = this.getSqlSession().selectList("com.hr.dao.ConfigPublicCharMapper.getConfigPublicCharByListAll");
		return configPublicChars;
	}
}
