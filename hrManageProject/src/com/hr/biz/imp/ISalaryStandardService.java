package com.hr.biz.imp;

import java.util.HashMap;
import java.util.List;

import com.hr.entity.SalaryStandard;
import com.hr.entity.SalaryStandardDetails;
import com.hr.entity.SalaryStandardWithBLOBs;

public interface ISalaryStandardService {
	public abstract List<SalaryStandard> getSalaryStandardList()throws Exception;
	
	public abstract int addIntoStandardRegister(SalaryStandardWithBLOBs salaryStandardWithBLOBs,List<SalaryStandardDetails> list)throws Exception;
	
	public abstract List<SalaryStandardWithBLOBs> getStandardBycheckstatus(Short i)throws Exception;
	
	public abstract SalaryStandardWithBLOBs getStandardByssdId(Short sid) throws Exception;
	
	public abstract List<SalaryStandardDetails> getStandardBystandardId(String standardId) throws Exception;
	
	public abstract int updateStandard(SalaryStandardWithBLOBs standardWithBLOBs,List<SalaryStandardDetails> list) throws Exception;
	
	public abstract List<SalaryStandard> getBystandardId(String Id) throws Exception;
	
	public abstract List<SalaryStandard> getBystandardName(String Name) throws Exception;
	
	public abstract SalaryStandardWithBLOBs getBystandardId2(String Id) throws Exception;
	
	public List<SalaryStandard> getSalartStandardBycheckList()throws Exception;
}
