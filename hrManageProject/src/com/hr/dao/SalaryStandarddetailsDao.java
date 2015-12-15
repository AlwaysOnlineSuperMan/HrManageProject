package com.hr.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hr.dao.mapper.SalaryStandardDetailsMapper;
import com.hr.entity.SalaryStandardDetails;
import com.opensymphony.xwork2.ActionSupport;

public class SalaryStandarddetailsDao extends SqlSessionDaoSupport implements SalaryStandardDetailsMapper{
	
	public int deleteByPrimaryKey(Short sdtId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(SalaryStandardDetails record) {

		return this.getSqlSession().insert("com.hr.dao.SalaryStandardDetailsMapper.insert", record);
	}

	public int insertSelective(SalaryStandardDetails record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public SalaryStandardDetails selectByPrimaryKey(Short sdtId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKey(SalaryStandardDetails record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeySelective(SalaryStandardDetails record) {
		return this.getSqlSession().update("com.hr.dao.SalaryStandardDetailsMapper.updateByPrimaryKeySelective",record);
	}
	
	public List<SalaryStandardDetails> selectAll () throws Exception
	{
		List<SalaryStandardDetails>  salaryStandardDetailslist = null;
		String sql = "com.hr.dao.SalaryStandardDetailsMapper.selectAll";
		salaryStandardDetailslist = this.getSqlSession().selectList(sql);
		System.out.println(" -------" + salaryStandardDetailslist.size());
		return salaryStandardDetailslist;
		
	}

	public List<SalaryStandardDetails> selectByStandardId(String standardId) {
		
		return this.getSqlSession().selectList("com.hr.dao.SalaryStandardDetailsMapper.selectByStandardId",standardId);
	}

}
