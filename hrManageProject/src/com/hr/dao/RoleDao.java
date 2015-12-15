package com.hr.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hr.dao.mapper.RoleMapper;
import com.hr.entity.Role;

public class RoleDao extends SqlSessionDaoSupport implements RoleMapper{

	public int deleteByPrimaryKey(Short roleId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Role> getRoleAllList() throws Exception {
		List<Role> role= null;
		role = this.getSqlSession().selectList("com.hr.dao.RoleMapper.selectRoleAllList");
		return role;
	}

	public int insert(Role record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelective(Role record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Role selectByPrimaryKey(Short roleId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKey(Role record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeySelective(Role record) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
