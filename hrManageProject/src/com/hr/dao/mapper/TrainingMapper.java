package com.hr.dao.mapper;

import com.hr.entity.Training;

public interface TrainingMapper {
    int deleteByPrimaryKey(Short traId);

    int insert(Training record);

    int insertSelective(Training record);

    Training selectByPrimaryKey(Short traId);

    int updateByPrimaryKeySelective(Training record);

    int updateByPrimaryKeyWithBLOBs(Training record);

    int updateByPrimaryKey(Training record);
}