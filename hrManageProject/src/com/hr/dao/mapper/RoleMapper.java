package com.hr.dao.mapper;

import java.util.List;

import com.hr.entity.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Short roleId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Short roleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    
    public List<Role> getRoleAllList() throws Exception ;
}