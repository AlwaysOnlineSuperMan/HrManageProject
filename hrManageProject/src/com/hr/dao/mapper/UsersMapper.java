package com.hr.dao.mapper;

import java.util.HashMap;
import java.util.List;

import com.hr.entity.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(Short uId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Short uId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    //---------------------
    public abstract Users getUsersByLogin(HashMap map) throws Exception;
    
    public abstract  List<Users> getUsersAllList( ) throws Exception ;
}