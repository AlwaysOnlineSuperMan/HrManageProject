package com.hr.dao.mapper;

import java.util.List;

import com.hr.entity.SalaryStandard;
import com.hr.entity.SalaryStandardWithBLOBs;

public interface SalaryStandardMapper {
    int deleteByPrimaryKey(Short ssdId);

    int insert(SalaryStandardWithBLOBs record);

    int insertSelective(SalaryStandardWithBLOBs record);

    SalaryStandardWithBLOBs selectByPrimaryKey(Short ssdId);

    int updateByPrimaryKeySelective(SalaryStandardWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SalaryStandardWithBLOBs record);

    int updateByPrimaryKey(SalaryStandard record);
    
    public abstract List<SalaryStandard> getselectAllBycheck()throws Exception;
	
    public abstract List<SalaryStandard> getSalaryStandardList()throws Exception;
    
    public abstract List<SalaryStandard> getSalaryStandardByStandardId(String Id)throws Exception;
    
    public abstract SalaryStandardWithBLOBs getSalaryStandBystandardId2(String Id) throws Exception;
	
	public abstract List<SalaryStandardWithBLOBs> selectBycheckstatus(Short check) throws Exception;
	
	public abstract List<SalaryStandard> getSalaryStandardByStandardName(String name)throws Exception;
}