package com.hr.dao.mapper;

import java.util.List;

import com.hr.entity.SalaryGrantDetails;
import com.hr.entity.SalaryStandardDetails;

public interface SalaryGrantDetailsMapper {
    int deleteByPrimaryKey(Short grdId);

    int insert(SalaryGrantDetails record);

    int insertSelective(SalaryGrantDetails record);

    SalaryGrantDetails selectByPrimaryKey(Short grdId);

    int updateByPrimaryKeySelective(SalaryGrantDetails record);

    int updateByPrimaryKey(SalaryGrantDetails record);
    
    
}