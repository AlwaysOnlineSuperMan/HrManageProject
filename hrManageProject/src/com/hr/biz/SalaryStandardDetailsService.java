package com.hr.biz;

import java.util.HashMap;
import java.util.List;

import com.hr.biz.imp.ISalaryStandardDetailsService;
import com.hr.dao.SalaryStandarddetailsDao;
import com.hr.dao.mapper.SalaryStandardDetailsMapper;
import com.hr.entity.SalaryStandardDetails;

public class SalaryStandardDetailsService  implements ISalaryStandardDetailsService{

		private SalaryStandardDetailsMapper salaryStandardDetailsMapper;

		public SalaryStandardDetailsMapper getSalaryStandardDetailsMapper() {
			return salaryStandardDetailsMapper;
		}

		public void setSalaryStandardDetailsMapper(
				SalaryStandardDetailsMapper salaryStandardDetailsMapper) {
			this.salaryStandardDetailsMapper = salaryStandardDetailsMapper;
		}
		
		
		public List<SalaryStandardDetails> selectAll () throws Exception
		{
			return salaryStandardDetailsMapper.selectAll();
			
		}

		/*public SalaryStandardDetails selectMoneyById(HashMap mp) throws Exception {
			return salaryStandardDetailsMapper.selectMoneyById(mp);
		}*/
}
