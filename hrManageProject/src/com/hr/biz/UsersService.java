package com.hr.biz;

import java.util.HashMap;
import java.util.List;

import com.hr.biz.imp.IUsersService;
import com.hr.dao.mapper.UsersMapper;
import com.hr.entity.Users;

public class UsersService implements IUsersService {
	private UsersMapper usersDAO;

	public UsersMapper getUsersDAO() {
		return usersDAO;
	}

	public void setUsersDAO(UsersMapper usersDAO) {
		this.usersDAO = usersDAO;
	}

	public Users getUsersByLogin(HashMap map) throws Exception{
		return usersDAO.getUsersByLogin(map);
	}

	public List<Users> getUsersAllList() throws Exception {
		// TODO Auto-generated method stub
		return usersDAO.getUsersAllList();
	}
}
