package com.hr.biz;

import java.util.List;

import com.hr.dao.RoleDao;
import com.hr.dao.mapper.RoleMapper;
import com.hr.dao.mapper.UsersMapper;
import com.hr.entity.Role;
import com.hr.entity.Users;

public class RoleService {
	private RoleMapper roleDao;
	
	public RoleMapper getRoleDao() {
		return roleDao;
	}

	public void setRoleDao(RoleMapper roleDao) {
		this.roleDao = roleDao;
	}

	public List<Role> getRoleAllList() throws Exception {
		return roleDao.getRoleAllList();
	}
}
