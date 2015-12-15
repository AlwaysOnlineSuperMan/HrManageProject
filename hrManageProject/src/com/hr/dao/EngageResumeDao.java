package com.hr.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hr.dao.mapper.EngageResumeMapper;
import com.hr.entity.EngageResume;
import com.hr.entity.EngageResumeWithBLOBs;

public class EngageResumeDao extends SqlSessionDaoSupport implements
		EngageResumeMapper {

	public int deleteByPrimaryKey(Short resId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(EngageResumeWithBLOBs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelective(EngageResumeWithBLOBs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public EngageResumeWithBLOBs selectByPrimaryKey(Short resId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKey(EngageResume record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeySelective(EngageResumeWithBLOBs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeyWithBLOBs(EngageResumeWithBLOBs record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
