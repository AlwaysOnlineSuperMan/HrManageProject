package com.hr.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hr.dao.mapper.SalaryStandardMapper;
import com.hr.entity.SalaryStandard;
import com.hr.entity.SalaryStandardWithBLOBs;

public class SalaryStandardDao extends SqlSessionDaoSupport implements SalaryStandardMapper{

	public int deleteByPrimaryKey(Short ssdId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(SalaryStandardWithBLOBs record) {
		// TODO Auto-generated method stub
		return this.getSqlSession().insert("com.hr.dao.SalaryStandardMapper.insert",record);
	}

	public int insertSelective(SalaryStandardWithBLOBs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public SalaryStandardWithBLOBs selectByPrimaryKey(Short ssdId) {
		SalaryStandardWithBLOBs bloBs = null;
		bloBs =(SalaryStandardWithBLOBs) this.getSqlSession().selectOne("com.hr.dao.SalaryStandardMapper.selectByPrimaryKey", ssdId);
		return bloBs;
	}

	public int updateByPrimaryKey(SalaryStandard record) {
			this.getSqlSession().update("com.hr.dao.SalaryStandardMapper.updateByPrimaryKey",record);
		return 0;
	}

	public int updateByPrimaryKeySelective(SalaryStandardWithBLOBs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeyWithBLOBs(SalaryStandardWithBLOBs record) {
		
		return this.getSqlSession().update("com.hr.dao.SalaryStandardMapper.updateByPrimaryKeySelective", record);
	}
	public List<SalaryStandard> getSalaryStandardList()throws Exception{
		List<SalaryStandard> salaryStandards = null;
		salaryStandards = this.getSqlSession().selectList("com.hr.dao.SalaryStandardMapper.selectAllBycheck");
		return salaryStandards;
		
	}
	//通过复核状态查询标准信息
	public List<SalaryStandardWithBLOBs> selectBycheckstatus(Short check)
			throws Exception {
		List<SalaryStandardWithBLOBs> list = null;
		list = this.getSqlSession().selectList("com.hr.dao.SalaryStandardMapper.selectBycheckstatus",check);
		return list;
	}

	public List<SalaryStandard> getSalaryStandardByStandardId(String Id)
			throws Exception {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("com.hr.dao.SalaryStandardMapper.selectBystandardId",Id);
	}

	public List<SalaryStandard> getSalaryStandardByStandardName(String name)
			throws Exception {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("com.hr.dao.SalaryStandardMapper.selectBystandardName",name);
	}
	public SalaryStandardWithBLOBs getSalaryStandBystandardId2(String Id)
			throws Exception {
		// TODO Auto-generated method stub
		return (SalaryStandardWithBLOBs) this.getSqlSession().selectOne("com.hr.dao.SalaryStandardMapper.selectBystandardId", Id);
	}

	public List<SalaryStandard> getselectAllBycheck() throws Exception {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("com.hr.dao.SalaryStandardMapper.selectAllBycheck");
	}
}
