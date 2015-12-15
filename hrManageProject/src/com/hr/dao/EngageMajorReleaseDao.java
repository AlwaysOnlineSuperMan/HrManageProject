package com.hr.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hr.dao.mapper.EngageMajorReleaseMapper;
import com.hr.entity.ConfigMajorKind;
import com.hr.entity.EngageMajorRelease;
import com.hr.entity.EngageMajorReleaseWithBLOBs;
import com.hr.entity.HumanFileWithBLOBs;

public class EngageMajorReleaseDao extends SqlSessionDaoSupport implements
		EngageMajorReleaseMapper {

	public int deleteByPrimaryKey(Short mreId) {
		// TODO Auto-generated method stub
		return 0;
	}
	//É¾³ý
	public int deleteByPrimaryHumanId(String humanId) {
		// TODO Auto-generated method stub
		return this.getSqlSession().delete("com.hr.dao.EngageMajorReleaseMapper.deleteByPrimaryHumanId", humanId);
	}
	//±£´æ
	public int insert(EngageMajorReleaseWithBLOBs record) {
		System.out.println("---------------------");
		int count = this.getSqlSession().insert("com.hr.dao.EngageMajorReleaseMapper.insert",record);
		System.out.println("---------------------");
		return count;
	}
	//ÐÞ¸Ä
	public int updateEngageMajor(String id) {
		int count=this.getSqlSession().update("com.hr.dao.EngageMajorReleaseMapper.update",id);
		return count;
	}
	public int updateByPrimaryKeySelective(HumanFileWithBLOBs record) {
		// TODO Auto-generated method stub
		return this.getSqlSession().update("com.hr.dao.EngageMajorReleaseMapper.updateByPrimaryKeySelective",record);
	}

	public int insertSelective(EngageMajorReleaseWithBLOBs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public EngageMajorReleaseWithBLOBs selectByPrimaryKey(Short mreId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKey(EngageMajorRelease record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeySelective(EngageMajorReleaseWithBLOBs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeyWithBLOBs(EngageMajorReleaseWithBLOBs record) {
		
		return 0;
	}
	//²éÑ¯
	public List<EngageMajorReleaseWithBLOBs> selectAll()throws Exception{
		List<EngageMajorReleaseWithBLOBs> list=null;
		String sql = "com.hr.dao.EngageMajorReleaseMapper.selectAllEngageMajor";
		list = this.getSqlSession().selectList(sql);
		System.out.println("DAO + " + list.size());
		return list;
	}
	public EngageMajorRelease updateEngageMajorRelease(String Eid) throws Exception{
		EngageMajorRelease engageMajorRelease=null;
		engageMajorRelease=(EngageMajorRelease) this.getSqlSession().selectOne("com.hr.dao.EngageMajorReleaseMapper.selectByEngageMajorhId",Eid);
		return engageMajorRelease;
	}
}
