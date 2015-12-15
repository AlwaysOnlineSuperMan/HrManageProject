package com.hr.dao.mapper;

import java.util.List;

import com.hr.entity.SalaryStandardDetails;

public interface SalaryStandardDetailsMapper {
    int deleteByPrimaryKey(Short sdtId);

    int insert(SalaryStandardDetails record);

    int insertSelective(SalaryStandardDetails record);

    SalaryStandardDetails selectByPrimaryKey(Short sdtId);

    int updateByPrimaryKeySelective(SalaryStandardDetails record);

    int updateByPrimaryKey(SalaryStandardDetails record);
    
    public abstract List<SalaryStandardDetails> selectAll () throws Exception;

    
    public abstract  List<SalaryStandardDetails> selectByStandardId(String standardId); 

}