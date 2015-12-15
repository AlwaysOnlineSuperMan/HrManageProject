package com.hr.dao.mapper;

import com.hr.entity.SalaryGrant;

public interface SalaryGrantMapper {
    int deleteByPrimaryKey(Short sgrId);

    int insert(SalaryGrant record);

    int insertSelective(SalaryGrant record);

    SalaryGrant selectByPrimaryKey(Short sgrId);

    int updateByPrimaryKeySelective(SalaryGrant record);

    int updateByPrimaryKey(SalaryGrant record);
}