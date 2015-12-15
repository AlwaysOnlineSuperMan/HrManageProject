package com.hr.biz.imp;

import java.util.HashMap;
import java.util.List;

import com.hr.entity.SalaryStandardDetails;
import com.hr.entity.SalaryStandardWithBLOBs;

public interface ISalaryStandardDetailsService {
	
	public abstract List<SalaryStandardDetails> selectAll()throws Exception;
	
	 //public abstract SalaryStandardDetails selectMoneyById (HashMap map) throws Exception;
}
