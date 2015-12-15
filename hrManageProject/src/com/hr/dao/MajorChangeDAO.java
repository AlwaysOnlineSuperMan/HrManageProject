package com.hr.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hr.dao.mapper.MajorChangeMapper;
import com.hr.entity.MajorChange;
import com.hr.entity.MajorChangeWithBLOBs;

public class MajorChangeDAO extends SqlSessionDaoSupport implements
		MajorChangeMapper {

	public int deleteByPrimaryKey(Short mchId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(MajorChangeWithBLOBs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelective(MajorChangeWithBLOBs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public MajorChangeWithBLOBs selectByPrimaryKey(Short mchId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKey(MajorChange record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeySelective(MajorChangeWithBLOBs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeyWithBLOBs(MajorChangeWithBLOBs record) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//
	public List<MajorChange> selectByIII () throws Exception{
		List<MajorChange> list = null;
		String sql = "com.hr.dao.MajorChangeMapper.selectByIII";
		list = this.getSqlSession().selectList(sql);
		//System.out.println("Dao +  "  + list.size());
		return list;
	}

	public MajorChangeWithBLOBs selectById(int id) throws Exception {
		MajorChangeWithBLOBs mc = null;
		String sql = "com.hr.dao.MajorChangeMapper.selectById";
		mc =  (MajorChangeWithBLOBs) this.getSqlSession().selectOne(sql,id);
		//System.out.println(mc);
		return mc;
	}
	public int selectCount () throws Exception
	{
		String sql = "com.hr.dao.MajorChangeMapper.selectCount";
		int i = (Integer) this.getSqlSession().selectOne(sql);
		//System.out.println(i);
		return i;
	}

}
