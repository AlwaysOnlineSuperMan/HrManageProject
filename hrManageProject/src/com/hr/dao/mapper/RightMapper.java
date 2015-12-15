package com.hr.dao.mapper;

import com.hr.entity.Right;

public interface RightMapper {
    int deleteByPrimaryKey(String rightCode);

    int insert(Right record);

    int insertSelective(Right record);

    Right selectByPrimaryKey(String rightCode);

    int updateByPrimaryKeySelective(Right record);

    int updateByPrimaryKey(Right record);
}