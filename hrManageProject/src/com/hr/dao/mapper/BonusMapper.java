package com.hr.dao.mapper;

import com.hr.entity.Bonus;

public interface BonusMapper {
    int deleteByPrimaryKey(Short bonId);

    int insert(Bonus record);

    int insertSelective(Bonus record);

    Bonus selectByPrimaryKey(Short bonId);

    int updateByPrimaryKeySelective(Bonus record);

    int updateByPrimaryKeyWithBLOBs(Bonus record);

    int updateByPrimaryKey(Bonus record);
}