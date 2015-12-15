package com.hr.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hr.dao.mapper.UsersMapper;
import com.hr.entity.Users;

public class UsersDAO extends SqlSessionDaoSupport implements UsersMapper {

	public int deleteByPrimaryKey(Short uId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(Users record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelective(Users record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Users selectByPrimaryKey(Short uId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKey(Users record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeySelective(Users record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Users getUsersByLogin(HashMap map) throws Exception {
		Users users= null;
		users = (Users) this.getSqlSession().selectOne("com.hr.dao.UsersMapper.getUsersToLogin",map);
		return users;
	}
	
	public List<Users> getUsersAllList( ) throws Exception {
		List<Users> users= null;
		users =  this.getSqlSession().selectList("com.hr.dao.UsersMapper.selectUsersAllList");
		return users;
	}

}
