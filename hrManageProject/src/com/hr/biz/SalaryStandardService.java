package com.hr.biz;

import java.util.HashMap;
import java.util.List;

import com.hr.biz.imp.ISalaryStandardService;
import com.hr.dao.mapper.SalaryStandardDetailsMapper;
import com.hr.dao.mapper.SalaryStandardMapper;
import com.hr.entity.SalaryStandard;
import com.hr.entity.SalaryStandardDetails;
import com.hr.entity.SalaryStandardWithBLOBs;

public class SalaryStandardService implements ISalaryStandardService{
	private SalaryStandardMapper salaryStandardDao;
	private SalaryStandardDetailsMapper detailsMapperDao;

	public SalaryStandardMapper getSalaryStandardDao() {
		return salaryStandardDao;
	}

	public void setSalaryStandardDao(SalaryStandardMapper salaryStandardDao) {
		this.salaryStandardDao = salaryStandardDao;
	}
	
	
	

	public SalaryStandardDetailsMapper getDetailsMapperDao() {
		return detailsMapperDao;
	}

	public void setDetailsMapperDao(SalaryStandardDetailsMapper detailsMapperDao) {
		this.detailsMapperDao = detailsMapperDao;
	}

	public List<SalaryStandard> getSalaryStandardList() throws Exception {
		// TODO Auto-generated method stub
		return salaryStandardDao.getSalaryStandardList();
	}
	public List<SalaryStandard> getSalartStandardBycheckList()throws Exception{
		
		return salaryStandardDao.getselectAllBycheck();
	}
	public List<SalaryStandardWithBLOBs> getStandardBycheckstatus(Short check)
			throws Exception {
		
		List<SalaryStandardWithBLOBs> list  = salaryStandardDao.selectBycheckstatus(check);
		return list;
	}

	public int addIntoStandardRegister(
			SalaryStandardWithBLOBs salaryStandardWithBLOBs,
			List<SalaryStandardDetails> list) throws Exception {
		salaryStandardDao.insert(salaryStandardWithBLOBs);
		SalaryStandardDetails details = new SalaryStandardDetails();
		for (int i = 0; i < list.size(); i++) {
			details.setItemId(list.get(i).getItemId());
			details.setItemName(list.get(i).getItemName());
			details.setSalary(list.get(i).getSalary());
			details.setStandardId(list.get(i).getStandardId());
			details.setStandardName(list.get(i).getStandardName());
			detailsMapperDao.insert(details);
		}
		return 0;
	}

	public SalaryStandardWithBLOBs getStandardByssdId(Short sid)
			throws Exception {
			
		return salaryStandardDao.selectByPrimaryKey(sid);
	}

	public List<SalaryStandardDetails> getStandardBystandardId(String standardId)
			throws Exception {
		List<SalaryStandardDetails> list = null;
		list = detailsMapperDao.selectByStandardId(standardId);
		return list;
	}

	public int updateStandard(SalaryStandardWithBLOBs standardWithBLOBs)
			throws Exception {
		
		return salaryStandardDao.updateByPrimaryKeyWithBLOBs(standardWithBLOBs);
	}

	public int updateStandard(SalaryStandardWithBLOBs standardWithBLOBs,
			List<SalaryStandardDetails> list) throws Exception {
		salaryStandardDao.updateByPrimaryKeyWithBLOBs(standardWithBLOBs);
		SalaryStandardDetails details = new SalaryStandardDetails();
		for (int i = 0; i < list.size(); i++) {
			details.setItemId(list.get(i).getItemId());
			details.setItemName(list.get(i).getItemName());
			details.setSalary(list.get(i).getSalary());
			details.setStandardId(list.get(i).getStandardId());
			details.setStandardName(list.get(i).getStandardName());
			detailsMapperDao.updateByPrimaryKeySelective(details);
		}
		return 0;
	}

	public List<SalaryStandard> getBystandardId(String Id) throws Exception {
		
		return salaryStandardDao.getSalaryStandardByStandardId(Id);
	}

	public List<SalaryStandard> getBystandardName(String name) throws Exception {

		return salaryStandardDao.getSalaryStandardByStandardName(name);
	}

	public SalaryStandardWithBLOBs getBystandardId2(String Id) throws Exception {
		// TODO Auto-generated method stub
		return salaryStandardDao.getSalaryStandBystandardId2(Id);
	}


	
	
}
