package com.hr.dao.mapper;

import com.hr.entity.RoleRight;

public interface RoleRightMapper {
    int deleteByPrimaryKey(Short rfId);

    int insert(RoleRight record);

    int insertSelective(RoleRight record);

    RoleRight selectByPrimaryKey(Short rfId);

    int updateByPrimaryKeySelective(RoleRight record);

    int updateByPrimaryKey(RoleRight record);
}