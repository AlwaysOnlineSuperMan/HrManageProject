package com.hr.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hr.dao.mapper.HumanFileDigMapper;
import com.hr.entity.HumanFileDigWithBLOBs;
import com.hr.entity.HumanFileWithBLOBs;

public class HumanFileDigDAO extends SqlSessionDaoSupport implements
		HumanFileDigMapper {

	public int deleteByPrimaryKey(Short hfdId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(HumanFileDigWithBLOBs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelective(HumanFileDigWithBLOBs record) {
		// TODO Auto-generated method stub
			return this.getSqlSession().insert("com.hr.dao.HumanFileDigMapper.insertSelective", record);

	}

	public HumanFileDigWithBLOBs selectByPrimaryKey(Short hfdId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKey(com.hr.entity.HumanFileDig record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeySelective(HumanFileDigWithBLOBs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeyWithBLOBs(HumanFileDigWithBLOBs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelectiveforHumanFileWithBLOBs(HumanFileWithBLOBs record) {
		// TODO Auto-generated method stub
		return this.getSqlSession().insert("com.hr.dao.HumanFileDigMapper.insertSelectiveforHumanFileWithBLOBs", record);
	}

}
