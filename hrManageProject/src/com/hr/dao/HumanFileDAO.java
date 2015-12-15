package com.hr.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hr.dao.mapper.HumanFileMapper;
import com.hr.entity.HumanFile;
import com.hr.entity.HumanFileDigWithBLOBs;
import com.hr.entity.HumanFileWithBLOBs;
import com.hr.util.PageModel;

public class HumanFileDAO extends SqlSessionDaoSupport implements
		HumanFileMapper {

	public int deleteByPrimaryKey(Short hufId) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int deleteByPrimaryHumanId(String humanId) {
		// TODO Auto-generated method stub
		return this.getSqlSession().delete("com.hr.dao.HumanFileMapper.deleteByPrimaryHumanId", humanId);
	}
	public int insert(HumanFileWithBLOBs record) {
		// TODO Auto-generated method stub
		return this.getSqlSession().insert("com.hr.dao.HumanFileMapper.insert", record);
	}
	public int insertToHumanFileDigWithBLOBs(HumanFileWithBLOBs record) {
		// TODO Auto-generated method stub
		return this.getSqlSession().insert("com.hr.dao.HumanFileMapper.insertToHumanFileDigWithBLOBs", record);
	}
	
	
	public int insertSelective(HumanFileWithBLOBs record) {
		// TODO Auto-generated method stub
		return 0;
	}
	


	public HumanFileWithBLOBs selectByPrimaryKey(Short hufId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKey(HumanFile record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeySelective(HumanFileWithBLOBs record) {
		// TODO Auto-generated method stub
		return this.getSqlSession().update("com.hr.dao.HumanFileMapper.updateByPrimaryKeySelective",record);
	}
	
	
	public int updateByPrimaryKeyWithBLOBs(HumanFileWithBLOBs record) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//----
	public List<HumanFile> selectAll() throws Exception {
		String sql = "com.hr.dao.HumanFileMapper";
		List<HumanFile> list = null;
		list = this.getSqlSession().selectList(sql);
		System.out.println("Dao +++++" + list);
		return list;
	}

	public List<HumanFile> getHumanFileWithBLOBAllList() throws Exception {
		List<HumanFile>  humanFileWithBLOBAllList= null;
		humanFileWithBLOBAllList = this.getSqlSession().selectList("com.hr.dao.HumanFileMapper.selectByAll");
		return humanFileWithBLOBAllList;
	}
	
	public List<HumanFile> getHumanFilByHumanFileStatus(String humanFileStatus) throws Exception {
		List<HumanFile>  humanFileWithBLOBAllList= null;
		humanFileWithBLOBAllList = this.getSqlSession().selectList("com.hr.dao.HumanFileMapper.selectByHumanFileStatus",humanFileStatus);
		return humanFileWithBLOBAllList;
	}
	public String getMaxHumanId() throws Exception {
		
		return (String) this.getSqlSession().selectOne("com.hr.dao.HumanFileMapper.getMaxHumanId");
	}
	public HumanFileWithBLOBs getHumanFileWithBLOBAllByHumanID(String HumanId
			) throws Exception {
		HumanFileWithBLOBs  humanFileWithBLOB= null;
		humanFileWithBLOB = (HumanFileWithBLOBs) this.getSqlSession().selectOne("com.hr.dao.HumanFileMapper.selectByHumanId",HumanId);
		return humanFileWithBLOB;
	}

	
	
	public PageModel<HumanFileWithBLOBs> getHumanFileWithBLOBsForCondtionListPageModel(HashMap hm){
		PageModel<HumanFileWithBLOBs> model = new PageModel<HumanFileWithBLOBs>();
		String sqlString= "com.hr.dao.HumanFileMapper.TeacherMapper.getHumanFileWithBLOBsForCondtionCount";
		int count = (Integer)(this.getSqlSession().selectOne(sqlString, hm));
		model.setAllRecord(count);
		sqlString= "com.hr.dao.HumanFileMapper.getHumanFileWithBLOBsForCondtionList";
		List<HumanFileWithBLOBs> resultList= this.getSqlSession().selectList(sqlString, hm);
		model.setResultList(resultList);
		return model;
	}
	
	public HumanFileWithBLOBs getHuman_fileById(HashMap hsp) throws Exception {

		HumanFileWithBLOBs hw = null;
		String sql = "com.hr.dao.HumanFileMapper.getHuman_fileById";
		hw = (HumanFileWithBLOBs) this.getSqlSession().selectOne(sql,hsp);
		//System.out.println(hw);
		return hw;
	}
	public HumanFileWithBLOBs selectById(int id) throws Exception {
		HumanFileWithBLOBs hw = null;
		String sql = "com.hr.dao.HumanFileMapper.selectById";
		hw = (HumanFileWithBLOBs) this.getSqlSession().selectOne(sql,id);
		//System.out.println(hw);
		return hw;
	}
}
