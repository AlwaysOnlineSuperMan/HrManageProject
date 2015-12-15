package com.hr.biz.imp;

import java.util.HashMap;
import java.util.List;

import com.hr.entity.Users;

public interface IUsersService {

	public abstract Users getUsersByLogin(HashMap map) throws Exception;
	 public abstract  List<Users> getUsersAllList( ) throws Exception ;
}